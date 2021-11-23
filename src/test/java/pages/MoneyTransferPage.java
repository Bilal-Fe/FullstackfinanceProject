package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MoneyTransferPage {
    public MoneyTransferPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
