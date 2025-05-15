package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage {
    WebDriver driver;
    public SignupPage(WebDriver driver) { this.driver = driver; }

    By signupHeader = By.xpath("//h2[text()='New User Signup!']");
    By nameInput = By.name("name");
    By emailInput = By.xpath("//input[@data-qa='signup-email']");
    By signupBtn = By.xpath("//button[text()='Signup']");
    By RegisteredHeader = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/p");

    public boolean isSignupHeaderVisible() {
        return driver.findElement(signupHeader).isDisplayed();
    }
    public void enterName(String name) {
        driver.findElement(nameInput).sendKeys(name);
    }
    public void enterEmail(String email) {
        driver.findElement(emailInput).sendKeys(email);
    }
    public void clickSignupButton() {
        driver.findElement(signupBtn).click();
    }
    public boolean isAlreadyRegisteredHeaderVisible() {
        return driver.findElement(RegisteredHeader).isDisplayed();
    }
}


