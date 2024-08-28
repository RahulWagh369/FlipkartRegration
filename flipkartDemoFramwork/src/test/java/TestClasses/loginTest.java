package TestClasses;



import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import org.testng.annotations.Test;

import BaseClass.Base;
import Pages.loginPage;

public class loginTest extends Base {

//	static WebDriver driver;
	
	public static loginPage login;
	
	
	@Test()
	public void TClogoImageFlipkartIsDisplayed() throws InterruptedException {
		
		Thread.sleep(3000);
		
		
//		boolean result = loginPage.logoImageFlipkartIsDisplayed();
		
		logger.info("test start");
		
		login= new loginPage(driver);
		
//		Assert.assertTrue(false);         //using it to Mark test Case  failed manualy
		
		if(login.logoImageFlipkartIsDisplayed()) {
		
			System.out.println("TClogoImageFlipkartIsDisplayed is pass");
		}
		else {
			System.out.println("TClogoImageFlipkartIsDisplayed is pass");
			Assert.assertTrue(login.logoImageFlipkartIsDisplayed());
		}
		
		logger.info("test stop");
	}
	
	@Test
	public void TClogoImageFlipkartWidth() throws InterruptedException {
		
		login= new loginPage(driver);
		
		Thread.sleep(3000);
		String width = login.logoImageFlipkartWidth();
		
		if(width.equals("75")) {
			System.out.println("TClogoImageFlipkartWidth is pass");
		}
		else{
			System.out.println("TClogoImageFlipkartWidth is failed");
			Assert.assertTrue(false);
		}
		
	}
	
	
	
	@Test
	public void TClogoTextPlus() throws InterruptedException {
		
		login= new loginPage(driver);
		
		Thread.sleep(3000);
		String text = login.logoTextPlus();
		
		if(text.equals("Plus")) {
			System.out.println("TClogoTextPlus is pass");
		}
		else {
			System.out.println("TClogoTextPlus is failed");
			Assert.assertTrue(false);
		}	
	}
	
	@Test
	public void TClogoImagePlusIsDispalyed() throws InterruptedException {
	
		login= new loginPage(driver);
		
		Thread.sleep(3000);
		boolean result = login.logoImagePlusIsDispalyed();
		
		if(result) {
			System.out.println("TClogoImagePlusIsDispalyed is pass");
		}
		
		else {
			System.out.println("TClogoImagePlusIsDispalyed is failed");
			Assert.assertTrue(result);
		}
		
	}
	
	@Test
	public void TClogoImagePlusWidth() throws InterruptedException {
		
		login= new loginPage(driver);
		
		Thread.sleep(3000);
		String width = login.logoImagePlusWidth();
		
		if(width.equals("10")) {
			System.out.println("TClogoImagePlusWidth is pass");
		}
		else {
			System.out.println("TClogoImagePlusWidth is pass");
			Assert.assertTrue(false);
		}
		
	}
	//not working
//	@Test
//	public void TCMBankLogoImage() throws InterruptedException {
//		
//		login = new loginPage(driver);
//		
//		String Expected = "//static-assets-web.flixcart.com/fk-p-linchpin-web/fk-cp-zion/img/payment-method_69e7ec.svg";
//		
//		String actual =login.MBankLogoImage()	;
//		
//		Assert.assertEquals(actual, Expected);
//		
//		logger.info("TCMBankLogoImage pass");
//		
//	}
	@Test
	public void TCMOfferZone() {
		
		login =  new loginPage(driver);
		
		login.MOfferZone();
		
		String text = login.MTopDeals();
		
		Assert.assertEquals(text, "Top Deals");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
