package BaseClass;



import java.util.concurrent.TimeUnit;



import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Configuraion.ReadConfigFile;
import io.github.bonigarcia.wdm.WebDriverManager;





public class Base {
	
	
	
	public static Logger logger;
	
	public static WebDriver driver ;
	
	ReadConfigFile RCF = new ReadConfigFile();
	
	public String BaseURL  = RCF.getAplicationURL()	;
	public String Username = RCF.getUsername();
	public String Password = RCF.getPassword();
	
//	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void setup() throws InterruptedException {
		
//		System.out.println(BaseURL);
//		System.out.println(Username);
//		System.out.println(Password);
		
		
		logger=Logger.getLogger(Base.class);
		
		PropertyConfigurator.configure("D:\\FRAMWORK_DEVLOPMENT_SDET\\flipkartDemoFramwork\\src\\test\\resources\\Confifuration\\Log4j.properties");
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		
		logger.info("browser open");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get(BaseURL);

		logger.info("aplication open");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	
	}
	
		@AfterMethod
		public void teardown() throws InterruptedException {
		
		logger.info("browser close");
		Thread.sleep(3000);
		driver.close();
	}

}

