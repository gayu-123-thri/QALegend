package automation_core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
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
	 driver.manage().window();
     driver.get("https://qalegend.com/billing/public/login");
 }
 @BeforeMethod
 
 public void setup()

 {
	 initializebrowser("Chrome");
 }
 @AfterMethod
 
 public void closeBrowser()
 {
	// driver.close();
 }
}
