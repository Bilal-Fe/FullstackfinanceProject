package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CommonPageElements;
import pages.CreateEditACustomerPage;

public class US10_createEditACustomer {
    CreateEditACustomerPage createEditACustomerPage = new CreateEditACustomerPage();
    CommonPageElements commonPageElements = new CommonPageElements();
    Faker faker = new Faker();



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
}
