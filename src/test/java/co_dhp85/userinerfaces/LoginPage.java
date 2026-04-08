package co_dhp85.userinerfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;

public class LoginPage {

    public static final Target Button_Register = the("Boton de registrar")
            .located(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"Registrate\"]"));

}
