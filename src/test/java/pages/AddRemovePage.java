package pages;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AddRemovePage extends BasePage {

    @FindBy(xpath = "//*[@id='content']/div/button")
    private WebElement addElementButton;

    @FindBy(xpath = "//*[@id='elements']/button[1]")
    private WebElement removeElementButton;

    @FindBy(css = ".added-manually")
    private List <WebElement> listOfRemainedElements;

    public AddRemovePage(WebDriver driver) {
        super(driver);
    }

    public void openAddRemoveElementsPage() {
        driver.get(Urls.ADD_REMOVE_URL);
    }

    public void clickAddElement() {
        addElementButton.click();
    }

    public void clickRemoveElement() {
        removeElementButton.click();
    }

    public int getAmountOfRemainedElements() {
        return listOfRemainedElements.size();
    }
}
