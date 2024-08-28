package Utility;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportClass {
	
	static ExtentReports extents ;
	
	public static ExtentReports Report() {
		
		String Day_Time = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		
		String reportNameHalf = "ExtentReport"+Day_Time;
		
		Path resourceDirectory = Paths.get("src","test","resources");
		
		String absolutePath = resourceDirectory.toFile().getAbsolutePath();
		
		System.out.println(absolutePath);
		
		String Path = absolutePath+"\\Reports\\"+Day_Time+""+".html";
		
		ExtentHtmlReporter reporter =new ExtentHtmlReporter(Path);
		
		reporter.config().setReportName("Flipkart Framework extent report");
		
		reporter.config().setDocumentTitle("Flipkart Framework execution result");
		
		extents= new ExtentReports();
		
		extents.attachReporter(reporter);
		
		extents.setSystemInfo("Name", "Rahul Wagh");
		
		extents.setSystemInfo("Suite Name", "Regression/Smoke");
		
		return extents;
		
	}

}
