package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EntryAdPage;

public class EntryAdTests extends BaseTest {
    @Test
    public void modalWindowCanBeClosedTest() {
        EntryAdPage entryAdPage = new EntryAdPage(getDriver());
        entryAdPage.openEntryAdPage();
        entryAdPage.clickCloseButton();
        boolean isModalPresent = entryAdPage.isModalWindowPresent();
        Assert.assertFalse(isModalPresent, "Modal window is still present.");
    }

    @Test
    public void modalWindowCanBeReEnabledTest() {
        EntryAdPage entryAdPage = new EntryAdPage(getDriver());
        entryAdPage.openEntryAdPage();
        entryAdPage.clickCloseButton();
        entryAdPage.switchToModalWindow();
        boolean isModalPresent = entryAdPage.isModalWindowPresent();
        Assert.assertTrue(isModalPresent, "Modal window is absent.");
    }
}
