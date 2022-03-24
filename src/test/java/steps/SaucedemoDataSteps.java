package steps;

import net.thucydides.core.annotations.Step;
import pageobjects.SaucedemoMainPage;

import java.util.List;

public class SaucedemoDataSteps {

    SaucedemoMainPage saucedemoMainPage;


    @Step
    public void diligenciarInformacionCompra(List<List<String>> data, int id){
        saucedemoMainPage.checkFirstName(data.get(id).get(2).trim());
        saucedemoMainPage.checkLastName(data.get(id).get(3).trim());
        saucedemoMainPage.checkPostalCode(data.get(id).get(4).trim());
        saucedemoMainPage.checkContinue();

    }
}
