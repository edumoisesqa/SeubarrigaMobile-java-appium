package appium.support;

import appium.connect.App;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.net.MalformedURLException;
import java.time.Duration;

public class Hooks extends Element {
    public Hooks() throws MalformedURLException {
        PageFactory.initElements(new AppiumFieldDecorator(App.getDriver(), Duration.ofSeconds(12)  ), this );
    }

    @After //import cucumber.api.java.After;
    public void after(Scenario scenario) throws MalformedURLException {
        if (scenario.isFailed()) {
            Utilss Utils = new Utilss();
            File screenshot = Utils.gerarScreenShot(scenario);
            Utils.anexarScreenshot(screenshot, scenario.getName());
        }
        App.relaunchApp();

    }

}

