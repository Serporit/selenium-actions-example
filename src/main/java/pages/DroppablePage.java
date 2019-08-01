package pages;

import org.openqa.selenium.By;
import reporting.Logger;

/**
 * Created by Sergey_Poritskiy on 6/15/2017.
 */
public class DroppablePage extends AbstractPage {
    private static final By SQUARE_LOCATOR = By.cssSelector("#draggable");
    private static final By TARGET_LOCATOR = By.cssSelector("#droppable");

    public DroppablePage dragNDropSquare() {
        browser.switchToFrame();
        browser.dragAndDrop(SQUARE_LOCATOR, TARGET_LOCATOR);
        Logger.info("Successfully dragged a square!");
        return this;
    }

    public DroppablePage dragNDropWrongSquare() {
        browser.switchToFrame();
        browser.dragAndDrop(TARGET_LOCATOR, TARGET_LOCATOR);
        Logger.info("Dragged a wrong square");
        return this;
    }

    public boolean squareIsOnThePlace() {
        return false;
    }
}
