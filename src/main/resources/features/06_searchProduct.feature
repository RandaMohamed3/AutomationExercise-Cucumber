Feature: Search Product

  Scenario: Verify All Products and Product Detail Page
    Given User launches browser and navigates to "https://automationexercise.com"
    Then Home page should be visible
    When User clicks on the "Products" button in home page
    Then User is navigated to all products page successfully
    When User searches for product "T-Shirt"
    Then "SEARCHED PRODUCTS" section should be visible
    And All products related to "T-Shirt" should be visible
