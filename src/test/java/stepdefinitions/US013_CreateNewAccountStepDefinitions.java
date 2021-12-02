package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.CommonPageElements;
import pages.CustomerPages;
import pages.ManageAccountPage;
import pages.RegistrationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US013_CreateNewAccountStepDefinitions {
    CommonPageElements commonPageElements = new CommonPageElements();
    ManageAccountPage manageAccountPage = new ManageAccountPage();
    CustomerPages customerPages = new CustomerPages();

    @When("user sign in as an employee")
    public void user_register_as_an_employee() {

        commonPageElements.userName.sendKeys(ConfigReader.getProperty("employee_user_name"));
        commonPageElements.password.sendKeys(ConfigReader.getProperty("employee_password"));
        commonPageElements.signIn.click();

    }


    @And("user clicks My operations")
    public void userClicksMyOperations() {
        commonPageElements.MyOperationsButton.click();
    }

    @And("user clicks Manage Account")
    public void uerClicksManageAccount() {
        commonPageElements.ManageAccountsButton.click();
    }

    @Then("user clicks create an account")
    public void user_clicks_create_an_account() {
        manageAccountPage.createANewAccount.click();
    }

    @Then("user should be able to see Create or edit a Account page")
    public void user_should_be_able_to_see_create_or_edit_a_account_page() {
        Assert.assertEquals(commonPageElements.MyOperationsButton.getText(), "My Operations");
    }

    @When("user not enter description see an error message for description box")
    public void userNotEnterDescriptionSeeAnErrorMessageForDescriptionBox() {
        manageAccountPage.descriptionBox.click();
        manageAccountPage.balanceBox.click();
        Assert.assertEquals(manageAccountPage.descriptionBoxErrorMessage.getText(), "This field is required.");
    }

    @Then("user  not enter balance see an error message for balance box")
    public void userNotEnterBalanceSeeAnErrorMessageForBalanceBox() {
        manageAccountPage.balanceBox.click();
        manageAccountPage.createDateBox.click();
        Assert.assertEquals(manageAccountPage.balanceBoxErrorMessage.getText(), "This field is required.");
    }

    @When("user enters data in description box")
    public void user_enters_data_in_description_box() {
        manageAccountPage.descriptionBox.sendKeys("Saving");


    }

    @When("user  provides a balance for the first time account creation as Dollar")
    public void user_provides_a_balance_for_the_first_time_account_creation_as_dollar() {
        manageAccountPage.balanceBox.sendKeys("10000");

    }

    @Then("user  selects Checking account type")
    public void user_selects_checking_account_type() {
        Select se = new Select(manageAccountPage.selectAccountType);
        se.selectByValue("CHECKING");

    }

    @Then("user  selects Active status type")
    public void user_selects_active_status_type() {
        Select se2 = new Select(manageAccountPage.selectAccountStatus);
        se2.selectByValue("ACTIVE");
        manageAccountPage.createDateBox.click();

    }

    @Then("User clicks save button")
    public void user_clicks_save_button() throws InterruptedException {
        manageAccountPage.saveButton.click();

    }

    @Then("user  selects Suspended status type")
    public void user_selects_suspended_status_type() {
        Select se2 = new Select(manageAccountPage.selectAccountStatus);
        se2.selectByValue("SUESPENDED");
        manageAccountPage.createDateBox.click();

    }

    @Then("user  selects Closed status type")
    public void user_selects_closed_status_type() {
        Select se2 = new Select(manageAccountPage.selectAccountStatus);
        se2.selectByValue("CLOSED");
        manageAccountPage.createDateBox.click();

    }

    @Then("user  selects Saving account type")
    public void user_selects_saving_account_type() {
        Select se = new Select(manageAccountPage.selectAccountType);
        se.selectByValue("SAVING");
    }

    @Then("user  selects Credit_card account type")
    public void user_selects_credit_card_account_type() {
        Select se = new Select(manageAccountPage.selectAccountType);
        se.selectByValue("CREDIT_CARD");
    }

    @Then("user clicks signout button")
    public void userClicksSignoutButton() {
        manageAccountPage.chevron.click();
        manageAccountPage.signOut.click();
    }

    @When("user select accounts there should be four accounts")
    public void userSelectAccountsThereShouldBeFourAccounts() {
        Select se = new Select(manageAccountPage.selectAccountType);
        List<WebElement> allOptions = se.getOptions();
        Assert.assertEquals(allOptions.get(0).getText(), "CHECKING");
        Assert.assertEquals(allOptions.get(1).getText(), "SAVING");
        Assert.assertEquals(allOptions.get(2).getText(), "CREDIT_CARD");
        Assert.assertEquals(allOptions.get(3).getText(), "INVESTING");

    }

    @When("user select accounts status there should be three accounts")
    public void userSelectAccountsStatusThereShouldBeThreeAccounts() {

        Select se2 = new Select(manageAccountPage.selectAccountStatus);
        List<WebElement> allOptions = se2.getOptions();
        Assert.assertEquals(allOptions.get(0).getText(), "ACTIVE");
        Assert.assertEquals(allOptions.get(1).getText(), "SUESPENDED");
        Assert.assertEquals(allOptions.get(2).getText(), "CLOSED");
    }

}
