package stepDefinitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.ContactUsPage;
import pages.HomePage;
import utilities.ElementHelper;

public class ContactUsStepDefinitions {
    WebDriver driver = Hooks.driver;
    HomePage homePage = new HomePage(driver);
    ContactUsPage contactUsPage = new ContactUsPage(driver);
    ElementHelper elementHelper = new ElementHelper(driver);

    @When("User clicks on the {string} button")
    public void user_clicks_on_the_contact_us(String buttonText) {
        switch (buttonText.toLowerCase()){
            case"contact us":
                homePage.clickContactUsBtn();
                break;
            case "home":
                homePage.clickHomePage();
                break;
            default:
                throw new IllegalArgumentException("Unknown button: " + buttonText);
        }
    }
    @Then("{string} should be shown in the page")
    public void should_be_shown_in_the_page(String expectedText) {
        switch (expectedText.toUpperCase()) {
            case "GET IN TOUCH":
                Assert.assertTrue(contactUsPage.isGetInTouchVisible());
                break;
            case "SUCCESS! YOUR DETAILS HAVE BEEN SUBMITTED SUCCESSFULLY":
                Assert.assertTrue(contactUsPage.isSuccessMessageVisible());
                break;
            default:
                throw new IllegalArgumentException("Unknown visible text: " + expectedText);
        }
    }
    @When("User enters name, email, subject, and message")
    public void user_enters_name_and_email_and_subject_and_message() {
        contactUsPage.enterName("Randa");
        contactUsPage.enterEmail("randa@gmail.com");
        contactUsPage.enterSubject("Test Subject");
        contactUsPage.enterMessage("Randa");
    }
    @And("User uploads a file")
    public void user_uploads_a_file() {
    String filePath = System.getProperty("user.dir") + "/src/test/testfile.txt";
    contactUsPage.uploadFile(filePath);
    }
    @And("User clicks on the \"submit\" button of the form")
    public void user_clicks_on_the_button_of_the_form() {
        elementHelper.waitForAdToDisappear();
        elementHelper.jsClick(contactUsPage.clickSubmit());
    }

    @And("User confirms the alert")
    public void user_confirms_the_alert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}
