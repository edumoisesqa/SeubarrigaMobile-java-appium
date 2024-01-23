package appium.run;

import appium.connect.App;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features",
        tags = {"@wip"},
        glue = "appium/steps"
)
public class RunTest {
    @BeforeClass
    public static void tearUp(){
        App.getDriver();

    }

    @AfterClass
    public static void tearDown(){
        App.closeDriver();

    }
}
