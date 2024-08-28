package Configuraion;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigFile {
	
	Properties prop;
	
	public ReadConfigFile() {  //constructor
		
		File src = new File("D:\\FRAMWORK_DEVLOPMENT_SDET\\flipkartDemoFramwork\\src\\test\\resources\\Confifuration\\cofiguration.properties");
		
		prop =  new Properties();
		
		try {
			FileInputStream Fis = new FileInputStream(src);
					try {
						prop.load(Fis);
					}
					catch(IOException e){
						System.out.println(e.getMessage());
						e.printStackTrace();
					}
		}
		catch(FileNotFoundException e){
			
			System.out.println(e.getMessage());
			e.printStackTrace();
		
		}
		
	}


	public String getAplicationURL() {
		
		String url = prop.getProperty("BaseURL");
		
		return url;
		
	}


	public String getUsername() {
		
		String user = prop.getProperty("Username");
		return user;
		
	}

	public String getPassword() {
		
		String pass = prop.getProperty("Password");
		return pass;
		
	}
	


	
	
	
}
