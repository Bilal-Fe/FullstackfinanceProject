package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ManageAccountPage {
    public ManageAccountPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
