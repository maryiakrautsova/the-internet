package pages;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChallengingDOMPage extends BasePage {

    @FindBy(xpath = "//div[@class='large-2 columns']//a[1]")
    private WebElement blueButton;

    @FindBy(xpath = "//a[2]")
    private WebElement redButton;

    @FindBy(xpath = "//a[3]")
    private WebElement greenButton;

    @FindBy(css = ".button")
    private WebElement blueButtonMessage;

    @FindBy(css = ".button.alert")
    private WebElement redButtonMessage;

    @FindBy(css = ".button.success")
    private WebElement greenButtonMessage;

    public ChallengingDOMPage(WebDriver driver) {
        super(driver);
    }

    public void openLocatorsPage() {
        driver.get(Urls.CHALLENGING_DOM_LOCATORS_URL);
    }

    public void clickBlueButton() {
        blueButton.click();
    }

    public void clickRedButton() {
        redButton.click();
    }

    public void clickGreenButton() {
        greenButton.click();
    }

    public String getRedButtonMessage() {
        return redButtonMessage.getText();
    }

    public String getBlueButtonMessage() {
        return blueButtonMessage.getText();
    }

    public String getGreenButtonMessage() {
        return greenButtonMessage.getText();
    }
}
