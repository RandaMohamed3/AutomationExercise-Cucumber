package stepDefinitions;

import hooks.Hooks;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.HomePage;
import pages.LoginPage;

public class LoginStepDefinitions {

    WebDriver driver = Hooks.driver;
    LoginPage login = new LoginPage(driver);
    HomePage home = new HomePage(driver);

    String validPassword = "123456";

    @Then("{string} should be shown")
    public void verify_text_should_be_visible(String expectedText) {
        Assert.assertTrue(home.isLoggedIn());
    }
    @When("User enters valid login credentials")
    public void user_enters_valid_credentials() {
        //String emailToUse = Hooks.registeredEmail != null ? Hooks.registeredEmail : "randa222.test@gmail.com";
        String emailToUse = "randa222.test@gmail.com";
        login.enterLoginEmail(emailToUse);
        login.enterLoginPassword(validPassword);
    }

    @When("User enters invalid login credentials")
    public void user_enters_invalid_credentials() {
        login.enterLoginEmail("wrong@test.com");
        login.enterLoginPassword("wrongpass");
    }

    @When("Clicks login button")
    public void user_clicks_login_button() {
        login.clickLoginButton();
    }

    @When("User clicks on logout button")
    public void user_clicks_on_logout_button() {
        login.clickLogoutBtn();
    }

    @Then("LOGIN TO YOUR ACCOUNT should be visible")
    public void login_header_should_be_visible() {
        Assert.assertTrue(login.isLoginHeaderVisible());
    }

    @Then("LOGGED IN AS USERNAME should be visible")
    public void logged_in_should_be_visible() {
        Assert.assertTrue(home.isLoggedIn());
    }

    @Then("Error {string} should be visible")
    public void error_message_should_be_visible(String errorMessage) {
        Assert.assertTrue(login.isErrorVisible());
    }
    @Then ("User should be navigated to login page")
    public void user_should_be_navigated_to_login_page() {
        Assert.assertTrue(login.isLoginHeaderVisible());
    }
}
