package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DragAndDropPage;

public class DragAndDropTests extends BaseTest {
    @Test
    public void dragAndDropTest() {
        DragAndDropPage dragAndDropPage = new DragAndDropPage(getDriver());
        dragAndDropPage.openDragAndDropPage();
        dragAndDropPage.performDragAndDrop();

        Assert.assertEquals(dragAndDropPage.isSourceElementTextDisplayed(), true);
    }
}
