package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import automation_core.Base_Class;
import constants.Constants;
import constants.Messages;
import pageobject.AdminUpdateProfilePage;
import pageobject.HomePage;
import pageobject.LoginPage;
import utilities.ExelUtility;

public class AdminUpdatePageTest extends Base_Class
{
	@Test
 public void verify_adminUpdate_Page()
 {
	    String user_name=ExelUtility.get_Stringdata(0, 0, Constants.LOGINPAGE);
		String pass_word=ExelUtility.get_Integerdata(0, 1, Constants.LOGINPAGE);
	    String admin_update_name=ExelUtility.get_Stringdata(0, 0, Constants.ADMINUPDATE);
	    String actual_result=ExelUtility.get_Stringdata(1, 0, Constants.UPDATEMESSAGE);
	    
	     LoginPage login=new LoginPage(driver);
		 login.enter_Username(user_name);
		 login.enter_Password(pass_word);
		 HomePage home=login.click_onLogin_Button();
		 home.clic_ONalertButton();
		 home.click_On_Adminabc();
		 AdminUpdateProfilePage adminupdate=home.click_On_Profile_Field();
		 adminupdate.enter_update_Lastname(admin_update_name);
		 adminupdate.verify_Update_Button();
		 String expected_result=adminupdate.verify_Get_Message();
		 Assert.assertEquals(actual_result,expected_result,Messages.UPDATESUCCESS); 
		 
		 
 }

}

