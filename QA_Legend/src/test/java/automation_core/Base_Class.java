package automation_core;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Class 
{
 public WebDriver driver; 
 public void initializebrowser(String browser)
 {
	 if(browser.equals("Chrome"))
	 {
		 driver=new ChromeDriver();
	 }
	 else if(browser.equals("Edge"))
	 {
		 driver=new EdgeDriver();
	 }
	 else if(browser.equals("Firefox"))
	 {
		 driver=new FirefoxDriver();
	 }
	 else
	 {
		 throw new RuntimeException("Invalid browser");
	 }
	 driver.manage().window().maximize();
     driver.get("https://qalegend.com/billing/public/login");
 }
 @BeforeMethod
 
 public void setup()

 {
	 initializebrowser("Chrome");
 }
 @AfterMethod(alwaysRun=true)
 
 public void closeBrowser(ITestResult result) throws IOException 
 {
	if(result.getStatus()==ITestResult.FAILURE)
	{
		takeScreenshot(result);
	}
//	driver.close();
 }
public void takeScreenshot(ITestResult result) throws IOException 
{
	TakesScreenshot takescreenshot=(TakesScreenshot)driver;
	File screenshot=takescreenshot.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenshot, new File("./Screenshot/"+result.getName()+".png"));   //create a folder for a file
}
}
