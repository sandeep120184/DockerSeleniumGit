package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import AppiumEmulator.SwagLabsNativeApp;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BasePageFactory extends SwagLabsNativeApp{

	public static AppiumDriver<WebElement> Pagedriver;
	
	public  BasePageFactory()
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}

	
	
}
