package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CommonPageElements;
import pages.CreateEditACustomerPage;

public class US10_createEditACustomer {
    CreateEditACustomerPage createEditACustomerPage = new CreateEditACustomerPage();
    CommonPageElements commonPageElements = new CommonPageElements();
    Faker faker = new Faker();



    @And("user enters first name of customer")
    public void userEntersFirstNameOfCustomer() {
        createEditACustomerPage.firstName.clear();
        createEditACustomerPage.firstName.sendKeys("Camelia");
    }


}
