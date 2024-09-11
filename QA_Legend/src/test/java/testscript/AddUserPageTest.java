package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import automation_core.Base_Class;
import constants.Constants;
import constants.Messages;
import pageobject.AddUserPage;
import pageobject.HomePage;
import pageobject.LoginPage;
import pageobject.UsersManagementPage;
import pageobject.UsersPage;
import utilities.ExelUtility;
import utilities.RandomDataUtility;
import utilities.WaitUtility;

public class AddUserPageTest extends Base_Class
{
 @Test
 public void verify_add_user()
 {
	     String username=ExelUtility.get_Stringdata(0, 0, Constants.ADDUSERSPAGE);
		 String password=ExelUtility.get_Integerdata(0, 1, Constants.ADDUSERSPAGE);
		 
		 String fst_name=RandomDataUtility.get_FirstName();
		 String lst_name=RandomDataUtility.get_LastName();
		 String email_fld=fst_name+Constants.ADDUSERSPAGEDOTEXTENSION+lst_name+Constants.ADDUSERSPAGEEMAILEXTENSION;
		 String user_name=fst_name+lst_name;
		 String passwd=fst_name+lst_name;
		 
		 LoginPage login=new LoginPage(driver); 
		 login.enter_Username(username);
		 login.enter_Password(password);
		 HomePage home=login.click_onLogin_Button();
		 home.clic_ONalertButton();
		 UsersManagementPage usermanagement=home.clickON_UserManagement_Field();
		 UsersPage users=usermanagement.clickOn_users_field();
		 AddUserPage adduser=users.button_Add();
		 adduser.prefix_Box();
		 adduser.enter_FirstName(fst_name);
		 adduser.enter_LastName(lst_name);
		 adduser.enter_UserName(user_name);
		 adduser.enter_EmailAddress(email_fld);
		 adduser.role_FieldSelection();
		 adduser.enter_Password(passwd);
		 adduser.enter_ConfirmPassword(passwd);
		 adduser.ClickOn_SaveButton();
		 users.search_User(user_name);
		 String actual_result=users.display_Table();
		 Assert.assertEquals(actual_result, user_name, Messages.USERADD);
		 
		 
		 
		 
		/* WebElement username_fld=driver.findElement(By.xpath("//input[@id='username']"));
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
		 WebElement save_button_field=driver.findElement(By.xpath("//button[@id='submit_user_button']"));
		 save_button_field.click();
		 WebElement search_fld=driver.findElement(By.xpath("//input[@class='form-control input-sm']"));
		 search_fld.sendKeys(user_name);
		 WaitUtility.waitFor_Element(driver, search_fld);
		 WebElement result_table=driver.findElement(By.xpath("//table[@id='users_table']/tbody/tr/td[4]"));
		 String actual_username=result_table.getText();
		 System.out.println(actual_username);
		 ;*/
		 
	  
	 
 }
 @Test
 public void verify_userLogin_withNewly_Added_user()
 {
	 String username=ExelUtility.get_Stringdata(0, 0, Constants.ADDUSERSPAGE);
	 String password=ExelUtility.get_Integerdata(0, 1, Constants.ADDUSERSPAGE);
	 
	 String fst_name=RandomDataUtility.get_FirstName();
	 String lst_name=RandomDataUtility.get_LastName();
	 String email_fld=fst_name+Constants.ADDUSERSPAGEDOTEXTENSION+lst_name+Constants.ADDUSERSPAGEEMAILEXTENSION;
	 String user_name=fst_name+lst_name;
	 String passwd=fst_name+lst_name;
	 
	 LoginPage login=new LoginPage(driver); 
	 login.enter_Username(username);
	 login.enter_Password(password);
	 HomePage home=login.click_onLogin_Button();
	 home.clic_ONalertButton();
	 UsersManagementPage usermanagement=home.clickON_UserManagement_Field();
	 UsersPage users=usermanagement.clickOn_users_field();
	 AddUserPage adduser=users.button_Add();
	 adduser.prefix_Box();
	 adduser.enter_FirstName(fst_name);
	 adduser.enter_LastName(lst_name);
	 adduser.enter_UserName(user_name);
	 adduser.enter_EmailAddress(email_fld);
	 adduser.role_FieldSelection();
	 adduser.enter_Password(passwd);
	 adduser.enter_ConfirmPassword(passwd);
	 adduser.ClickOn_SaveButton();
	 users.backTo_HomePage();
	 home.clicOn_adminName();
	 home.clickOn_SignOut_Button();
	 login.enter_Username(user_name);
	 login.enter_Password(passwd);
	 login.click_onLogin_Button();
	 String actual_result=home.user_LoginResult();
	 String expected_result=Constants.MESSAGE+fst_name+Constants.ADDUSERPAGEEXTENSION;
	 Assert.assertEquals(actual_result, expected_result, Messages.INVALIDUSERADD);
	 
	 
	 
	/* WebElement username_fld=driver.findElement(By.xpath("//input[@id='username']"));
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
	 WebElement submit_button_fld=driver.findElement(By.xpath("//button[@id='submit_user_button']"));
	 submit_button_fld.click(); 
	// WebElement search_fld=driver.findElement(By.xpath("//input[@type='search']"));
	// search_fld.sendKeys(user_name);
	 WebElement home_page_fld=driver.findElement(By.xpath("//a[@href='https://qalegend.com/billing/public/home']"));
	 home_page_fld.click();
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
	 WebElement result=driver.findElement(By.xpath("//section[@class='content-header']"));
	 String actual_result =result.getText();
	*/
	 
	 
 }
}
