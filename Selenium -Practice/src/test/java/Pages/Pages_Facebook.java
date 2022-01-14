package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Pages_Facebook {

		
		WebDriver driver;
		By email = By.xpath("//input[@type ='text' and @name='email']");
		By pass =  By.xpath("//input[@type ='password' and @name='pass']");
		By login = By.xpath("//button[@type ='submit' and @name='login']");
        By forgotPass = By.xpath("//a[text()='Forgotten password?']");
        By Createnewaccount = By.xpath("//a[@role ='button' and @id ='u_0_2_1q']");
		
	public Pages_Facebook(WebDriver driver)
	{
		this.driver=driver;
		driver.get("https://www.facebook.com/");
	}
		
	/*	
	@BeforeTest
		public void setup() {
		
			System.setProperty("webdriver.chrome.driver", "C:/Selenium drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			System.out.println("ChromeDriver is created");
			driver.get("https://facebook.com");
		}

		*/
	public void enterEmail(String strEmail)
	{
		driver.findElement(email).sendKeys(strEmail);
	}		


	public void enterPass(String strPass)
	{
		driver.findElement(pass).sendKeys(strPass);
	}		



	public void clickOnLogin()
	{
		driver.findElement(login).click();
	}		

	public void strLogin(String strEmail,String strPass)
	{
		
		this.enterEmail(strEmail);
		this.enterPass(strPass);
		this.clickOnLogin();
		 
		}

	public void ForgotPass()
	{
	driver.findElement(forgotPass).click();	
	}
	
	
	}


