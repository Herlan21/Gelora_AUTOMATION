package AutomationMobileGELORA.page;

import AutomationMobileGELORA.BaseTest;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class VenuePage extends BaseTest {

    //Splashscreen
    By welcomeScreenButtonSelanjutnya = AppiumBy.accessibilityId("Selanjutnya, \uE902");
    By welcomeScreenButtonHomepage = AppiumBy.accessibilityId("Yuk ke Homepage!");

    //Locator Navbar - HomePage
    By navbarVenue = AppiumBy.accessibilityId("Venue");

    //Locator Homepage All
    By searchForm = By.xpath("//android.widget.EditText[@text=\"Cari Venue\"]");
    By bottomSheetLocation = By.xpath("(//android.widget.SeekBar[@content-desc=\"Bottom Sheet\"])[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup");
    By lanjutkanButtonHome = AppiumBy.accessibilityId("Lanjutkan");
    By allowLocationPermission = By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_foreground_only_button\"]");

   // Locator Venue
   By selectedVenue = AppiumBy.accessibilityId("Selanjutnya, \uE902" );
   By selectedVenueTime = By.xpath("//android.view.ViewGroup[@content-desc=\"10:00 - 12:00, Rp400.000\"]/android.view.ViewGroup");


//Method action for locator
    // Searching method
    public void selanjutnyaButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(welcomeScreenButtonSelanjutnya)).isDisplayed();
        wait.until(ExpectedConditions.visibilityOfElementLocated(welcomeScreenButtonSelanjutnya)).click();
    }

    public void homepageButton (){
        wait.until(ExpectedConditions.visibilityOfElementLocated(welcomeScreenButtonHomepage)).isDisplayed();
        wait.until(ExpectedConditions.visibilityOfElementLocated(welcomeScreenButtonHomepage)).click();
    }

    public void checkBottomSheetLocation(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(bottomSheetLocation)).isDisplayed();
        wait.until(ExpectedConditions.visibilityOfElementLocated(lanjutkanButtonHome)).click();
    }

    public void hitAllowLocationPermission(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(allowLocationPermission)).isDisplayed();
        wait.until(ExpectedConditions.visibilityOfElementLocated(allowLocationPermission)).click();
    }

    public void inputSearchingValue(String searchingValue){
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchForm)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchForm)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchForm)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchForm)).sendKeys(searchingValue);
        pressKeyboardAction("go");
    }

    public void pressKeyboardAction(String action){
        driver.executeScript(
                "mobile: performEditorAction",
                ImmutableMap.of("action", action)
        );
    }

    public void hitSelectedVenue(){
      wait.until(ExpectedConditions.visibilityOfElementLocated(selectedVenue)).click();
    }

    public void hitButtonTimetable(){
      wait.until(ExpectedConditions.visibilityOfElementLocated(selectedVenueTime)).click();
    }

}


