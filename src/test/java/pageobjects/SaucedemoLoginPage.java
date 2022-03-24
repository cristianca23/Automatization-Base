package pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.WebElementFacade;

@DefaultUrl("https://www.saucedemo.com/")
public class SaucedemoLoginPage extends PageObject {

    //Campo Username
    @FindBy(id="user-name")
    public WebElementFacade txtUsername;

    //Campo Password
    @FindBy(id="password")
    public WebElementFacade txtPassword;

    //Boton Login
    @FindBy(id="login-button")
    public WebElementFacade btnSignIn;


    //Dialogo PRODUCTS principal
    @FindBy(xpath = "//*[@id='header_container']/div[2]/span")
    public WebElementFacade HomPpal;


    public void IngresarDatos (String strUsuario, String strPass){
        txtUsername.sendKeys(strUsuario);
        txtPassword.sendKeys(strPass);
        btnSignIn.click();
    }
}
