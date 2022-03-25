package steps;

import net.thucydides.core.annotations.Step;
import pageobjects.SaucedemoMainPage;

public class SaucedemoFinalSteps {

    SaucedemoMainPage saucedemoMainPage;

    @Step
   public void realizarCompra(){
        saucedemoMainPage.checkFinish();
        saucedemoMainPage.verificarOrden();
    }
}
