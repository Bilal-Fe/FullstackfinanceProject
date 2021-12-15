package stepdefinitions.uisteps;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPageElements;
import pages.CreateEditACustomerPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import static junit.framework.TestCase.assertTrue;

public class US09_createEditACustomer {

    CreateEditACustomerPage createEditACustomerPage = new CreateEditACustomerPage();
    ReusableMethods reusableMethods = new ReusableMethods();

    @Then("verify the {string} is displayed")
    public void verifyTheIsDisplayed(String arg0) {
        ReusableMethods.waitFor(2);
        assertTrue(createEditACustomerPage.greenline.isDisplayed());
    }
    @And("user verifies the Zip Code of the customer")
    public void userVerifiesTheZipCodeOfTheCustomer() {
        Assert.assertTrue(createEditACustomerPage.zipCode.isDisplayed());
    }


    @Then("user verifies the first name of the customer")
    public void userVerifiesTheFirstNameOfTheCustomer() {
        Assert.assertTrue(createEditACustomerPage.firstName.isDisplayed());
    }

    @And("user verifies the last name of the customer")
    public void userVerifiesTheLastNameOfTheCustomer() {
        Assert.assertTrue(createEditACustomerPage.lastName.isDisplayed());
    }

    @And("user verifies middle initial of the customer")
    public void userVerifiesMiddleInitialOfTheCustomer() {
        Assert.assertTrue(createEditACustomerPage.MiddleInitial.isDisplayed());
    }

    @When("user verifies the email of the customer")
    public void userVerifiesTheEmailOfTheCustomer() {

        Assert.assertTrue(createEditACustomerPage.email.isDisplayed());
    }

    @And("user verifies the mobile phone number of the customer")
    public void userVerifiesTheMobilePhoneNumberOfTheCustomer() {
        Assert.assertTrue(createEditACustomerPage.mobilePhoneNumber.isDisplayed());
    }

    @And("user verifies the phone number of the customer")
    public void userVerifiesThePhoneNumberOfTheCustomer() {
        Assert.assertTrue(createEditACustomerPage.phoneNumber.isDisplayed());

    }

    @And("user verifies the address of the customer")
    public void userVerifiesTheAddressOfTheCustomer() {
        Assert.assertTrue(createEditACustomerPage.address.isDisplayed());
    }

    @And("user verifies the city of the customer")
    public void userVerifiesTheCityOfTheCustomer() {
        Assert.assertTrue(createEditACustomerPage.city.isDisplayed());
    }

    @And("user verifies the Ssn of the customer")
    public void userVerifiesTheSsnOfTheCustomer() {
        Assert.assertTrue(createEditACustomerPage.ssn.isDisplayed());
    }

    @Then("User verifies the Create Date of the customer")
    public void userVerifiesTheCreateDateOfTheCustomer() {
        Assert.assertTrue(createEditACustomerPage.createDate.isDisplayed());
    }

    @And("user verifies the Country of the customer")
    public void userVerifiesTheCountryOfTheCustomer() {
        Assert.assertTrue(createEditACustomerPage.country.isDisplayed());
    }

    @And("user verifies the State of the customer")
    public void userVerifiesTheStateOfTheCustomer() {
        Assert.assertTrue(createEditACustomerPage.state.isDisplayed());
    }

    @Then("verify the {string} is displayed for SSN")
    public void verifyTheIsDisplayedForSSN(String arg0) {
        ReusableMethods.waitFor(2);
        assertTrue(createEditACustomerPage.greenline.isDisplayed());
    }

}
