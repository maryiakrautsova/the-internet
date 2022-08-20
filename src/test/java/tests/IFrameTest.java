package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.IFramePage;

public class IFrameTest extends BaseTest {
    @Test
    public void textCanBeAddedToEditor() {
        IFramePage iFramePage = new IFramePage(getDriver());
        iFramePage.openIFramePage();
        iFramePage.switchToTextArea();
        iFramePage.inputText();
        String editedText = iFramePage.getNewTextAdded();
        Assert.assertEquals(editedText, "Your content goes here. I love testing!");
    }
}
