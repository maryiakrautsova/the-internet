package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ChallengingDOMPage;

public class ChallengingDOMLocatorTests extends BaseTest {
    @Test
    public void verifyRedButtonTest() {
        ChallengingDOMPage challengingDOMPage = new ChallengingDOMPage(getDriver());
        challengingDOMPage.openLocatorsPage();
        String initialRedButtonMessage = challengingDOMPage.getRedButtonMessage();
        challengingDOMPage.clickRedButton();
        String redButtonMessage = challengingDOMPage.getRedButtonMessage();
        System.out.println("Red Button message is: " + redButtonMessage);
        Assert.assertEquals(redButtonMessage, initialRedButtonMessage);
    }

    @Test
    public void verifyGreenButtonTest() {
        ChallengingDOMPage challengingDOMPage = new ChallengingDOMPage(getDriver());
        challengingDOMPage.openLocatorsPage();
        String initialGreenButtonMessage = challengingDOMPage.getGreenButtonMessage();
        challengingDOMPage.clickGreenButton();
        String greenButtonMessage = challengingDOMPage.getGreenButtonMessage();
        System.out.println("Green Button message is: " + greenButtonMessage);
        Assert.assertEquals(greenButtonMessage, initialGreenButtonMessage);
    }

    @Test
    public void verifyBlueButtonTest(){
        ChallengingDOMPage challengingDOMPage = new ChallengingDOMPage(getDriver());
        challengingDOMPage.openLocatorsPage();
        String initialBlueButtonMessage = challengingDOMPage.getBlueButtonMessage();
        challengingDOMPage.clickBlueButton();
        String blueButtonMessage = challengingDOMPage.getBlueButtonMessage();
        System.out.println("Blue Button message is: " + blueButtonMessage);
        Assert.assertEquals(blueButtonMessage, initialBlueButtonMessage);
    }
}
