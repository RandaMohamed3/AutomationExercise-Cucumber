package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver) { this.driver = driver; }

    By signupLoginBtn = By.xpath("//a[contains(text(),'Signup / Login')]");
    By loggedIn = By.xpath("//a[contains(text(), 'Logged in as')]"),
            deleteBtn = By.xpath("//a[contains(text(),'Delete Account')]");
    By deletedMsg = By.xpath("//h2[@data-qa='account-deleted']/b");
    By homePageElement = By.xpath("//*[@id=\"header\"]/div/div/div/div[1]");
    By contactUsBtn = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[8]/a");
    By testCasesBtn = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a");
    By productsBtn = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a");
    By subscriptionEmailField = By.id("susbscribe_email");
    By subscribeBtn = By.id("subscribe");
    By SubscriptionText = By.xpath("//h2[text()='Subscription']");
    By successMsg = By.xpath("//*[contains(text(),'You have been successfully subscribed!')]");

    public void clickSignupLogin() { driver.findElement(signupLoginBtn).click(); }
    public boolean isLoggedIn() { return driver.findElement(loggedIn).isDisplayed(); }
    public void clickDeleteAccount() { driver.findElement(deleteBtn).click(); }
    public boolean isAccountDeletedVisible() { return driver.findElement(deletedMsg).isDisplayed(); }
    public boolean isHomePageVisible() {
        return driver.findElement(homePageElement).isDisplayed();
    }
    public void clickHomePage() { driver.findElement(homePageElement).click(); }

    public void clickContactUsBtn() { driver.findElement(contactUsBtn).click();}
    public void clickTestCasesBtn() { driver.findElement(testCasesBtn).click(); }
    public void clickProductsBtn() { driver.findElement(productsBtn).click(); }
    public void scrollToFooter() {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public boolean isSubscriptionTitleVisible(String expectedText) {
        return driver.findElement(SubscriptionText).getText().trim().equalsIgnoreCase(expectedText);
    }

    public void enterSubscriptionEmail(String email) {
        driver.findElement(subscriptionEmailField).clear();
        driver.findElement(subscriptionEmailField).sendKeys(email);
    }

    public void clickSubscriptionArrow() {
        driver.findElement(subscribeBtn).click();
    }

    public boolean isSubscriptionSuccessMessageVisible(String expectedMessage) {
        return driver.findElement(successMsg).getText().trim().equalsIgnoreCase(expectedMessage);
    }

}
