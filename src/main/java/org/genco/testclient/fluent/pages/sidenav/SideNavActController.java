package org.genco.testclient.fluent.pages.sidenav;

import org.genco.testclient.fluent.enums.Page;
import org.genco.testclient.framework.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.genco.testclient.fluent.DriverFactory.getChromeDriver;

/**
 * Controller for fluent tests.
 * <p>
 * Note: Another layer of abstraction could be added here for the WebDriver.
 * The WebDriver could either be pushed down another layer, like in the Browser class.
 * Or the WebDriver could be injected into this class as a dependency via a common interface.
 * </p>
 */
public class SideNavActController {

    private WebDriver driver = getChromeDriver();

    public void select(Page page) {

        driver.findElement(By.linkText(page.toString())).click();
        Browser.pause();
    }
}
