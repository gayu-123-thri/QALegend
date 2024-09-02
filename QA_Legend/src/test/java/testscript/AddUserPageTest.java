package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import automation_core.Base_Class;
import utilities.ExelUtility;
import utilities.RandomDataUtility;

public class AddUserPageTest extends Base_Class
{
 @Test
 public void verify_add_user()
 {
	     String username=ExelUtility.get_Stringdata(0, 0, "AddUserTest");
		 String password=ExelUtility.get_Stringdata(0, 1, "AddUserTest");
		 WebElement username_fld=driver.findElement(By.xpath("//input[@id='username']"));
		 username_fld.sendKeys(username);
		 WebElement password_fld=driver.findElement(By.xpath("//input[@id='password']"));
		 password_fld.sendKeys(password);
		 WebElement login_btnfld=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		 login_btnfld.click();
		 WebElement endtour_btn=driver.findElement(By.xpath("//button[@data-role='end']"));
		 endtour_btn.click();
		 WebElement user_management_fld=driver.findElement(By.xpath("//span[text()='User Management']"));
		 user_management_fld.click();
		 WebElement usr_fld=driver.findElement(By.xpath("//a[@href='https://qalegend.com/billing/public/users']"));
		 usr_fld.click();
		 WebElement add_fld=driver.findElement(By.xpath("//a[@href='https://qalegend.com/billing/public/users/create']"));
		 add_fld.click();
		 
		 String fst_name=RandomDataUtility.get_FirstName();
		 String lst_name=RandomDataUtility.get_LastName();
		 String email_fld=fst_name+"."+lst_name+"@yahoo.com";
		 String user_name=fst_name+lst_name;
		 String passwd=fst_name+lst_name;
		 WebElement prefix_fld=driver.findElement(By.xpath("//input[@id='surname']"));
		 prefix_fld.sendKeys("Mrs");
		 WebElement First_field=driver.findElement(By.xpath("//input[@id='first_name']"));
		 First_field.sendKeys(fst_name);
		 WebElement last_field=driver.findElement(By.xpath("//input[@id='last_name']"));
		 last_field.sendKeys(lst_name);
		 WebElement email_field=driver.findElement(By.xpath("//input[@id='email']"));
		 email_field.sendKeys(email_fld);
		// WebElement role_fld=driver.findElement(By.xpath("//b[@role='presentation']"));
		 //role_fld.click();
		// WebElement drop_dwn=driver.findElement(By.xpath("//li[@id='select2-role-result-wlxc-707']"));
		// Select select=new Select(drop_dwn);
		// select.selectByVisibleText("Producer");
		// drop_dwn.sendKeys("Producer");
		 WebElement uname_fld=driver.findElement(By.xpath("//input[@id='username']"));
		 uname_fld.sendKeys(user_name);
		 WebElement pass_fld=driver.findElement(By.xpath("//input[@id='password']"));
		 pass_fld.sendKeys(passwd);
		 WebElement confrm_pass=driver.findElement(By.xpath("//input[@id='confirm_password']"));
		 confrm_pass.sendKeys(passwd);
		 WebElement send_keyfld=driver.findElement(By.xpath("//button[@id='submit_user_button']"));
		 send_keyfld.click();
		 WebElement search_fld=driver.findElement(By.xpath("//input[@type='search']"));
		 search_fld.sendKeys(user_name);
		 String actual_result=search_fld.getText();
		 System.out.println(actual_result);
		// String expected_result=
	 
 }
 @Test
 public void verify_userLogin_withNewly_Added_user()
 {
	 String username=ExelUtility.get_Stringdata(0, 0, "AddUserTest");
	 String password=ExelUtility.get_Stringdata(0, 1, "AddUserTest");
	 WebElement username_fld=driver.findElement(By.xpath("//input[@id='username']"));
	 username_fld.sendKeys(username);
	 WebElement password_fld=driver.findElement(By.xpath("//input[@id='password']"));
	 password_fld.sendKeys(password);
	 WebElement login_btnfld=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	 login_btnfld.click();
	 WebElement endtour_btn=driver.findElement(By.xpath("//button[@data-role='end']"));
	 endtour_btn.click();
	 WebElement user_management_fld=driver.findElement(By.xpath("//span[text()='User Management']"));
	 user_management_fld.click();
	 WebElement usr_fld=driver.findElement(By.xpath("//a[@href='https://qalegend.com/billing/public/users']"));
	 usr_fld.click();
	 WebElement add_fld=driver.findElement(By.xpath("//a[@href='https://qalegend.com/billing/public/users/create']"));
	 add_fld.click();
	 
	 String fst_name=RandomDataUtility.get_FirstName();
	 String lst_name=RandomDataUtility.get_LastName();
	 String email_fld=fst_name+"."+lst_name+"@yahoo.com";
	 String user_name=fst_name+lst_name;
	 String passwd=fst_name+lst_name;
	 WebElement prefix_fld=driver.findElement(By.xpath("//input[@id='surname']"));
	 prefix_fld.sendKeys("Mrs");
	 WebElement First_field=driver.findElement(By.xpath("//input[@id='first_name']"));
	 First_field.sendKeys(fst_name);
	 WebElement last_field=driver.findElement(By.xpath("//input[@id='last_name']"));
	 last_field.sendKeys(lst_name);
	 WebElement email_field=driver.findElement(By.xpath("//input[@id='email']"));
	 email_field.sendKeys(email_fld);
	// WebElement role_fld=driver.findElement(By.xpath("//b[@role='presentation']"));
	 //role_fld.click();
	// WebElement drop_dwn=driver.findElement(By.xpath("//li[@id='select2-role-result-wlxc-707']"));
	// Select select=new Select(drop_dwn);
	// select.selectByVisibleText("Producer");
	// drop_dwn.sendKeys("Producer");
	 WebElement uname_fld=driver.findElement(By.xpath("//input[@id='username']"));
	 uname_fld.sendKeys(user_name);
	 WebElement pass_fld=driver.findElement(By.xpath("//input[@id='password']"));
	 pass_fld.sendKeys(passwd);
	 WebElement confrm_pass=driver.findElement(By.xpath("//input[@id='confirm_password']"));
	 confrm_pass.sendKeys(passwd);
	 WebElement send_keyfld=driver.findElement(By.xpath("//button[@id='submit_user_button']"));
	 send_keyfld.click(); 
	// WebElement search_fld=driver.findElement(By.xpath("//input[@type='search']"));
	// search_fld.sendKeys(user_name);
	 WebElement admin_name=driver.findElement(By.xpath("//a[@data-toggle='dropdown' and  @class='dropdown-toggle'] "));
	 admin_name.click();
	 WebElement signou_fld=driver.findElement(By.xpath("//a[@href='https://qalegend.com/billing/public/logout']"));
	 signou_fld.click();
	 WebElement usrname_fld=driver.findElement(By.xpath("//input[@id='username']"));
	 usrname_fld.sendKeys(user_name);
	 WebElement pasword_fld=driver.findElement(By.xpath("//input[@id='password']"));
	 pasword_fld.sendKeys(passwd);
	 WebElement login_butonfld=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	 login_butonfld.click();
 }
}
