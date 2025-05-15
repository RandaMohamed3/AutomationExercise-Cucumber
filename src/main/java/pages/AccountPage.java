package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utilities.ElementHelper;

public class AccountPage {
    WebDriver driver;
    ElementHelper helper;

    public AccountPage(WebDriver driver) { this.driver = driver;
    helper = new ElementHelper(driver);}

    By titleMrs = By.id("id_gender2");
    By password = By.id("password");
    By days = By.id("days");
    By months = By.id("months");
    By years = By.id("years");
    By newsletter = By.id("newsletter");
    By offers = By.id("optin");

    By firstName = By.id("first_name");
    By lastName = By.id("last_name");
    By company = By.id("company");
    By address = By.id("address1");
    By address2 = By.id("address2");
    By country = By.id("country");
    By state = By.id("state");
    By city = By.id("city");
    By zipcode = By.id("zipcode");
    By mobile = By.id("mobile_number");
    By createBtn = By.xpath("//button[text()='Create Account']");
    By createdMsg = By.xpath("//b[text()='Account Created!']");
    By continueBtn = By.xpath("//a[text()='Continue']");
    By accountInfoHeader = By.xpath("//b[text()='Enter Account Information']");

    public boolean isAccountInfoHeaderVisible() {
        return driver.findElement(accountInfoHeader).isDisplayed();
    }

    public void selectTitle(String title) {
        driver.findElement(titleMrs).click();
    }

    public void setPassword(String val) {
        driver.findElement(password).sendKeys(val);
    }

    public void setDateOfBirth(String d, String m, String y) {
        new Select(driver.findElement(days)).selectByVisibleText(d);
        new Select(driver.findElement(months)).selectByVisibleText(m);
        new Select(driver.findElement(years)).selectByVisibleText(y);
    }

    public void setCheckboxes() {
        helper.waitForAdToDisappear();
        helper.jsClick(newsletter);
        helper.jsClick(offers);
    }

    public void fillAddressInfo() {
        driver.findElement(firstName).sendKeys("Randa");
        driver.findElement(lastName).sendKeys("Test");
        driver.findElement(company).sendKeys("TestCo");
        driver.findElement(address).sendKeys("123 Test St");
        driver.findElement(address2).sendKeys("Apt 4");
        new Select(driver.findElement(country)).selectByVisibleText("Canada");
        driver.findElement(state).sendKeys("Ontario");
        driver.findElement(city).sendKeys("Toronto");
        driver.findElement(zipcode).sendKeys("M1M1M1");
        driver.findElement(mobile).sendKeys("1234567890");
    }

    public void clickCreateAccount() {
        helper.waitForAdToDisappear();
        helper.jsClick(createBtn);}
    public boolean isAccountCreatedVisible() { return driver.findElement(createdMsg).isDisplayed(); }
    public void clickContinue() { driver.findElement(continueBtn).click(); }
}