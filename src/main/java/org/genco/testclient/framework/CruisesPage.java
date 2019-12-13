package org.genco.testclient.framework;

public class CruisesPage extends AbstractListPage {
    private static final String CRUISES_NAV = "Cruises";
    private static final String CRUISES_LABEL = "Cruises: Mercury Tours";

    public void goTo() {
        SideNavMenu.goTo(CRUISES_NAV);
    }

    public boolean isAt() {
        return Browser
                .getTitle()
                .equals(CRUISES_LABEL);
    }
}
