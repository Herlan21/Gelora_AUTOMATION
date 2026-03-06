package AutomationMobileGELORA;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

import java.net.MalformedURLException;

public class CucumberHooks {

    @BeforeAll
    public static void beforeAll() throws MalformedURLException {
        BaseTest.setupDriver();
    }

    @AfterAll
    public static void afterAll() {
        BaseTest.stopDriver();
    }

    @After
    public static void after() {
        BaseTest.resetApp();
    }
}
