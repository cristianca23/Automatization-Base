package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import pageobjects.SaucedemoMainPage;
import pageobjects.SaucedemoLoginPage;

public class SaucedemoFinalSteps {

    SaucedemoMainPage saucedemoMainPage;
    SaucedemoLoginPage saucedemoLoginPage;

    @Step
   public void realizarCompra(){
        saucedemoMainPage.checkFinish();
        saucedemoMainPage.verificarOrden();
    }

    @Step
    public void cancelarCompra(){
        //saucedemoMainPage.returnContinueShopping();
        saucedemoMainPage.cancelarOrden();
        saucedemoMainPage.cancelarItems();
    }

    @Step
    public void verificarHomeAfter(){
        saucedemoLoginPage.verificarHome();
    }
}
