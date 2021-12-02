package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ManageAccountPage {
    public ManageAccountPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='tp-account-description']")
    public WebElement descriptionBox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement descriptionBoxErrorMessage;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement balanceBoxErrorMessage;

    @FindBy(xpath = "//input[@id='tp-account-balance']")
    public WebElement balanceBox;

    @FindBy(xpath = "//select[@id='tp-account-accountType'']")
    public WebElement accountTypeBox;

    @FindBy(xpath = "//select[@id='tp-account-accountStatusType']")
    public WebElement accountStatusTypeBox;

    @FindBy(id = "tp-account-createDate")
    public WebElement createDateBox;

    @FindBy(xpath = "//input[@id='tp-account-closedDate']")
    public WebElement closedDateBox;

    @FindBy(xpath = "//select[@id='tp-account-employee']")
    public WebElement employeeBox;

    @FindBy(xpath = "//button[@id='save-entity']")
    public WebElement saveButton;

    @FindBy(xpath = " //input[@id='username']")
    public WebElement userName;

    @FindBy(xpath = " //input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInbutton;

    @FindBy(xpath = "//span[.='My Operations']")
    public WebElement myOperations;

    @FindBy(xpath = "//span[.='Manage Accounts']")
    public WebElement manageAccounts;

    @FindBy(xpath = "//span[.='Create a new Account']")
    public WebElement createANewAccount;

    @FindBy(xpath = "//span[.='Create or edit a Account']")
    public WebElement verifyCreateAccountPage;
    @FindBy(xpath = "//select[@id='tp-account-accountType']")
    public WebElement selectAccountType;

    @FindBy(xpath = "//select[@id='tp-account-accountStatusType']")
    public WebElement selectAccountStatus;

    @FindBy(xpath = "//span[.='Sign out']")
    public WebElement signOut;

    @FindBy(xpath = "(//a[@class='dropdown-toggle nav-link'])[3]")
    public WebElement chevron;

    @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])[1]")
    public WebElement editButton;

    @FindBy(xpath = "//span[.='Accounts']")
    public WebElement accounts;
}