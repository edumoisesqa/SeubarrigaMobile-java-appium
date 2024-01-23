package appium.support;
import appium.connect.App;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static appium.config.DefaultValue.TIME_DEFAULT;

public class Element extends App {
    protected static MobileElement element(By by) {
        waitElement(by);
        return appiumDriver.findElement(by);
    }

    protected static void waitElement(By by) {
        appiumDriver.manage().timeouts().implicitlyWait(TIME_DEFAULT, TimeUnit.SECONDS);
        appiumDriver.findElement(by);
    }

}

