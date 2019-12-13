package org.genco.testclient.fluent.enums;

public enum Page {
    HOME("Home"),
    FLIGHTS("Flights"),
    CRUISES("Cruises");

    private String value;

    Page(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}