package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
                                                     
public class searchPage {
	
WebDriver driver; 
	
	// constructor
	
	public searchPage (WebDriver driver){
		
		this.driver = driver;
		
		PageFactory.initElements(driver,this);

   }
	
	
	

	@FindBy(xpath = "//input[@placeholder='What are you looking for?']")
	private WebElement searchbox;
	
	@FindBy(xpath = "//*[text()='Mens Sunglasses']")
	private WebElement mensCategory;
	
	@FindBy(xpath = "//*[@class='FilterSectionStyles__FilterWrapper-sc-1v1jomf-1 jJesvy']")
	private WebElement asideElement;
	
	
    @FindBy(id = "frame_shape_id")
    private WebElement frameShapeFilter;
    
    @FindBy(xpath = "//*[text()='BRANDS']")
    private WebElement branddropdown;
    
    @FindBy(xpath = "//*[text()='OJOS(53)']")
    private WebElement brandname;
    
    @FindBy(xpath = "//input[@placeholder='What are you looking for?']")
	private WebElement searchByText;
    
    @FindBy(xpath = "//*[text()='No Results Found!!!']")
    private WebElement noResultsMessage;
	
	

	public WebElement getSearchbox() {
		return searchbox;
		
		
    
	}
	
	

	// Business method
	
	public void entersearch() throws InterruptedException {
		
//		searchbox.sendKeys("men's sunglasses" + Keys.ENTER);
		searchbox.click();
		Thread.sleep(2000);
		mensCategory.click();
		
	}
	
	


	public String getCurrentUrl() {
		
        return driver.getCurrentUrl();
    }
		
		
	
	public void scroll() throws InterruptedException {
		
		// Cast driver to JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        
     // Scroll "ele2" into view
        js.executeScript("arguments[0].scrollIntoView(true);",frameShapeFilter );
        
        // Optionally add a delay to see the scroll effect
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Scroll "ele4" into view
        js.executeScript("arguments[0].scrollIntoView(true);", branddropdown);

        // Optionally add a delay to see the scroll effect
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        branddropdown.click();
        
        Thread.sleep(2000);
        
        brandname.click();
        
        
	}	
		
//	}
	
	public void enterKeys() throws InterruptedException {
		
		searchByText.click();
		
		Thread.sleep(2000);
		
		searchByText.sendKeys("Sngls"+ Keys.ENTER);
		
	}
	
	public boolean isNoResultsFoundMessageDisplayed() {
        try {
            
            return noResultsMessage.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
	
	
	
	}




	
	
