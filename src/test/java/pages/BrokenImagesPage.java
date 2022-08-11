package pages;

import constants.Urls;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BrokenImagesPage extends BasePage {
    private static String STATUS = "passed";

    public BrokenImagesPage(WebDriver driver) {
        super(driver);
    }

    public int getAmountOfBrokenImages() {
        Integer iBrokenImageCount = 0;
        try {
            iBrokenImageCount = 0;
            List<WebElement> imagesList = driver.findElements(By.tagName("img"));
            for (WebElement img : imagesList) {
                if (img != null) {
                    HttpClient client = HttpClientBuilder.create().build();
                    HttpGet request = new HttpGet(img.getAttribute("src"));
                    HttpResponse response = client.execute(request);
                    if (response.getStatusLine().getStatusCode() != 200) {
                        iBrokenImageCount++;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            STATUS = "failed";
            System.out.println(e.getMessage());
        }
        STATUS = "passed";
        return iBrokenImageCount;
    }

    public void openImagesPage() {
        driver.get(Urls.BROKEN_IMAGES_URL);
    }
}
