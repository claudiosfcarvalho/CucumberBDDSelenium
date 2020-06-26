package br.com.claudiowork.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class srbarrigaSteps {

	@Dado("^que estou acessando a aplicação$")
	public void queEstouAcessandoAAplicacao() {
		//testa configuraÃ§Ã£o do selenium
		//*inicializar driver do selenium
		System.setProperty("webdriver.chrome.driver", "D:\\2 - Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://srbarriga.herokuapp.com");
	}

	@Quando("^informo o usuário \"([^\"]*)\"$")
	public void informoOUsuario(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Quando("^a senha \"([^\"]*)\"$")
	public void aSenha(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Quando("^seleciono entrar$")
	public void selecionoEntrar() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Então("^visualizo a página inicial$")
	public void visualizoAPaginaInicial() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Quando("^seleciono Contas$")
	public void selecionoContas() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Quando("^seleciono Adicionar$")
	public void selecionoAdicionar() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Quando("^informo a conta \"([^\"]*)\"$")
	public void informoAConta(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Quando("^seleciono Salvar$")
	public void selecionoSalvar() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Então("^a conta é inserida com sucesso$")
	public void aContaEhInseridaComSucesso() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
