package pages;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicContentPage extends BasePage {

    @FindBy(css = "a[href^='/dynamic_content?']")
    private WebElement refreshPageButton;

    @FindBy(css = ".row:nth-child(1) > .large-10")
    private WebElement textAreaRowOne;

    @FindBy(css = ".row:nth-child(4) > .large-10")
    private WebElement textAreaRowTwo;

    @FindBy(css = ".row:nth-child(7) > .large-10")
    private WebElement textAreaRowThree;

    @FindBy(css = ".row:nth-child(1) img")
    private WebElement pictureRowOne;

    @FindBy(css = ".row:nth-child(4) img")
    private WebElement pictureRowTwo;

    @FindBy(css = ".row:nth-child(7) img")
    private WebElement pictureRowThree;

    public DynamicContentPage(WebDriver driver) {
        super(driver);
    }

    public void openDynamicContentPage() {
        driver.get(Urls.DYNAMIC_CONTENT_URL);
    }

    public void refreshPage() {
        refreshPageButton.click();
    }

    public String getTextFromTextAreaRowOne() {
        return textAreaRowOne.getText();
    }

    public String getTextFromTextAreaRowTwo() {
        return textAreaRowTwo.getText();
    }

    public String getTextFromTextAreaRowThree() {
        return textAreaRowThree.getText();
    }

    public String getPictureRowOneUrl() {
        return pictureRowOne.getAttribute("src");
    }

    public String getPictureRowTwoUrl() {
        return pictureRowTwo.getAttribute("src");
    }

    public String getPictureRowThreeUrl() {
        return pictureRowThree.getAttribute("src");
    }
}
