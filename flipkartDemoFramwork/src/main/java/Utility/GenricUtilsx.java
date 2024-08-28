package Utility;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BaseClass.Base;

public class GenricUtilsx extends Base {
	
	public static String getScreenshotAs() throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		

		File source = ts.getScreenshotAs(OutputType.FILE);

		String Timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());

		String Name = "- Screenshot -" + Timestamp;

	    Path resourceDirectory = Paths.get("src","test","resources","Screenshot");
	    
		String AbsolutePath = resourceDirectory.toFile().getAbsolutePath();

		String Destination = AbsolutePath + "\\Screenshots\\"+Name+".png";
		
//		String Destination="D:\\FRAMWORK_DEVLOPMENT_SDET\\flipkartDemoFramwork\\src\\test\\resources\\Screenshot";

		FileUtils.copyFile(source, new File(Destination));
		
		
	

		return Destination;
		
	}
		
		public static void Clickonelementusingjavascriptexecutor(WebElement element,WebDriver driver) {
		
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].click();", element);
		
	}
		

}
