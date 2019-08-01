package pages;

import org.openqa.selenium.By;
import reporting.Logger;

/**
 * Created by Sergey_Poritskiy on 6/15/2017.
 */
public class SelectablePage extends AbstractPage {

    public static final By FIRST_ITEM_LOCATOR = By.xpath("//li[1]");
    public static final String LAST_ITEM_LOCATOR_PATTERN = "//li[%d]";

    public SelectablePage selectItems(int itemsToSelect) {
        browser.switchToFrame();
        By lastItemLocator = By.xpath(String.format(LAST_ITEM_LOCATOR_PATTERN, itemsToSelect));
        browser.selectItems(FIRST_ITEM_LOCATOR, lastItemLocator);
        Logger.info("Successfully selected " + itemsToSelect + " elements!");
        return this;
    }
}
