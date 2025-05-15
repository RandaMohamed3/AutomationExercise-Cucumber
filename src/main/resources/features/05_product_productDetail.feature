Feature: Product and Product Detail Page

  Scenario: Verify All Products and Product Detail Page
    Given User launches browser and navigates to "https://automationexercise.com"
    Then Home page should be visible
    When User clicks on the "Products" button in home page
    Then User is navigated to all products page successfully
    And The products list is visible
    When User click on "View Product" of first product
    Then User is landed to product detail page
    And The detail is visible: product name, category, price, availability, condition, brand
