package runners;

import cucumber.api.SnippetType;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
@RunWith(CucumberWithSerenity.class)
//@CucumberOptions (features = "src/test/resources/features/", tags = "@SmokeTest")
@CucumberOptions (  plugin = {"pretty"},
                    features = "src/test/resources/gherkin",
                    glue = "definitions",
                    snippets= SnippetType.CAMELCASE) //Se puede ejecutar toda la feature
//@CucumberOptions (features = "src/test/resources/features/Nombre.feature", tags = "@CasoAlterno") // Ejecuta solo un escenario de prueba
public class RunnerTags {

}