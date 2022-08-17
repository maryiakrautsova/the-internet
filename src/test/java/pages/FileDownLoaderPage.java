package pages;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.File;

public class FileDownLoaderPage extends BasePage {

    @FindBy(css = "a[href*='download/upload_file.xlsx']")
    private WebElement excelFile;

    public FileDownLoaderPage(WebDriver driver) {
        super(driver);
    }

    public void openFileDownloaderPage() {
        driver.get(Urls.FILE_DOWNLOADER_URL);
    }

    public void clickToDownload() {
        excelFile.click();
    }

    public String getFileName(){
        return excelFile.getText();
    }

    public boolean fileIsDownloaded(){
        File f = new File("C:\\" + excelFile.getText());
        return f.exists(); // this will print true or false whether the file program.txt exists
    }
}
