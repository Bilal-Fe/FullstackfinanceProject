package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MoneyTransferPage {

    public MoneyTransferPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="(//a[@class='dropdown-toggle nav-link'])[2]")
    public WebElement myOperationsDropdown;

    @FindBy(xpath="//a[contains(text(), 'Transfer Money')]")
    public WebElement transferMoney;

    @FindBy(xpath="//a[contains(text(), 'My Accounts')]")
    public WebElement myAccounts;

    @FindBy(xpath="//*[contains(text(), 'TRANSFER BETWEEN YOUR ACCOUNTS')]")
    public WebElement transferBetweenAccounts;

    @FindBy(xpath="//h2[contains(text(), 'Customer Accounts')]")
    public WebElement customerAccounts;

    @FindBy(xpath="//select[@name='fromAccountId']")
    public WebElement fromAccount;

    @FindBy(xpath="(//div[@class='text-danger form-group'])[1]")
    public WebElement redFrom;

    @FindBy(xpath="//select[@name='toAccountId']")
    public WebElement toAccount;

    @FindBy(xpath="(//div[@class='text-danger form-group'])[2]")
    public WebElement redTo1;

    @FindBy(xpath="//div[@class='text-danger form-group']")
    public WebElement redTo2;

    @FindBy(xpath="//input[@name='balance']")
    public WebElement balance;

    @FindBy(xpath="//textarea[@name='description']")
    public WebElement description;

    @FindBy(id="make-transfer")
    public WebElement makeTransferButton;

    @FindBy(xpath="//div[@class='Toastify__toast-body']")
    public WebElement successfulMessage;

    //"This field is required." message
    @FindBy(xpath="//div[@class='invalid-feedback']")
    public WebElement emptyFieldMessage;

    //"Translation not found" message

    @FindBy(xpath="//div[@class='Toastify__toast Toastify__toast--error toastify-toast']")
    public WebElement translationNotFoundMessage;

   // @FindBy(xpath="//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container' and @class='Toastify__toast Toastify__toast--error toastify-toast']")
    //public WebElement translationNotFoundMessage;

    @FindBy(xpath="//button[@class='btn btn-success btn-sm']")
    public WebElement viewTransaction;

    @FindBy(xpath="//span[contains(text(),'ID')]")
    public WebElement ID;


}
