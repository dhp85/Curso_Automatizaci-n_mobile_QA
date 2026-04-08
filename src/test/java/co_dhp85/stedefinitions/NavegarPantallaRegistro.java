// src/test/java/co_dhp85/stedefinitions/NavegarPantallaRegistro.java
package co_dhp85.stedefinitions;

import co_dhp85.config.TestBase;
import net.serenitybdd.screenplay.actions.Click;
import org.junit.jupiter.api.Test;

import static co_dhp85.userinerfaces.LoginPage.Button_Register;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class NavegarPantallaRegistro extends TestBase {

    @Test
    public void navegarPantallaRegistro() {
        theActorCalled("Dhp").attemptsTo(
                Click.on(Button_Register)
        );
    }
}