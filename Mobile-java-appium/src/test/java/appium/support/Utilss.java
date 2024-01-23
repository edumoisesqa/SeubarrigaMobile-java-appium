package appium.support;
import appium.connect.App;
import cucumber.api.Scenario;
import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Utilss {


    /*1- Gera relatorio com nome e status do cenário no allure
     * 2- Cria diretorio automaticamente*/

    public static File gerarScreenShot(Scenario scenario) throws MalformedURLException {
        File img = ((TakesScreenshot) App.getDriver()).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(img, (new File("src/main/java/resources/evidences", scenario.getName() + " - " + scenario.getStatus().toUpperCase() + ".png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return img;
    }

    public static void anexarScreenshot(File file, String description) {
        Path content = Paths.get(file.getPath());
        try (InputStream is = Files.newInputStream(content)) {
            Allure.addAttachment(description, is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
