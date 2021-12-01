package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class CreateEditACustomerPage {
    public CreateEditACustomerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement signInDataIcon;
    @FindBy(xpath = "//a[@id='login-item']")
    public WebElement signInButton;

    @FindBy(xpath = "(//*[.='Sign in'])[1]")
    public WebElement signInButtonSon;



    @FindBy(xpath = "//input[@id='username']")
    public WebElement userName;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passWord;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signIn;
    @FindBy(xpath = "//a[@id='jh-create-entity']")
    public WebElement createANewCustomer;
    @FindBy(xpath = "//input[@id='search-ssn']")
    public WebElement SSN;
    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    public WebElement searchbutton;
    @FindBy(xpath = "//input[@id='tp-customer-firstName']")
    public WebElement firstName;
    @FindBy(xpath = "//input[@id='tp-customer-lastName']")
    public WebElement lastName;


    @FindBy(xpath = "//input[@name='middleInitial']")
    public WebElement middleInitial;

   @FindBy(xpath = "//span[contains(text(),'Middle Initial')]")
   public WebElement MiddleInitial;


    @FindBy(xpath = "//input[@id='tp-customer-email']")
    public WebElement email;
    @FindBy(xpath = "//input[@id='tp-customer-mobilePhoneNumber']")
    public WebElement mobilePhoneNumber;
    @FindBy(xpath = "//input[@id='tp-customer-phoneNumber']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//input[@name='phoneNumber']")
    public WebElement PhoneNumber;


    @FindBy(xpath = "//input[@name='zipCode']")
    public WebElement zipCode;
    @FindBy(xpath = "//input[@name='address']")
    public WebElement address;
    @FindBy(xpath = "//input[@name='city']")
    public WebElement city;
    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement ssn;



    @FindBy(xpath = "//input[@name='createDate']")
    public WebElement createDate;
    @FindBy(xpath = "//select[@name='country.id']")
    public WebElement country;
    @FindBy(xpath = "//input[@name='state']")
    public WebElement state;
    @FindBy(xpath = "//select[@name='user.id']")
    public WebElement user;
    @FindBy(xpath = "//option[@value='2310']")
    public WebElement savingAccount;

    @FindBy(xpath = "//select[@id='tp-customer-account']")
    public WebElement Account;



    @FindBy(xpath = "(//input[@name='zelleEnrolled']")
    public WebElement ZelleEnrolled;


    @FindBy(xpath = "(//button[@type='button'])[4]")
    public WebElement button;

    @FindBy(xpath = "//*[.='Save']")
    public WebElement savebutton;

    @FindBy(xpath = "(//*[.='Create Date'])[3]")
    public WebElement dateError;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement snnError;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement cityError;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement greenline;






}