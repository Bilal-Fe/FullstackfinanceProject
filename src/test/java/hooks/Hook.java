package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hook {

    @Before
    public void setUp() {

    }

    @After
    public void tearDown(Scenario scenario) {
//        final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
////       Attaching the screenshot to the scenarios in the default-cucumber-reports.html
//
//        if (scenario.isFailed()) {
//            scenario.attach(screenshot, "image/png", "Screenshot");
//        }
    }
}
