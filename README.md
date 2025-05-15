
# Automation Exercise - Selenium Java Cucumber Project

## Overview

This project automates the first 11 test cases of the website [automationexercise.com](http://automationexercise.com) using:

- **Java**
- **Selenium WebDriver**
- **Cucumber BDD**
- **Page Object Model (POM)**
- **Allure Reports**

---

## Test Cases Covered

1. Register User  
2. Login User with correct email and password  
3. Login User with incorrect email and password  
4. Logout User  
5. Register User with existing email  
6. Contact Us Form  
7. Verify Test Cases Page  
8. Verify All Products and product detail page  
9. Search Product  
10. Verify Subscription in home page  

---

## Project Structure

```
src
 └── main
      └── java
           └── org.example
                ├── pages        # Page Objects classes
                ├── runners      # Cucumber runners
                └── stepDefinitions # Step definitions for scenarios
resources
 └── features                # Cucumber feature files (.feature)
```

---

## Tools & Frameworks

- Selenium WebDriver for browser automation  
- Cucumber for BDD (Behavior Driven Development)  
- Maven for dependency management  
- Allure for generating test reports  
- Java 21+  
- Git for version control  

---

## How to run tests

### 1. Clone the repo

```bash
git clone https://github.com/YourUsername/YourProjectName.git
cd YourProjectName
```

### 2. Run tests via Maven

```bash
mvn clean test
```

### 3. Generate Allure report

```bash
mvn allure:serve
```

This command will open the report in your default browser.

---

## Notes about Cucumber usage

- Feature files are located under `src/resources/features` and contain Gherkin scenarios describing test cases.
- Step definitions are in `src/main/java/org/example/stepDefinitions`.
- Test runners are in `src/main/java/org/example/runners`, which configure Cucumber options like feature path, glue code, and report plugins.

---

## Example Scenario snippet (from Feature file)

```gherkin
Feature: User Registration

  Scenario: Register a new user successfully
    Given I launch the browser and navigate to "http://automationexercise.com"
    When I click on "Signup / Login" button
    And I enter valid name and email
    And I click "Signup"
    Then I fill in the account information form
    And I click "Create Account"
    Then I verify "ACCOUNT CREATED!" message is displayed
```

---

## Contact

For any questions or suggestions, please contact [Randa Mohamed](mailto:randamohamed9987@gmail.com).
