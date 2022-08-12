package pages;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DisappearingElementsPage extends BasePage {

    @FindBy(css = "li:nth-child(1) > a")
    private WebElement homeButton;

    @FindBy(css = "li:nth-child(2) > a")
    private WebElement aboutButton;

    @FindBy(css = "li:nth-child(3) > a")
    private WebElement contactUsButton;

    @FindBy(css = "li:nth-child(4) > a")
    private WebElement portfolioUsButton;

    @FindBy(css = "li:nth-child(5) > a")
    private WebElement galleryUsButton;

    public DisappearingElementsPage(WebDriver driver) {
        super(driver);
    }

    public void openDisappearingElementsPage() {
        driver.get(Urls.DISAPPEARING_ELEMENTS_URL);
    }

    public boolean isHomeButtonPresent() {
        return homeButton.isDisplayed();
    }

    public boolean isAboutButtonPresent() {
        return aboutButton.isDisplayed();
    }

    public boolean isContactUsButtonPresent() {
        return contactUsButton.isDisplayed();
    }

    public boolean isPortfolioButtonPresent() {
        return portfolioUsButton.isDisplayed();
    }

    public boolean isGalleryButtonPresent() {
        return galleryUsButton.isDisplayed();
    }
}
