
import browser.Browser;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.DroppablePage;
import pages.MainPage;
import pages.ResizablePage;
import pages.SelectablePage;

public class ActionsDemoTests {

    @BeforeClass(description = "init browser")
    public void init(){
        Browser.getInstance();
    }

    @Test(description = "Drag-n-drop test")
    public void dragNDropDemo() {
        DroppablePage droppablePage = new MainPage().open().openDroppableLink();
        droppablePage.dragNDropSquare();
    }

    @Test(description = "Resize test")
    public void resizeDemo() {
        ResizablePage resizablePage = new MainPage().open().openResizableLink();
        resizablePage.resizeSquare();
    }

    @Test(description = "Selecting test")
    public void selectingDemo() {
        SelectablePage selectablePage = new MainPage().open().openSelectableLink();
        selectablePage.selectItems(5);
    }

    @Test(description = "Broken test")
    public void brokenTest() {
        DroppablePage droppablePage = new MainPage().open().openDroppableLink();
        droppablePage.dragNDropWrongSquare();
        Assert.assertTrue(droppablePage.squareIsOnThePlace());
    }

    @AfterClass(description = "close browser")
    public void kill(){
        Browser.kill();
    }
}
