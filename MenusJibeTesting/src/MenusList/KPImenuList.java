package MenusList;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



import CommanFunction.RW;

public class KPImenuList extends RW {
	

	@SuppressWarnings("unused")
	public String PIList(WebDriver driver1) throws Exception {

		Thread.sleep(100);

		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(13, 2, 2)));

		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(13, 3, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Thread.sleep(100);

		write_data.writedata(13, 3, 4, Result);

		return (title);
	}
	
	//KPI List
	@SuppressWarnings("unused")
	public String KPIList(WebDriver driver1) throws Exception {

		Thread.sleep(100);

		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(13, 2, 2)));

		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(13, 4, 2))).click();// Click KPI List

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Thread.sleep(100);

		write_data.writedata(13, 4, 4, Result);

		return (title);
	}
	
	
	// KPI Library
	@SuppressWarnings("unused")
	public String KPILibrary(WebDriver driver1) throws Exception {

		Thread.sleep(100);

		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(13, 2, 2)));

		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(13, 5, 2))).click();// Click KPI Library
																		

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Thread.sleep(100);

		write_data.writedata(13, 5, 4, Result);

		return (title);
	}
	
	
	// KPI Consolidated
	@SuppressWarnings("unused")
	public String KPIConsolidated(WebDriver driver1) throws Exception {

		Thread.sleep(100);

		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(13, 2, 2)));

		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(13, 6, 2))).click();// Click KPI Consolidated
																		

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Thread.sleep(100);

		write_data.writedata(13, 6, 4, Result);

		return (title);
	}
	
	// PI Details
	@SuppressWarnings("unused")
	public String PIDetails(WebDriver driver1) throws Exception {

		Thread.sleep(100);

		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(13, 2, 2)));

		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(13, 7, 2))).click();// Click PI Details
																		

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Thread.sleep(100);

		write_data.writedata(13, 7, 4, Result);

		return (title);
	}
	
	// Crew Retention
	@SuppressWarnings("unused")
	public String CrewRetention(WebDriver driver1) throws Exception {

		Thread.sleep(100);

		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(13, 2, 2)));

		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(13, 8, 2))).click();// Click Crew Retention
																		

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Thread.sleep(100);

		write_data.writedata(13, 8, 4, Result);

		return (title);
	}
	
	// TMSA Auto Report
	@SuppressWarnings("unused")
	public String TMSAAutoReport(WebDriver driver1) throws Exception {

		Thread.sleep(100);

		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(13, 2, 2)));

		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(13, 9, 2))).click();// Click TMSA Auto Report
																		

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Thread.sleep(100);

		write_data.writedata(13, 9, 4, Result);

		return (title);
	}
	
	// PMS Overdue
	@SuppressWarnings("unused")
	public String PMSOverdue(WebDriver driver1) throws Exception {

		Thread.sleep(100);

		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(13, 2, 2)));

		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(13, 10, 2))).click();// Click PMS Overdue
																		

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Thread.sleep(100);

		write_data.writedata(13, 10, 4, Result);

		return (title);
	}
	
	
	// Crew Retention1
	@SuppressWarnings("unused")
	public String CrewRetention1(WebDriver driver1) throws Exception {

		Thread.sleep(100);

		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(13, 2, 2)));

		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(13, 11, 2))).click();// Click Crew Retention
																			
		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Thread.sleep(100);

		write_data.writedata(13, 11, 4, Result);

		return (title);
	}
	
	// Crew Retention New
	@SuppressWarnings("unused")
	public String CrewRetentionNew(WebDriver driver1) throws Exception {

		Thread.sleep(100);

		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(13, 2, 2)));

		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(13, 12, 2))).click();// Click Crew Retention New
																			

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Thread.sleep(100);

		write_data.writedata(13, 12, 4, Result);

		return (title);
	}
	
	// Vetting KPIs
	@SuppressWarnings("unused")
	public String VettingKPIs(WebDriver driver1) throws Exception {

		Thread.sleep(100);

		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(13, 2, 2)));

		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(13, 13, 2))).click();// Click Vetting KPIs
																			

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Thread.sleep(100);

		write_data.writedata(13, 13, 4, Result);

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

			FileUtils.copyFile(scrFile, new File("C:\\Users\\Arati\\workspace\\JibeTesting\\ScreenShot\\KPI\\" + driver.getTitle().trim()+ "_" + System.currentTimeMillis() + ".jpg"));


			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			driver.get(Dashboard); // if the page is not exceuted then it will
			// opne this url

		}

		return (null);

	}
}
