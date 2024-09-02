package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import automation_core.Base_Class;
import dataprovider.DataProviders;
import utilities.ExelUtility;

public class LoginPageTest extends Base_Class
{
@Test
	
 public void verify_Login_With_Valid_Credentials()
 {
	String username=ExelUtility.get_Stringdata(1, 0, "LoginTest");
	String password=ExelUtility.get_Stringdata(1, 1, "LoginTest");
	 WebElement username_fld=driver.findElement(By.xpath("//input[@id='username']"));
	 username_fld.sendKeys(username);
	 WebElement password_fld=driver.findElement(By.xpath("//input[@id='password']"));
	 password_fld.sendKeys(password);
	 WebElement login_btnfld=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	 login_btnfld.click();
	// WebElement login_btnfld=driver.findElement(By.xpath("//div[text()='Login']"));
	// login_btnfld.click();
	 WebElement endtour_btn=driver.findElement(By.xpath("//button[@data-role='end']"));
	 endtour_btn.click();
	 WebElement result=driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
	 String expected_result=result.getText();
	 System.out.println(expected_result);
	 String actual_result=username;
	 System.out.println(actual_result);
	 Assert.assertEquals(actual_result, expected_result, "Invalid login");
 }
@Test(dataProvider="Invalidusercredentials", dataProviderClass=DataProviders.class)

 public void verify_errorMessage_whileLogin_withInvalid_credentials(String username, String password)
 {
	 WebElement username_fld=driver.findElement(By.xpath("//input[@id='username']"));
	 username_fld.sendKeys(username);
	 WebElement password_fld=driver.findElement(By.xpath("//input[@id='password']"));
	 password_fld.sendKeys(password);
	 WebElement login_btnfld=driver.findElement(By.xpath("//div[text()='Login']"));
	 login_btnfld.click();
	//WebElement result=driver.findElement(By.xpath("//strong[text()='These credentials do not match our records.']"));
	//span[@class='help-block']
	// String expected_result=result.getText();
	 //String actual_result="These credentials do not match our records.";
	 //Assert.assertEquals(actual_result, expected_result, "Valid login details");
 }
}
