package org.genco.testclient.framework;

public class LoginPage {

    private static final String USERNAME_INPUT = "userName";
    private static final String PASSWORD_INPUT = "password";
    private static final String LOGIN_BUTTON = "login";

    public static void reset(String url) {
        Browser.goTo(url);
        Browser.clearCookies();
    }

    public static void goTo(String url) {
        Browser.goTo(url);
    }

    public static void login(String url, String username, String password) {
        goTo(url);
        Browser.addInputTextForControl(USERNAME_INPUT, username);
        Browser.addInputTextForControl(PASSWORD_INPUT, password);
        Browser.clickControlForName(LOGIN_BUTTON);
        Browser.pause();
    }
}
