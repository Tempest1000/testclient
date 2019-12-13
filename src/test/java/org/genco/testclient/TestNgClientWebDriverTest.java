package org.genco.testclient;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

/**
 * TestNG Selenium WebDriver tests (simple).
 * <p>
 * Note: This page is a more unstructured implementation,
 * for a structured implementation see TestNgFramework and Fluent Tests.
 * </p>
 */
public class TestNgClientWebDriverTest {

    public static final String USERNAME = "qqqq";
    public static final String PASSWORD = "qqqq";
    public static final String USERNAME_ELEMENT = "userName";
    public static final String PASSWORD_ELEMENT = "password";
    public static final String LOGIN_ELEMENT = "login";
    public static final String URL = "http://newtours.demoaut.com/";
    private WebDriver driver;
    JavascriptExecutor js;

    @BeforeClass
    public void setup() {
        System.out.println("setup");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
    }

    @AfterClass
    public void tearDown() {
        System.out.println("tear down");

        driver.quit();
    }

    @BeforeMethod
    public void runBeforeMethod() {
        System.out.println("testing before method");

        driver.get(URL);
        driver.manage().deleteAllCookies();

        Login();
    }

    @AfterMethod
    public void runAfterMethod() {
        System.out.println("testing after method");

        // logout
    }

    @Test
    public void login() {
        assertTrue(12 % 2 == 0);
        //SideNavTest("categories", "Categories");
    }

    @Test
    public void givenSideNav_whenNavigateToHome_ThenInputShouldDisplay() {
        SideNavHomeTest("Home");
    }

    @Test
    public void givenSideNav_whenNavigateToFlights_ThenFlightDetailsShouldDisplay() {
        SideNavFlightsTest("Flights", "Flight Details");
    }

    @Test
    public void givenSideNav_whenNavigateToCruises_ThenTitleShouldDisplay() {
        SideNavTest("Cruises", "Cruises: Mercury Tours");
    }

    private void SideNavHomeTest(String text) {
        driver.findElement(By.linkText(text)).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        boolean isPresent = driver.findElements(By.name(USERNAME_ELEMENT)).size() > 0;
        assertTrue(isPresent);
    }

    private void SideNavFlightsTest(String text, String label) {
        driver.findElement(By.linkText(text)).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // this xpath statement could be better if we had an automation id (or just check for page title)
        String elementText = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td/font/font/b/font/font")).getText();
        assertEquals(elementText, label);
    }

    private void SideNavTest(String text, String title) {
        driver.findElement(By.linkText(text)).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals(title, driver.getTitle());
    }

    private void Login() {

        driver.findElement(By.name(USERNAME_ELEMENT)).click();
        driver.findElement(By.name(USERNAME_ELEMENT)).sendKeys(USERNAME);
        driver.findElement(By.name(PASSWORD_ELEMENT)).click();
        driver.findElement(By.name(PASSWORD_ELEMENT)).sendKeys(PASSWORD);
        driver.findElement(By.name(LOGIN_ELEMENT)).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
