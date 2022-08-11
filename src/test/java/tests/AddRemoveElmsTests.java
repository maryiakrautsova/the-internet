package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddRemovePage;

public class AddRemoveElmsTests extends BaseTest {
    @Test
    public void addOnceRemoveOnceTest() {
        AddRemovePage addRemovePage = new AddRemovePage(getDriver());
        addRemovePage.openAddRemoveElementsPage();
        addRemovePage.clickAddElement();
        addRemovePage.clickRemoveElement();
        Assert.assertEquals(addRemovePage.getAmountOfRemainedElements(), 0);
    }

    @Test
    public void addTwiceRemoveOnceTest() {
        AddRemovePage addRemovePage = new AddRemovePage(getDriver());
        addRemovePage.openAddRemoveElementsPage();
        addRemovePage.clickAddElement();
        addRemovePage.clickAddElement();
        addRemovePage.clickRemoveElement();
        Assert.assertEquals(addRemovePage.getAmountOfRemainedElements(), 1);
    }
}
