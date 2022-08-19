package pages;

import constants.Urls;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FloatingMenuPage extends BasePage {
    @FindBy(css = "p:nth-child(1)")
    private WebElement paragraphOne;

    @FindBy(css = "p:nth-child(1)")
    private WebElement paragraphTen;

    @FindBy(css = "li:nth-child(1) > a")
    private WebElement homeButton;

    public FloatingMenuPage(WebDriver driver) {
        super(driver);
    }

    public void openFloatingMenuPage() {
        driver.get(Urls.FLOATING_MENU_URL);
    }

    public boolean isHomeButtonVisible() {
        return homeButton.isDisplayed();
    }

    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Scrolling down the page till the element is found
        js.executeScript("arguments[0].scrollIntoView();", paragraphTen);
    }
}
