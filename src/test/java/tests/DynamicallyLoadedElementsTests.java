package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicallyLoadedElementsPage;

public class DynamicallyLoadedElementsTests extends BaseTest {

    @Test
    public void validateHiddenTextCanBeVisibleTest() {
        DynamicallyLoadedElementsPage dynamicallyLoadedElementsPage = new DynamicallyLoadedElementsPage(getDriver());
        dynamicallyLoadedElementsPage.openDynamicallyLoadedElementsPage();
        dynamicallyLoadedElementsPage.clickStartButton();
        driverManager.removeTimeout();
        driverManager.setExplicitWaitForHiddenText();
        String hiddenText = dynamicallyLoadedElementsPage.getHiddenText();

        driverManager.setTimeout();
        Assert.assertEquals(hiddenText,
                "Hello World!",
                "Hidden text can not be reached.");
    }
}
