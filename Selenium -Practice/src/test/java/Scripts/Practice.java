package Scripts;

import java.io.File;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Practice{
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:/Selenium drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("ChromeDriver is created");
	}
	
@Test
@Parameters({"filename"})
public void TakeScreenshot(String filename) throws IOException{
	driver.get("https://facebook.com");

	
	
	File file =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	// copy file to a desired path
	System.out.println("Test");
	
	FileHandler.copy(file, new File("D:/Selenium -Practice/src/test/java/Screenshot"+filename+".png"));
	System.out.println("Test1");
		
/*	
System.out.println("Test within function");
	WebElement str = driver.findElement(By.name("email"));
	System.out.println("Webelement is identified");
	Screenshot strm = new AShot().takeScreenshot(driver, str);
	ImageIO.write(strm.getImage(), "jpg",new File ("D:/Selenium -Practice/src/test/java/Screenshot"+filename1+".jpg"));
	//ImageIO.write(strm.getImage(),"jpg",new File("D:/Selenium -Practice/src/test/java/Screenshot"+filename1+".jpg"));

	*/
}
	

/*
@Test
@Parameters({"filename1"})
public void takescreenshotElement(String filename1) throws IOException
{
	System.out.println("Test within function");
	WebElement elem = driver.findElement(By.name("email"));
	System.out.println("Webelement is identified");
	Screenshot scrn = new AShot().takeScreenshot(driver,elem);
	ImageIO.write(scrn.getImage(),"jpg",new File("D:/Selenium -Practice/src/test/java/Screenshot"+filename1+".jpg"));	
}

*/
	
@AfterTest
public void Teardown()
{
	driver.close();
	driver.quit();

	System.out.println("Driver obejct is closed");
}

}
