package org.genco.testclient.fluent;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Andrew Baines
 */
public class DriverFactory {
    private static WebDriver driver;
    private static WebDriverWait wait;
    private static JavascriptExecutor js;

    private DriverFactory() {
        // prevent instantiation
    }

    public static WebDriver getChromeDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static WebDriverWait getWebDriverWait() {
        if (wait == null) {
            wait = new WebDriverWait(getChromeDriver(), 5);
        }
        return wait;
    }

    public static JavascriptExecutor getJavascriptExecutor() {
        if (js == null) {
            js = (JavascriptExecutor) getChromeDriver();
        }
        return js;
    }
}
