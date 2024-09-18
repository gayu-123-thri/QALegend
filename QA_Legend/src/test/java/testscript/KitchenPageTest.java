package testscript;

import org.testng.annotations.Test;

import automation_core.Base_Class;
import constants.Constants;
import pageobject.HomePage;
import pageobject.KitchenPage;
import pageobject.LoginPage;
import utilities.ExelUtility;

public class KitchenPageTest extends Base_Class
{
	@Test
	public void verify_kitchen_Order()
	{
		

	String user_name=ExelUtility.get_Stringdata(0, 0, Constants.LOGINPAGE);
	String pass_word=ExelUtility.get_Integerdata(0, 1, Constants.LOGINPAGE);


	LoginPage login=new LoginPage(driver);
	login.enter_Username(user_name);
	 login.enter_Password(pass_word);
	 HomePage home=login.click_onLogin_Button();
	 home.clic_ONalertButton();
	 KitchenPage kitchen=home.click_on_Kitchen_Field();
	 kitchen.click_On_OrderDetails_Field();
	 
	}
}
