package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import pages.CommonPageElements;
import pages.MoneyTransferPage;
import utilities.ReusableMethods;

import java.util.LinkedList;
import java.util.List;

public class MoneyTransferStepDefinitions {

    CommonPageElements commonPageElements=new CommonPageElements();
    MoneyTransferPage moneyTransferPage=new MoneyTransferPage();
    WebDriver driver;


    @And("customer  clicks the Sign in button")
    public void customerClicksTheSignInButton() {
        commonPageElements.clickSignInButton();
    }

    @When("customer  enters customer credentials")
    public void customerEntersCustomerCredentials(DataTable datatable) {
        commonPageElements.userName.sendKeys(ReusableMethods.getDataTableData(datatable,"username"));
        commonPageElements.password.sendKeys(ReusableMethods.getDataTableData(datatable,"password"));
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
        ReusableMethods.waitFor(3);
        moneyTransferPage.transferMoney.click();
        ReusableMethods.waitFor(3);
   //     List<WebElement> dropdownOptions = new List<WebElement>();
     //   dropdownOptions=driver.findElements(By.xpath("//a[contains(text(), 'Transfer Money')]"));
       //for(WebElement option:dropdownOptions){
       //    System.out.println(option.getText());
      // }
        //System.out.println(dropdownOptions.size());
       //dropdownOptions.get(1).click();
    }

    @Then("verify the TRANSFER BETWEEN YOUR ACCOUNTS is displayed on the page")
    public void verifyTheTRANSFERBETWEENYOURACCOUNTSIsDisplayedOnThePage() {
        Assert.assertEquals("TRANSFER BETWEEN YOUR ACCOUNTS",moneyTransferPage.transferBetweenAccounts.getText());
    }

    @Then("verify the all their account types is displayed on the from line")
    public void verifyTheAllTheirAccountTypesIsDisplayedOnTheFromLine() {
    }

    @Then("verify the all their account types is displayed on the to line")
    public void verifyTheAllTheirAccountTypesIsDisplayedOnTheToLine() {
    }

    @And("customer  selects the one account on the from line")
    public void customerSelectsTheOneAccountOnTheFromLine() {
       // Select select=new Select(moneyTransferPage.fromAccount);
       // ReusableMethods.waitForClickablility(moneyTransferPage.fromAccount,3);
       // select.selectByIndex(1);
    }

    @And("customer  selects the one account on the to line")
    public void customerSelectsTheOneAccountOnTheToLine() {
        //Select select=new Select(moneyTransferPage.toAccount);
        //ReusableMethods.waitForClickablility(moneyTransferPage.toAccount,3);
        //select.selectByIndex(2);
    }

    @And("customer  enters {string} on the balance")
    public void customerEntersTheAmountOnTheBalance(String  amount) {

        //moneyTransferPage.balance.sendKeys("15");
    }

    @And("customer  writes a description")
    public void customerWritesADescription() {
    }

    @When("customer  clicks Make Transfer button")
    public void customerClicksMakeTransferButton() {
    }

    @Then("verify Transfer is succesfull message is displayed on the page")
    public void verifyTransferIsSuccesfullMessageIsDisplayedOnThePage() {
    }

    @Then("take the screenshot")
    public void takeTheScreenshot() {
    }
}
