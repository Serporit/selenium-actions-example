package pages;

import org.openqa.selenium.By;
import reporting.Logger;

/**
 * Created by Sergey_Poritskiy on 6/15/2017.
 */
public class ResizablePage extends AbstractPage {
    private static final By SIZE_HANDLE_LOCATOR = By.cssSelector(".ui-resizable-se");

    public ResizablePage resizeSquare() {
        browser.switchToFrame();
        browser.resize(SIZE_HANDLE_LOCATOR, 150, 100);
        Logger.info("Successfully resized a square!");
        return this;
    }
}
