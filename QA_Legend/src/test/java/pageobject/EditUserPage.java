package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditUserPage {
	WebDriver driver;
	public EditUserPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='first_name']")
	WebElement firstname_field;
	@FindBy(xpath="//input[@id='last_name']")
	WebElement lastname_field;
	@FindBy(xpath="//input[@id='email']")
	WebElement email_field;
	@FindBy(xpath="//button[@id='submit_user_button']")
	WebElement save_button_field;
	
	
	public void enter_FirstName(String fname)
	{
		firstname_field.sendKeys(fname);
	}
	public void enter_LastName(String lname)
	{
		lastname_field.sendKeys(lname);
	}
	public void enter_EmailAddress(String email)
	{
		email_field.sendKeys(email);
	}
	public UsersPage ClickOn_SaveButton()
	{
		save_button_field.click();
		return new UsersPage(driver) ;
	}

}
