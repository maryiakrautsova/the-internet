package pages;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.interactions.Actions;


public class DragAndDropPage extends BasePage {
    @FindBy(xpath = "//li[@id='credit2']/a")
    private WebElement source;

    @FindBy(xpath = "//ol[@id='bank']/li")
    private WebElement sourceElementText;

    @FindBy(id = "//ol[@id='bank']/li")
    private WebElement target;

    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }

    public void openDragAndDropPage() {
        driver.get(Urls.DRAG_AND_DROP_URL);
    }

    public void performDragAndDrop() {
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source, target);
        actions.build();
        actions.perform();
        actions.release();
    }

    public boolean isSourceElementTextDisplayed() {
        return sourceElementText.isDisplayed();
    }
}
