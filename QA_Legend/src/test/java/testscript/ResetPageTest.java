package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automation_core.Base_Class;
import utilities.ExelUtility;

public class ResetPageTest extends Base_Class
{
@Test
 public void verify_errorMsg_withInvalid_emailAddress()
 {
	 String email=ExelUtility.get_Stringdata(0, 0, "InvalidMailTest");
	 WebElement forget_passwdbtn=driver.findElement(By.xpath("//a[@class='btn btn-link']"));
	 forget_passwdbtn.click();
	 WebElement email_fld=driver.findElement(By.id("email"));
	 email_fld.sendKeys(email);
	 WebElement snd_passwd_rsetlnk=driver.findElement(By.xpath("//button[@type='submit']"));
	 snd_passwd_rsetlnk.click();
	//strong[text()='We can't find a user with that e-mail address.']
	 
	 
	 
 }
 @Test
 public void verify_paswrdReset_withValid_emailAddress()
 {
	 String email_id=ExelUtility.get_Stringdata(0, 0, "ValidMailTest");
	 WebElement forget_passwdbtn=driver.findElement(By.xpath("//a[@class='btn btn-link']"));
	 forget_passwdbtn.click();
	 WebElement email_fld=driver.findElement(By.id("email"));
	 email_fld.sendKeys("Sneharaj@gmail.com");
	 WebElement snd_passwd_rsetlnk=driver.findElement(By.xpath("//button[@type='submit']"));
	 snd_passwd_rsetlnk.click();
	 WebElement msg=driver.findElement(By.xpath("//div[@class='alert alert-success']"));
	 String expected_result=msg.getText();
	 System.out.println(expected_result);
	 String result=ExelUtility.get_Stringdata(1, 0, "ValidMailTest");
	 String actual_result=result;
	 System.out.println(result);
	 Assert.assertEquals(actual_result,expected_result, "Invalid mail");
	 
 }
}
