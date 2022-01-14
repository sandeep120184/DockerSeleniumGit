package AppiumEmulator;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AndroidEmulator {

	public static WebDriver driver;
	public static DesiredCapabilities cap;
	
	@BeforeTest
	public void setUp() throws MalformedURLException, InterruptedException
	{
		cap = new DesiredCapabilities().chrome();
		cap.setCapability("deviceName", "emulator");
		cap.setCapability(CapabilityType.PLATFORM_NAME,"ANDROID");
		cap.setCapability(CapabilityType.BROWSER_NAME,"Chrome");
		cap.setCapability(CapabilityType.VERSION,"11");
		
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.get("https://www.amazon.ae");
		
		/*
		 * driver.findElement(By.id("nav-search-keywords")).sendKeys("Mobile");
		 * driver.findElement(By.xpath("//input[@aria-label='Go' and @value = 'Go']")).
		 * click();
		 */	    
	    

	}

	
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver.quit();
	}
	
}
