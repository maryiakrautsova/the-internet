package pages;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class EntryAdPage extends BasePage {
    @FindBy(css = "div.modal-footer > p")
    private WebElement closeButton;

    @FindBy(className = "modal")
    private WebElement modalWindow;

    @FindBy(id = "restart-ad")
    private WebElement clickHereButton;

    public EntryAdPage(WebDriver driver) {
        super(driver);
    }

    public void openEntryAdPage() {
        driver.get(Urls.ENTRY_AD_URL);
    }

    public void clickCloseButton() {
        closeButton.click();
    }

    public boolean isModalWindowPresent() {
        return modalWindow.isDisplayed();
    }

    public void switchToModalWindow(){
        Actions action = new Actions(driver);
        action.moveToElement(clickHereButton).perform();
    }

}
