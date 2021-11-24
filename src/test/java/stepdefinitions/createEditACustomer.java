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
import pojos.RegisteredUser;
import utilities.ConfigReader;
import utilities.Driver;


public class createEditACustomer {

    CreateEditACustomerPage createEditACustomerPage =new CreateEditACustomerPage();
    CommonPageElements commonPageElements = new CommonPageElements();
    Faker faker = new Faker();
    RegisteredUser registeredUser = new RegisteredUser();
    String elevenDigitsPhoneNumber = "234-456-21223";
    String tenDigitsSsnNumber = "345-33-23434";

    @Given("user is on the gmi bank webpage")
    public void userIsOnTheGmiBankWebpage() {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
    }

    @When("user clicks sign in button")
    public void userClicksSignInButton() {
        commonPageElements.clickSignInButton();
    }

    @And("user enters username of the employee")
    public void userEntersUsernameOfTheEmployee() {
    }

    @And("user enters password of the employee")
    public void userEntersPasswordOfTheEmployee() {
    }

    @Then("user clicks on sign in")
    public void userClicksOnSignIn() {
    }
    @And("user clicks on My Operations drop down menu")
    public void userClicksOnMyOperationsDropDownMenu() {
    }

    @And("user selects Manage Customers")
    public void userSelectsManageCustomers() {
    }

    @And("user clicks on Create a new Customer button")
    public void userClicksOnCreateANewCustomerButton() {
    }

    @Then("verify Create or edit a Customer")
    public void verifyCreateOrEditACustomer() {
    }
    @And("user is on the application page")
    public void userIsOnTheApplicationPage() {
        createEditACustomerPage.createANewCustomer.click();
    }

    @And("user enters ssn number")
    public void userEntersSsnNumber() {
        createEditACustomerPage.ssn.sendKeys("customer_ssn");
    }

    @When("user clicks on the search button")
    public void userClicksOnTheSearchButton() {
        createEditACustomerPage.searchbutton.click();
    }

    @Then("verify the {string} is displayed")
    public void verifyTheIsDisplayed(String arg0) {
        String title = Driver.getDriver().getTitle();
        Assert.assertTrue(title.contains("456-57-8890"));
    }

    @Then("take the screenshot")
    public void takeTheScreenshot() {
    }

    @And("user enters name of customer")
    public void userEntersNameOfCustomer() {
        createEditACustomerPage.userName.sendKeys("customer_username"+ Keys.ENTER);
    }

    @When("user clicks on the enter button")
    public void userClicksOnTheEnterButton() {
    }

    @Then("verify the {string} is not displayed")
    public void verifyTheIsNotDisplayed(String arg0) {
    }

    @And("user enters last name of customer")
    public void userEntersLastNameOfCustomer() {
        createEditACustomerPage.lastName.sendKeys("Camelia" + Keys.ENTER);
    }

    @And("user enters Middle Initial of customer")
    public void userEntersMiddleInitialOfCustomer() {
        createEditACustomerPage.middleInitial.sendKeys("M" + Keys.ENTER);
    }

    @And("user enters Email of customer")
    public void userEntersEmailOfCustomer() {
        createEditACustomerPage.email.sendKeys("cameliamueller@gmail.com" + Keys.ENTER);
    }

    @And("user enters Mobile Phone Number of customer")
    public void userEntersMobilePhoneNumberOfCustomer() {
        createEditACustomerPage.mobilePhoneNumber.sendKeys("123-456-7890" + Keys.ENTER);
    }

    @And("user enters Phone Number of customer")
    public void userEntersPhoneNumberOfCustomer() {
        createEditACustomerPage.phoneNumber.sendKeys("123-456-7890" +Keys.ENTER);
    }

    @And("user enters Zip Code of customer")
    public void userEntersZipCodeOfCustomer() {

    }

    @And("user enters Address of customer")
    public void userEntersAddressOfCustomer() {
    }

    @And("user enters City of customer")
    public void userEntersCityOfCustomer() {
    }

    @And("user enters Ssn of customer")
    public void userEntersSsnOfCustomer() {
    }

    @And("user enters date of account of_customer")
    public void userEntersDateOfAccountOf_customer() {
    }

    @And("user enters Country of_customer")
    public void userEntersCountryOf_customer() {
    }

    @And("user enters State of customer")
    public void userEntersStateOfCustomer() {
    }

    @And("user enters User name of customer")
    public void userEntersUserNameOfCustomer() {
    }

    @And("user enters Account of customer")
    public void userEntersAccountOfCustomer() {
    }

    @And("user enters Zelle Enrolled")
    public void userEntersZelleEnrolled() {
    }

    @When("user clicks on the save button")
    public void userClicksOnTheSaveButton() {
    }

}