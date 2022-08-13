package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicContentPage;

public class DynamicContentTests extends BaseTest {
    @Test
    public void validateDynamicContentRowOneTest() {
        DynamicContentPage dynamicContentPage = new DynamicContentPage(getDriver());
        dynamicContentPage.openDynamicContentPage();
        String initialTextRowOne = dynamicContentPage.getTextFromTextAreaRowOne();
        String initialUrlPictureRowOne = dynamicContentPage.getPictureRowOneUrl();
        dynamicContentPage.refreshPage();
        String refreshedTextRowOne = dynamicContentPage.getTextFromTextAreaRowOne();
        String refreshedUrlPictureRowOne = dynamicContentPage.getPictureRowOneUrl();

        boolean isRowOneChanged = (refreshedTextRowOne != initialTextRowOne || refreshedUrlPictureRowOne != initialUrlPictureRowOne);

        Assert.assertTrue(isRowOneChanged, "Page has been refreshed.");
    }

    @Test
    public void validateDynamicContentRowTwoTest() {
        DynamicContentPage dynamicContentPage = new DynamicContentPage(getDriver());
        dynamicContentPage.openDynamicContentPage();
        String initialTextRowTwo = dynamicContentPage.getTextFromTextAreaRowTwo();
        String initialUrlPictureRowTwo = dynamicContentPage.getPictureRowTwoUrl();
        dynamicContentPage.refreshPage();
        String refreshedTextRowTwo = dynamicContentPage.getTextFromTextAreaRowTwo();
        String refreshedUrlPictureRowTwo = dynamicContentPage.getPictureRowTwoUrl();

        boolean isRowTwoChanged = (refreshedTextRowTwo != initialTextRowTwo || refreshedUrlPictureRowTwo != initialUrlPictureRowTwo);

        Assert.assertTrue(isRowTwoChanged, "Page has been refreshed.");
    }

    @Test
    public void validateDynamicContentRowThreeTest() {
        DynamicContentPage dynamicContentPage = new DynamicContentPage(getDriver());
        dynamicContentPage.openDynamicContentPage();
        String initialTextRowThree = dynamicContentPage.getTextFromTextAreaRowThree();
        String initialUrlPictureRowThree = dynamicContentPage.getPictureRowThreeUrl();
        dynamicContentPage.refreshPage();
        String refreshedTextRowThree = dynamicContentPage.getTextFromTextAreaRowThree();
        String refreshedUrlPictureRowThree = dynamicContentPage.getPictureRowThreeUrl();

        boolean isRowThreeChanged = (refreshedTextRowThree != initialTextRowThree || refreshedUrlPictureRowThree != initialUrlPictureRowThree);

        Assert.assertTrue(isRowThreeChanged, "Page has been refreshed.");
    }
}
