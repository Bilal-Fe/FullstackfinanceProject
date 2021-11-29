package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.CommonPageElements;
import pages.CustomerPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class AsAnEmployeeManageCostumer {
    CommonPageElements commonPageElements = new CommonPageElements();
    Faker faker = new Faker();
    CustomerPages customerPages = new CustomerPages();

    @Given("user clicks on Sign in button")
    public void user_clicks_on_sign_in_button() {
       commonPageElements.clickSignInButton();
    }

    @When("user enter employee credentials and click sign in button")
    public void userEnterEmployeeCredentialsAndClickSignInButton() {
        commonPageElements.userName.sendKeys(ConfigReader.getProperty("employee_user_name"));
        commonPageElements.password.sendKeys(ConfigReader.getProperty("employee_password"));
        commonPageElements.signIn.click();
    }

    @Then("verify that user is in the employee page")
    public void verifyThatUserIsInTheEmployeePage() {
        Assert.assertTrue(commonPageElements.MyOperationsButton.isDisplayed());
    }

    @When("user clicks on My Operation button")
    public void userClicksOnMyOperationButton() {
        commonPageElements.MyOperationsButton.click();
    }

    @And("user clicks on Manage Customer button")
    public void userClicksOnManageCustomerButton() {
        commonPageElements.ManageCustomersButton.click();
    }

    @Then("verify that user is in the Customer page")
    public void verifyThatUserIsInTheCustomerPage() {
        Assert.assertTrue(customerPages.CustomersHead.isDisplayed());
    }

    @And("verify that all Customers account informations are appear")
    public void verifyThatAllCustomersAccountInformationsAreAppear() {
        Assert.assertTrue(customerPages.ID.isDisplayed());
        Assert.assertTrue(customerPages.FirstName.isDisplayed());
        Assert.assertTrue(customerPages.LastName.isDisplayed());
        Assert.assertTrue(customerPages.MiddleInitial.isDisplayed());
        Assert.assertTrue(customerPages.Email.isDisplayed());
        Assert.assertTrue(customerPages.MobilePhoneNumber.isDisplayed());
        Assert.assertTrue(customerPages.PhoneNumber.isDisplayed());
        Assert.assertTrue(customerPages.Address.isDisplayed());
        Assert.assertTrue(customerPages.CreateDate.isDisplayed());
    }

    @Then("verify that view button is clickable")
    public void verifyThatViewButtonIsClickable() {
        Assert.assertTrue(customerPages.View.isEnabled());
    }

    @When("user clicks on view button")
    public void userClicksOnViewButton() {
        customerPages.View.click();
    }

    @Then("verify that all customer info is navigated")
    public void verifyThatAllCustomerInfoIsNavigated() {
        Assert.assertTrue(customerPages.ZelleEnrolled.isDisplayed());
        Assert.assertTrue(customerPages.City.isDisplayed());
        Assert.assertTrue(customerPages.Country.isDisplayed());
        Assert.assertTrue(customerPages.State.isDisplayed());
        Assert.assertTrue(customerPages.Account.isDisplayed());
        Assert.assertTrue(customerPages.ZipCode.isDisplayed());
        Assert.assertTrue(customerPages.Ssn.isDisplayed());
        Assert.assertTrue(customerPages.FirstName.isDisplayed());
        Assert.assertTrue(customerPages.LastName.isDisplayed());
        Assert.assertTrue(customerPages.MiddleInitial.isDisplayed());
        Assert.assertTrue(customerPages.Email.isDisplayed());
        Assert.assertTrue(customerPages.MobilePhoneNumber.isDisplayed());
        Assert.assertTrue(customerPages.PhoneNumber.isDisplayed());
        Assert.assertTrue(customerPages.Address.isDisplayed());
        Assert.assertTrue(customerPages.CreateDate.isDisplayed());

    }

    @And("verify that edit button is clickable")
    public void verifyThatEditButtonIsClickable() {
        Assert.assertTrue(customerPages.Edit.isEnabled());
    }

    @When("user clicks on edit button")
    public void userClicksOnEditButton() {
        customerPages.Edit.click();
    }

    @Then("verify that user is in the Create or edit a Customer page")
    public void verifyThatUserIsInTheCreateOrEditACustomerPage() {
        customerPages.CreateOrEditACustomer.isDisplayed();
    }

    @When("user edit customer's information")
    public void userEditCustomerSInformation() {
        customerPages.EditFirstName.clear();
        //customerPages.EditFirstName.sendKeys(ReusableMethods.getDataTableData(DataTable.emptyDataTable(), "firsname"));
        customerPages.EditFirstName.sendKeys(faker.name().firstName());
        customerPages.EditLastName.clear();
        //customerPages.EditLastName.sendKeys(ReusableMethods.getDataTableData(DataTable.emptyDataTable(),"lastname"));
        customerPages.EditLastName.sendKeys(faker.name().lastName());
        customerPages.EditAddress.clear();
        //customerPages.EditAddress.sendKeys(ReusableMethods.getDataTableData(DataTable.emptyDataTable(),"address"));
        customerPages.EditAddress.sendKeys(faker.address().fullAddress());
        ReusableMethods.selectFromDropDown(customerPages.EditCountry,"Turkey");
        customerPages.EditState.clear();
        //customerPages.EditState.sendKeys(ReusableMethods.getDataTableData(DataTable.emptyDataTable(),"state"));
        customerPages.EditState.sendKeys(faker.address().state());
        ReusableMethods.selectCheckBox(customerPages.EditZelleEnrolled,true);
    }

    public static void main(String[] args) {
        Faker faker = new Faker();
        String country = faker.country().name();
        System.out.println(country);
    }

    @And("user clicks on save button")
    public void userClicksOnSaveButton() {
    customerPages.SaveButton.click();
    }

    @Then("verify that success message for edit customer is displayed")
    public void verifyThatSuccessMessageForEditCustomerIsDisplayed() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(customerPages.SuccessMessageForEditCustomer.isDisplayed());
    }

    @Then("verify that save button is clickable")
    public void verifyThatSaveButtonIsClickable() {
        customerPages.SaveButton.isEnabled();
    }

    @When("user clicks on delete button")
    public void userClicksOnDeleteButton() {
        customerPages.Delete.click();
    }

    @Then("verify that Confirm delete operation message is display")
    public void verifyThatConfirmDeleteOperationMessageIsDisplay() {
        ReusableMethods.waitFor(1);
        customerPages.ConfirmDeleteOperation.isDisplayed();
    }

    @When("user clicks on delete button on the message page")
    public void userClicksOnDeleteButtonOnTheMessagePage() {
        customerPages.DeleteOnConfirm.click();
    }

    @Then("verify that success message for delete customer is displayed")
    public void verifyThatSuccessMessageForDeleteCustomerIsDisplayed() {
        ReusableMethods.waitFor(1);
    Assert.assertFalse(customerPages.FailMessage.isDisplayed());
    }

    @And("close the webpage")
    public void closeTheWebpage() {
        Driver.closeDriver();
    }
}
