package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.CreateEditACustomerPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.List;

import static junit.framework.TestCase.*;

public class US10_createEditACustomer {
    CreateEditACustomerPage createEditACustomerPage = new CreateEditACustomerPage();
    ReusableMethods reusableMethods = new ReusableMethods();

    @And("user enters first name of customer")
    public void userEntersFirstNameOfCustomer() {
        createEditACustomerPage.firstName.clear();
        createEditACustomerPage.firstName.sendKeys("Camelia");
    }


    @Then("take the screenshot")
    public void takeTheScreenshot() throws IOException {
        reusableMethods.getScreenshot("US10");

    }

    @And("user enters last name of customer")
    public void userEntersLastNameOfCustomer() {
        createEditACustomerPage.lastName.clear();
        createEditACustomerPage.lastName.sendKeys("Cline");
    }

    @And("user enters Mobile Phone Number of customer")
    public void userEntersMobilePhoneNumberOfCustomer() {
        createEditACustomerPage.mobilePhoneNumber.clear();
        createEditACustomerPage.mobilePhoneNumber.sendKeys("222-333-4444");
    }

    @And("user enters Address of customer")
    public void userEntersAddressOfCustomer() {
        createEditACustomerPage.address.clear();
        createEditACustomerPage.address.sendKeys("221 S Baker Street");
    }


    @Then("{string} message is displayed for City textbox")
    public void messageIsDisplayedForCityTextbox(String arg0) {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(createEditACustomerPage.cityRequired.isDisplayed());;
    }

    @And("user leaves as blank the address")
    public void userLeavesAsBlankTheAddress() {
        createEditACustomerPage.address.clear();
    }

    @And("user leaves blank as blank the City")
    public void userLeavesBlankAsBlankTheCity() {
        createEditACustomerPage.city.clear();
    }

//    @And("user leaves as blank the Country")
//    public void userLeavesAsBlankTheCountry() {
//        createEditACustomerPage.country.clear();
//    }

    @And("user leaves as blank the State")
    public void userLeavesAsBlankTheState() {
        createEditACustomerPage.state.clear();
    }

//    @Then("{string} message is displayed for Country")
//    public void messageIsDisplayedForCountry(String arg0) {
//
//    }

//    @Then("{string} message is displayed for State")
//    public void messageIsDisplayedForState(String arg0) {
//    }

    @Then("verify the adress error message is displayed")
    public void verifyTheAdressErrorMessageIsDisplayed() {
        ReusableMethods.waitFor(2);
        assertTrue(createEditACustomerPage.addressRequired.isDisplayed());
    }

    @Then("verify the Country error message is not displayed")
    public void verifyTheCountryErrorMessageIsNotDisplayed() {
        List<WebElement> errorList = Driver.getDriver().findElements(By.xpath("//div[@class='invalid-feedback']"));
        System.out.println(errorList.size());
        Assert.assertEquals(1,errorList.size());
    }

    @Then("verify the State error message is not displayed")
    public void verifyTheStateErrorMessageIsNotDisplayed() {
        String state = createEditACustomerPage.state.getText();
        System.out.println(state + "OK");
        Assert.assertNotEquals("", state);

    }

    @And("user enters State of customer")
    public void userEntersStateOfCustomer() {
        createEditACustomerPage.state.sendKeys("OK");

    }
}
