package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class SearchFlipkart extends BaseClass{

	
	public void pmyfirsttest() throws Exception
	{
		gen.loadconfig();
		driver.get(System.getProperty("url"));
		System.out.println("Google page gets open");
		driver.findElement(By.name("q")).sendKeys("flipkart");
		System.out.println("flipkart needs to be searched");
		WebElement str5 = driver.findElement(By.name("q"));
		str5.sendKeys(Keys.ESCAPE);
		System.out.println("ESCAPE button is pressed from keyboard");
		//findElement(By.className("lnXdpd")).click();
		gen.btnXpath("//div[contains(@class,'FPdoLc lJ9FBc')]//input[@class='gNO89b']").click();
		//driver.findElement(By.xpath("//div[contains(@class,'FPdoLc lJ9FBc')]//input[@class='gNO89b']")).click();
		//driver.findElement(By.xpath("//div[@class ='FPdoLc lJ9FBc']//input[@name='btnK']")).click();
		System.out.println("Google button got clicked");

	}

	public void strGoogleSearch()
	{
		gen.btnXpath("//div[contains(@class,'yuRUbf')]//a[@href='https://www.flipkart.com/']").click();
		String strTitle=driver.getTitle();
		System.out.println("Title of this page is:"+strTitle);
	}
	
	
}
