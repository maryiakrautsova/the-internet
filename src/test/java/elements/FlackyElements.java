package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlackyElements {
    private static final String DISAPPEARING_BUTTONS_SELECTOR = "li:nth-child(%s) > a";
    private String labelText;
    private WebDriver driver;

    public FlackyElements(WebDriver driver, String labelText) {
        this.labelText = labelText;
        this.driver = driver;
    }

    public void inputText(String text) {
        String finalSelectorPath = String.format(DISAPPEARING_BUTTONS_SELECTOR, labelText);
        driver.findElement(By.cssSelector(finalSelectorPath)).sendKeys(text);
    }
}
