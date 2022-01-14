package DemoImage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class DemoImage {

public static WebDriver driver;	

@Test
public void testchrome() throws MalformedURLException, InterruptedException {

	DesiredCapabilities caps = new DesiredCapabilities();

	caps.setBrowserName(BrowserType.CHROME);
	
     driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),caps);
	
	driver.get("http://www.google.com");
	
	driver.findElement(By.name("q")).sendKeys("Learn Automation");
	
	Thread.sleep(5000);
	
	
	}

}
