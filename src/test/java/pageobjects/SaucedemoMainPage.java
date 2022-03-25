package pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class SaucedemoMainPage extends PageObject {

    //Añado el bolso
    @FindBy (id="add-to-cart-sauce-labs-backpack")
    public WebElementFacade addToCart01;

    //Añado la chaqueta de 50usd
    @FindBy (id="add-to-cart-sauce-labs-fleece-jacket")
    public WebElementFacade addToCart02;

    //Click en el carrito
    @FindBy (xpath = "//*[@id='shopping_cart_container']/a")
    public WebElementFacade shoppingCart;

    //Click en el boton CHECKOUT
    @FindBy (xpath = "//*[@id='checkout']")
    public WebElementFacade checkout;

    //Ingreso el nombre
    @FindBy (id="first-name" )
    public WebElementFacade firstName;

    //Ingreso el Apellido
    @FindBy (id="last-name" )
    public WebElementFacade lastName;

    //Ingreso el Codígo
    @FindBy (id="postal-code" )
    public WebElementFacade postalCode;

    //Boton Continuar
    @FindBy(id="continue")
    public WebElementFacade bttonContinue;

    //Boton Finish
    @FindBy(id="finish")
    public WebElementFacade bttonFinish;

    // Thank you for your order
    @FindBy(xpath ="//*[@id='checkout_complete_container']/h2" )
    public WebElementFacade thanks;

    //Cancelo la orden
    @FindBy(id="cancel")
    public WebElementFacade bttonCancel;

    //Cancelo item1
    @FindBy(id="remove-sauce-labs-backpack")
    public WebElementFacade bttonRemove1;

    //Cancelo item1
    @FindBy(id="remove-sauce-labs-fleece-jacket")
    public WebElementFacade bttonRemove2;

    //Boton de retorno a Home
    @FindBy(id="continue-shopping")
    public WebElementFacade bttonContinueShopping;

    //Dialogo de CHECKOUT
    @FindBy(xpath ="//*[@id='header_container']/div[2]/span" )
    public WebElementFacade tituloCheckout;





    // SE CREAN METODOS PARA INTERACTUAR CON CADA OBJETO DE LA PAGINA

    //Agrego el primer producto
    public void firstProduct (){
        addToCart01.click();
    }

    //Agrego el segundo producto
    public void secondProduct (){
        addToCart02.click();
    }

    //Click al boton carrito
    public void shoppingCartButton(){
        shoppingCart.click();
    }

    //Click al boton checkout
    public void checkoutButton(){
        checkout.click();
    }

    // Ingreso el nombre
    public void checkFirstName(String datoPrueba){
        firstName.click();
        firstName.clear();
        firstName.sendKeys(datoPrueba);
    }
    // Ingreso el apellido
    public void checkLastName(String datoPrueba){
        lastName.click();
        lastName.clear();
        lastName.sendKeys(datoPrueba);
    }
    // Ingreso el postal code
    public void checkPostalCode(String datoPrueba){
        postalCode.click();
        postalCode.clear();
        postalCode.sendKeys(datoPrueba);
    }

    //Dar click en continuar
    public void checkContinue(){
        bttonContinue.click();
    }

    //Dar click en el boton Finish
    public void checkFinish(){
        bttonFinish.click();
    }

    //Comparar dialogos
    public void verificarOrden (){
        String label = "THANK YOU FOR YOUR ORDER";
        String strMensaje = thanks.getText();
        assertThat(strMensaje, containsString(label));
    }

    //Cancelaremos la orden
    public void cancelarOrden(){
        bttonCancel.click();
    }

    //Cancelo el primer item
    public void cancelarItems(){
        bttonRemove1.click();
        bttonRemove2.click();
    }

    //Boton retorno a Home
    public void returnContinueShopping(){
        bttonContinueShopping.click();
    }

    //Boton de verificar si se esta en el OVERVIEW
    public void verificarOverview (){
        String label = "CHECKOUT: OVERVIEW\n";
        String strMensaje = tituloCheckout.getText();
        assertThat(strMensaje, containsString(label));
    }

}
