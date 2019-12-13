package org.genco.testclient.fluent.pages.login;

import org.genco.testclient.framework.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.genco.testclient.fluent.DriverFactory.getChromeDriver;

public class LoginActController {

    private WebDriver driver = getChromeDriver();
    private static final String USERNAME_INPUT = "userName";
    private static final String PASSWORD_INPUT = "password";
    private static final String LOGIN_BUTTON = "login";

    public LoginActController at(String url) {
        driver.get(url);
        return this;
    }

    public LoginActController withUsername(String text) {
        driver.findElement(By.name(USERNAME_INPUT)).click();
        driver.findElement(By.name(USERNAME_INPUT)).sendKeys(text);
        return this;
    }

    public LoginActController withPassword(String text) {
        driver.findElement(By.name(PASSWORD_INPUT)).click();
        driver.findElement(By.name(PASSWORD_INPUT)).sendKeys(text);
        return this;
    }

    public void login() {
        driver.findElement(By.name(LOGIN_BUTTON)).click();
        Browser.pause();
    }
}
