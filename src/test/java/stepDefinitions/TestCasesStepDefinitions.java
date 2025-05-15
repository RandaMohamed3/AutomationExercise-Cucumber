package stepDefinitions;

import hooks.Hooks;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.HomePage;

public class TestCasesStepDefinitions {
    WebDriver driver = Hooks.driver;
    HomePage homePage = new HomePage(driver);

    @When("User clicks on the \"test cases\" button in home page")
    public void user_clicks_on_the_test_cases_button_in_home_page() {
        homePage.clickTestCasesBtn();
    }
    @Then("user is navigated to test cases page successfully")
    public void user_is_navigated_to_test_cases_page_successfully() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("/test_cases"), "Not navigated to test cases page");
    }
}
