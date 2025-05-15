package stepDefinitions;

import hooks.Hooks;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.HomePage;

public class SubscriptionStepDefinitions {

    WebDriver driver = Hooks.driver;
    HomePage homePage = new HomePage(driver);

    @When("User scrolls down to the footer")
    public void user_scrolls_down_to_the_footer() {
        homePage.scrollToFooter();
    }

    @Then("{string} text should be visible")
    public void text_should_be_visible(String expectedText) {
        Assert.assertTrue(homePage.isSubscriptionTitleVisible(expectedText));
    }

    @When("User enters email {string} in subscription input and clicks the arrow button")
    public void user_enters_email_in_subscription_input_and_clicks_the_arrow_button(String email) {
        homePage.enterSubscriptionEmail(email);
        homePage.clickSubscriptionArrow();
    }

    @Then("Success message {string} should be visible")
    public void success_message_should_be_visible(String expectedMessage) {
        Assert.assertTrue(homePage.isSubscriptionSuccessMessageVisible(expectedMessage));
    }
}
