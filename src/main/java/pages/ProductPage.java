package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage {
    WebDriver driver;
    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }
    By allProductHeader = By.xpath("//h2[text()='All Products']");
    By productList = By.className("features_items");
    By viewProductDetailsBtn = By.xpath("//a[@href='/product_details/1' and contains(., 'View Product')]");
    By productName = By.xpath ("/html/body/section/div/div/div[2]/div[2]/div[2]/div/h2");
    By category = By.xpath("//p[contains(text(),'Category')]");
    By price = By.xpath("//span[contains(text(),'Rs.')]");
    By availability = By.xpath("//b[text()='Availability:']");
    By condition = By.xpath("//b[text()='Condition:']");
    By brand = By.xpath("//b[text()='Brand:']");
    By searchInput = By.id("search_product");
    By searchButton = By.id("submit_search");
    By searchedProductsTitle = By.xpath("//h2[text()='Searched Products']");
    By searchResults = By.xpath("//div[@class='features_items']/div");


    public boolean isAllProductsHeaderVisible() {
        return driver.findElement(allProductHeader).isDisplayed();
    }

    public boolean isProductsListVisible() {

        return driver.findElement(productList).isDisplayed();
    }

    public By clickOnViewProductDetailsBtn() {
        return viewProductDetailsBtn;
    }
    public boolean isViewProductDetailsVisible() {

        return driver.getCurrentUrl().contains("product_details");
    }
    public boolean isProductNameVisible() {
        return driver.findElement(productName).isDisplayed();
    }

    public boolean isCategoryVisible() {
        return driver.findElement(category).isDisplayed();
    }

    public boolean isPriceVisible() {
        return driver.findElement(price).isDisplayed();
    }

    public boolean isAvailabilityVisible() {
        return driver.findElement(availability).isDisplayed();
    }

    public boolean isConditionVisible() {
        return driver.findElement(condition).isDisplayed();
    }

    public boolean isBrandVisible() {
        return driver.findElement(brand).isDisplayed();
    }
    public void enterSearchText(String productName) {
        driver.findElement(searchInput).sendKeys(productName);
    }

    public void clickSearchButton() {
        driver.findElement(searchButton).click();
    }

    public boolean isSearchedProductsTitleVisible() {
        return driver.findElement(searchedProductsTitle).isDisplayed();
    }

    public boolean areSearchResultsVisible() {
        List<WebElement> products = driver.findElements(searchResults);
        return !products.isEmpty();
    }

}
