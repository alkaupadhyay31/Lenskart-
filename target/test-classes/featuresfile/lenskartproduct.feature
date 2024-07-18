
Feature: Lenskart Product Search and Filters

  

  Scenario: Search for product by category and brand
    Given I am on the Lenskart homepage
    When  I search for "Sunglasses" in the "Men's" category
    Then I should see search results for men's sunglasses
    When I flter by brand "Ray-Ban"
    Then I should see only Ray-Ban men's sunglasses displayed

  Scenario: Search with misspelled keyword
    Given I am on the Lenskart homepage
    When I search for "SunGlases" (misspelled)
    Then I should see suggestions for the correct spelling or a message indicating no results found
    
    
  Scenario: Iterate through product colors and add to cart
    Given I am on the product details page for a specifc spectacle frame
    When  I iterate through all available frame colors
    Then for each color, I should be able to add the frame to the cart (assuming different colors are separate products)
  
  
  Scenario: Select random lens material from dropdown
    Given I am on the product details page for a specifc spectacle frame
    When I get all available lens material options from the dropdown and store them in an array
    Then I should be able to randomly select a lens material from the array and apply it
    
  Scenario: verify recently added items appear in wishlist
    Given I am on the Lenskart homepage
    When  I add a few different spectacle frames to the wishlist
    Then  I navigate to the wishlist page and the displayed items should be a subset of the recently added frames (assuming a collection is used)
  

 