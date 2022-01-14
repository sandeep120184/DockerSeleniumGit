package Scripts;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;

import Pages.LoginPageSwagLabs;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class AppiumFirstTestCase extends MobileBaseClass{

	public static LoginPageSwagLabs login;
	
	public AppiumFirstTestCase() throws MalformedURLException, InterruptedException
	{
		setUp();
		login = new LoginPageSwagLabs();
	}

	
	@Test
	public void SwagLabLogin() throws MalformedURLException, InterruptedException
	{
		login.fnLogin();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		String strTitle = driver.getContext();
		System.out.println("Context of the landing page is: "+strTitle);
		Thread.sleep(3000);
	}

@Test
public void scrolling()
{


	Dimension dimension = driver.manage().window().getSize();

	//swap right to left	
	int start_x= (int) (dimension.getWidth()*0.5);
	int end_x = (int) (dimension.getWidth()*0.5);
	
	int start_y = (int) (dimension.getHeight()*0.4);
	int end_y =(int) (dimension.getHeight() * 0.8);
	
	TouchAction touch = new TouchAction(driver);
	
	touch.longPress(PointOption.point(start_x, start_y))
	.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(10)))
	.moveTo(PointOption.point(end_x, end_y))
	.release().perform();		
}
		
}
