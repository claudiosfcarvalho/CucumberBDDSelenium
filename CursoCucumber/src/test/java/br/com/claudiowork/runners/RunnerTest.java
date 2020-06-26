package br.com.claudiowork.runners;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","html:target/report-html", "json:target/report.json"}, //imprime tudo no console como execução padrao no cucumber mas agora executado com o junit 
				monochrome = false, //retira todas as formatações e caracteres especiais no console
				snippets = SnippetType.CAMELCASE,//gera as implementações sugeridas em camel case
				dryRun = false, //faz o teste dando skipped em tudo apenas para validar se tem erro - Ativa com true
				strict = false, //faz com que o teste seja feito de forma completa, se tiver faltando definição apresenta erro se ativo
				features ="src/test/resources/features",
				glue = "br.com.claudiowork.steps",
				//tags = {"@esse, ~@ignore"}
				tags= {"@srbarriga","~@ignore"}
				)
public class RunnerTest {

}
