Feature: User Registration

  Scenario: Successful user registration
    Given User launches browser and navigates to "https://automationexercise.com"
    Then Home page should be visible
    When User clicks on "Signup / Login" button
    Then "New User Signup" should be visible
    When User enters name and email and clicks "Signup"
    Then "Enter Account Information" should be visible
    When User fills account information and address details
    When User clicks on "Create Account" button
    Then "ACCOUNT CREATED!" should be visible
    When User clicks on "Continue" button
    Then "Logged in as username" should be visible
    When User clicks on "Delete Account" button
    Then "ACCOUNT DELETED!" should be visible

  Scenario: Registering with already registered email
    Given User launches browser and navigates to "https://automationexercise.com"
    Then Home page should be visible
    When User clicks on "Signup / Login" button
    Then "New User Signup" should be visible
    When User enters name and already registered email address and Clicks "Signup" button
    Then "Email Address already exist!" should be visible
