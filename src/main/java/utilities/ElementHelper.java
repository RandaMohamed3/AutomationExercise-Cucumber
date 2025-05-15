package utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementHelper {
    WebDriver driver;
    WebDriverWait wait;

    public ElementHelper(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void jsClick(By locator) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    public void waitForAdToDisappear() {
        By ad = By.id("aswift_3_host");
        wait.until(ExpectedConditions.invisibilityOfElementLocated(ad));
    }
    public void hideAdsIfExist() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        try {
            js.executeScript("var ad = document.getElementById('aswift_3_host'); if(ad) { ad.style.display='none'; }");
        } catch (Exception e) {
            // No ad, carry on
        }
    }
}

