package AutomationMobileGELORA;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseTest {

    public static AndroidDriver driver;
    public static WebDriverWait wait;

    public static void setupDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "15.0");
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("app", "/Users/herlan/Downloads/app-staging-release.apk");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("appPackage", "com.gelora.staging");
//        capabilities.setCapability("appPackage", "com.gelora");
        capabilities.setCapability("appActivity", "com.gelora.MainActivity");

        driver = new AndroidDriver(capabilities);
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public static void stopDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static void resetApp() {
//        driver.terminateApp("com.example.jangkau");
        driver.activateApp("com.gelora.staging");
//        driver.activateApp("com.gelora");
    }
}
