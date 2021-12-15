package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ChangePassword {
    public ChangePassword(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//span[contains(text(),'John Doe')]")
    public WebElement userNameDropDown;

    @FindBy(xpath = "(//span[contains(text(),'Password')])[1]")
    public WebElement passwordButton;

    @FindBy(xpath = "//input[@name='currentPassword']")
    public WebElement currentPassword;

    @FindBy(xpath = "//input[@name='newPassword']")
    public WebElement NewPassword;

    @FindBy(xpath = "//input[@name= 'confirmPassword']")
    public WebElement reenterNewPassword;
}
