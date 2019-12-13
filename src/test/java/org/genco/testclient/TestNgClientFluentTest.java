package org.genco.testclient;

import org.genco.testclient.fluent.CommonVerification;
import org.genco.testclient.fluent.enums.Page;
import org.genco.testclient.fluent.pages.login.LoginPage;
import org.genco.testclient.fluent.pages.sidenav.SideNav;
import org.testng.annotations.Test;

public class TestNgClientFluentTest extends BaseTestClass {
    private static final String URL = "http://newtours.demoaut.com/";

    private static final String USERNAME_INPUT = "userName";
    private static final String USERNAME = "qqqq";
    private static final String PASSWORD = "qqqq";
    private static final String CRUISES_LABEL = "Cruises: Mercury Tours";

    private LoginPage login = LoginPage.getLoginPage();
    private SideNav sideNav = SideNav.getSideNav();
    private CommonVerification common = CommonVerification.getCommonVerification();

    public TestNgClientFluentTest() {
        super(URL);
    }

    @Test
    public void givenSideNav_whenNavigateToHome_ThenInputShouldDisplay() {

        login.act()
                .at(URL)
                .withUsername(USERNAME)
                .withPassword(PASSWORD)
                .login();

        sideNav.act()
                .select(Page.HOME);

        common
                .verifyElementPresent(USERNAME_INPUT);
    }

    @Test
    public void givenSideNav_whenNavigateToCruises_ThenTitleShouldDisplay() {

        login.act()
                .at(URL)
                .withUsername(USERNAME)
                .withPassword(PASSWORD)
                .login();

        sideNav.act()
                .select(Page.CRUISES);

        common
                .verifyPageDisplayedByTitle(CRUISES_LABEL);
    }

}
