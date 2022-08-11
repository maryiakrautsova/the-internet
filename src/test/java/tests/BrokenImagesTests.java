package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrokenImagesPage;

public class BrokenImagesTests extends BaseTest {


    @Test
    protected void findBrokenImagesTest() {

        BrokenImagesPage brokenImagesPage = new BrokenImagesPage(getDriver());
        brokenImagesPage.openImagesPage();
        int iBrokenImageCount = brokenImagesPage.getAmountOfBrokenImages();

        Assert.assertEquals(iBrokenImageCount, 2);
    }
}