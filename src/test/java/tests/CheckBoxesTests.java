package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckBoxesPage;

public class CheckBoxesTests extends BaseTest {
    @Test
    public void checkboxOneCanBeCheckedTest() {
        CheckBoxesPage checkBoxesPage = new CheckBoxesPage(getDriver());
        checkBoxesPage.openCheckBoxesPage();
        Boolean checkBoxOneUnchecked = checkBoxesPage.isCheckBoxOneUnchecked();
        Assert.assertFalse(checkBoxOneUnchecked, "Checkbox #1 isn't set to unchecked.");
        Boolean checkBoxTwoChecked = checkBoxesPage.isCheckBoxTwoChecked();
        checkBoxesPage.changeCheckBoxOneStatus();
        Boolean checkBoxOneAfterSettingChecked = checkBoxesPage.isCheckBoxOneUnchecked();
        Assert.assertTrue(checkBoxTwoChecked, "Checkbox #2 isn't set to checked.");
        Assert.assertTrue(checkBoxOneAfterSettingChecked, "Checkbox #1 isn't set to checked.");
    }

    @Test
    public void checkboxTwoCanBeUncheckedTest() {
        CheckBoxesPage checkBoxesPage = new CheckBoxesPage(getDriver());
        checkBoxesPage.openCheckBoxesPage();
        Boolean checkBoxTwoChecked = checkBoxesPage.isCheckBoxTwoChecked();
        Assert.assertTrue(checkBoxTwoChecked, "Checkbox #2 is set to checked.");
        checkBoxesPage.changeCheckBoxTwoStatus();
        Boolean checkBoxTwoAfterSettingUnchecked = checkBoxesPage.isCheckBoxTwoChecked();
        Assert.assertFalse(checkBoxTwoAfterSettingUnchecked, "Checkbox #2 is set to unchecked.");
    }
}
