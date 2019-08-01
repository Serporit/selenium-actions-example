package pages;

import org.openqa.selenium.By;

/**
 * Created by Sergey_Poritskiy on 6/15/2017.
 */
public class MainPage extends AbstractPage {
    private static final String MAIN_URL = "https://jqueryui.com";
    private static final By DROPPABLE_LINK_LOCATOR = By.cssSelector("a[href$='droppable/']");
    private static final By RESIZABLE_LINK_LOCATOR = By.cssSelector("a[href$='resizable/']");
    private static final By SELECTABLE_LINK_LOCATOR = By.cssSelector("a[href$='selectable/']");

    public MainPage open() {
        browser.open(MAIN_URL);
        return this;
    }

    public DroppablePage openDroppableLink() {
        browser.click(DROPPABLE_LINK_LOCATOR);
        return new DroppablePage();
    }

    public ResizablePage openResizableLink() {
        browser.click(RESIZABLE_LINK_LOCATOR);
        return new ResizablePage();
    }

    public SelectablePage openSelectableLink() {
        browser.click(SELECTABLE_LINK_LOCATOR);
        return new SelectablePage();
    }
}
