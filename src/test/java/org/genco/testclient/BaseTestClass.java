package org.genco.testclient;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import static org.genco.testclient.fluent.DriverFactory.getChromeDriver;
import static org.genco.testclient.fluent.DriverFactory.getJavascriptExecutor;

public class BaseTestClass {

    WebDriver driver;
    JavascriptExecutor js;
    private final String CLEAR_LOCAL_STORAGE_SCRIPT = "window.localStorage.clear()";
    private String url;

    BaseTestClass(String url) {
        this.url = url;
    }

    @BeforeSuite
    public void startupBrowser() {
        driver = getChromeDriver();
        js = getJavascriptExecutor();
    }

    @BeforeMethod()
    public void cleanupBefore() {
        clearCookies();
    }

    @AfterMethod()
    public void cleanupAfter() {
        clearCookies();
    }

    @AfterSuite
    public void cleanup() {
        driver.quit();
    }

    private void clearCookies() {
        driver.get(url);
        driver.manage().deleteAllCookies();
    }
}
