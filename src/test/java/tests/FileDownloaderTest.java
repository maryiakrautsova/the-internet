package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileDownLoaderPage;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class FileDownloaderTest extends BaseTest {
    @Test
    public void downloadOneExcelFile() {
        Map<String, Object> prefs = new HashMap<String, Object>();

        prefs.put("download.default_directory",
                System.getProperty("user.dir") + File.separator + "externalFiles" + File.separator + "downloadFiles");

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);

        FileDownLoaderPage fileDownLoaderPage = new FileDownLoaderPage(getDriver());

        fileDownLoaderPage.openFileDownloaderPage();
        fileDownLoaderPage.clickToDownload();

        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href*='download/upload_file.xlsx']")));
        String downloadedFileNAme = fileDownLoaderPage.getFileName();
        Assert.assertEquals(downloadedFileNAme,
                "upload_file.xlsx" ,
                "File is not downloaded.");
    }
}
