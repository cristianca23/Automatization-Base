package steps;
import net.thucydides.core.annotations.Step;

import pageobjects.SaucedemoLoginPage;
public class ValidationSteps {

    SaucedemoLoginPage saucedemoLoginPage;

    @Step
    public void login_saucedemo(String strUsuario, String strPass){

        saucedemoLoginPage.open();

        saucedemoLoginPage.IngresarDatos(strUsuario, strPass);
    }

}
