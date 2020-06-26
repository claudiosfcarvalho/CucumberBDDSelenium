package br.com.claudiowork.runners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteAmbiente {

	public static void main(String[] args) {
		//testa configuração do selenium
		//*inicializar driver do selenium
		System.setProperty("webdriver.chrome.driver", "D:\\2 - Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://srbarriga.herokuapp.com");
		driver.navigate().to("https://srbarriga.herokuapp.com");
	}
}
