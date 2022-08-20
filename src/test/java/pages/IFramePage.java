package pages;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IFramePage extends BasePage {
    @FindBy(id = "mce_0_ifr")
    private WebElement frame;

    @FindBy(id = "tinymce")
    private WebElement textInputArea;

    public IFramePage(WebDriver driver) {
        super(driver);
    }

    public void openIFramePage() {
        driver.get(Urls.IFRAME_URL);
    }

    public void switchToTextArea() {
        driver.switchTo().frame(frame);
    }

    public void inputText() {
        textInputArea.sendKeys(" I love testing!");
    }

    public String getNewTextAdded() {
        return textInputArea.getText();
    }
}
