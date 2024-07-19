## Lenskart Web Automation Framework 
https://www.lenskart.com/

## This project is a Java-based Selenium web automation framework designed to test the Lenskart website. The framework uses Cucumber for BDD, Page Object Model for organized test scripts, and includes features such as screenshot capture on test failure, retry mechanism for failed tests, HTML report generation, parallel testing, cross-browser testing, and logging for debugging.

## Features

- Cucumber BDD Framework: Write tests in a human-readable format.
- Page Object Model: Organize your test scripts for better maintenance.
- Screenshot Capture: Automatically take screenshots on test failure.
- Clear Documentation: Step-by-step instructions for setting up and running the tests.

## Prerequisites

- Java JDK 
- Maven
- ChromeDriver or GeckoDriver (for Chrome and Firefox testing)
- IDE (Eclipse,spring tool, IntelliJ IDEA, etc.)

##  Setup Instructions
- Clone the repository: git clone (https://github.com/alkaupadhyay31/Lenskart-)
- Install dependencies: mvn clean install
- Run the tests: mvn test

## Project Structure

- pageObjects: Contains the Page Object Model (POM) classes for all the scenarios
- stepDefinition: Contains the path for the Cucumber scenarios.
- features: Contains the feature files defining the scenarios.

  ![image](https://github.com/user-attachments/assets/8249e446-8151-40a1-996f-8d8f57954f41)


## Test Scenarios

## Feature: Lenskart Product Search and Filters

![image](https://github.com/user-attachments/assets/29152da3-3c90-4e53-9b87-da07bace67fa)


## How to Run

- Ensure Chromebrowser installed and ChromeDriver is in your path
- Run the test using Maven: mvn test This will execute all the scenarios

  ![image](https://github.com/user-attachments/assets/a3c90ec4-e856-46ad-8219-383c70678fcd)

  ![image](https://github.com/user-attachments/assets/c5fdb239-fa03-4363-8ca7-cefcdd3b61e1)





## Screenshot Capture

Screenshots are captured automatically on test failure and saved in the screenshots directory.
