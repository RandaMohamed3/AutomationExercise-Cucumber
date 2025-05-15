package stepDefinitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.HomePage;
import pages.ProductPage;
import utilities.ElementHelper;

public class ProductStepDefinitions {
    WebDriver driver = Hooks.driver;
    HomePage homePage = new HomePage(driver);
    ProductPage productPage = new ProductPage(driver);
    ElementHelper elementHelper = new ElementHelper(driver);

    @When("User clicks on the \"Products\" button in home page")
    public void user_clicks_on_the_products_button_in_home_page() {
        homePage.clickProductsBtn();
    }
    @Then("User is navigated to all products page successfully")
    public void user_is_navigated_to_all_products_page_successfully() {
        Assert.assertTrue(productPage.isAllProductsHeaderVisible());
    }
    @And("The products list is visible")
    public void the_products_list_is_visible() {
        Assert.assertTrue(productPage.isProductsListVisible());
    }
    @When("User click on \"View Product\" of first product")
    public void user_click_on_product_of_first_product() {
        //elementHelper.waitForAdToDisappear();
        elementHelper.hideAdsIfExist();
        elementHelper.jsClick(productPage.clickOnViewProductDetailsBtn());

    }
    @Then("User is landed to product detail page")
    public void user_is_landed_to_product_detail_page() {
        Assert.assertTrue(productPage.isViewProductDetailsVisible());
    }
    @And("The detail is visible: product name, category, price, availability, condition, brand")
    public void the_detail_is_visible_product_name_category_price_brand() {
        Assert.assertTrue(productPage.isProductNameVisible());
        Assert.assertTrue(productPage.isCategoryVisible());
        Assert.assertTrue(productPage.isPriceVisible());
        Assert.assertTrue(productPage.isAvailabilityVisible());
        Assert.assertTrue(productPage.isConditionVisible());
        Assert.assertTrue(productPage.isBrandVisible());
    }
    @When("User searches for product \"T-Shirt\"")
    public void user_searches_for_product_t_shirt() {
        productPage.enterSearchText("dress");
        productPage.clickSearchButton();
    }
    @Then("\"SEARCHED PRODUCTS\" section should be visible")
    public void searched_products_section_should_be_visible() {
        Assert.assertTrue(productPage.isSearchedProductsTitleVisible());
    }
    @And("All products related to \"T-Shirt\" should be visible")
    public void all_products_related_to_products_should_be_visible() {
        Assert.assertTrue(productPage.areSearchResultsVisible());

    }
}
