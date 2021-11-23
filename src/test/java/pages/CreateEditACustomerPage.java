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

    @FindBy(xpath = "(//*[.='Zelle Enrolled'])[1]")
    public WebElement zelleEnrolled;


}