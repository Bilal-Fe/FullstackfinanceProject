package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CustomerPages {
    public CustomerPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[contains(text(),'ID')]")
    public WebElement ID;

    @FindBy(xpath = "//span[contains(text(),'First Name')]")
    public WebElement FirstName;

    @FindBy(xpath = "//span[contains(text(),'Last Name')]")
    public WebElement LastName;

    @FindBy(xpath = "//span[contains(text(),'Middle Initial')]")
    public WebElement MiddleInitial;

    @FindBy(xpath = "//span[contains(text(),'Email')]")
    public WebElement Email;

    @FindBy(xpath = "//span[contains(text(),'Mobile Phone Number')]")
    public WebElement MobilePhoneNumber;

    @FindBy(xpath = "(//span[contains(text(),'Phone Number')])[2]")
    public WebElement PhoneNumber;

    @FindBy(xpath = "//span[contains(text(),'Address')]")
    public WebElement Address;

    @FindBy(xpath = "//span[contains(text(),'Create Date')]")
    public WebElement CreateDate;

    @FindBy(xpath = "//span[contains(text(),'View')]")
    public WebElement View;

    @FindBy(xpath = "//span[contains(text(),'Edit')]")
    public WebElement Edit;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    public WebElement Delete;

    @FindBy(xpath = "//span[contains(text(),'Confirm delete operation')]")
    public WebElement ConfirmDeleteOperation;

    @FindBy(xpath = "//button[@id='jhi-confirm-delete-tPCustomer']")
    public WebElement DeleteOnConfirm;

    @FindBy(xpath = "(//span[contains(text(),'Customers')])[2]")
    public WebElement CustomersHead;

    @FindBy(xpath = "//span[contains(text(),'City')]")
    public WebElement City;

    @FindBy(xpath = "//span[contains(text(),'Ssn')]")
    public WebElement Ssn;

    @FindBy(xpath = "//span[contains(text(),'Zip Code')]")
    public WebElement ZipCode;

    @FindBy(xpath = "//span[contains(text(),'Zelle Enrolled')]")
    public WebElement ZelleEnrolled;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div[1]/div/div/div/div/dl/dt[16]/span")
    public WebElement Account;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div[1]/div/div/div/div/dl/dt[13]/span")
    public WebElement Country;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div[1]/div/div/div/div/dl/dt[14]/span")
    public WebElement State;

    @FindBy(xpath = "//span[contains(text(),'Create or edit a Customer')]")
    public WebElement CreateOrEditACustomer;

    @FindBy(xpath = "//span[contains(text(),'Save')]")
    public WebElement SaveButton;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement EditFirstName;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement EditLastName;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement EditEmail;

    @FindBy(xpath = "//input[@name='mobilePhoneNumber']")
    public WebElement EditMobilePhoneNumber;

    @FindBy(xpath = "//input[@name='address']")
    public WebElement EditAddress;

    @FindBy(xpath = "//input[@name='state']")
    public WebElement EditState;

    @FindBy(xpath = "//select[@name='country.id']")
    public WebElement EditCountry;

    @FindBy(xpath = "//input[@name='zelleEnrolled']")
    public WebElement EditZelleEnrolled;

    @FindBy(xpath = "//div[contains(text(),'translation-not-found[gmiBankBackendApp.tPCustomer.updated]')]")
    public WebElement SuccessMessageForEditCustomer;

//@FindBy(xpath = "//div[@class='Toastify__toast-body']")
//public WebElement SuccessMessageForEditCustomer;

    @FindBy(xpath = "//div[contains(text(),'Internal server error')]")
    public WebElement FailMessage;
}
