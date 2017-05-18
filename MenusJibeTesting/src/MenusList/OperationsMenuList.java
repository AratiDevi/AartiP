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

public class OperationsMenuList extends RW {

	// Admin

	@SuppressWarnings("unused")
	public String WaterInHoldTank(WebDriver driver1) throws Exception {
		Thread.sleep(100);

		WebDriver driver = driver1;

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement menu = driver.findElement(By.linkText(data.getData(5, 2, 2)));

		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(5, 3, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(5, 4, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Thread.sleep(100);

		write_data.writedata(5, 4, 4, Result);

		return (title);
	}
	
	//Deck Log Book Threshold
	@SuppressWarnings("unused")
	public String DeckLogBookThreshold(WebDriver driver1) throws Exception {
		Thread.sleep(100);

		WebDriver driver = driver1;

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement menu = driver.findElement(By.linkText(data.getData(5, 2, 2)));

		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(5, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(5, 20, 2))).click();// Click Deck Log Book Threshold

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Thread.sleep(100);

		write_data.writedata(5, 20, 4, Result);

		return (title);
	}
	
	

	@SuppressWarnings("unused")
	public String PiracyAlarmSettings(WebDriver driver1) throws Exception {

		Thread.sleep(100);

		WebDriver driver = driver1;

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement menu = driver.findElement(By.linkText(data.getData(5, 2, 2)));

		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(5, 3, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(5, 5, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Thread.sleep(100);

		write_data.writedata(5, 5, 4, Result);

		return (title);
	}

	@SuppressWarnings("unused")
	public String VslGeneralParameters(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement menu = driver.findElement(By.linkText(data.getData(5, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(5, 3, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(5, 6, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(5, 6, 4, Result);

		return (title);
	}
	
	
	//Reports-Rank Config.
	@SuppressWarnings("unused")
	public String ReportsRankConfig(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement menu = driver.findElement(By.linkText(data.getData(5, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(5, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(5, 21, 2))).click();// Click Reports-Rank Config.

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(5, 21, 4, Result);

		return (title);
	}
	
	// Sub-Menus VoyageReports
	//Daily Report Index

	@SuppressWarnings("unused")
	public String DailyReportIndex(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(5, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(5, 7, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(5, 23, 2))).click();// Click Daily Report Index

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(5, 23, 4, Result);

		return (title);
	}

	// Sub-Menus VoyageReports

	@SuppressWarnings("unused")
	public String ReportIndex(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(5, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(5, 7, 2))); // Click


		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(5, 8, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(5, 8, 4, Result);

		return (title);
	}

	@SuppressWarnings("unused")
	public String CPFiguresEntry(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(5, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(5, 7, 2))); // Click


		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(5, 9, 2))).click();// Click


		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(5, 9, 4, Result);

		return (title);
	}
	
	//Bunker Report
	@SuppressWarnings("unused")
	public String BunkerReport(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(5, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(5, 7, 2))); // Click


		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(5, 24, 2))).click();// Click Bunker Report


		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(5, 24, 4, Result);

		return (title);
	}
	
	// Port Report
	@SuppressWarnings("unused")
	public String PortReport(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(5, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(5, 7, 2))); // Click

		action.moveToElement(submenu).build().perform();
 
		driver.findElement(By.linkText(data.getData(5, 25, 2))).click();// Click Port Report
																		

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(5, 25, 4, Result);

		return (title);
	}
	
	// Report Index- Chemical
	@SuppressWarnings("unused")
	public String ReportIndexChemical(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(5, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(5, 7, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(5, 26, 2))).click();// Click Report Index- Chemical
																		

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(5, 26, 4, Result);

		return (title);
	}

	// Sub-Menus BunkerSampleReports
	@SuppressWarnings("unused")
	public String BunkerSampleReports(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(5, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/*
		 * WebElement submenu= driver.findElement(By.linkText(data.getData(5, 3,
		 * 2))); // Click On Admin Menu
		 *
		 * action.moveToElement(submenu).build().perform();
		 */

		driver.findElement(By.linkText(data.getData(5, 10, 2))).click();// Click


		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(5, 9, 4, Result);

		return (title);
	}
	
	// Sub-Menus Bunker Sample Lab
	@SuppressWarnings("unused")
	public String BunkerSampleLab(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(5, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		

		driver.findElement(By.linkText(data.getData(5, 27, 2))).click();// Click Bunker Sample Lab

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(5, 27, 4, Result);

		return (title);
	}

	// Sub-Menus BunkerAttachments
	/*@SuppressWarnings("unused")
	public String BunkerAttachments(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(5, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/*
		 * WebElement submenu= driver.findElement(By.linkText(data.getData(5, 3,
		 * 2))); // Click On Admin Menu
		 *
		 * action.moveToElement(submenu).build().perform();
		 *

		driver.findElement(By.linkText(data.getData(5, 11, 2))).click();// Click
																		// on

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(5, 10, 4, Result);

		return (title);
	}*/

	// Sub-Menus DeckLogBook
	@SuppressWarnings("unused")
	public String DeckLogBook(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(5, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/*
		 * WebElement submenu= driver.findElement(By.linkText(data.getData(5, 3,
		 * 2))); // Click On Admin Menu
		 *
		 * action.moveToElement(submenu).build().perform();
		 */

		driver.findElement(By.linkText(data.getData(5, 12, 2))).click();// Click
																		// on

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(5, 12, 4, Result);

		return (title);
	}
	
	// Sub-Menus DeckLogBookLibHoldTank
	@SuppressWarnings("unused")
	public String DeckLogBookLibHoldTank(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(5, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(5, 28, 2))).click();// Click DeckLogBookLibHoldTank
		
		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(5, 28, 4, Result);

		return (title);
	}
	
	

	// Vessel Movement

	/*
	 * // PortCallsNew
	 *
	 * @SuppressWarnings("unused") public String PortCallsNew (WebDriver
	 * driver1) throws Exception { WebDriver driver = driver1;
	 *
	 * WebElement menu=driver.findElement(By.linkText(data.getData(5, 2,
	 * 2)));Thread.sleep(100); // Click On Technical menu
	 *
	 * Actions action=new Actions(driver);
	 *
	 * action.moveToElement(menu).build().perform();
	 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 *
	 * WebElement submenu= driver.findElement(By.linkText(data.getData(5, 13,2))); // Click On Admin Menu
	 *
	 * action.moveToElement(submenu).build().perform();
	 *
	 * driver.findElement(By.linkText(data.getData(5, 14, 2))).click();// Click
	 * on
	 *
	 * String title = driver.getTitle().trim();
	 *
	 * long LoagingStart = System.currentTimeMillis();
	 *
	 * List<WebElement> allLinks = driver.findElements(By.xpath("//*"));
	 *
	 * long Loadingstop = System.currentTimeMillis();
	 *
	 * double TotalTime = (Loadingstop-LoagingStart);
	 *
	 * String Result = Double.toString(TotalTime);
	 *
	 * System.out.println(driver.getTitle().trim()+ " Pageloading time is "+
	 * TotalTime + " Milisec");
	 *
	 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 * Thread.sleep(100);
	 *
	 * write_data.writedata(5,13,4,Result);
	 *
	 * return(title);
	 *
	 * }
	 */
	
	//Port Calls  New
	@SuppressWarnings("unused")
	public String PortCallsNew(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(5, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(5, 13, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.xpath(data.getData(5, 14, 2))).click();// Click Port Calls  New


		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(5, 14, 4, Result);

		return (title);
	}
	
	

	@SuppressWarnings("unused")
	public String PortCalls(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(5, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(5, 13, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(5, 15, 2))).click();// Click


		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(5, 15, 4, Result);

		return (title);
	}
	
	
	//Port Cost
	@SuppressWarnings("unused")
	public String PortCost(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(5, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(5, 13, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(5, 30, 2))).click();// Click Port Cost


		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(5, 30, 4, Result);

		return (title);
	}
	
	// Port Call History
	@SuppressWarnings("unused")
	public String PortCallHistory(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(5, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(5, 13, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(5, 31, 2))).click();// Click Port Call History
																		

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(5, 31, 4, Result);

		return (title);
	}
	
	

	@SuppressWarnings("unused")
	public String PortCallNotification(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(5, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(5, 13, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(5, 16, 2))).click();// Click
																		// on

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(5, 16, 4, Result);

		return (title);
	}
	
	@SuppressWarnings("unused")
	public String PortCalls1(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(5, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(5, 13, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.xpath(data.getData(5, 37, 2))).click();// Click


		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(5, 37, 4, Result);

		return (title);
	}

	// Sub-Menus DPLMap

	@SuppressWarnings("unused")
	public String DPLMap(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(5, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		/*
		 * WebElement submenu= driver.findElement(By.linkText(data.getData(5,
		 * 12, 2))); // Click On Admin Menu
		 *
		 * action.moveToElement(submenu).build().perform();
		 */

		driver.findElement(By.linkText(data.getData(5, 17, 2))).click();// Click


		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(5, 17, 4, Result);

		return (title);
	}

	// Sub-Menus AddVoyageNumber

	@SuppressWarnings("unused")
	public String AddVoyageNumber(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(5, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/*
		 * WebElement submenu= driver.findElement(By.linkText(data.getData(5,
		 * 12, 2))); // Click On Admin Menu
		 *
		 * action.moveToElement(submenu).build().perform();
		 */
		driver.findElement(By.linkText(data.getData(5, 18, 2))).click();// Click
																		// on

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(5, 18, 4, Result);

		return (title);

	}
	
	

	// Sub-Menus DeckLogBookThreshold

	@SuppressWarnings("unused")
	public String DeckLogBookThreshold1(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(5, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText(data.getData(5, 35, 2))).click();// Click
																		// on

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(5, 35, 4, Result);

		return (title);

	}
	
	// Sub-Menus Worklist
	@SuppressWarnings("unused")
	public String Worklist(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(5, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(5, 32, 2))).click();// Click Worklist
																		

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(5, 32, 4, Result);

		return (title);
	}
	
	// Submenu LOAnalysis
	// LOSample
	@SuppressWarnings("unused")
	public String LOSample(WebDriver driver1) throws Exception {
		Thread.sleep(100);

		WebDriver driver = driver1;

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement menu = driver.findElement(By.linkText(data.getData(5, 2, 2)));

		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(5, 33, 2))); // Click
																					// Admin

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(5, 34, 2))).click();// Click
																		
		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Thread.sleep(100);

		write_data.writedata(5, 34, 4, Result);

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

			FileUtils.copyFile(scrFile, new File("C:\\Users\\Arati\\workspace\\JibeTesting\\ScreenShot\\OperationMenus\\"+ driver.getTitle().trim() + "_" + System.currentTimeMillis() + ".jpg"));

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			driver.get(Dashboard); // if the page is not exceuted then it will
			// opne this url

		}

		return (null);

	}

}
