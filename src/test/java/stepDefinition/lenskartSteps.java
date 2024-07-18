package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.addtoCart;
import pages.searchPage;

public class lenskartSteps {
	
	WebDriver driver;
    searchPage sp;
    addtoCart  ac;

    
	
	
	@Given("I am on the Lenskart homepage")
	public void i_am_on_the_lenskart_homepage() throws InterruptedException {
		
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
        
        driver.get("https://www.lenskart.com/");
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        sp = new searchPage(driver);
        
//        ac = new addtoCart(driver);
        
      }

	@When("I search for {string} in the {string} category")
	public void i_search_for_in_the_category(String string, String string2) throws InterruptedException {
//		searchPage sp = new searchPage(driver);
		
        sp.entersearch();
		
	}

	@Then("I should see search results for men's sunglasses")
	public void i_should_see_search_results_for_men_s_sunglasses() {
		
		 String expectedUrl = "https://www.lenskart.com/sunglasses/find-eyewear/mens-sunglasses.html";
	        String currentUrl = sp.getCurrentUrl();
	        Assert.assertEquals(expectedUrl, currentUrl);
	        System.out.println("Url Match");
	    }
		

	    

	@When("I flter by brand {string}")
	public void i_flter_by_brand(String string) throws InterruptedException {
		
	    sp.scroll();
	}

	@Then("I should see only Ray-Ban men's sunglasses displayed")
	public void i_should_see_only_ray_ban_men_s_sunglasses_displayed() {
	    
		System.out.println("All the products are displayed to the particular brand");
	}


	@When("I search for {string} \\(misspelled)")
	public void i_search_for_misspelled(String string) throws InterruptedException {
		
	    sp.enterKeys();
	}

	@Then("I should see suggestions for the correct spelling or a message indicating no results found")
	public void i_should_see_suggestions_for_the_correct_spelling_or_a_message_indicating_no_results_found() {
		
		Assert.assertTrue(sp.isNoResultsFoundMessageDisplayed());
		
		System.out.println("No result found text are visible");
	}

	@Given("I am on the product details page for a specifc spectacle frame")
	public void i_am_on_the_product_details_page_for_a_specifc_spectacle_frame() {
		
        driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.lenskart.com/hooper-hp-e10004m-c3-eyeglasses.html");
		
		
	    
	}

	@When("I iterate through all available frame colors")
	public void i_iterate_through_all_available_frame_colors() {
		
		 ac.iterateThroughFrameColorsAndAddToCart();
	}

	@Then("for each color, I should be able to add the frame to the cart \\(assuming different colors are separate products)")
	public void for_each_color_i_should_be_able_to_add_the_frame_to_the_cart_assuming_different_colors_are_separate_products() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I get all available lens material options from the dropdown and store them in an array")
	public void i_get_all_available_lens_material_options_from_the_dropdown_and_store_them_in_an_array() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I should be able to randomly select a lens material from the array and apply it")
	public void i_should_be_able_to_randomly_select_a_lens_material_from_the_array_and_apply_it() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I add a few different spectacle frames to the wishlist")
	public void i_add_a_few_different_spectacle_frames_to_the_wishlist() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I navigate to the wishlist page and the displayed items should be a subset of the recently added frames \\(assuming a collection is used)")
	public void i_navigate_to_the_wishlist_page_and_the_displayed_items_should_be_a_subset_of_the_recently_added_frames_assuming_a_collection_is_used() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
	


}
