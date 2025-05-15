package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) { this.driver = driver; }

    By loginHeader = By.xpath("//h2[text()='Login to your account']");
    By email = By.xpath("//input[@data-qa='login-email']");
    By password = By.xpath("//input[@data-qa='login-password']");
    By loginBtn = By.xpath("//button[text()='Login']");
    By errorMsg = By.xpath("//p[contains(text(),'incorrect')]");
    By logoutBtn = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a");

    public boolean isLoginHeaderVisible() {
        return driver.findElement(loginHeader).isDisplayed();    }
    public void enterLoginEmail(String val) { driver.findElement(email).sendKeys(val); }
    public void enterLoginPassword(String val) { driver.findElement(password).sendKeys(val); }
    public void clickLoginButton() { driver.findElement(loginBtn).click(); }
    public boolean isErrorVisible() { return driver.findElement(errorMsg).isDisplayed(); }
    public void clickLogoutBtn() { driver.findElement(logoutBtn).click(); }

}