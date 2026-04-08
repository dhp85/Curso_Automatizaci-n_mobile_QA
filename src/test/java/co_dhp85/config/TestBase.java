package co_dhp85.config;

import io.appium.java_client.ios.IOSDriver;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.actors.OnStage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SerenityJUnit5Extension.class)
public class TestBase {

    @BeforeEach
    public void setUp() {
        IOSDriver driver = AppiumDriverConfig.createIOSDriver();
        OnStage.setTheStage(
                OnlineCast.whereEveryoneCan(
                        BrowseTheWeb.with(driver)
                )
        );
    }
}