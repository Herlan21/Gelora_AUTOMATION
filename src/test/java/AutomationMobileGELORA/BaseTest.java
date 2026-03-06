package AutomationMobileGELORA;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AutomationName;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
import java.net.MalformedURLException;
import java.time.Duration;

public class BaseTest {

    public static AndroidDriver driver;
    public static WebDriverWait wait;

    public static void setupDriver() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        // Platform settings (tanpa prefix appium: untuk platformName)
        capabilities.setCapability("platformName", "Android");

        // Appium specific capabilities (gunakan prefix appium:)
        capabilities.setCapability("appium:deviceName", "emulator-5554");
        capabilities.setCapability("appium:platformVersion", "15");
        capabilities.setCapability("appium:automationName", AutomationName.ANDROID_UIAUTOMATOR2);
        capabilities.setCapability("appium:appPackage", "com.gelora.staging");
        capabilities.setCapability("appium:appActivity", "com.gelora.MainActivity");
        capabilities.setCapability("appium:app", "/Users/herlan/Downloads/app-staging-release.apk");

        // Optional: tambahkan no reset untuk mempercepat testing
        capabilities.setCapability("appium:noReset", false);
        capabilities.setCapability("appium:fullReset", false);

        // URL Appium server (pastikan portnya benar)
//        URL url = new URL("http://127.0.0.1:4723");

        // Inisialisasi driver
        driver = new AndroidDriver(capabilities);

        // WebDriver wait
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        System.out.println("Driver berhasil diinisialisasi!");
    }

    public static void stopDriver() {
        if (driver != null) {
            driver.quit();
            System.out.println("Driver ditutup.");
        }
    }

    public static void resetApp() {
        if (driver != null) {
            driver.activateApp("com.gelora.staging");
        }
    }
}