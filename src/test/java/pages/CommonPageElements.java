package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CommonPageElements {
    public CommonPageElements(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[contains(text(),'My Operations')]")
    public WebElement MyOperationsButton;

    @FindBy(xpath = "//span[contains(text(),'Manage Customers')]")
    public WebElement ManageCustomersButton;

    @FindBy(xpath = "//span[contains(text(),'Home')]")
    public WebElement home;

    @FindBy(xpath = "//span[contains(text(),'Loans')]")
    public WebElement loans;

    @FindBy(xpath = "//span[contains(text(),'About Us')]")
    public WebElement aboutUs;

    @FindBy(xpath = "//span[contains(text(),'Services')]")
    public WebElement services;

    @FindBy(xpath = "//span[contains(text(),'Blog')]")
    public WebElement blog;

    @FindBy(xpath = "//span[contains(text(),'Contact')]")
    public WebElement contact;

    @FindBy(id = "account-menu")
    public WebElement accountMenu;

    @FindBy(id = "login-item")
    public WebElement signInButton;

    @FindBy(xpath = "//span[contains(text(),'Register')]")
    public WebElement register;

    public void clickSignInButton() {
        accountMenu.click();
        signInButton.click();
    }

    public void  clickRegisterButton() {
        accountMenu.click();
        register.click();
    }
//

    @FindBy(xpath = "//input[@name='username']")
    public WebElement username;


    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signin;

    @FindBy(xpath = "//*[.='My Operations']")
    public WebElement operations;

    @FindBy(xpath = "//*[.='Manage Customers']")
    public WebElement manageCustomers;

    @FindBy(xpath = "//*[.='Create a new Customer']")
    public WebElement createANewCustomer;

    @FindBy(xpath = "//input[@name='search-ssn']")
    public WebElement SSN;

}