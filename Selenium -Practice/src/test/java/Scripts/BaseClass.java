package Scripts;

import org.testng.annotations.*;

import Utils.Generic;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BaseClass {

	WebDriver driver;
	Generic gen;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("ChromeDriver is created");
	}

/*
	@Test
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



//	@Test
	
//	public void strclickonMore()
//	{

		/*	WebElement strDrpdwn = driver.findElement(By.xpath("//div[contains(@class,'exehdJ')]"));
		strDrpdwn.click();
		driver.findElement(By.xpath("//*[contains(text(),'Notification Preferences')]"));
		 */	
	//	Actions act = new Actions(driver);
//		WebElement wn = driver.findElement(By.xpath("//div[contains(@class,'exehdJ')]"));
//		act.moveToElement(wn).perform();
//		System.out.println("second value in a drop down is selected");
		//driver.findElement(By.xpath("//div[contains(@class,'_3vhnxf')]")).click();
		
	//}



/*
@Test
@Parameters({"strusername","pswd"})
	public void strlogin(String strusername,String pswd) throws IOException {
	
	Boolean btn = driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2doB4z')]")).isDisplayed();
	
	if (btn==true)
	{
		System.out.println("Login window is displayed");
		driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2doB4z')]")).click();
	}
	else
	{
		System.out.println("Login window is not displayed");
	}
	
		
	String strWndHdl = driver.getWindowHandle();
	System.out.println("window handler name is:" +strWndHdl);
    driver.switchTo().window(strWndHdl);
  
	driver.findElement(By.xpath("//a[contains(@href,'/account/login?ret=/')]")).click();
	

	String strWndHd2 = driver.getWindowHandle();
	System.out.println("window handler name is:" +strWndHd2);
    driver.switchTo().window(strWndHd2);
   
	
		Boolean btn1 = driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2doB4z')]")).isDisplayed();
		if (btn1==true)
		{
			driver.findElement(By.xpath("//input[contains(@class,'_2IX_2- VJZDxU')]")).sendKeys(strusername);
			driver.findElement(By.xpath("//input[contains(@class,'_2IX_2- _3mctLh VJZDxU')]")).sendKeys(pswd);
			driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2HKlqd _3AWRsL')]")).click();
		
			
			
		}
		
		
		/*
		TakesScreenshot scr = ((TakesScreenshot)driver);
		File scrf = scr.getScreenshotAs(OutputType.FILE);
		File f = new File("C://test.png");
		Files.copy(scrf, f);
		

	}

			*/
/*
	
@Test
@Parameters({"filename"})
public void TakeScreenshot(String filename) throws IOException{
	
	driver.get("www.facebook.com");
	File file =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	// copy file to a desired path
	System.out.println("Test");
	
	FileHandler.copy(file, new File("D:\\Selenium -Practice\\src\\test\\java\\Screenshot"+filename+".png"));
	System.out.println("Test1");
	
	//c(file,new File);
	
	
}

*/

/*	@AfterTest
	public void Teardown()
	{
		driver.close();
		driver.quit();
	
		System.out.println("Driver obejct is closed");
	}
*/

}