Feature: Test Cases Page

  Scenario: Verify Test Cases Page
    Given User launches browser and navigates to "https://automationexercise.com"
    Then Home page should be visible
    When User clicks on the "test cases" button in home page
    Then user is navigated to test cases page successfully