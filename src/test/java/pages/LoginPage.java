package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement loginDropdownClick;

    @FindBy(xpath = "//a[@id='login-item']")
    public WebElement signInClick;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement userNameBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordLoginBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInSubmit;

    @FindBy(xpath = "//span[contains(text(),'forget')]")
    public WebElement passwordResetButton;

    @FindBy(xpath = "//span[text()='You don't have an account yet?']")
    public WebElement newRegisterButton;

    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    public WebElement cancelButton;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailBox;

    @FindBy(xpath = "//span[text()='Reset password']")
    public WebElement resetPasswordButton;

    @FindBy(xpath = "//span[text()='My Operations']")
    public WebElement myOperationsButton;

    @FindBy(xpath = "//span[text()='Administration']")
    public WebElement administrationButton;

    @FindBy(xpath = "//a[@href='/logout']")
    public WebElement signOutButton;

    @FindBy(xpath = "//a[text()='My Accounts']")
    public WebElement myAccountButton;

    @FindBy(xpath = "//strong[text()='Failed to sign in!']")
    public WebElement failedMessage;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement resetPasswordBox;

}
