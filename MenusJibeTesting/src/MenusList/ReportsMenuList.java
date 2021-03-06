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

public class ReportsMenuList extends RW {
	
	public String PMSOverdue(WebDriver driver1) throws Exception {
		

		Thread.sleep(1000);
		WebDriver driver = driver1;
		
		Actions action = new Actions(driver);
		
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		

		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2)));  //Technical
		Thread.sleep(1000); // Click On Technical menu


		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(1000);

		WebElement submenu = driver.findElement(By.linkText(data.getData(8, 53, 2))); // Click Reports
		
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(8, 54, 2))).click();// Click PMS Overdue

		String title = driver.getTitle().trim();

		//Get the page load Time
		
		 long LoagingStart = System.currentTimeMillis();

		  List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		  long Loadingstop = System.currentTimeMillis();

		  double TotalTime = (Loadingstop-LoagingStart);

		  String Result  =  Double.toString(TotalTime);

		  System.out.println(driver.getTitle().trim()+"Pageloading time is "+ TotalTime + " Milisec");



		  write_data.writedata(8,54,4,Result);

		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		  Thread.sleep(1000);

		return (title);
		
}
	
	public String NearMisses(WebDriver driver1) throws Exception {
		

		Thread.sleep(1000);
		WebDriver driver = driver1;
		
		Actions action = new Actions(driver);
		
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		

		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2)));  //Technical
		Thread.sleep(1000); // Click On Technical menu


		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(1000);

		WebElement submenu = driver.findElement(By.linkText(data.getData(8, 53, 2))); // Click Reports 
		
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(8, 55, 2))).click();// Click NearMisses

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);

		//write_data.writedata(8, 4, 4, Result);

		return (title);
		
	}
	
public String IncidentsPersonnel(WebDriver driver1) throws Exception {
		

		Thread.sleep(1000);
		WebDriver driver = driver1;
		
		Actions action = new Actions(driver);
		
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		

		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2)));  //Technical
		Thread.sleep(1000); // Click On Technical menu


		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(1000);

		WebElement submenu = driver.findElement(By.linkText(data.getData(8, 53, 2))); // Click Reports
		
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(8, 56, 2))).click();// Click IncidentsPersonnel

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);

		//write_data.writedata(8, 4, 4, Result);

		return (title);
		
	}
	

public String IncidentswithInjury(WebDriver driver1) throws Exception {
	

	Thread.sleep(1000);
	WebDriver driver = driver1;
	
	Actions action = new Actions(driver);
	
	Thread.sleep(1000);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	

	WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2)));  //Technical
	Thread.sleep(1000); // Click On Technical menu


	action.moveToElement(menu).build().perform();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Thread.sleep(1000);

	WebElement submenu = driver.findElement(By.linkText(data.getData(8, 53, 2))); // Click Reports 
	
	Thread.sleep(1000);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	action.moveToElement(submenu).build().perform();

	driver.findElement(By.linkText(data.getData(8, 57, 2))).click();// Click IncidentswithInjury

	String title = driver.getTitle().trim();

	long LoagingStart = System.currentTimeMillis();

	List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

	long Loadingstop = System.currentTimeMillis();

	double TotalTime = (Loadingstop - LoagingStart);

	String Result = Double.toString(TotalTime);

	System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Thread.sleep(2000);

	//write_data.writedata(8, 4, 4, Result);

	return (title);
	
}

public String IncidentswithDeath(WebDriver driver1) throws Exception {
	

	Thread.sleep(1000);
	WebDriver driver = driver1;
	
	Actions action = new Actions(driver);
	
	Thread.sleep(1000);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	

	WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2)));  //Technical
	Thread.sleep(1000); // Click On Technical menu


	action.moveToElement(menu).build().perform();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Thread.sleep(1000);

	WebElement submenu = driver.findElement(By.linkText(data.getData(8, 53, 2))); // Click Reports 
	
	Thread.sleep(1000);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	action.moveToElement(submenu).build().perform();

	driver.findElement(By.linkText(data.getData(8, 58, 2))).click();// Click IncidentswithDeath

	String title = driver.getTitle().trim();

	long LoagingStart = System.currentTimeMillis();

	List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

	long Loadingstop = System.currentTimeMillis();

	double TotalTime = (Loadingstop - LoagingStart);

	String Result = Double.toString(TotalTime);

	System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Thread.sleep(2000);

	//write_data.writedata(8, 4, 4, Result);

	return (title);
	
}


public String IncidentsPollution(WebDriver driver1) throws Exception {
	

	Thread.sleep(1000);
	WebDriver driver = driver1;
	
	Actions action = new Actions(driver);
	
	Thread.sleep(1000);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	

	WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2)));  //Technical
	Thread.sleep(1000); // Click On Technical menu


	action.moveToElement(menu).build().perform();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Thread.sleep(1000);

	WebElement submenu = driver.findElement(By.linkText(data.getData(8, 53, 2))); // Click Reports
	
	Thread.sleep(1000);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	action.moveToElement(submenu).build().perform();
	
	Thread.sleep(1000);

	driver.findElement(By.linkText(data.getData(8, 59, 2))).click();// Click IncidentsPollution

	String title = driver.getTitle().trim();

	long LoagingStart = System.currentTimeMillis();

	List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

	long Loadingstop = System.currentTimeMillis();

	double TotalTime = (Loadingstop - LoagingStart);

	String Result = Double.toString(TotalTime);

	System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Thread.sleep(2000);

	//write_data.writedata(8, 4, 4, Result);

	return (title);
	
}

public String InternalInspections(WebDriver driver1) throws Exception {
	

	Thread.sleep(1000);
	WebDriver driver = driver1;
	
	Actions action = new Actions(driver);
	
	Thread.sleep(1000);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	

	WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2)));  //Technical
	Thread.sleep(1000); // Click On Technical menu


	action.moveToElement(menu).build().perform();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Thread.sleep(1000);

	WebElement submenu = driver.findElement(By.linkText(data.getData(8, 53, 2))); // Click Reports
	
	Thread.sleep(1000);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	action.moveToElement(submenu).build().perform();

	driver.findElement(By.linkText(data.getData(8, 60, 2))).click();// Click InternalInspections

	String title = driver.getTitle().trim();

	long LoagingStart = System.currentTimeMillis();

	List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

	long Loadingstop = System.currentTimeMillis();

	double TotalTime = (Loadingstop - LoagingStart);

	String Result = Double.toString(TotalTime);

	System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Thread.sleep(2000);

	//write_data.writedata(8, 4, 4, Result);

	return (title);
	
}

public String PortStateControlDeficiencies(WebDriver driver1) throws Exception {
	

	Thread.sleep(1000);
	WebDriver driver = driver1;
	
	Actions action = new Actions(driver);
	
	Thread.sleep(1000);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	

	WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2)));  //Technical
	Thread.sleep(1000); // Click On Technical menu


	action.moveToElement(menu).build().perform();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Thread.sleep(1000);

	WebElement submenu = driver.findElement(By.linkText(data.getData(8, 53, 2))); // Click Reports 
	
	Thread.sleep(1000);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	action.moveToElement(submenu).build().perform();

	driver.findElement(By.linkText(data.getData(8, 61, 2))).click();// Click PortStateControlDeficiencies

	String title = driver.getTitle().trim();

	long LoagingStart = System.currentTimeMillis();

	List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

	long Loadingstop = System.currentTimeMillis();

	double TotalTime = (Loadingstop - LoagingStart);

	String Result = Double.toString(TotalTime);

	System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Thread.sleep(2000);

	//write_data.writedata(8, 4, 4, Result);

	return (title);
	
}

public String VettingReports(WebDriver driver1) throws Exception {
	

	Thread.sleep(1000);
	WebDriver driver = driver1;
	
	Actions action = new Actions(driver);
	
	Thread.sleep(1000);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	

	WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2)));  //Technical
	Thread.sleep(1000); // Click On Technical menu


	action.moveToElement(menu).build().perform();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Thread.sleep(1000);

	WebElement submenu = driver.findElement(By.linkText(data.getData(8, 53, 2))); // Click Reports 
	
	Thread.sleep(1000);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	action.moveToElement(submenu).build().perform();

	driver.findElement(By.linkText(data.getData(8, 62, 2))).click();// Click VettingReports

	String title = driver.getTitle().trim();

	long LoagingStart = System.currentTimeMillis();

	List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

	long Loadingstop = System.currentTimeMillis();

	double TotalTime = (Loadingstop - LoagingStart);

	String Result = Double.toString(TotalTime);

	System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Thread.sleep(2000);

	//write_data.writedata(8, 4, 4, Result);

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

			FileUtils.copyFile(scrFile, new File("C:\\Users\\Arati\\workspace\\JibeTesting\\ScreenShot\\ReportsMenus\\"+ driver.getTitle().trim() + "_" + System.currentTimeMillis() +".jpg"));

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			driver.get(Dashboard); // if the page is not exceuted then it will
			// opne this url

		}

		return (null);

	}
	

}
