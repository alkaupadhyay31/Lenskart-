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

  ![image](https://github.com/user-attachments/assets/a3c90ec4-e856-46ad-8219-383c70678fcd)

- we can run our script using runner file

  ![image](https://github.com/user-attachments/assets/4f392297-ba6e-4a8c-9e71-39ff9e0fe8dd)


 ## Test Cases
Test Case 1: In Homepage Search for mens sunglesses and choose a particular brand..

Steps:

- Open the application.

- Enter mens sunglasses in search field

- scroll the frame to handle the dropdown of brand

- select a particular brand

Verify it shows all the product of this particular brand.

Status: PASS

![image](https://github.com/user-attachments/assets/c5fdb239-fa03-4363-8ca7-cefcdd3b61e1)

![image](https://github.com/user-attachments/assets/2aee5025-62b7-419e-afee-3113ea60ac80)


Test Case 2: Verify Product search functionality with misspelled product name

Steps:

- Open the application
  
- search for a product with incorrect spelling

Verify it shows "No result found!!" message

Status: PASS

![image](https://github.com/user-attachments/assets/be4c8387-97c1-40bd-a2e2-f63ce141b5e8)

![image](https://github.com/user-attachments/assets/e4ff707e-3c2c-416b-8a58-67ab83febe8e)



  ##  Setup Instructions
  
- Clone the repository: git clone (https://github.com/alkaupadhyay31/Lenskart-)

