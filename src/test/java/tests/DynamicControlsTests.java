package tests;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicControlsPage;

public class DynamicControlsTests extends BaseTest {

    @Test
    public void removeOrAddCheckboxCanBeGone() {
        DynamicControlsPage dynamicControlsPage = new DynamicControlsPage(getDriver());
        dynamicControlsPage.openDynamicControlsPage();
        dynamicControlsPage.clickRemoveOrAddButton();

        driverManager.removeTimeout();
        driverManager.setExplicitWaitForCheckbox();
        boolean isCheckboxPresent = false;
        try {
            isCheckboxPresent = dynamicControlsPage.isCheckboxPresent();
        } catch (NoSuchElementException e) {
        }
        driverManager.setTimeout();
        Assert.assertFalse(isCheckboxPresent, "Checkbox is present.");

    }

    @Test
    public void removeOrAddCheckboxCanBeAdded() {
        DynamicControlsPage dynamicControlsPage = new DynamicControlsPage(getDriver());
        dynamicControlsPage.openDynamicControlsPage();
        dynamicControlsPage.clickRemoveOrAddButton();
        dynamicControlsPage.clickRemoveOrAddButton();
        boolean isCheckboxPresent = dynamicControlsPage.isCheckboxPresent();
        Assert.assertTrue(isCheckboxPresent, "Checkbox is removed.");
    }

    @Test
    public void inputCanBeEnabled() {
        DynamicControlsPage dynamicControlsPage = new DynamicControlsPage(getDriver());
        dynamicControlsPage.openDynamicControlsPage();
        dynamicControlsPage.clickEnableOrDisableButton();
        driverManager.removeTimeout();
        driverManager.setExplicitWaitForInput();
        boolean isInputAreaEnabled = dynamicControlsPage.isInputAreaEnabled();

        driverManager.setTimeout();
        Assert.assertTrue(isInputAreaEnabled, "Input area is disabled.");
    }

    @Test
    public void inputCanBeDisabled() {
        DynamicControlsPage dynamicControlsPage = new DynamicControlsPage(getDriver());
        dynamicControlsPage.openDynamicControlsPage();
        dynamicControlsPage.clickEnableOrDisableButton();
        dynamicControlsPage.clickEnableOrDisableButton();
        boolean isInputAreaEnabled = dynamicControlsPage.isInputAreaEnabled();
        Assert.assertFalse(isInputAreaEnabled, "Input area is disabled.");
    }
}
