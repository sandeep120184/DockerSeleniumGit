package Scripts;
import org.testng.annotations.Test;
import Pages.Pages_Facebook;
import Utils.ExcelUtilities;
import org.testng.annotations.*;

import com.codoid.products.exception.FilloException;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.sl.draw.DrawTableShape;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class TestCase1 extends BaseClass{

	//WebDriver driver;
	Pages_Facebook obj;
	ExcelUtilities utl = new ExcelUtilities();
	String [] arr = {"Name","Email_Id"};
	String Path = "D:\\Sandeep1.xlsx";
	String Sheetname = "Test";
	String txtSearch = "Sandeep";
	String txtchange = "Amar";
	String expecteddate  = "12-January-2022";
	String date = expecteddate.split("-")[0];
	String year = expecteddate.split("-")[2];
	String month = expecteddate.split("-")[1];

	
	
	/*			
	@Test
	@Parameters({"username","password"})
	public void logintoFacebook(String username,String password) 
	{
		
		obj = new Pages_Facebook(super.driver);
		 obj.strLogin(username, password);
		 
		  
			 	 
	} 

	
	
	
@Test
	public void creatingExcel() throws Exception
	{
		
		//utl.ExcelCreator(arr);
	//utl.ExcelReador(Path,Sheetname);
	utl.ExcelSearch_Update(Path, Sheetname, txtSearch, txtchange);
	}
	
*/
/*
@Test
public void strDeleteExcelRecords() throws FilloException
{
	
		
	//utl.DeleteExcelRecords();
}


		@Test
	public void strpara() throws Exception
	{
		//utl.ReadWorddocument("D:/sandeep.docx");
		//utl.createWorddocument();
		//utl.createtxt();n 
		//utl.DeleteExcelRecords();
		utl.readtxt("D:/test2.txt");
	}
	
*/
	
@Test	
public void JS() {
	System.out.print("dates are:"+date+"-"+month+"-" +year);
	
	driver.get("https://spicejet.com");
	driver.manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
	
	WebDriverWait wt = new 	WebDriverWait(driver,20000);
	WebElement el = 
	wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"flightSearchContainer\"]/div[4]/button")))); 
	
	el.click();
	
	String strMonth = 
			driver.findElement(By.xpath("//*[@class='ui-datepicker-group ui-datepicker-group-first']//span[@class='ui-datepicker-month']"))
			.getText().toString();
	
	String strYear = 
			driver.findElement(By.xpath("//*[@class='ui-datepicker-group ui-datepicker-group-first']//span[@class='ui-datepicker-year']"))
			.getText().toString();
	

	while (!(strMonth.equalsIgnoreCase(month)) && (strYear.equalsIgnoreCase(year)))

			{
		
			
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		 strMonth = 
					driver.findElement(By.xpath("//*[@class='ui-datepicker-group ui-datepicker-group-first']//span[@class='ui-datepicker-month']"))
					.getText().toString();
			
			 strYear = 
					driver.findElement(By.xpath("//*[@class='ui-datepicker-group ui-datepicker-group-first']//span[@class='ui-datepicker-year']"))
					.getText().toString();
			
		System.out.println("month:"+strMonth+"Year:"+strYear);
	}
	
	
	List<WebElement> ex = (List<WebElement>) driver.findElement(By.xpath("//a[@class='ui-state-default']"));
	
	for(WebElement s:ex)
		
	{
		if(s.getText().equalsIgnoreCase(date))
		{
			s.click();
		}
	}
	
	/*
	el = driver.findElement(By.name("ctl00$mainContent$view_date1"));
	dateval = "30-06-2021";
	JavascriptExecutor js = ((JavascriptExecutor)driver);
	js.executeScript("arguments[0].setAttribute('value','"+dateval+"');", el);
	*/	
}



/*	public void resetpass()
	{
		obj = new Pages_Facebook(super.driver);
		obj.ForgotPass();
		
	}
*/	
}
