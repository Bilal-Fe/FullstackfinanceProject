package stepdefinitions.uisteps;

import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.CommonPageElements;
import utilities.ConfigReader;
import pages.ChangePassword;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class ChangePasswordStepDefinition {

    ChangePassword changePassword = new ChangePassword();
    CommonPageElements commonPageElements = new CommonPageElements();

    @And("user enters admin username")
    public void userEntersAdminUsername() {commonPageElements.username.sendKeys(ConfigReader.getProperty("admin_user_name"));
    }

    @And("user enters admin password")
    public void userEntersAdminPassword() {commonPageElements.password.sendKeys(ConfigReader.getProperty("admin_password"));
    }

    @And("user clicks on the user name drop down")
    public void userClicksOnTheUserNameDropDown() {changePassword.userNameDropDown.click();
    }


    @And("user clicks on password button")
    public void userClicksOnPasswordButton() {
        ReusableMethods.waitFor(3);
        changePassword.passwordButton.click();

    }

    @And("user enters admin current password")
    public void userEntersAdminCurrentPassword() {changePassword.currentPassword.sendKeys(ConfigReader.getProperty("admin_password"));
    }

    @And("user enter a new valid password")
    public void userEnterANewValidPassword() {changePassword.NewPassword.sendKeys("Gmi123456!");

    }

    @And("user verifies the five bars for password strength")
    public void userVerifiesTheFiveBarsForPasswordStrength() {
        List<WebElement> greenBar = Driver.getDriver().findElements(By.xpath("//li[@style='background-color: rgb(0, 255, 0);']"));
        System.out.println(greenBar.size());
        Assert.assertEquals(5,greenBar.size());
    }

    @And("user reenters the new password")
    public void userReentersTheNewPassword() {changePassword.reenterNewPassword.sendKeys("Gmi123456!");
    }

    @And("user enter a new invalid {string} with one missing {string}")
    public void userEnterANewInvalidWithOneMissing(String arg0, String arg1) {changePassword.NewPassword.sendKeys(arg0);
    }

    @And("user verifies the three bars for password strength")
    public void userVerifiesTheThreeBarsForPasswordStrength() {
        List<WebElement> yellowBar = Driver.getDriver().findElements(By.xpath("//li[@style='background-color: rgb(255, 255, 0);']"));
        System.out.println(yellowBar.size());
        Assert.assertEquals(3,yellowBar.size());
    }

    @And("user enters a new invalid password with six characters")
    public void userEntersANewInvalidPasswordWithSixCharacters() {changePassword.NewPassword.sendKeys("Gmi12!");
    }

    @And("user verifies the four bars for password strength")
    public void userVerifiesTheFourBarsForPasswordStrength() {
        List<WebElement> lightGreenBar = Driver.getDriver().findElements(By.xpath("//li[@style='background-color: rgb(153, 255, 0);']"));
        System.out.println(lightGreenBar.size());
        Assert.assertEquals(4,lightGreenBar.size());
    }
}

