Feature: Contact Us Form

  Scenario: User submits contact form successfully
    Given User launches browser and navigates to "https://automationexercise.com"
    Then Home page should be visible
    When User clicks on the "Contact Us" button
    Then "GET IN TOUCH" should be shown in the page
    When User enters name, email, subject, and message
    And User uploads a file
    And User clicks on the "submit" button of the form
    And User confirms the alert
    Then "SUCCESS! YOUR DETAILS HAVE BEEN SUBMITTED SUCCESSFULLY" should be shown in the page
    When User clicks on the "Home" button
    Then Home page should be visible
