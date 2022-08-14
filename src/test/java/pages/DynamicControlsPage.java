package pages;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicControlsPage extends BasePage {

    @FindBy(css = "#checkbox input")
    private WebElement checkbox;

    @FindBy(css = "#checkbox-example > button")
    private WebElement removeOrAddButton;

    @FindBy(css = "#input-example > button")
    private WebElement enableOrDisableButton;

    @FindBy(css = "input[type='text']")
    private WebElement inputArea;

    public DynamicControlsPage(WebDriver driver) {
        super(driver);
    }

    public void openDynamicControlsPage() {
        driver.get(Urls.DYNAMIC_CONTROLS_URL);
    }

    public void clickRemoveOrAddButton() {
        removeOrAddButton.click();
    }

    public boolean isCheckboxPresent() {
        return checkbox.isDisplayed();
    }

    public void clickEnableOrDisableButton() {
        enableOrDisableButton.click();
    }

    public boolean isInputAreaEnabled() {
        return inputArea.isEnabled();
    }
}
