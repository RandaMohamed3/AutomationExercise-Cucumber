Feature: User Login

  Scenario: Login with valid credentials
    Given User launches browser and navigates to "https://automationexercise.com"
    Then Home page should be visible
    When User clicks on "Signup / Login" button
    Then LOGIN TO YOUR ACCOUNT should be visible
    When User enters valid login credentials
    And Clicks login button
    Then "Logged in as Randa" should be shown
    When User clicks on logout button
    Then User should be navigated to login page


  Scenario: Login with invalid credentials
    Given User launches browser and navigates to "https://automationexercise.com"
    Then Home page should be visible
    When User clicks on "Signup / Login" button
    Then LOGIN TO YOUR ACCOUNT should be visible
    When User enters invalid login credentials
    And Clicks login button
    Then Error "Your email or password is incorrect!" should be visible
