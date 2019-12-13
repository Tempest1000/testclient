package org.genco.testclient.framework;

public class SideNavMenu {

    public static void goTo(String link) {
        Browser.clickControlForLinkText(link);
        Browser.pause();
    }
}
