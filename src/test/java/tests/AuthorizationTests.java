package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AuthorizationPage;

public class AuthorizationTests extends BaseTest {
    @Test
    public void basicAuthTest() {
        AuthorizationPage authorizationPage = new AuthorizationPage(getDriver());
        authorizationPage.openPage();
        String text = authorizationPage.getTextAfterAuthorization();
        Assert.assertEquals(text,
                "Congratulations! You must have the proper credentials.",
                "Authorization failed!");
    }
}
