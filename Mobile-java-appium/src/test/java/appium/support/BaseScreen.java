package appium.support;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

import static appium.connect.App.appiumDriver;


public class BaseScreen extends Element {
    public static WebDriver driver;

    /* Função que preenche campo imput*/
    public static void preencherInput(By by, String text) {
        waitElement(by);
        element(by).sendKeys(text);
    }

    /* Função que clica em campo ou em botão*/
    public static void click(By by) {
        //time(20);
        waitElement(by);
        element(by).click();
    }

    /* Função que limpra campo imput*/
    static void clear(By by) {
        element(by).clear();
    }

    /* Função que retorna um "false ou um true" sobre a disponibilidade de um elemento*/
    static boolean isDisplayed(By by) {
        return element(by).isDisplayed();
    }

    /* Função que seleciona a tecla tab sobre um campo*/
    protected static void selecinoTab(By by) {
        element(by).sendKeys(Keys.TAB);
    }

    /* Função que pega o texto de um determinado elemento*/
    protected static String getText(By by) {
        return element(by).getText();
    }

    /* Função que valida se o check está true*/
    protected static String checkedTrue(By by, String True) {
        return element(by).getAttribute(True);
    }

    /* Função que valida se o check está false*/
    protected static String checkedFalse(By by, String False) {
        return element(by).getAttribute(False);
    }

    /* Função para rolar a tela para baixoque valida se o check está false*/
    public static void scrollDown(int qtdScroll) {
        org.openqa.selenium.Dimension size = appiumDriver.manage().window().getSize();
        // calculate coordinates for vertical swipe
        int startVerticalY = (int) (size.height * 0.05);
        int endVerticalY = (int) (size.height * 0.45);
        int startVerticalX = (int) (size.width * 0.5);

        for (int i = 0; i < qtdScroll; i++) {
            TouchAction action = new TouchAction(appiumDriver);
            action.press(PointOption.point(startVerticalY, startVerticalX))
                    .waitAction(new WaitOptions().withDuration(Duration.ofMillis(500))) //you can change wait durations as per your requirement
                    .moveTo(PointOption.point(endVerticalY, startVerticalY))
                    //.moveTo(PointOption.point(startVerticalY, endVerticalY))
                    .release()
                    .perform();
        }
    }

    public static void scrollUp(int qtdScroll) {
        org.openqa.selenium.Dimension size = appiumDriver.manage().window().getSize();
        // calculate coordinates for vertical swipe
        int startVerticalY = (int) (size.height * 0.45);
        int endVerticalY = (int) (size.height * 0.45);
        int startVerticalX = (int) (size.width * 0.5);

        for (int i = 0; i < qtdScroll; i++) {
            TouchAction action = new TouchAction(appiumDriver);
            action.press(PointOption.point(startVerticalY,startVerticalX))
                    .waitAction(new WaitOptions().withDuration(Duration.ofMillis(500))) //you can change wait durations as per your requirement
                    .moveTo(PointOption.point(endVerticalY,startVerticalY))
                    //.moveTo(PointOption.point(startVerticalY, endVerticalY))
                    .release()
                    .perform();
        }
    }

    public static void swipeLeft(int qtdSwipes) {
        org.openqa.selenium.Dimension size = appiumDriver.manage().window().getSize();
        // calculate coordinates for vertical swipe
        int startHorizontallX = (int) (size.width * 0.1);
        int endHorizontalX = (int) (size.width * 0.95);
        int startVerticaly = (int) (size.height * 0.5);

        for (int i = 0; i < qtdSwipes; i++) {
            TouchAction action = new TouchAction(appiumDriver);
            action.press(PointOption.point(startHorizontallX, startVerticaly))
                    .waitAction(new WaitOptions().withDuration(Duration.ofMillis(1000))) //you can change wait durations as per your requirement
                    .moveTo(PointOption.point(endHorizontalX, startVerticaly))
                    .release()
                    .perform();
        }
    }

    public static void swipeRight(int qtdSwipes) {
        org.openqa.selenium.Dimension size = appiumDriver.manage().window().getSize();
        // calculate coordinates for vertical swipe
        int startHorizontallX = (int) (size.width * 0.95);
        int endHorizontalX = (int) (size.width * 0.1);
        int startVerticaly = (int) (size.height * 0.5);

        for (int i = 0; i < qtdSwipes; i++) {
            TouchAction action = new TouchAction(appiumDriver);
            action.press(PointOption.point(startHorizontallX, startVerticaly))
                    .waitAction(new WaitOptions().withDuration(Duration.ofMillis(1000))) //you can change wait durations as per your requirement
                    .moveTo(PointOption.point(endHorizontalX, startVerticaly))
                    .release()
                    .perform();
        }

    }


}

