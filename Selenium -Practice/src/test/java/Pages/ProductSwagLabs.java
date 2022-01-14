package Pages;

import org.openqa.selenium.support.PageFactory;

import Scripts.MobileBaseClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ProductSwagLabs extends MobileBaseClass{

	@AndroidFindBy(xpath = "//android.view.View[@content-desc='test-Menu']")
	public MobileElement hamburgerMenu;

	public ProductSwagLabs()
	{

          PageFactory.initElements(new AppiumFieldDecorator(driver), this);	
	}

	//menu
	public void fnMenu()
	{
		hamburgerMenu.click();	
	}
	
	
}
