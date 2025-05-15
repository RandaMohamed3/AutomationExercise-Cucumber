package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage {

    WebDriver driver;

    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
    }

    final By submitBtn = By.cssSelector("#contact-us-form > div:nth-child(7) > input");

    public boolean isGetInTouchVisible() {
        return driver.findElement(By.xpath("//h2[text()='Get In Touch']")).isDisplayed();
    }

    public void enterName(String name) {
        driver.findElement(By.name("name")).sendKeys(name);
    }

    public void enterEmail(String email) {
        driver.findElement(By.name("email")).sendKeys(email);
    }

    public void enterSubject(String subject) {
        driver.findElement(By.name("subject")).sendKeys(subject);
    }

    public void enterMessage(String message) {
        driver.findElement(By.name("message")).sendKeys(message);
    }

    public void uploadFile(String filePath) {
        driver.findElement(By.name("upload_file")).sendKeys(filePath);
    }
    public By clickSubmit() {
        return submitBtn;
    }

    public boolean isSuccessMessageVisible() {
        return driver.findElement(By.xpath("//*[contains(text(),'Success! Your details have been submitted successfully.')]")).isDisplayed();
    }

}
