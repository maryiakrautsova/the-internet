package pages;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicallyLoadedElementsPage extends BasePage {

    @FindBy(css = "#start > button")
    private WebElement startButton;

    @FindBy(css = "#finish > h4")
    private WebElement hiddenText;

    public DynamicallyLoadedElementsPage(WebDriver driver) {
        super(driver);
    }

    public void openDynamicallyLoadedElementsPage() {
        driver.get(Urls.DYNAMICALLY_LOADED_ELEMENTS_URL);
    }

    public void clickStartButton() {
        startButton.click();
    }

    public String getHiddenText() {
        return hiddenText.getText();
    }
}
