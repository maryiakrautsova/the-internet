package pages;

import constants.Credentials;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthorizationPage extends BasePage {

    @FindBy(css = "div > p")
    private WebElement textOfSuccessfulAuthorization;

    public AuthorizationPage(WebDriver driver) {
        super(driver);
    }

    public String getUsername() {
        return Credentials.USERNAME;
    }

    public String getPassword() {
        return Credentials.PASSWORD;
    }

    public String getAuthorizationPageUrl() {
        return "http://" + this.getUsername() + ":" + this.getPassword() + "@the-internet.herokuapp.com/basic_auth";
    }

    public void openPage() {
        driver.get(this.getAuthorizationPageUrl());
    }

    public String getTextAfterAuthorization() {
        return textOfSuccessfulAuthorization.getText();
    }
}
