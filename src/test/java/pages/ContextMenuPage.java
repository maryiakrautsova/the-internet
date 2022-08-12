package pages;

import constants.Urls;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ContextMenuPage extends BasePage {
    @FindBy(id = "hot-spot")
    private WebElement boxArea;

    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    public void openContextMenuPage() {
        driver.get(Urls.CONTEXT_MENU_URL);
    }

    public void callContextMenu() {
        Actions a = new Actions(driver);
        a.moveToElement(boxArea).contextClick().build().perform();
    }

    public String getAlertText() {
        Alert alert = driver.switchTo().alert();
        return alert.getText();
    }

    public void closeAlert() {
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }
}
