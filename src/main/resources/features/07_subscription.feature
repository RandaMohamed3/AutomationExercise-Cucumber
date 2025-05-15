Feature: Verify Subscription on Home Page

  Scenario: Verify All Products and Product Detail Page
    Given User launches browser and navigates to "https://automationexercise.com"
    Then Home page should be visible
    When User scrolls down to the footer
    Then "SUBSCRIPTION" text should be visible
    When User enters email "randa@example.com" in subscription input and clicks the arrow button
    Then Success message "You have been successfully subscribed!" should be visible
