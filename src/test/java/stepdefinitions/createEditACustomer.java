package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.CommonPageElements;
import pages.CreateEditACustomerPage;
import pages.RegistrationPage;
import pojos.RegisteredUser;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.WriteToTxt;

import java.io.IOException;


public class createEditACustomer {

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

    @And("user enters first name of customer")
    public void userEntersFirstNameOfCustomer() {
        createEditACustomerPage.firstName.clear();
        createEditACustomerPage.firstName.sendKeys("Camelia");
    }

    @And("user enters last name of customer")
    public void userEntersLastNameOfCustomer() {
        createEditACustomerPage.lastName.clear();
        createEditACustomerPage.lastName.sendKeys("Mueller");
    }

    @And("user enters middle initial of customer")
    public void userEntersMiddleInitialOfCustomer() {
        createEditACustomerPage.middleInitial.sendKeys("M");
    }

    @And("user enters Mobile Phone Number of customer")
    public void userEntersMobilePhoneNumberOfCustomer() {
        createEditACustomerPage.mobilePhoneNumber.clear();
        createEditACustomerPage.mobilePhoneNumber.sendKeys("111-222-3333");
    }

    @And("user enters phone number of customer")
    public void userEntersPhoneNumberOfCustomer() {
        createEditACustomerPage.phoneNumber.clear();
        createEditACustomerPage.phoneNumber.sendKeys("123-456-7890");
    }

    @And("user enters Zip Code of customer")
    public void userEntersZipCodeOfCustomer() {
        createEditACustomerPage.zipCode.sendKeys("12345");
    }

    @And("user enters Address of customer")
    public void userEntersAddressOfCustomer() {
        createEditACustomerPage.address.clear();
        createEditACustomerPage.address.sendKeys("221 S Baker Street");
    }

    @And("user enters City of customer")
    public void userEntersCityOfCustomer() {
        createEditACustomerPage.city.sendKeys("Miami");
    }

    @And("user enters Ssn of customer")
    public void userEntersSsnOfCustomer() {

    }
    @And("user edits name of customer")
    public void userEditsNameOfCustomer() {
        createEditACustomerPage.firstName.clear();
        createEditACustomerPage.firstName.sendKeys("Hannah");
    }

    @When("user clicks on the save button button")
    public void userClicksOnTheEnterButton() {
        createEditACustomerPage.saveButton.click();
    }

    @Then("verify the {string} is not displayed")
    public void verifyTheIsNotDisplayed(String arg0) {
    }

    @And("user edits last name of customer")
    public void userEditsLastNameOfCustomer() {
        createEditACustomerPage.lastName.clear();
        createEditACustomerPage.lastName.sendKeys("Akyol");
    }

    @And("user edits Middle Initial of customer")
    public void userEditsMiddleInitialOfCustomer() {
        createEditACustomerPage.middleInitial.clear();
        createEditACustomerPage.middleInitial.sendKeys("G");
    }

    @And("user edits Email of customer")
    public void userEditsEmailOfCustomer() {
        createEditACustomerPage.email.clear();
        createEditACustomerPage.email.sendKeys("zehraakyol@gmail.com");
    }

    @And("user edits Mobile Phone Number of customer")
    public void userEditsMobilePhoneNumberOfCustomer() {
        createEditACustomerPage.mobilePhoneNumber.clear();
        createEditACustomerPage.mobilePhoneNumber.sendKeys("111-222-3333");
    }
    @And("user edits Phone Number of customer")
    public void userEditsPhoneNumberOfCustomer() {
        createEditACustomerPage.phoneNumber.clear();
        createEditACustomerPage.phoneNumber.sendKeys("444-555-6666");

    }
    @And("user edits Zip Code of customer")
    public void userEditsZipCodeOfCustomer() {
        createEditACustomerPage.zipCode.clear();
        createEditACustomerPage.zipCode.sendKeys("54321");
    }
    @And("user edits Address of customer")
    public void userEditsAddressOfCustomer() {
        createEditACustomerPage.address.clear();
        createEditACustomerPage.address.sendKeys("New Address 2021");
    }
    @And("user edits City of customer")
    public void userEditsCityOfCustomer() {
        createEditACustomerPage.city.clear();
        createEditACustomerPage.city.sendKeys("Sarasota");
    }
    @And("user edits Ssn of customer")
    public void userEditsSsnOfCustomer() {
        createEditACustomerPage.ssn.clear();
        createEditACustomerPage.ssn.sendKeys("111-22-3333");
    }

    @And("user edits date of customer account")
    public void userEditsDateOfCustomerAccount() {
        createEditACustomerPage.createDate.click();
        createEditACustomerPage.createDate.sendKeys("12/12/2021 12:00 AM");
    }
    @And("user edits Country_of_customer")
    public void userEditsCountry_of_customer() {
        createEditACustomerPage.country.sendKeys("USA");

    }
    @And("user edits State_of_customer")
    public void userEditsState_of_customer() {
        createEditACustomerPage.state.sendKeys("Florida");
    }

    @And("user edits User_name_of_customer")
    public void userEditsUser_name_of_customer() {
    }

    @And("user edits Account_of_customer")
    public void userEditsAccount_of_customer() {
    }

}

//        //Reusable Metota metot ekledim
//        ReusableMethods.selectFromDropDown(createEditACustomerPage.Account, 1);
//        ReusableMethods.selectFromDropDown(createEditACustomerPage.Account, 3);
//    }
//
//    @And("user edits Zelle_of_customer")
//    public void userEditsZelle_of_customer() throws InterruptedException {
//
//        WebElement checkbox1= Driver.getDriver().findElement(By.xpath("//input[@name='zelleEnrolled']"));
//
//        if(!checkbox1.isSelected()){
//            checkbox1.click();
//        }
//    }
//}