package org.genco.testclient.framework;

public class HomePage extends AbstractListPage {
    private static final String HOME_NAV = "Home";
    private static final String USERNAME_INPUT = "userName";

    public void goTo() {
        SideNavMenu.goTo(HOME_NAV);
    }

    public boolean isAt() {
        return Browser.isElementPresentByName(USERNAME_INPUT);
    }
}
