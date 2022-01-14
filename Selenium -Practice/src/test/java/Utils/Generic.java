package Utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Generic {

	WebDriver driver;
     
public 	Generic(WebDriver driver)
{
	this.driver = driver;
}

	public WebElement txtfldXpath(String XPATH)

	{
		WebElement txt= driver.findElement(By.xpath(XPATH));
		return txt;
	}
	

	public WebElement btnXpath(String XPATH)

	{
		WebElement btn= driver.findElement(By.xpath(XPATH));
		return btn;
	}
	
	
	public void loadconfig() throws Exception
	{
		//loading property file & accessing configuration
		Properties prop = new Properties();
		InputStream fs = new FileInputStream("D:\\Selenium -Practice\\config.properties");
		prop.load(fs);
		

	}

	
}
