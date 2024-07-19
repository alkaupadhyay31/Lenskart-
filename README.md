## Lenskart Web Automation Framework 
https://www.lenskart.com/

## This project is a Java-based Selenium web automation framework designed to test the Lenskart website. The framework uses Cucumber for BDD, Page Object Model for organized test scripts, and includes features such as screenshot capture on test failure, retry mechanism for failed tests, HTML report generation, parallel testing, cross-browser testing, and logging for debugging.

## Features

Cucumber BDD Framework: Write tests in a human-readable format.
Page Object Model: Organize your test scripts for better maintenance.
Screenshot Capture: Automatically take screenshots on test failure.
Clear Documentation: Step-by-step instructions for setting up and running the tests.

## Prerequisites

Java JDK 
Maven
ChromeDriver or GeckoDriver (for Chrome and Firefox testing)
IDE (Eclipse,spring tool, IntelliJ IDEA, etc.)

## Test Scenarios

## Feature: Lenskart Product Search and Filters

Scenario: Search for product by category and brand..

Given : I am on the Lenskart homepage..
When : I search for "Sunglasses" in the "Men's" category..
Then : I should see search results for men's sunglasses..
When : I filter by brand "Ray-Ban"..
Then : I should see only Ray-Ban men's sunglasses displayed..

Scenario: Search with misspelled keyword..

Given : I am on the Lenskart homepage..
When : I search for "SunGlases" (misspelled)..
Then : I should see suggestions for the correct spelling or a message indicating no results found..

Scenario: Iterate through product colors and add to cart..

Given : I am on the product details page for a specific spectacle frame..
When : I iterate through all available frame colors..
Then : for each color, I should be able to add the frame to the cart (assuming different colors are separate products)..

Scenario: Select random lens material from dropdown..

Given : I am on the product details page for a specific spectacle frame..
When : I get all available lens material options from the dropdown and store them in an array..
Then : I should be able to randomly select a lens material from the array and apply it..

Scenario: Verify recently added items appear in wishlist..

Given : I am on the Lenskart homepage..
When : I add a few different spectacle frames to the wishlist..
Then : I navigate to the wishlist page..
And : the displayed items should be a subset of the recently added frames (assuming a collection is used)..

## Screenshot Capture

Screenshots are captured automatically on test failure and saved in the screenshots directory.
