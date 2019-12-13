package org.genco.testclient.framework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This class encapsulates code that interacts with the webdriver
 */
public class Browser {

    static WebDriver driver;
    static JavascriptExecutor js;

    public static void init() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
    }

    public static String getTitle() {
        return driver.getTitle();
    }

    public static void goTo(String url) {
        driver.get(url);
    }

    public static void clearCookies() {
        driver.manage().deleteAllCookies();
    }

    public static void close() {
        if (driver != null) driver.quit();
    }

    public static void addInputTextForControl(String inputControl, String text) {
        driver.findElement(By.name(inputControl)).click();
        driver.findElement(By.name(inputControl)).sendKeys(text);
    }

    public static void clickControlForName(String inputControl) {
        driver.findElement(By.name(inputControl)).click();
    }

    public static void clickControlForLinkText(String link) {
        driver.findElement(By.linkText(link)).click();
    }

    public static void clickControlForCssSelector(String selector) {
        driver.findElement(By.name(selector)).click();
    }

    public static String getControlTextForCssSelector(String selector) {
        return driver.findElement(By.cssSelector(selector)).getText();
    }

    public static String getControlTextForXPath(String xpath) {
        return driver.findElement(By.xpath(xpath)).getText();
    }

    public static boolean isElementPresentByName(String name) {
        return driver.findElements(By.name(name)).size() > 0;
    }

    public static void pause() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
