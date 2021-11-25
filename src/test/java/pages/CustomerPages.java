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


}
