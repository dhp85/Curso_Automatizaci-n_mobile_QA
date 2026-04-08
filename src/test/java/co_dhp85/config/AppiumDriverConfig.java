package co_dhp85.config;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import java.net.URL;

public class AppiumDriverConfig {

    public static IOSDriver createIOSDriver() {
        try {
            XCUITestOptions options = new XCUITestOptions();
            options.setDeviceName("iPhone 17 Pro");
            options.setPlatformVersion("26.0");
            options.setBundleId("com.Diego.SportMeet");
            options.setNoReset(false);

            return new IOSDriver(new URL("http://127.0.0.1:4723/"), options);
        } catch (Exception e) {
            throw new RuntimeException("No se pudo crear el IOSDriver", e);
        }
    }
}