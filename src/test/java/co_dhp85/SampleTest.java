package co_dhp85;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;


public class SampleTest {

    private IOSDriver driver;

    @BeforeEach
    public void configurationAppium() throws MalformedURLException {
        XCUITestOptions options = new XCUITestOptions()
                .setPlatformName("iOS")
                .setUdid("6FEF71A2-E687-4CF4-9D42-EEEA18A4F928")
                .setPlatformVersion("26.0")
                .setBundleId("com.Diego.SportMeet");
        driver = new IOSDriver(
                new URL("http://127.0.0.1:4723/"), options
        );


    }

    @Test
    void sampleTestSerenity(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement registerButton = wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        AppiumBy.xpath("//XCUIElementTypeButton[@name=\"Registrate\"]"))
        );

        registerButton.click();
    }
}
