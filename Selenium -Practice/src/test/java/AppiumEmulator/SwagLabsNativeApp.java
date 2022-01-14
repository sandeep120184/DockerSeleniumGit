package AppiumEmulator;

import java.net.MalformedURLException;

import java.net.URL;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class SwagLabsNativeApp {

	
	public static AppiumDriver<WebElement> driver;
	public static DesiredCapabilities cap;
	public static  String context;
	
	@BeforeTest
	public void setUp() throws MalformedURLException, InterruptedException
	{
		cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");
    	cap.setCapability(MobileCapabilityType.VERSION,"5.1");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.swaglabsmobileapp");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.swaglabsmobileapp.MainActivity");		
    	driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
    	Thread.sleep(20000);
	}

	@Test
	public void test() throws InterruptedException
	{
		

		driver.findElement(By.xpath("//android.widget.EditText[@content-desc='test-Username']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//android.widget.EditText[@content-desc='test-Password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//android.view.View[@content-desc='test-LOGIN']")).click();
		Thread.sleep(20000);

}
	
//	@AfterTest
//	public void teardown()
//	{
//		driver.quit();
//	}
	
}
