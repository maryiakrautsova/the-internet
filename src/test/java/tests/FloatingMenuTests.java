package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FloatingMenuPage;

public class FloatingMenuTests extends BaseTest {
    @Test
    public void homeButtonCanBeAlwaysDisplayedIfScrollingDownTest() {
        FloatingMenuPage floatingMenuPage = new FloatingMenuPage(getDriver());
        floatingMenuPage.openFloatingMenuPage();
        floatingMenuPage.scrollDown();
        boolean isHomeButtonVisible = floatingMenuPage.isHomeButtonVisible();
        Assert.assertTrue(isHomeButtonVisible, "'Home' button is not visible.");
    }
}
