package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DisappearingElementsPage;

public class DisappearingElementsTests extends BaseTest {
    @Test
    public void galleryButtonValidationTest() {
        DisappearingElementsPage disappearingElementsPage = new DisappearingElementsPage(getDriver());
        disappearingElementsPage.openDisappearingElementsPage();
        Assert.assertEquals(disappearingElementsPage.isGalleryButtonPresent(),
                true,
                "Gallery button is absent.");
    }

    @Test
    public void homeButtonValidationTest() {
        DisappearingElementsPage disappearingElementsPage = new DisappearingElementsPage(getDriver());
        disappearingElementsPage.openDisappearingElementsPage();
        Assert.assertEquals(disappearingElementsPage.isHomeButtonPresent(),
                true,
                "Home button is absent.");
    }

    @Test
    public void aboutButtonValidationTest() {
        DisappearingElementsPage disappearingElementsPage = new DisappearingElementsPage(getDriver());
        disappearingElementsPage.openDisappearingElementsPage();
        Assert.assertEquals(disappearingElementsPage.isAboutButtonPresent(),
                true,
                "About button is absent.");
    }

    @Test
    public void contactUsButtonValidationTest() {
        DisappearingElementsPage disappearingElementsPage = new DisappearingElementsPage(getDriver());
        disappearingElementsPage.openDisappearingElementsPage();
        Assert.assertEquals(disappearingElementsPage.isContactUsButtonPresent(),
                true,
                "Contact Us button is absent.");
    }

    @Test
    public void portfolioButtonValidationTest() {
        DisappearingElementsPage disappearingElementsPage = new DisappearingElementsPage(getDriver());
        disappearingElementsPage.openDisappearingElementsPage();
        Assert.assertEquals(disappearingElementsPage.isPortfolioButtonPresent(),
                true,
                "Portfolio button is absent.");
    }
}
