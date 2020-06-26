package br.com.claudiowork.steps;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import br.com.claudiowork.converters.DateConverter;
import cucumber.api.Transform;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Ent�o;
import cucumber.api.java.pt.Quando;
import junit.framework.Assert;

public class AprenderCucumber {

	@Dado("^que criei o arquivo corretamente$")
	public void queCrieiOArquivoCorretamente() {
	    
	}

	@Quando("^execut�-lo$")
	public void executaLo() {
	    
	}

	@Ent�o("^a especifica��o deve finalizar com sucesso$")
	public void aEspecificacaoDeveFinalizarComSucesso() {
	    
	}

	private Long contador = new Long(0);
	@Dado("^que o valor do contador � (\\d+)$")
	public void queOValorDoContadorEh(Long arg1) {
	    contador = arg1;
	    
	}

	@Quando("^eu incrementar em (\\d+)$")
	public void euIncrementarEm(Long arg1) {
	    contador+=arg1;
	    
	}

	@Ent�o("^o valor do contador ser� (\\d+)$")
	public void oValorDoContadorSera(Long arg1) {
	    Assert.assertEquals(arg1, contador);
	    
	}
	
	Date entrega = new Date();
	//@Dado("^que a entrega � dia (\\d+)/(\\d+)/(\\d+)$")
	@Dado("^que a entrega � dia (.*)$")
	public void queAEntregaEhDia(@Transform(DateConverter.class) Date data) {
	    //Calendar cal = Calendar.getInstance();
	    //cal.set(Calendar.YEAR, ano);
	    //cal.set(Calendar.MONTH, mes - 1);
	    //cal.set(Calendar.DAY_OF_MONTH, dia);
	    //entrega = cal.getTime();
		entrega = data;
	}

//	@Quando("^a entrega atrasar em (\\d+) (.+)$")
	@Quando("^a entrega atrasar em (\\d+) (dia|dias|m�s|meses|ano|anos)$")
	public void aEntregaAtrasarEmDias(int qtd,String tempo) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(entrega);
		int calendarTime = tempo.contains("dia") ? Calendar.DAY_OF_MONTH : (tempo.contains("mês") ||tempo.contains("meses") ? Calendar.MONTH : Calendar.YEAR);
		cal.add(calendarTime, qtd);
		entrega = cal.getTime();
	}

	//@Ent�o("^a entrega ser� efetuada em (\\d{2}\\/\\d{2}\\/\\d{4})$")
	@Ent�o("^a entrega ser� efetuada em (.*)$")
	public void aEntregaSeraEfetuadaEm(@Transform(DateConverter.class) Date data) {
	    DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	    String dataFormat = format.format(entrega);
	    Assert.assertEquals(data, entrega);
	}
	
	@Dado("^que o ticket( especial)? � (A.\\d{3})$")
	public void queOTicketEhAF(String especial, String ticket) {
	    
	}

	//@Dado("^que o valor da passagem é R\\$ (\\d+,\\d+)$")
	@Dado("^que o valor da passagem � R\\$ (.*)$")
	public void queOValorDaPassagemEhR$(BigDecimal valor) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	//@Dado("^que o nome do passageiro é \"([^\"]*)\"$")
	@Dado("^que o nome do passageiro � \"(.{5,20})\"$")
	public void queONomeDoPassageiroEh(String arg1) {
	    
	}

	@Dado("^que o telefone do passageiro � (9\\d{3}-\\d{4})$")
	public void queOTelefoneDoPassageiroEh(String telefone) {
	   
	}

	@Quando("^criar os steps$")
	public void criarOsSteps() {

	}

	@Ent�o("^o teste vai funcionar$")
	public void oTesteVaiFuncionar() {

	}

	
}
