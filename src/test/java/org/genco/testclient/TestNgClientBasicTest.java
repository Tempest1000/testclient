package org.genco.testclient;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class TestNgClientBasicTest {

    private int number;

    @BeforeClass
    public void setup() {
        number = 12;
    }

    @AfterClass
    public void tearDown() {
        number = 0;
    }

    @BeforeMethod
    public void runBeforeMethod() {
        System.out.println("testing before method");
    }

    @AfterMethod
    public void runAfterMethod() {
        System.out.println("testing after method");
    }

    @Test
    public void givenNumber_whenEven_thenTrue() {
        assertTrue(number % 2 == 0);
    }

}
