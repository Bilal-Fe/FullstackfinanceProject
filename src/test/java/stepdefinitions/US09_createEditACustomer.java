package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.CommonPageElements;
import pages.CreateEditACustomerPage;
import utilities.ConfigReader;

public class US09_createEditACustomer {

    CreateEditACustomerPage createEditACustomerPage = new CreateEditACustomerPage();
    CommonPageElements commonPageElements = new CommonPageElements();
    Faker faker = new Faker();

    @Given("user clicks sign in button")
    public void user_clicks_register_button() {
        commonPageElements.clickSignInButton();
    }

    @And("user enters username of customer")
    public void userEntersUsernameOfCustomer() {
        commonPageElements.username.sendKeys(ConfigReader.getProperty("employee_user_name"));
    }
    @And("user enters password of customer")
    public void userEntersPasswordOfCustomer() {
        commonPageElements.password.sendKeys(ConfigReader.getProperty("employee_password"));
    }
    @And("user clicks sign in button in page")
    public void userClicksSignInButtonInPage() {
        commonPageElements.signin.click();
    }
    @And("user clicks my operations button")
    public void userClicksMyOperationsButton() {
        commonPageElements.operations.click();
    }

    @And("user clicks manage customers button")
    public void userClicksManageCustomersButton() {
        commonPageElements.manageCustomers.click();
    }

    @And("user clicks create A New Customer button")
    public void userClicksCreateANewCustomerButton() {
        commonPageElements.createANewCustomer.click();
    }

    @And("user enters ssn number")
    public void userEntersSsnNumber() {
        createEditACustomerPage.SSN.sendKeys(ConfigReader.getProperty("customer_ssn"));
    }

    @And("user clicks on the search button")
    public void userClicksOnTheSearchButton() {
        createEditACustomerPage.button.click();
    }
    @Then("verify the {string} is displayed")
    public void verifyTheIsDisplayed(String arg0) {
        Assert.assertTrue(createEditACustomerPage.translationNotFoundMessage.isDisplayed());
    }
    @Then("take the screenshot")

    public void takeTheScreenshot() {
    }


}
