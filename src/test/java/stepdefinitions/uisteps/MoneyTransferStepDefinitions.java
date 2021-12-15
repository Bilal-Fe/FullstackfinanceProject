package stepdefinitions.uisteps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import pages.CommonPageElements;
import pages.MoneyTransferPage;
import utilities.ReusableMethods;

import java.util.List;
import java.util.Random;

public class MoneyTransferStepDefinitions {

    CommonPageElements commonPageElements = new CommonPageElements();
    MoneyTransferPage moneyTransferPage = new MoneyTransferPage();

    @And("customer  clicks the Sign in button")
    public void customerClicksTheSignInButton() {
        commonPageElements.clickSignInButton();
    }

    @When("customer  enters customer credentials")
    public void customerEntersCustomerCredentials(DataTable datatable) {
        commonPageElements.userName.sendKeys(ReusableMethods.getDataTableData(datatable, "username"));
        commonPageElements.password.sendKeys(ReusableMethods.getDataTableData(datatable, "password"));
        commonPageElements.signIn.click();
    }

    @Then("verify the My Operations is displayed")
    public void verifyTheMyOperationsIsDisplayed() {
        ReusableMethods.waitFor(5);
        Assert.assertTrue(commonPageElements.MyOperationsButton.isDisplayed());
    }

    @And("customer  selects My Operations dropdown")
    public void customerSelectsMyOperationsDropdown() {
        commonPageElements.MyOperationsButton.click();
    }

    @When("customer  selects Transfer Money on the dropdown")
    public void customerSelectsTransferMoneyOnTheDropdown() {
        ReusableMethods.waitFor(4);
        moneyTransferPage.transferMoney.click();
    }

    @Then("verify the TRANSFER BETWEEN YOUR ACCOUNTS is displayed on the page")
    public void verifyTheTRANSFERBETWEENYOURACCOUNTSIsDisplayedOnThePage() {
        Assert.assertEquals("TRANSFER BETWEEN YOUR ACCOUNTS", moneyTransferPage.transferBetweenAccounts.getText());
    }

    @And("customer  selects one account on the from line")
    public void customerSelectsOneAccountOnTheFromLine() {
        Select select = new Select(moneyTransferPage.fromAccount);
        ReusableMethods.waitForClickablility(moneyTransferPage.fromAccount, 4);
        Random random = new Random();
        List<WebElement> allFromOption = select.getOptions();
        int lengthAllFromOption = allFromOption.size();
        int randomOption = random.nextInt(lengthAllFromOption);
        select.selectByIndex(randomOption);
    }

    @And("customer  selects one account on the to line")
    public void customerSelectsOneAccountOnTheToLine() {
        Select select = new Select(moneyTransferPage.toAccount);
        ReusableMethods.waitForClickablility(moneyTransferPage.toAccount, 4);
        Random random = new Random();
        List<WebElement> allToOption = select.getOptions();
        int lengthAllToOption = allToOption.size();
        int randomOption = random.nextInt(lengthAllToOption);
        select.selectByIndex(randomOption);
        System.out.println();
    }

    @And("customer  enters the amount on the balance")
    public void customerEntersTheAmountOnTheBalance() {
        moneyTransferPage.balance.sendKeys("2");
    }

    @And("customer  writes a description")
    public void customerWritesADescription() {
        moneyTransferPage.description.sendKeys("money transfer");
    }

    @When("customer  clicks Make Transfer button")
    public void customerClicksMakeTransferButton() {
        moneyTransferPage.makeTransferButton.click();
    }

    @Then("verify Transfer is succesfull message is displayed on the page")
    public void verifyTransferIsSuccesfullMessageIsDisplayedOnThePage() {
        ReusableMethods.waitFor(3);
        boolean isSuccessfullMessage = moneyTransferPage.successfulMessage.isDisplayed();
        Assert.assertTrue(isSuccessfullMessage);
    }

    //2.Test Case
    @And("customer does not select one account on the from line")
    public void customerDoesNotSelectOneAccountOnTheFromLine() {
    }

    @Then("verify the from and to line is red")
    public void verifyTheFromAndToLineIsRed() {
        boolean isRedFrom = moneyTransferPage.redFrom.isDisplayed();
        Assert.assertTrue(isRedFrom);
        boolean isRedTo1 = moneyTransferPage.redTo1.isDisplayed();
        Assert.assertTrue(isRedTo1);
    }

    @Then("verify the to line is red")
    public void verifyTheToLineIsRed() {
        boolean isRedTo2 = moneyTransferPage.redTo2.isDisplayed();
        Assert.assertTrue(isRedTo2);
    }

    //3.Test Case
    @And("customer does not select one account on the to line")
    public void customerDoesNotSelectOneAccountOnTheToLine() {
    }

    //4.Test Case
    @And("customer leaves balance empty")
    public void customerLeavesBalanceEmpty() {
    }

    @Then("verify This field is required. message is displayed on the page")
    public void verifyThisFieldIsRequiredMessageIsDisplayedOnThePage() {
        boolean isEmptyFieldCaution = moneyTransferPage.emptyFieldMessage.isDisplayed();
        Assert.assertTrue(isEmptyFieldCaution);
    }

    //5.Test Case
    @And("customer leaves Description empty")
    public void customerLeavesDescriptionEmpty() {
    }

    //6.Test Case
    @And("customer selects one account on the from line and enters the amount greater than the money in their account on the balance line")
    public void customerSelectsOneAccountOnTheFromLineAndEntersTheAmountGreaterThanTheMoneyInTheirAccountOnTheBalanceLine() {
        Select select = new Select(moneyTransferPage.fromAccount);
        ReusableMethods.waitForClickablility(moneyTransferPage.fromAccount, 3);
        Random random = new Random();
        List<WebElement> allFromOption = select.getOptions();
        int lengthAllFromOption = allFromOption.size();
        int randomOption = random.nextInt(lengthAllFromOption);
        String value = allFromOption.get(randomOption).getText();
        select.selectByVisibleText(value);
        String moneyPart=value.substring(value.lastIndexOf('-')+1,value.length()-1);
        System.out.println(moneyPart);
        int balance = Integer.parseInt(moneyPart);
        int amount = balance + 1;
        moneyTransferPage.balance.sendKeys(Integer.toString(amount));

    }

    @Then("verify translation-not-found[error.Balanceexceed] message is displayed on the page")
    public void verifyTranslationNotFoundErrorBalanceexceedMessageIsDisplayedOnThePage() {
        ReusableMethods.waitFor(4);
        boolean isErrorMessage = moneyTransferPage.translationNotFoundMessage.isDisplayed();
        Assert.assertTrue(isErrorMessage);
    }

    //7.Test Case
    @When("customer selects My Accounts on the dropdown")
    public void customerSelectsMyAccountsOnTheDropdown() {
        ReusableMethods.waitFor(3);
        moneyTransferPage.myAccounts.click();
    }

    @Then("verify the Customer Accounts is displayed on the page")
    public void verifyTheCustomerAccountsIsDisplayedOnThePage() {
        Assert.assertEquals("Customer Accounts", moneyTransferPage.customerAccounts.getText());
    }

    @And("customer clicks View Transaction button")
    public void customerClicksViewTransactionButton() {
        moneyTransferPage.viewTransaction.click();
    }

    @Then("verify the ID is displayed")
    public void verifyTheIDIsDisplayed() {
        Assert.assertEquals("ID", moneyTransferPage.ID.getText());
    }

}
