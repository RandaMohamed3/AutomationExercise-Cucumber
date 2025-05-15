package stepDefinitions;

import hooks.Hooks;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.AccountPage;
import pages.HomePage;
import pages.SignupPage;


public class RegisterStepDefinitions {

    WebDriver driver = Hooks.driver;
    HomePage home = new HomePage(driver);
    SignupPage signup = new SignupPage(driver);
    AccountPage account = new AccountPage(driver);

    String randomEmail = "randa" + System.currentTimeMillis() + "@test.com";
    String validPassword = "123456";

    @When("User launches browser and navigates to {string}")
    public void user_launches_browser_and_navigates_to(String url) {
        driver.get(url);
    }

    @Then("Home page should be visible")
    public void home_page_should_be_visible() {
        Assert.assertTrue(home.isHomePageVisible());
    }

    @When("User clicks on {string} button")
    public void user_clicks_button(String buttonText) {
        switch (buttonText.toLowerCase()) {
            case "signup_login":
            case "signup / login":
                home.clickSignupLogin();
                break;
            case "create account":
                account.clickCreateAccount();
                break;
            case "continue":
                account.clickContinue();
                break;
            case "delete account":
                home.clickDeleteAccount();
                break;
            default:
                throw new IllegalArgumentException("Unknown button: " + buttonText);
        }
    }

    @Then("{string} should be visible")
    public void verify_text_should_be_visible2(String expectedText) {
        switch (expectedText.toUpperCase()) {
            case "NEW USER SIGNUP":
                Assert.assertTrue(signup.isSignupHeaderVisible());
                break;
            case "ENTER ACCOUNT INFORMATION":
                Assert.assertTrue(account.isAccountInfoHeaderVisible());
                break;
            case "ACCOUNT CREATED!":
                Assert.assertTrue(account.isAccountCreatedVisible());
                break;
            case "ACCOUNT DELETED!":
                Assert.assertTrue(home.isAccountDeletedVisible());
                break;
            case "LOGGED IN AS USERNAME":
                Assert.assertTrue(home.isLoggedIn());
                break;
            case "EMAIL ADDRESS ALREADY EXIST!":
                Assert.assertTrue(signup.isAlreadyRegisteredHeaderVisible());
                break;
            default:
                throw new IllegalArgumentException("Unknown visible text: " + expectedText);
        }
    }

    @When("User enters name and email and clicks {string}")
    public void user_enters_name_email_and_clicks(String button) {
        signup.enterName("Randa");
        signup.enterEmail(randomEmail);
        signup.clickSignupButton();

        Hooks.registeredEmail = randomEmail;
    }

    @When("User fills account information and address details")
    public void user_fills_account_info() {
        account.selectTitle("Mrs");
        account.setPassword(validPassword);
        account.setDateOfBirth("10", "May", "1998");
        account.setCheckboxes();
        account.fillAddressInfo();
    }
    @When("User enters name and already registered email address and Clicks \"Signup\" button")
    public void user_enters_name_and_already_registered_email_address_and_Clicks_button() {
        signup.enterName("Randa");
        signup.enterEmail("randa222.test@gmail.com");
        signup.clickSignupButton();
    }

}
