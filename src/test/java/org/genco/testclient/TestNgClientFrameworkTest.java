package org.genco.testclient;

import org.genco.testclient.framework.Browser;
import org.genco.testclient.framework.LoginPage;
import org.genco.testclient.framework.Pages;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestNgClientFrameworkTest {

    private static final String USERNAME = "qqqq";
    private static final String PASSWORD = "qqqq";
    private static final String URL = "http://newtours.demoaut.com/";

    @BeforeClass
    public void setup() {
        System.out.println("setup");

        Browser.init();
    }

    @AfterClass
    public void tearDown() {
        System.out.println("tear down");

        Browser.close();
    }

    @BeforeMethod
    public void runBeforeMethod() {
        System.out.println("testing before method");

        LoginPage.reset(URL);
        LoginPage.login(URL, USERNAME, PASSWORD);
    }

    @AfterMethod
    public void runAfterMethod() {
        System.out.println("testing after method");

        // logout
    }

    @Test
    public void canGoToHomePage() {
        Pages.homePage().goTo();
        Assert.assertTrue(Pages.homePage().isAt());
    }

    @Test
    public void canGoToFlightsPage() {
        Pages.flightsPage().goTo();
        Assert.assertTrue(Pages.flightsPage().isAt());
    }

    @Test
    public void canGoToCruisesPage() {
        Pages.cruisesPage().goTo();
        Assert.assertTrue(Pages.cruisesPage().isAt());
    }
}
