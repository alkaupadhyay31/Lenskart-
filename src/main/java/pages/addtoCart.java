package pages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addtoCart {
	
 WebDriver driver; 
	
	// constructor
	
	public addtoCart (WebDriver driver){
		
		this.driver = driver;
		
		PageFactory.initElements(driver,this);

      }
	
	@FindBy(css = ".frame-color-options .color-option")
    private List<WebElement> frameColors;

    @FindBy(css = ".add-to-cart-button")
    private WebElement addToCartButton;

    @FindBy(css = ".lens-material-dropdown")
    private  WebElement lensMaterialDropdown;

    @FindBy(css = ".lens-material-option")
    private List<WebElement> lensMaterialOptions;
    
    
    public void iterateThroughFrameColorsAndAddToCart() {
        for (WebElement color : frameColors) {
            color.click();
            addToCartButton.click();
        }
    }

    public void selectRandomLensMaterial() {
        lensMaterialDropdown.click();
        Random rand = new Random();
        int randomIndex = rand.nextInt(lensMaterialOptions.size());
        lensMaterialOptions.get(randomIndex).click();
    }

	}