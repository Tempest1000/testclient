package org.genco.testclient.framework;

public class Pages {

    public static HomePage homePage() {
        return new HomePage();
    }

    public static FlightsPage flightsPage() {
        return new FlightsPage();
    }

    public static CruisesPage cruisesPage() {
        return new CruisesPage();
    }
}
