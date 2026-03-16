package AutomationMobileGELORA.StepDefinitions;

import AutomationMobileGELORA.BaseTest;
import AutomationMobileGELORA.page.VenuePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class VenueSteps extends BaseTest {

    private VenuePage venuePage;

    @Before
    public void setup() {
        venuePage = new VenuePage();
    }

    // Step definitions
    @Given("user is launch Gelora app")
    public void userIsLaunchGeloraApp() {
    }

    @And("user click selanjutnya and homepage button")
    public void userClickSelanjutnyaAndHomepageButton() {
        venuePage.selanjutnyaButton();
        venuePage.selanjutnyaButton();
        venuePage.homepageButton();
        venuePage.checkBottomSheetLocation();
        venuePage.hitAllowLocationPermission();
    }

    @And("user click search form and then input text with {string} and enter")
    public void userClickSearchFormAndThenInputTextWithAndEnter(String searchingValue) {
        venuePage.inputSearchingValue(searchingValue);
    }

    @And("user select venue, select date and timetable in the venue")
    public void userSelectVenueAndDateAndTimetableInTheVenue() {
        venuePage.hitSelectedVenue();
        venuePage.hitButtonTimetable();
    }

    @When("user hit checkout button")
    public void userClickCheckoutButton() {

    }

    @Then("user is on payment details")
    public void userIsOnPaymentDetails() {

    }

}
