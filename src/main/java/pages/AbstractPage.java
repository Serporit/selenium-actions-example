package pages;

import browser.Browser;

public class AbstractPage {
    protected Browser browser;

    protected AbstractPage() {
        this.browser = Browser.getInstance();
    }
}
