package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
@RunWith(CucumberWithSerenity.class)
//@CucumberOptions (features = "src/test/resources/features/", tags = "@SmokeTest")
@CucumberOptions (features = "src/test/resources/gherkin/saucedemo.feature", tags = "@CasoExitoso") //Se puede ejecutar toda la feature
//@CucumberOptions (features = "src/test/resources/features/Nombre.feature", tags = "@CasoAlterno") // Ejecuta solo un escenario de prueba
public class RunnerTags {

}