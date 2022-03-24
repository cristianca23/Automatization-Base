package steps;

import net.thucydides.core.annotations.Step;
import pageobjects.SaucedemoMainPage;

public class SaucedemoMainSteps {

    SaucedemoMainPage saucedemoMainPage;

    @Step
    public void llenar_carrito(){
        saucedemoMainPage.firstProduct();
        saucedemoMainPage.secondProduct();
        saucedemoMainPage.shoppingCartButton();

    }
    @Step
    public void checkbox(){
        saucedemoMainPage.checkoutButton();

    }

}
