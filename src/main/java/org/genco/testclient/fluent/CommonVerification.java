package org.genco.testclient.fluent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static org.genco.testclient.fluent.DriverFactory.getChromeDriver;

public class CommonVerification {

    protected WebDriver driver = getChromeDriver();

    private CommonVerification(){
        // hide it
    }

    public static CommonVerification getCommonVerification(){
        return new CommonVerification();
    }

    public CommonVerification verifyElementPresent(String name){
        boolean isPresent = driver.findElements(By.name(name)).size() > 0;
        Assert.assertTrue(isPresent);
        return this;
    }

    public CommonVerification verifyPageDisplayedByTitle(String name){
        Assert.assertEquals(name, driver.getTitle());
        return this;
    }

    public CommonVerification verifyIsDisplayed(By element){
        Assert.assertTrue(driver.findElement(element).isDisplayed());
        return this;
    }
}
