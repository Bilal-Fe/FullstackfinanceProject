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
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInSubmit;

    @FindBy(xpath = "//div[@class='alert alert-warning fade show'][1]")
    public WebElement passwordResetButton;

    @FindBy(xpath = "//div[@class='alert alert-warning fade show'][2]")
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


}
