package definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.SaucedemoMainSteps;
import steps.ValidationSteps;
import cucumber.api.DataTable;
import steps.SaucedemoDataSteps;
import steps.SaucedemoFinalSteps;


import javax.xml.crypto.Data;
import java.util.List;

public class StepsDefinitions {


    @Steps
    ValidationSteps validationSteps;

    @Steps
    SaucedemoMainSteps saucedemoMainSteps;

    @Steps
    SaucedemoDataSteps saucedemoDataSteps;

    @Steps
    SaucedemoFinalSteps saucedemoFinalSteps;

    @Given("^Autentico en saucedemo con usuario \"([^\"]*)\" y contraseña \"([^\"]*)\"$")
    public void autenticoEnSaucedemoConUsuarioYContraseña(String Usuario, String Clave) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        validationSteps.login_saucedemo(Usuario, Clave);
    }



    @When("^Agrego items al carrito de compras y hago click en ShoppingCart$")
    public void agregoItemsAlCarritoDeComprasYHagoClickEnShoppingCart() {
        // Write code here that turns the phrase above into concrete actions

        try{
            Thread.sleep(5000);
            saucedemoMainSteps.llenar_carrito();
        }catch(InterruptedException e){
        }
    }


    @When("^Verifico los productos y ingreso Nombre,  Apellido  y codigo postal$")
    public void verifico_los_productos_y_ingreso_Nombre_Apellido_y_codigo_postal(DataTable dtDatosForm) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        saucedemoMainSteps.checkbox();
        List<List<String>> data = dtDatosForm.raw();
        for(int i=1; i<data.size(); i++){
            saucedemoDataSteps.diligenciarInformacionCompra(data, i);
            try{
                Thread.sleep(5000);
            }catch(InterruptedException e){
            }
    }


    }

    @Then("^Verifico que se pueda comprar el producto$")
    public void verificoQueSePuedaComprarElProducto() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        saucedemoFinalSteps.realizarCompra();
    }


}
