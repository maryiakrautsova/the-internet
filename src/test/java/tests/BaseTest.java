package tests;

import drivermanager.DriverFactory;
import drivermanager.DriverManager;
import drivermanager.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();
    DriverManager driverManager;

    @BeforeClass
    public void setUp() {
        DriverFactory factory = new DriverFactory();
        driverManager = factory.getManager(DriverType.CHROME);
        driverManager.createDriver();
        driverManager.setTimeout();
        driverManager.startMaximize();
        threadLocalDriver.set(driverManager.getDriver());
    }

    public WebDriver getDriver() {
        return threadLocalDriver.get();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        driverManager.quiteDriver();
        threadLocalDriver.remove();
    }
}
