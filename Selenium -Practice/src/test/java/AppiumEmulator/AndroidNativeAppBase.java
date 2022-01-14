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

public class AndroidNativeAppBase {

	
	public static AppiumDriver<WebElement> driver;
	public static DesiredCapabilities cap;
	public static  String context;
	
	@BeforeTest
	public void setUp() throws MalformedURLException, InterruptedException
	{
		cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");
        //cap.setCapability(MobileCapabilityType.BROWSER_NAME,BrowserType.ANDROID);
		cap.setCapability(MobileCapabilityType.VERSION,"11");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
		//cap.setCapability(MobileCapabilityType.FULL_RESET,"");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.dialer.main.impl.MainActivity");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.dialer");
    	driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		Thread.sleep(3000);
	}

	@Test
	public void test() throws InterruptedException
	{

		driver.findElementById("com.android.dialer:id/fab").click();
		Thread.sleep(3000);
		context =driver.getContext();
		System.out.println("Context is:"+context);
		driver.findElementById("com.android.dialer:id/nine").click();
		driver.findElementById("com.android.dialer:id/zero").click();
		driver.findElementById("com.android.dialer:id/one").click();
		driver.findElementById("com.android.dialer:id/dialpad_floating_action_button").click();
		Thread.sleep(4000);
		context =driver.getContext();
		System.out.println("Context is:"+context);
		driver.findElementById("com.android.dialer:id/incall_end_call").click();
		Thread.sleep(3000);
		String strTitle =driver.getTitle();
		System.out.println("Dialler Title"+strTitle);
	}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
	
}
