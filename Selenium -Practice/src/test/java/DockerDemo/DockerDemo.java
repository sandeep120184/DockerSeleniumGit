package DockerDemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DockerDemo {

@Test
	public void testff() throws MalformedURLException, InterruptedException {
	
		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setBrowserName(BrowserType.FIREFOX);
		
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:8080/wd/hub "),caps);
		
		driver.get("http://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("Learn Automation");

		System.out.println("sandeep");
		Thread.sleep(5000);
		
		driver.quit();
		}
	

@Test
public void testchrome() throws MalformedURLException, InterruptedException {

	DesiredCapabilities caps = new DesiredCapabilities();

	caps.setBrowserName(BrowserType.CHROME);
	
	WebDriver driver = new RemoteWebDriver(new URL("http://localhost:8080/wd/hub "),caps);
	
	driver.get("http://www.google.com");
	
	driver.findElement(By.name("q")).sendKeys("Learn Automation");
	
	Thread.sleep(5000);
	
	driver.quit();
	}




}
