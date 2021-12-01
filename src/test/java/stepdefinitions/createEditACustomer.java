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
import pages.RegistrationPage;
import pojos.RegisteredUser;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.WriteToTxt;

import java.io.IOException;


public class createEditACustomer {

    CreateEditACustomerPage createEditACustomerPage = new CreateEditACustomerPage();
    CommonPageElements commonPageElements = new CommonPageElements();
    Faker faker = new Faker();


    @And("user edits Zip Code of customer")
    public void userEditsZipCodeOfCustomer() {
        createEditACustomerPage.zipCode.clear();
        createEditACustomerPage.zipCode.sendKeys("54321");
    }
    @And("user edits Address of customer")
    public void userEditsAddressOfCustomer() {
        createEditACustomerPage.address.clear();
        createEditACustomerPage.address.sendKeys("New Address 2021");
    }
    @And("user edits City of customer")
    public void userEditsCityOfCustomer() {
        createEditACustomerPage.city.clear();
        createEditACustomerPage.city.sendKeys("Sarasota");
    }
    @And("user edits Ssn of customer")
    public void userEditsSsnOfCustomer() {
        createEditACustomerPage.ssn.clear();
        createEditACustomerPage.ssn.sendKeys("111-22-3333");
    }

    @And("user edits date of customer account")
    public void userEditsDateOfCustomerAccount() {
        createEditACustomerPage.createDate.click();
        createEditACustomerPage.createDate.sendKeys("12/12/2021 12:00 AM");
    }
    @And("user edits Country_of_customer")
    public void userEditsCountry_of_customer() {
        createEditACustomerPage.country.sendKeys("USA");

    }
    @And("user edits State_of_customer")
    public void userEditsState_of_customer() {
        createEditACustomerPage.state.sendKeys("Florida");
    }

    @And("user edits User_name_of_customer")
    public void userEditsUser_name_of_customer() {
    }

    @And("user edits Account_of_customer")
    public void userEditsAccount_of_customer() {
    }

}

