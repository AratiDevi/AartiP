package MenusList;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import CommanFunction.RW;

public class HelpMenuList extends RW {

	// MainMenus HelpCenter

	/*// Sub-Menus SupportDesk
	@SuppressWarnings("unused")
	public String SupportDesk(WebDriver driver1) throws Exception {

		Thread.sleep(100);

		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(12, 2, 2)));

		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(12, 3, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(12, 3, 4, Result);

		return (title);
	}*/
	
	//Data building
	@SuppressWarnings("unused")
	public String Databuilding(WebDriver driver1) throws Exception {

		Thread.sleep(100);

		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(12, 2, 2)));

		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(12, 7, 2))).click();// Click Data building

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Thread.sleep(100);

		write_data.writedata(12, 7, 4, Result);

		return (title);
	}
	
	// Sub-Menus Support Desk555
	@SuppressWarnings("unused")
	public String SupportDesk555(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(12, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(12, 8, 2))).click();// Click Support Desk555
																		

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(12, 8, 4, Result);

		return (title);
	}
	

	// Sub-Menus TrainingVideos
	@SuppressWarnings("unused")
	public String TrainingVideos(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(12, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(12, 4, 2))).click();// Click
																		// on

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(12, 4, 4, Result);

		return (title);
	}

	// Sub-Menus FAQ
	@SuppressWarnings("unused")
	public String FAQ(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(12, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(12, 5, 2))).click();// Click FAQ
																		

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(12, 5, 4, Result);

		return (title);
	}

	// Sub-Menus FAQTopic
	@SuppressWarnings("unused")
	public String FAQTopic(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(12, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(12, 6, 2))).click();// Click
																		// on
		
		Thread.sleep(2000);
		// Switching to Alert        
	    Alert alert1=driver.switchTo().alert();  

	    // Capturing alert message.    
	    @SuppressWarnings("unused")
		String alertMessage1=driver.switchTo().alert().getText();  
	    // Displaying alert message  
	    // System.out.println(alertMessage1);   
	    Thread.sleep(1000);  
	    // Accepting alert  
	    alert1.accept();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(5000);

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(12, 6, 4, Result);
		
		return (title);
	}

	public String SShot(String actual1, String title1, WebDriver driver1) throws IOException {

		String actual = actual1;
		String title = title1;
		WebDriver driver = driver1;

		if (title.contentEquals(actual)) {
			System.out.println(title + " page is open.\n");
		} else {

			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(scrFile, new File("C:\\Users\\Arati\\workspace\\JibeTesting\\ScreenShot\\HelpMenus\\"+ driver.getTitle().trim() + "_" + System.currentTimeMillis() + ".jpg"));

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			driver.get(Dashboard); // if the page is not exceuted then it will
			// opne this url

		}

		return (null);

	}

}
