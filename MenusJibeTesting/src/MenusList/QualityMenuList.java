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

public class QualityMenuList extends RW {

	// Admin
	/*@SuppressWarnings("unused")
	public String Admin(WebDriver driver1) throws Exception {

		Thread.sleep(100);
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(6, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		
		 * WebElement submenu= driver.findElement(By.linkText(data.getData(6, 3,
		 * 2))); // Click On Admin Menu
		 *
		 * action.moveToElement(submenu).build().perform();
		 

		driver.findElement(By.linkText(data.getData(6, 3, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(6, 3, 4, Result);

		return (title);
	}*/
	
	
     //Admin
	// Form Type Library
	@SuppressWarnings("unused")
	public String FormTypeLibrary(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(6, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(6, 32, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(6, 33, 2))).click();// Click Form Type Library

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(6, 33, 4, Result);

		return (title);
	}
	
	// FBM Read Access
	@SuppressWarnings("unused")
	public String FBMReadAccess(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(6, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(6, 32, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(6, 34, 2))).click();// Click FBM Read Access
																		
		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(6, 34, 4, Result);

		return (title);
	}
	
	// QMS
	@SuppressWarnings("unused")
	public String QMSMain(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(6, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(6, 4, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(6, 5, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(6, 5, 4, Result);

		return (title);
	}

	@SuppressWarnings("unused")
	public String QMSFileApproval(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(6, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(6, 4, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(6, 6, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(6, 6, 4, Result);

		return (title);
	}

	@SuppressWarnings("unused")
	public String QMSSyncApproval(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(6, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(6, 4, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(6, 7, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(6, 7, 4, Result);

		return (title);
	}

	// EMS

	@SuppressWarnings("unused")
	public String EMS(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(6, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(6, 8, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(6, 8, 4, Result);

		return (title);
	}

	// SCM

	@SuppressWarnings("unused")
	public String SCMAbsentees(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(6, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(6, 9, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(6, 10, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(6, 10, 4, Result);

		return (title);
	}

	@SuppressWarnings("unused")
	public String SCMOffResp(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(6, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(6, 9, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(6, 11, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(6, 11, 4, Result);

		return (title);
	}
	
	
	//SCM Reports
	@SuppressWarnings("unused")
	public String SCMReports(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(6, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(6, 9, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(6, 36, 2))).click();// Click SCM Reports

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(6, 36, 4, Result);

		return (title);
	}

	// FBM

	@SuppressWarnings("unused")
	public String FBM(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(6, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		
		 /** WebElement submenu= driver.findElement(By.linkText(data.getData(6, 9,
		 * 2))); // Click On Admin Menu
		 *
		 * action.moveToElement(submenu).build().perform();*/
		 

		driver.findElement(By.linkText(data.getData(6, 12, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(6, 12, 4, Result);

		return (title);
	}

	// Masters Review Assignment

	@SuppressWarnings("unused")
	public String MastersReviewAssignment(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(6, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		/* * WebElement submenu= driver.findElement(By.linkText(data.getData(6, 9,
		 * 2))); // Click On Admin Menu
		 *
		 * action.moveToElement(submenu).build().perform();*/
		 
		driver.findElement(By.linkText(data.getData(6, 13, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(6, 13, 4, Result);

		return (title);
	}

	// MST Reviews Office Response

	@SuppressWarnings("unused")
	public String MSTReviewsOfficeResponse(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(6, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/*
		 * WebElement submenu= driver.findElement(By.linkText(data.getData(6, 9,
		 * 2))); // Click On Admin Menu
		 *
		 * action.moveToElement(submenu).build().perform();*/
		 
		driver.findElement(By.linkText(data.getData(6, 14, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(6, 14, 4, Result);

		return (title);
	}

	// SCM Off Resp Reps

	@SuppressWarnings("unused")
	public String SCMOffRespReps(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(6, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		 /** WebElement submenu= driver.findElement(By.linkText(data.getData(6, 9,
		 * 2))); // Click On Admin Menu
		 *
		 * action.moveToElement(submenu).build().perform();*/
		 
		driver.findElement(By.linkText(data.getData(6, 15, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(6, 15, 4, Result);

		return (title);
	}
	
	// Fleet Drill's Status

	@SuppressWarnings("unused")
	public String FleetDrillsStatus(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(6, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		/* * WebElement submenu= driver.findElement(By.linkText(data.getData(6, 9,
		 * 2))); // Click On Admin Menu
		 *
		 * action.moveToElement(submenu).build().perform();*/
		 
		driver.findElement(By.linkText(data.getData(6, 37, 2))).click();// Click Fleet Drill's Status

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(6, 15, 4, Result);

		return (title);
	}

	// Rest Hours

	@SuppressWarnings("unused")
	public String RestHourIndex(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(6, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(6, 16, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(6, 17, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(6, 17, 4, Result);

		return (title);
	}

	@SuppressWarnings("unused")
	public String Overtime(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(6, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(6, 16, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(6, 18, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(6, 18, 4, Result);

		return (title);
	}

	@SuppressWarnings("unused")
	public String Rules(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(6, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(6, 16, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(6, 19, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(6, 19, 4, Result);

		return (title);
	}

	@SuppressWarnings("unused")
	public String RestHourReport(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(6, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(6, 16, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(6, 20, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(6, 20, 4, Result);

		return (title);
	}
	
	//FMS Main
	@SuppressWarnings("unused")
	public String FMSMain(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(6, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(6, 21, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(6, 39, 2))).click();// Click FMS Main

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(6, 39, 4, Result);

		return (title);
	}
	
	// FMS File Approval
	@SuppressWarnings("unused")
	public String FMSFileApproval(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(6, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(6, 21, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(6, 40, 2))).click();// Click FMS File Approval
																		

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(6, 40, 4, Result);

		return (title);
	}
	
	// FMS Office Approval
	@SuppressWarnings("unused")
	public String FMSOfficeApproval(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(6, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(6, 21, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(6, 41, 2))).click();// Click FMS Office Approval
																		
		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(6, 41, 4, Result);

		return (title);
	}

	// FMS

	@SuppressWarnings("unused")
	public String FMSFormType(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(6, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(6, 21, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(6, 22, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(6, 22, 4, Result);

		return (title);
	}
	
	
	//Mail Settings
	@SuppressWarnings("unused")
	public String MailSettings(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(6, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(6, 21, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(6, 42, 2))).click();// Click Mail Settings

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(6, 42, 4, Result);

		return (title);
	}

	// Job Risk Assesment
	//Risk Assessment
	
	@SuppressWarnings("unused")
	public String RiskAssessment(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(6, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(6, 23, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(6, 44, 2))).click();// Click Risk Assessment

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(6, 44, 4, Result);

		return (title);
	}
	
	// Risk Assessment Details

	@SuppressWarnings("unused")
	public String RiskAssessmentDetails(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(6, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(6, 23, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(6, 45, 2))).click();// Click Risk Assessment Details
																		

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(6, 45, 4, Result);

		return (title);
	}
	
	//JRA Types
	@SuppressWarnings("unused")
	public String JRATypes(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(6, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(6, 23, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(6, 46, 2))).click();// Click JRA Types
																		

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(6, 46, 4, Result);

		return (title);
	}
	
	// Risk Ratings
	@SuppressWarnings("unused")
	public String RiskRatings(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(6, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(6, 23, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(6, 47, 2))).click();// Click Risk Ratings
																		

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(6, 47, 4, Result);

		return (title);
	}
	
	// Severity Consequences
	@SuppressWarnings("unused")
	public String SeverityConsequences(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(6, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(6, 23, 2))); // Click

		action.moveToElement(submenu).build().perform();
 
		driver.findElement(By.linkText(data.getData(6, 48, 2))).click();// Click Severity Consequences
																		

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(6, 48, 4, Result);

		return (title);
	}

	/*@SuppressWarnings("unused")
	public String RiskAssessmentMatrix(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(6, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(6, 23, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(6, 24, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(6, 24, 4, Result);

		return (title);
	}*/
	
	// Work Category
	@SuppressWarnings("unused")
	public String WorkCategory(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(6, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(6, 23, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(6, 49, 2))).click();// Click Work Category
																		

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(6, 49, 4, Result);

		return (title);
	}
	
	// Hazard Template
	@SuppressWarnings("unused")
	public String HazardTemplate(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(6, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(6, 23, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(6, 50, 2))).click();// Click Hazard Template
																		
		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(6, 50, 4, Result);

		return (title);
	}
	
	// Approval Configuration
	@SuppressWarnings("unused")
	public String ApprovalConfiguration(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(6, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(6, 23, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(6, 51, 2))).click();// Click Approval Configuration
																		

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(6, 51, 4, Result);

		return (title);
	}

	// Environmental KPI
	
	
	@SuppressWarnings("unused")
	public String CO2EFFICIENCY(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(6, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(6, 25, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(6, 27, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(6, 27, 4, Result);

		return (title);
	}

	@SuppressWarnings("unused")
	public String CO2EFFICIENCYBYVESSEL(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(6, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(6, 25, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(6, 26, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(6, 26, 4, Result);

		return (title);
	}
	
	//NOx EFFICIENCY
	@SuppressWarnings("unused")
	public String NOxEFFICIENCY(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(6, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(6, 25, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(6, 28, 2))).click();// Click NOx EFFICIENCY

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(6, 28, 4, Result);

		return (title);
	}
	
	// NOx EFFICIENCY BY VESSEL
	@SuppressWarnings("unused")
	public String NOxEFFICIENCYBYVESSEL(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(6, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(6, 25, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(6, 29, 2))).click();// Click NOx EFFICIENCY BY VESSEL
																		
		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(6, 29, 4, Result);

		return (title);
	}

	// SOx EFFICIENCY
	@SuppressWarnings("unused")
	public String SOxEFFICIENCY(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(6, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(6, 25, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(6, 30, 2))).click();// Click SOx EFFICIENCY
																		

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(6, 30, 4, Result);

		return (title);
	}
	
	// SOx EFFICIENCY BY VESSEL
	@SuppressWarnings("unused")
	public String SOxEFFICIENCYBYVESSEL(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(6, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(6, 25, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(6, 31, 2))).click();// Click SOx EFFICIENCY BY VESSEL
																		
		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(6, 31, 4, Result);

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

			FileUtils.copyFile(scrFile, new File("C:\\Users\\Arati\\workspace\\JibeTesting\\ScreenShot\\QualityMenus\\"+ driver.getTitle().trim() + "_" + System.currentTimeMillis() + ".jpg"));

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			driver.get(Dashboard); // if the page is not exceuted then it will
			// opne this url
		}

		return (null);

	}

}
