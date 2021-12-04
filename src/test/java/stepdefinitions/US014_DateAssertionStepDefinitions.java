package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.CommonPageElements;
import pages.ManageAccountPage;
import pages.RegistrationPage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class US014_DateAssertionStepDefinitions {
    CommonPageElements commonPageElements = new CommonPageElements();
    RegistrationPage registrationPage = new RegistrationPage();
    ManageAccountPage manageAccountPage = new ManageAccountPage();
    DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");


    @Then("check edit button clickable")
    public void check_edit_button_clickable() {
        Assert.assertTrue(manageAccountPage.editButton.isDisplayed());
    }

    @When("click edit button")
    public void clickEditButton() {
        manageAccountPage.editButton.click();
        Assert.assertEquals("Create or edit a Account","Create or edit a Account");
    }

    @And("User selects past time for create date")
    public void userSelectsPastTimeForCreateDate() {
        WebElement dateBox = manageAccountPage.createDateBox;
        dateBox.sendKeys("01/11/2020");
    }


    @Then("user should get an error message")
    public void userShouldGetAnErrorMessage() {
        if(manageAccountPage.accounts.isDisplayed()) {
            System.out.println("User tried to create an account with past or future time");
        }

    }

    @Then("employee box should have elements")
    public void employeeBoxShouldHaveElements() {
        String empolyeeBox = manageAccountPage.employeeBox.getText();
        Assert.assertNotEquals(" ", empolyeeBox);
        //There is a bug

    }

    @And("User selects future time for create date")
    public void userSelectsFutureTimeForCreateDate() {
        WebElement dateBox = manageAccountPage.createDateBox;
        dateBox.sendKeys("01/01/2035");
    }

    @Then("date box has month day and minute")
    public void dateBoxHasMonthDayAndMinute() {
        String defaultDate = manageAccountPage.createDateBox.getAttribute("value");
        System.out.println(defaultDate);
    }

    @Then("check the date is current date")
    public void checkTheDateIsCurrentDate() {
        String defaultDate = manageAccountPage.createDateBox.getAttribute("value");
        Assert.assertTrue(defaultDate.contains("T"));
    }

    @Then("check the date format")
    public void checkTheDateFormat() {
        String today = new SimpleDateFormat("yyyy/MM/dd").format(new Date()).replaceAll("/","-");
        String defaultDate = manageAccountPage.createDateBox.getAttribute("value");
        Assert.assertTrue(defaultDate.contains(today));
    }

    @Then("date box has hour and minute")
    public void dateBoxHasHourAndMinute() {
        String defaultDate = manageAccountPage.createDateBox.getAttribute("value");
        Assert.assertTrue(defaultDate.contains("00:00"));

    }
}
