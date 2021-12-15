package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPageElements;
import pages.RegistrationPage;
import pojos.RegisteredUser;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class UserRegistrationStepDefinitions {

    CommonPageElements commonPageElements = new CommonPageElements();
    RegistrationPage registrationPage = new RegistrationPage();
    Faker faker = new Faker();
    RegisteredUser registeredUser = new RegisteredUser();
    String elevenDigitsPhoneNumber = "234-456-21223";
    String tenDigitsSsnNumber = "345-33-23434";

    @Given("user is on the application page")
    public void user_is_on_the_application_page() {
        Driver.getDriver().get("https://www.gmibank.com/");
    }

    @Given("user clicks register button")
    public void user_clicks_register_button() {
        commonPageElements.clickRegisterButton();
    }

    @Given("user is on the gmi bank application page")
    public void user_is_on_the_gmi_bank_application_page() {
        Driver.getDriver().get("https://www.gmibank.com/");
    }

    @When("user enters ssn {string}")
    public void user_enters_ssn(String ssnNumber) {
        ssnNumber = faker.idNumber().ssnValid();
        registeredUser.setSsn(ssnNumber);
        ReusableMethods.waitAndSendText(registrationPage.ssn, ssnNumber);

    }
    @When("user enters first name {string}")
    public void user_enters_first_name(String fName) {
        fName = faker.name().firstName();
        registeredUser.setFirstName(fName);
        ReusableMethods.waitAndSendText(registrationPage.firstName, fName);
    }
    @When("user enters last name {string}")
    public void user_enters_last_name(String lName) {
        lName = faker.name().lastName();
        registeredUser.setLastName(lName);
        ReusableMethods.waitAndSendText(registrationPage.lastName, lName);
    }
    @When("user enters address {string}")
    public void user_enters_address(String address) {
        address = faker.address().fullAddress();
        registeredUser.setAddress(address);
        ReusableMethods.waitAndSendText(registrationPage.address, address);
    }
    @When("user enters phone number {string}")
    public void user_enters_phone_number(String phoneNumber) {
        phoneNumber = faker.number().digits(10);
        registeredUser.setPhoneNumber(phoneNumber);
        ReusableMethods.waitAndSendText(registrationPage.phoneNumber, phoneNumber);
    }
    @When("user enters username {string}")
    public void user_enters_username(String username) {
        username = faker.name().username();
        registeredUser.setUsername(username);
        ReusableMethods.waitAndSendText(registrationPage.username, username);
    }
    @When("user enters email {string}")
    public void user_enters_email(String email) {
        email = faker.internet().emailAddress();
        registeredUser.setEmail(email);
        ReusableMethods.waitAndSendText(registrationPage.email, email);
    }

    @When("user enters password and confirm password {string}")
    public void user_enters_password_and_confirm_password(String password) {
        password = faker.internet().password(10, 15, true, true);
        registeredUser.setPassword(password);
        ReusableMethods.waitAndSendText(registrationPage.newPassword, password);
        ReusableMethods.waitAndSendText(registrationPage.confirmPassword, password);
    }

    @When("user clicks on register button")
    public void user_clicks_on_register_button() {
        registrationPage.registerButton.click();
    }
    @Then("verify success_message is displayed")
    public void verify_success_message_is_displayed() throws IOException {
        ReusableMethods.waitForVisibility(registrationPage.registrationSuccessMessage, 5);
        boolean isDisplayed = registrationPage.registrationSuccessMessage.isDisplayed();
        Assert.assertTrue(isDisplayed);
       // WriteToTxt.saveRegisteredUserData(ConfigReader.getProperty("fileNameOfRegisteredUser"), registeredUser);
    }
    @Then("close the application")
    public void close_the_application() {
        Driver.closeDriver();
    }

    @When("user enters all valid required data and invalid nine digits phone number")
    public void user_enters_all_valid_required_data_and_invalid_nine_digits_phone_number(DataTable dataTable) {
        registrationPage.ssn.sendKeys(ReusableMethods.getDataTableData(dataTable, "ssn"));
        registrationPage.firstName.sendKeys(ReusableMethods.getDataTableData(dataTable, "first_name"));
        registrationPage.lastName.sendKeys(ReusableMethods.getDataTableData(dataTable, "last_name"));
        registrationPage.address.sendKeys(ReusableMethods.getDataTableData(dataTable, "address"));
        registrationPage.phoneNumber.sendKeys(ReusableMethods.getDataTableData(dataTable,
                "phone_number"));
        registrationPage.username.sendKeys(ReusableMethods.getDataTableData(dataTable, "username"));
        registrationPage.email.sendKeys(ReusableMethods.getDataTableData(dataTable, "email"));
        registrationPage.newPassword.sendKeys(ReusableMethods.getDataTableData(dataTable,
                "password"));
        registrationPage.confirmPassword.sendKeys(ReusableMethods.getDataTableData(dataTable,
                "password"));
    }


    @Then("verify invalid phone number message is displayed")
    public void verify_invalid_phone_number_message_is_displayed() {
        ReusableMethods.waitForVisibility(registrationPage.invalidPhoneNumberMessage, 5);
        boolean isPhoneErrorDisplayed = registrationPage.invalidPhoneNumberMessage.isDisplayed();
        Assert.assertTrue(isPhoneErrorDisplayed);
    }

    @When("user enter eleven digits phone number")
    public void user_enter_eleven_digits_phone_number() {
        registrationPage.phoneNumber.sendKeys(elevenDigitsPhoneNumber);
    }
    @Then("verify that only {int} digits are in Phone Number textbox")
    public void verify_that_only_digits_are_in_phone_number_textbox(Integer int1) {
        String phoneNumber = registrationPage.phoneNumber.getAttribute("value").replaceAll("-", "");
        Assert.assertEquals(10, phoneNumber.length());
    }
    @When("user enters all valid required data and invalid eight digits ssn")
    public void user_enters_all_valid_required_data_and_invalid_eight_digits_ssn(DataTable dataTable) {
        registrationPage.ssn.sendKeys(ReusableMethods.getDataTableData(dataTable, "ssn"));
        registrationPage.firstName.sendKeys(ReusableMethods.getDataTableData(dataTable, "first_name"));
        registrationPage.lastName.sendKeys(ReusableMethods.getDataTableData(dataTable, "last_name"));
        registrationPage.address.sendKeys(ReusableMethods.getDataTableData(dataTable, "address"));
        registrationPage.phoneNumber.sendKeys(ReusableMethods.getDataTableData(dataTable,
                "phone_number"));
        registrationPage.username.sendKeys(ReusableMethods.getDataTableData(dataTable, "username"));
        registrationPage.email.sendKeys(ReusableMethods.getDataTableData(dataTable, "email"));
        registrationPage.newPassword.sendKeys(ReusableMethods.getDataTableData(dataTable,
                "password"));
        registrationPage.confirmPassword.sendKeys(ReusableMethods.getDataTableData(dataTable,
                "password"));
    }
    @Then("verify invalid ssn number message is displayed")
    public void verify_invalid_ssn_number_message_is_displayed() {
        boolean isInvalidSsnMessageDisplayed = registrationPage.invalidSsnMessage.isDisplayed();
        Assert.assertTrue(isInvalidSsnMessageDisplayed);
    }
    @When("user enter eleven digits ssn number")
    public void user_enter_eleven_digits_ssn_number() {
        registrationPage.ssn.sendKeys(tenDigitsSsnNumber);
    }
    @Then("verify that only nine digits are in SSN Number textbox")
    public void verify_that_only_nine_digits_are_in_ssn_number_textbox() {
        String enteredSsnNumber = registrationPage.ssn.getAttribute("value").replaceAll("-", "");
        int lengthOfSsn = enteredSsnNumber.length();
        Assert.assertEquals(9, lengthOfSsn);
    }

    @Given("user click on login button")
    public void user_click_on_login_button() {
        commonPageElements.clickSignInButton();
    }

    @When("user enters invalid ssn {string}")
    public void user_enters_invalid_ssn(String invalidSsn) {
        registrationPage.ssn.sendKeys(invalidSsn);
    }

    @Then("Verify SSN text box does not contain {string}")
    public void verify_ssn_text_box_does_not_contain(String symbol) {
        String invalidSsn = registrationPage.ssn.getAttribute("value");
        System.out.println(invalidSsn);
        Assert.assertFalse("SSN number contains invalid symbol",invalidSsn.contains(symbol));
    }

    @When("user enters invalid phone number {string}")
    public void user_enters_invalid_phone_number(String invalidPhone) {
        registrationPage.phoneNumber.sendKeys(invalidPhone);
    }
    @Then("Verify Phone Number text box does not contain {string}")
    public void verify_phone_number_text_box_does_not_contain(String symbol) {
        String invalidNumber = registrationPage.phoneNumber.getAttribute("value");
        Assert.assertFalse("Phone number contains invalid symbol",invalidNumber.contains(symbol));
    }
    @When("user enters invalid email address {string}")
    public void user_enters_invalid_email_address(String invalidEmail) {
        registrationPage.email.sendKeys(invalidEmail);
    }
    @Then("verify invalid email address message is displayed")
    public void verify_invalid_email_address_message_is_displayed() {
        boolean isInvalidEmailMessageDisplayed = registrationPage.invalidEmailMessage.isDisplayed();
        Assert.assertTrue("Invalid email address message is not displayed",isInvalidEmailMessageDisplayed);
    }

    @Then("verify ssn is required message is displayed")
    public void verify_ssn_is_required_message_is_displayed() {
        boolean isDisplayed = registrationPage.enterSsnMessage.isDisplayed();
        Assert.assertTrue("SSN is required message is not displayed",isDisplayed);
    }

    @Then("verify first name is required message is displayed")
    public void verify_first_name_is_required_message_is_displayed() {
        boolean isDisplayed = registrationPage.enterFirstNameMessage.isDisplayed();
        Assert.assertTrue(isDisplayed);
    }

    @Then("verify last name is required message is displayed")
    public void verify_last_name_is_required_message_is_displayed() {
        boolean isDisplayed = registrationPage.enterLastNameMessage.isDisplayed();
        Assert.assertTrue(isDisplayed);
    }

    @Then("verify address is required message is displayed")
    public void verify_address_is_required_message_is_displayed() {
        boolean isDisplayed = registrationPage.enterAddressMessage.isDisplayed();
        Assert.assertTrue(isDisplayed);
    }

    @Then("verify phone number is required message is displayed")
    public void verify_phone_number_is_required_message_is_displayed() {
        boolean isDisplayed = registrationPage.enterPhoneNumberMessage.isDisplayed();
        Assert.assertTrue(isDisplayed);
    }

    @Then("verify username is required message is displayed")
    public void verify_username_is_required_message_is_displayed() {
        boolean isDisplayed = registrationPage.enterUsernameMessage.isDisplayed();
        Assert.assertTrue(isDisplayed);
    }

    @Then("verify email is required message is displayed")
    public void verify_email_is_required_message_is_displayed() {
        boolean isDisplayed = registrationPage.enterEmailMessage.isDisplayed();
        Assert.assertTrue(isDisplayed);
    }

    @When("user enters invalid password {string} and confirms it")
    public void user_enters_invalid_password_and_confirms_it(String invalidPassword) {
        registrationPage.newPassword.sendKeys(invalidPassword);
        registrationPage.confirmPassword.sendKeys(invalidPassword);
    }
    @Then("verify password error message")
    public void verify_password_error_message() {
        boolean isDisplayed = registrationPage.passwordContainError.isDisplayed();
        Assert.assertTrue(isDisplayed);
    }

}

