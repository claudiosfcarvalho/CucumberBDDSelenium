package br.com.claudiowork.steps;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

import br.com.claudiowork.entidades.Filme;
import br.com.claudiowork.entidades.NotaAluguel;
import br.com.claudiowork.entidades.TipoAluguel;
import br.com.claudiowork.servico.AluguelService;
import br.com.claudiowork.utils.DateUtils;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Ent�o;
import cucumber.api.java.pt.Quando;
import junit.framework.Assert;

public class AlugarFilmeSteps {
	private Filme filme;
	private AluguelService aluguel = new AluguelService();
	private NotaAluguel nota;
	private String erro;
	private TipoAluguel tipoAluguel;
	
	@Dado("^um filme$")
	public void umFilme(DataTable table) {
	    Map<String, String> map = table.asMap(String.class, String.class);
	    filme = new Filme();
	    filme.setEstoque(Long.parseLong(map.get("estoque")));
	    filme.setValorAluguel(BigDecimal.valueOf(Long.parseLong(map.get("preco"))));
	}
	
	@Dado("^um filme com estoque de (.*) unidades$")
	public void umFilmeComEstoqueDeUnidades(Long arg1) {
	    filme = new Filme();
	    filme.setEstoque(arg1);
	}

	@Dado("^que o pre�o do aluguel seja R\\$(\\d+)$")
	public void queOPrecoDoAluguelSejaR$(BigDecimal arg1) {
		filme.setValorAluguel(arg1);
	}

	@Quando("^alugar$")
	public void alugar() {
	    try {
			nota = aluguel.alugar(filme,tipoAluguel);
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			erro = e.getMessage();
		}
	}

	@Ent�o("^o pre�o do aluguel ser� R\\$(\\d+)$")
	public void oPrecoDoAluguelSeraR$(BigDecimal arg1) {
	    Assert.assertEquals(arg1, nota.getPreco() );
	}

	@Ent�o("^o estoque do filme ser� de (.*) unidade$")
	public void oEstoqueDoFilmeSeraDeUnidade(Long arg1) {
		Assert.assertEquals(arg1, filme.getEstoque() );
	}

	@Ent�o("^n�o ser� poss�vel alugar por falta de estoque$")
	public void naoSeraPossivelAlugarPorFaltaDeEstoque() {
	    Assert.assertEquals("Filme sem estoque", erro);
	}

	@Dado("^que o tipo do aluguel seja (.*)$")
	public void queOTipoDoAluguelSejaExtendido(TipoAluguel tipo) {
	    tipoAluguel = tipo;
	}

	@Ent�o("^a data de entrega ser� em (\\d+) dias?$")
	public void aDataDeEntregaSeraEmDias(int arg1) {
		Calendar cal = Calendar.getInstance();
		Date dataCerta = DateUtils.somaPeriodo(cal.getTime(),arg1,"dia");
		Date dataObtida = nota.getDataEntrega();
		System.out.println(dataCerta.toString());
		System.out.println(dataObtida.toString());
		System.out.println(dataCerta.compareTo(dataObtida));
		Assert.assertTrue(dataCerta.toString().equals(dataObtida.toString()));
	}

	@Ent�o("^a pontua��o recebida ser� de (\\d+) pontos?$")
	public void aPontuacaoRecebidaSeraDePontos(int arg1) {
	    Assert.assertEquals(arg1, nota.getPontuacao());
	}


}
