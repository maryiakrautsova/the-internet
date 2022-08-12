package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContextMenuPage;

public class ContextMenuTests extends BaseTest{
    @Test
    public void verifyContextMenuCall(){
        ContextMenuPage contextMenuPage = new ContextMenuPage(getDriver());
        contextMenuPage.openContextMenuPage();
        contextMenuPage.callContextMenu();
        String contextMenuMessage = contextMenuPage.getAlertText();
        contextMenuPage.closeAlert();
        Assert.assertEquals(contextMenuMessage, "You selected a context menu");
    }
}
