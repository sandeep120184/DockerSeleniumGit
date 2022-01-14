package Pages;


import org.openqa.selenium.support.PageFactory;

import Scripts.MobileBaseClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class LoginPageSwagLabs extends MobileBaseClass{

	public static ProductSwagLabs product;
	@AndroidFindBy(xpath ="//android.widget.EditText[@content-desc='test-Username']")
	public AndroidElement username;

	@AndroidFindBy(xpath ="//android.widget.EditText[@content-desc='test-Password']")
	public AndroidElement pswd;

	@AndroidFindBy(xpath ="//android.view.View[@content-desc='test-LOGIN']")
	public AndroidElement loginbtn;

	public LoginPageSwagLabs()
	{
       PageFactory.initElements(new AppiumFieldDecorator(driver), this);	
   	}

	//login functionality
	public ProductSwagLabs fnLogin() throws InterruptedException
	{
		username.sendKeys("standard_user");
		pswd.sendKeys("secret_sauce");
		loginbtn.click();
		return product;
	}	


}