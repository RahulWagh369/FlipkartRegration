package Pages;



import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;






public class loginPage   {
	
	WebDriver driver;


	
	@FindBy(xpath="//img[@src=\"//static-assets-web.flixcart.com/fk-p-linchpin-web/fk-cp-zion/img/flipkart-plus_8d85f4.png\"]")
	public WebElement logoImageFlipkart;
	
	@FindBy(xpath="//a[@class=\"MwbhDR\"]")
	public WebElement logoTextExplore;
	
	@FindBy(xpath="//span[@class=\"s4NJ5L\"]")
	private WebElement logoTextPlus ;
	
	@FindBy(xpath="//img[@src=\"//static-assets-web.flixcart.com/fk-p-linchpin-web/fk-cp-zion/img/plus_aef861.png\"]")
	private WebElement logoImagePlus;
	
//	****************************************************************************************************************
	//bankMerchant logo Image vlidation
	
	@FindBy(xpath="//img[@src=\"//static-assets-web.flixcart.com/fk-p-linchpin-web/fk-cp-zion/img/payment-method_69e7ec.svg\"]")
	private WebElement BankLogoImage;
	
	@FindBy(xpath="//a[contains(text(),\"Offer Zone\")]")
	private WebElement OfferZone;
	
	@FindBy(xpath="//div[@class=\"lF7HP0\"]")
	private WebElement TopDeals;
	
	
	
	
	
	
	
	
	
	//Class Constructor
	public loginPage(WebDriver driver) { //chromedriver
			
		this.driver=driver;
		
        PageFactory.initElements(driver, this);  // Initialize elements
    }
	
	
	public boolean logoImageFlipkartIsDisplayed() {
		
		boolean result = logoImageFlipkart.isDisplayed();
		return result;
	}
	
	public String logoImageFlipkartWidth () {
		
		String width = logoImageFlipkart.getAttribute("width");
		return width;
		
	}
	
	public String logoTextExplore () {
		
		String text = logoTextExplore.getText();
		return text;
		
	}
	
	public String logoTextPlus () {
		
		String text  = logoTextPlus.getText();
		return text;
	}
	
	public boolean logoImagePlusIsDispalyed() {
		
		boolean result = logoImagePlus.isDisplayed();
		return result;
	}
	
	public String logoImagePlusWidth() {
		
		String width = logoImagePlus.getAttribute("width");
		return width ;
	}
//	*****************************************************************************************************************
	//bankmerchant logo image validation
	
	public String MBankLogoImage() throws InterruptedException {
		
		
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",BankLogoImage);
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
//		js.executeScript("arguments[0].scrollIntoView();",ele);
		 
		String srcc = BankLogoImage.getAttribute("src");
		
		return srcc;
				
	}
	
	public void MOfferZone() {
		
		OfferZone.click();
		
	}
	
	public String  MTopDeals() {
		
		TopDeals.isDisplayed();
		
		String text = TopDeals.getText()	;
		
		return text;
		
	}
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
