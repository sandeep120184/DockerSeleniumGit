package Scripts;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		WebElement element;
		String dateval = "29/06/2021";
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("ChromeDriver is created");
		driver.get("https://spicejet.com");
		
		
		
		//driver.findElement(By.name("ctl00$mainContent$view_date1")).click();
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;
			//js.executeScript("arguments[0].setAttribute('value','"+dateval+"');", element);
		
		
		

		
	}
	
	
	
}
	