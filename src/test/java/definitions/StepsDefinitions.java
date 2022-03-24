package definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.ValidationSteps;

public class StepsDefinitions {


    @Steps
    ValidationSteps validationSteps;

    @Given("^Autentico en saucedemo con usuario \"([^\"]*)\" y contraseña \"([^\"]*)\"$")
    public void autenticoEnSaucedemoConUsuarioYContraseña(String Usuario, String Clave) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        validationSteps.login_saucedemo(Usuario, Clave);
        throw new PendingException();
    }




    @When("^Agrego items al carrito de compras y hago click en ShoppingCart$")
    public void agrego_items_al_carrito_de_compras_y_hago_click_en_ShoppingCart() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^Verifico los productos y ingreso Nombre Juan, Apellido Velez y codigo postal (\\d+)$")
    public void verifico_los_productos_y_ingreso_Nombre_Juan_Apellido_Velez_y_codigo_postal(int arg1) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Verifico que se pueda comprar el producto$")
    public void verifico_que_se_pueda_comprar_el_producto() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


}
