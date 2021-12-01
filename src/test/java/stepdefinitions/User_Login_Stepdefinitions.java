package stepdefinitions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPageElements;
import pages.LoginPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class User_Login_Stepdefinitions {

    LoginPage loginPage = new LoginPage();
    CommonPageElements commonPageElements = new CommonPageElements();

    @Given("user is on the main page")
    public void user_is_on_the_main_page() {

        Driver.getDriver().get("https://www.gmibank.com/");

    }

    @And("user clicks login button")
    public void userClicksLoginButton() {

        loginPage.loginDropdownClick.click();
    }

    @When("user clicks sign in button")
    public void userClicksSignInButton() {
        ReusableMethods.waitFor(2);
        loginPage.signInClick.click();
    }

    @Then("access to login page")
    public void accessToLoginPage() {
        ReusableMethods.waitFor(3);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("login"));
    }

    //Manager test
    @Given("user enters manager username {string}")
    public void userEntersManagerUsername(String string) {

        loginPage.userNameBox.sendKeys(string);
    }

    @And("user enters manager password {string}")
    public void userEntersManagerPassword(String string) {
        loginPage.passwordLoginBox.sendKeys(string);
    }

    @When("user clicks sign in submit button")
    public void userClicksSignInSubmitButton() {
        loginPage.signInSubmit.click();
    }

    @Then("verify the page is displayed")
    public void verifyTheIsDisplayed() {
        ReusableMethods.waitFor(2);
        Assert.assertEquals(loginPage.myOperationsButton.getText(), "My Operations");
    }

    @Then("click sign out back to main page")
    public void back_to_mainPage() {
        loginPage.loginDropdownClick.click();
        loginPage.signOutButton.click();
    }

    // Admin test
    @Given("user enters admin username {string}")
    public void userEntersAdminUsername(String string) {

        loginPage.userNameBox.sendKeys(string);
    }

    @And("user enters admin password {string}")
    public void userEntersAdminPassword(String string) {

        loginPage.passwordLoginBox.sendKeys(string);
    }

    @When("user clicks on the sign in submit button")
    public void userClicksSignInSubmitButton1() {

        loginPage.signInSubmit.click();
    }

    @Then("verify the Administration is displayed")
    public void verifyTheAdministrationIsDisplayed() {
        ReusableMethods.waitFor(2);
        Assert.assertEquals(loginPage.administrationButton.getText(), "Administration");
    }

    //Employee login
    @Given("user enters employee username {string}")
    public void userEntersEmployeeUsername(String string) {
        loginPage.userNameBox.sendKeys(string);
    }

    @And("user enters employee password {string}")
    public void userEntersEmployeePassword(String string) {
        loginPage.passwordLoginBox.sendKeys(string);

    }

    //Customer login
    @Given("user enters customer username {string}")
    public void userEntersCustomerUsername(String string) {
        loginPage.userNameBox.sendKeys(string);
    }


    @And("user enters customer password {string}")
    public void userEntersCustomerPassword(String string) {
        loginPage.passwordLoginBox.sendKeys(string);
    }

    @Then("user clicks on the myOperations button")
    public void userClicksOnTheMyOperationsButton() {
        loginPage.myOperationsButton.click();

    }

    @Then("verify the My Accounts  is displayed")
    public void verify_the_my_accounts_is_displayed() {
        Assert.assertEquals(loginPage.myAccountButton.getText(), "My Accounts");

    }

    @When("user click cancel button")
    public void userClickCancelButton() {
        loginPage.cancelButton.click();
    }

    @Then("verify that come back to main page")
    public void verifyThatComeBackToMainPage() {
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://www.gmibank.com/");
    }


    @Given("user enter invalid username and valid password")
    public void userEnterInvalidUsernameAndValidPassword(DataTable datatable) {
        loginPage.userNameBox.sendKeys(ReusableMethods.getDataTableData(datatable, "user_username"));
        loginPage.passwordLoginBox.sendKeys(ReusableMethods.getDataTableData(datatable,"user_password"));
        loginPage.signInSubmit.click();
    }

    @Then("verify that cannot login")
    public void verifyThatCannotLogin() {
       // Failed to sign in!
        ReusableMethods.waitForVisibility(loginPage.failedMessage, 5);
        boolean isDisplayed = loginPage.failedMessage.isDisplayed();
        Assert.assertTrue(isDisplayed);

    }
   @When("click cancel back to main page")
    public void click_cancel_back_to_main_page() {
        loginPage.cancelButton.click();
    }
    @Given("user enter  valid name and invalid password")
    public void userEnterValidNameAndInvalidPassword(DataTable datatable) {
        loginPage.userNameBox.sendKeys(ReusableMethods.getDataTableData(datatable, "user_username"));
        loginPage.passwordLoginBox.sendKeys(ReusableMethods.getDataTableData(datatable,"user_password"));
        loginPage.signInSubmit.click();

    }

    @Given("user enter invalid username and password")
    public void userEnterInvalidUsernameAndPassword(DataTable datatable) {
        loginPage.userNameBox.sendKeys(ReusableMethods.getDataTableData(datatable, "user_username"));
        loginPage.passwordLoginBox.sendKeys(ReusableMethods.getDataTableData(datatable,"user_password"));
        loginPage.signInSubmit.click();
    }

    @Given("user can access to registration page")
    public void userCanAccessToRegistrationPage() {
        loginPage.userNameBox.sendKeys("Mark");
        loginPage.passwordLoginBox.sendKeys("mark@gmail.com");
        loginPage.signInSubmit.click();
        ReusableMethods.waitFor(2);
        loginPage.newRegisterButton.click();

    }
      @Then ("verify that registration page")
         public void verifyRegistrationPage(){

         ReusableMethods.waitFor(2);
         Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("register"));

   }
    @And ("click back to main page")
    public void backToMainPage(){
        Driver.getDriver().navigate().back();
    }

    @Given("user can reset invalid password")
    public void userCanResetInvalidPassword() throws InterruptedException {
        loginPage.userNameBox.sendKeys("Marry");
        loginPage.passwordLoginBox.sendKeys("marry@gmail.com");
        loginPage.signInSubmit.click();
        loginPage.passwordResetButton.click();
        Thread.sleep(2);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("/account/reset/request"));

    }

    @Then("verify that can reset password")
    public void verifyThatCanResetPassword() {
        loginPage.resetPasswordBox.sendKeys("new@gmail.com");
        loginPage.resetPasswordButton.click();
    }
}