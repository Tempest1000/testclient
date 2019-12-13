package org.genco.testclient.framework;

public class FlightsPage extends AbstractListPage {
    private static final String FLIGHTS_NAV = "Flights";
    private static final String FLIGHTS_LABEL = "Flight Details";
    private static final String FLIGHTS_LABEL_XPATH = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td/font/font/b/font/font";

    public void goTo() {
        SideNavMenu.goTo(FLIGHTS_NAV);
    }

    public boolean isAt() {
        return Browser
                .getControlTextForXPath(FLIGHTS_LABEL_XPATH)
                .equals(FLIGHTS_LABEL);
    }
}
