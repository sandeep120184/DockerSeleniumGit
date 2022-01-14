package Scripts;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.testng.annotations.BeforeTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class MobileBaseClass {

	
	public static AppiumDriver<WebElement> driver;
    public static DesiredCapabilities cap;
		
		
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
			driver.manage().timeouts().implicitlyWait(80000, TimeUnit.MILLISECONDS);
			}
			

//		@AfterClass
//		public void teardown()
//		{
//			driver.close();
//			driver.quit();
//		}
//		
		
		}

	

