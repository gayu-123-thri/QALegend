package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automation_core.Base_Class;
import utilities.ExelUtility;

public class HomePageTest extends Base_Class
{
	@Test
	
 public void verify_userLogin_date()
 {
	 String username=ExelUtility.get_Stringdata(0, 0, "HomePageTest");
	 String passwd=ExelUtility.get_Stringdata(0, 1, "HomePageTest");
	 WebElement username_fld=driver.findElement(By.xpath("//input[@name='username']"));
	 username_fld.sendKeys(username);
	 WebElement password_fld=driver.findElement(By.xpath("//input[@name='password']"));
	 password_fld.sendKeys(passwd);
	 WebElement login_btnfld=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	 login_btnfld.click();
	 WebElement btn=driver.findElement(By.xpath("//button[@data-role='end']"));
	 btn.click();
	 WebElement date=driver.findElement(By.xpath("//strong[text()='01-09-2024']"));
	 String actual_result=date.getText();
	 System.out.println(actual_result);
	 String expected_result="01-09-2024";
			 //ExelUtility.get_Stringdata(1, 0, "HomePageTest");
	 System.out.println(expected_result);
	 Assert.assertEquals(actual_result, expected_result, "Date Missmatch");
 }
}
