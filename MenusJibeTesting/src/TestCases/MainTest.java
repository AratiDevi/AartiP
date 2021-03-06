package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import CommanFunction.RW;
import CommanFunction.loginpage;

import MenusList.SendEmail;

public class MainTest extends RW {

	public static WebDriver driver;

	loginpage L = new loginpage(); 
	
	

	@Test
	@Parameters("browser")
	public void initialioseBrowser(String browserName) throws Exception {
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arati\\workspace\\chromedriver.exe");
		

		driver = new ChromeDriver();
			
		//driver.get(url);
		
		driver.manage().window().maximize();

		//L.Login(driver);
		
		Thread.sleep(2000);

		

	}
		else if(browserName.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Arati\\workspace\\IEDriverServer.exe");

			 driver = new InternetExplorerDriver();
			 
			// driver.get(url);
			 
			 //driver.manage().window().maximize();
			 
			 L.Login(driver);
			 
			 Thread.sleep(3000);
			 
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		L.Login(driver);
		
		Thread.sleep(1000);
		
		//driver.quit();

		//@BeforeSuite
		
		
		
	/*}
	
	@Test
	
	public void initialioseBrowser1() throws Exception 
	{
		
		Thread.sleep(1000);
		
		Thread.sleep(1000);
		
	}*/
	
	

	/*@AfterSuite
	public void closeBrowser() {

		// it is used for sending the email
		driver.quit();

		//SendEmail SendEmail = new SendEmail();

		//SendEmail.Send();
	}*/

}}
