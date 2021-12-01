package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegistrationPage {
    public RegistrationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "ssn")
    public WebElement ssn;

    @FindBy(xpath = "//input[@name='firstname']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@name='lastname']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@name='address']")
    public WebElement address;

    @FindBy(xpath = "//input[@name='mobilephone']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@name='firstPassword']")
    public WebElement newPassword;

    @FindBy(xpath = "//input[@name='secondPassword']")
    public WebElement confirmPassword;

    @FindBy(id = "register-submit")
    public WebElement registerButton;

    @FindBy(xpath = "//div[text()='Please enter your social security number.']")
    public WebElement enterSsnMessage;

    @FindBy(xpath = "//div[text()='Ssn is invalid.']")
    public WebElement invalidSsnMessage;

    @FindBy(xpath = "//div[text()='Please enter your first name.']")
    public WebElement enterFirstNameMessage;

    @FindBy(xpath = "//div[text()='Please enter your last name.']")
    public WebElement enterLastNameMessage;

    @FindBy(xpath = "//div[text()='Please enter your address.']")
    public WebElement enterAddressMessage;

    @FindBy(xpath = "//div[text()='Please enter your mobile phone number.']")
    public WebElement enterPhoneNumberMessage;

    @FindBy(xpath = "//div[text()='Your mobile phone number is invalid.']")
    public WebElement invalidPhoneNumberMessage;

    @FindBy(xpath = "//div[text()='Your username is required.']")
    public WebElement enterUsernameMessage;

    @FindBy(xpath = "//div[text()='Please enter your email.']")
    public WebElement enterEmailMessage;

    @FindBy(xpath = "//div[text()='Your email is invalid.']")
    public WebElement invalidEmailMessage;

    @FindBy(xpath = "//div[text()='Your password is required.']")
    public WebElement passwordReguiredMessage;

    @FindBy(xpath = "//div[text()='Your confirmation password is required.']")
    public WebElement confirmationPasswordReguiredMessage;

    @FindBy(xpath = "//div[contains(text(),'Your password should contain at least one uppercase')]")
    public WebElement passwordContainError;

    @FindBy(xpath = "//*[contains(text(),'Registration saved')]")
    public WebElement registrationSuccessMessage;

}