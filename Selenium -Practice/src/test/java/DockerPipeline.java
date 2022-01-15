import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DockerPipeline {

	
	WebDriver driver;
	
	@Test
	public void dockerselgitjenk() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		System.out.println("ChromeDriver is created");
		
		driver.get("http://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("Learn Automation");
		
		Thread.sleep(5000);
		
	}
}
