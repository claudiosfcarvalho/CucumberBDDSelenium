package br.com.claudiowork.servico;

import java.math.BigDecimal;
import java.util.Date;

import br.com.claudiowork.entidades.Filme;
import br.com.claudiowork.entidades.NotaAluguel;
import br.com.claudiowork.entidades.TipoAluguel;
import br.com.claudiowork.utils.DateUtils;

public class AluguelService {

	private BigDecimal fatorExtendido = new BigDecimal(2.0);
	private BigDecimal fatorSemanal = new BigDecimal(3.0);
	private NotaAluguel nota;
	private Date dataEntrega;
	private int qtdDias;
	
	public NotaAluguel alugar(Filme filme,TipoAluguel tipoAluguel) {
		if (filme.getEstoque() == 0)
			throw new RuntimeException("Filme sem estoque");
		nota = new NotaAluguel();
		if (tipoAluguel == null)
			tipoAluguel = TipoAluguel.COMUM;
		switch (tipoAluguel) {
		case COMUM: {
			qtdDias = 1;
			nota.setPontuacao(1);
			nota.setPreco(filme.getValorAluguel());
			break;
		}
		case EXTENDIDO: {
			qtdDias = 3;
			nota.setPreco(filme.getValorAluguel().multiply(fatorExtendido));
			nota.setPontuacao(2);
			break;
		}
		case SEMANAL:{
			qtdDias = 7;
			nota.setPreco(filme.getValorAluguel().multiply(fatorSemanal));
			nota.setPontuacao(3);
			break;
		}
		default:
			break;
		}
		
		dataEntrega = DateUtils.somaPeriodo(new Date(),qtdDias,"dia");
		nota.setDataEntrega(dataEntrega);
		filme.setEstoque(filme.getEstoque() - 1);
		return nota;
	}
	
	public AluguelService() {
		nota = new NotaAluguel();
	}

	public Date getDataEntrega() {
		return dataEntrega;
	}
	
	public void setDataEntrega(Date data) {
		this.dataEntrega = data;
	}
}
