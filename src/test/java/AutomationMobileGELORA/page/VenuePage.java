package AutomationMobileGELORA.page;

import AutomationMobileGELORA.BaseTest;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class VenuePage extends BaseTest {

    private AndroidDriver driver;

    public VenuePage(AndroidDriver driver) {
        this.driver = driver;
    }

    //Splashscreen
    By welcomeScreenButton = AppiumBy.accessibilityId("Selanjutnya, \uE902");

    //Locator Navbar - HomePage
    By navbarVenue = AppiumBy.accessibilityId("Venue");

    //Locator Homepage All
    By seachForm = By.xpath("//android.widget.EditText[@text=\"Cari Venue\"]");

   // Locator Venue
   By selectedVenue = AppiumBy.accessibilityId("Selanjutnya, \uE902");

    //Method action for locator
    // Searching method

//    public void inputSearchingValue(String searchingValue){
//        wait.until(ExpectedConditions.visibilityOfElementLocated(seachForm)).click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(seachForm)).sendKeys(searchingValue);
//    }

    public void inputSearchingValue(String searchingValue){
        wait.until(ExpectedConditions.visibilityOfElementLocated(seachForm)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(seachForm)).sendKeys(searchingValue);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    }

    public void welcomeScreen() {
        wait.until(ExpectedConditions.presenceOfElementLocated(welcomeScreenButton)).isDisplayed();
        wait.until(ExpectedConditions.visibilityOfElementLocated(welcomeScreenButton)).click();
    }

    public void hitSelectedVenue(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectedVenue)).click();
    }

//    public String invalidNotification(){
//        return wait.until(ExpectedConditions.visibilityOfElementLocated(errorAlert)).getText();
//    }
//
//    public void inputUsername(String username){
//        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameForm)).sendKeys(username);
//    }
//
//    public void inputPassword(String password){
//        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordForm)).sendKeys(password);
//    }

//    public void clickLoginButton(){
//        wait.until(ExpectedConditions.visibilityOfElementLocated(loginButton)).click();
//    }

}


