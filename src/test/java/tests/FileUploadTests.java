package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileUploadPage;

public class FileUploadTests extends BaseTest {
    @Test
    public void uploadFileTest() throws InterruptedException {

        FileUploadPage fileUploadPage = new FileUploadPage(getDriver());
        fileUploadPage.openFileUploadPage();
        fileUploadPage.sendFilePath();
        fileUploadPage.uploadFile();
        driverManager.removeTimeout();
        String confirmationMessageAfterFileUpload = fileUploadPage.getUploadConfirmationMessage();
        driverManager.setTimeout();
        Assert.assertEquals(confirmationMessageAfterFileUpload, "dog.png");
    }
}
