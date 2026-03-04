package AutomationMobileJangkau.StepDefinitions;

import AutomationMobileJangkau.BaseTest;
import AutomationMobileJangkau.page.HomePage;
import AutomationMobileJangkau.page.VenuePage;
import io.cucumber.java.Before;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.testng.AssertJUnit.assertEquals;


public class VenueSteps extends BaseTest {

    private VenuePage venuePage;
    // Initialize Driver
    @Before
    public void setup(){
//        setupDriver();
        venuePage = new VenuePage(driver);
    }

    // Step definitions
    @Given("user is launch the app")
    public void userIsLaunchJangkauAppAndGoToLoginPage() {
    }

    @And("user click selanjutnya button")
    public void userClickSelanjutnyaButton() {
        venuePage.welcomeScreen();
    }

    @And("user click search form and then input text with {string} and enter")
    public void userClickSearchFormAndThenInputTextWithAndEnter(String searhingValue) {
        venuePage.inputSearchingValue(searhingValue);
    }

    @And("user select venue, select date and timetable in the venue")
    public void userSelectVenueAndDateAndTimetableInTheVenue() {
        venuePage.hitSelectedVenue();
//      venuePage.hitButtonTimetable();
    }

    @When("user hit checkout button")
    public void userClickCheckoutButton() {

    }

    @Then("user is on payment details")
    public void userIsOnPaymentDetails() {

    }

}
