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

/*import CommanFunction.ExcelRead;
import CommanFunction.WriteExcel;*/

public class AdminMenuList extends RW {

	@SuppressWarnings("unused")
	public String CreateUser(WebDriver driver1) throws Exception {

		Thread.sleep(100);

		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
		Thread.sleep(100);// Click On Admin Link menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(3, 3, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(3, 4, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		write_data.writedata(3, 4, 4, Result);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		return (title);
	}

	@SuppressWarnings("unused")
	public String UserList(WebDriver driver1) throws Exception {

		WebDriver driver = driver1;

	WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
		Thread.sleep(100);// Click On Admin Link menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(3, 3, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(3, 5, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		write_data.writedata(3, 5, 4, Result);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		return (title);

	}
	
	
	@SuppressWarnings("unused")
	public String UserVesselAssignment(WebDriver driver1) throws Exception {

		WebDriver driver = driver1;

	WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
		Thread.sleep(100);// Click On Admin Link menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(3, 3, 2))); // Click User Management

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(3, 57, 2))).click();// Click User Vessel Assignment

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		write_data.writedata(3, 57, 4, Result);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		return (title);

	}

	@SuppressWarnings("unused")
	public String MenuManagement(WebDriver driver1) throws Exception {
		Thread.sleep(100);

		WebDriver driver = driver1;

	WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
		Thread.sleep(100);// Click On Admin Link menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(3, 6, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(3, 7, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		write_data.writedata(3, 7, 4, Result);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		return (title);

	}

	@SuppressWarnings("unused")
	public String UserMenuRelationship(WebDriver driver1) throws Exception {

		WebDriver driver = driver1;

	WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
		Thread.sleep(100);// Click On Admin Link menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(3, 6, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(3, 8, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		write_data.writedata(3, 8, 4, Result);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		return (title);

	}
	
	
	@SuppressWarnings("unused")
	public String AsyncUserMenuAssignment(WebDriver driver1) throws Exception {

		WebDriver driver = driver1;

	WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
		Thread.sleep(100);// Click On Admin Link menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(3, 6, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(3, 60, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		write_data.writedata(3, 60, 4, Result);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		return (title);

	}
	
	//Access Rights Changes
	
	@SuppressWarnings("unused")
	public String AccessRightsChanges(WebDriver driver1) throws Exception {

		WebDriver driver = driver1;

	    WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
		Thread.sleep(100);// Click On Admin Link menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(3, 6, 2))); // Click Menu Management

		action.moveToElement(submenu).build().perform();
		Thread.sleep(1000);

		driver.findElement(By.linkText(data.getData(3, 61, 2))).click();// Click Access Rights Changes

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		write_data.writedata(3, 61, 4, Result);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		return (title);

	}

	@SuppressWarnings("unused")
	public String Company(WebDriver driver1) throws Exception {

		WebDriver driver = driver1;

	WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
		Thread.sleep(100);// Click On Admin Link menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(3, 9, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(3, 10, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		write_data.writedata(3, 10, 4, Result);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		return (title);
	}

	@SuppressWarnings("unused")
	public String Fleet(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

	WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
		Thread.sleep(100);// Click On Admin Link menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(3, 9, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(3, 11, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		write_data.writedata(3, 11, 4, Result);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		return (title);
	}

	@SuppressWarnings("unused")
	public String Vessels(WebDriver driver1) throws Exception {

		WebDriver driver = driver1;

	WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
		Thread.sleep(100);// Click On Admin Link menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		WebElement submenu = driver.findElement(By.linkText(data.getData(3, 9, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(3, 12, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		write_data.writedata(3, 12, 4, Result);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		return (title);

	}

	@SuppressWarnings("unused")
	public String Country(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

	WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
		Thread.sleep(100);// Click On Admin Link menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		WebElement submenu = driver.findElement(By.linkText(data.getData(3, 9, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(3, 13, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		write_data.writedata(3, 13, 4, Result);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		return (title);

	}

	@SuppressWarnings("unused")
	public String Port(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

	WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
		Thread.sleep(100);// Click On Admin Link menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(3, 9, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(3, 14, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		write_data.writedata(3, 14, 4, Result);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		return (title);

	}

	@SuppressWarnings("unused")
	public String Airport(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

	WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
		Thread.sleep(100);// Click On Admin Link menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(3, 9, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(3, 15, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		write_data.writedata(3, 15, 4, Result);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		return (title);

	}

	@SuppressWarnings("unused")
	public String Currency(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

	WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
		Thread.sleep(100);// Click On Admin Link menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(3, 9, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(3, 16, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		write_data.writedata(3, 16, 4, Result);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		return (title);

	}

	@SuppressWarnings("unused")
	public String OfficeDepartment(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

	WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
		Thread.sleep(100);// Click On Admin Link menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(3, 9, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(3, 17, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		write_data.writedata(3, 17, 4, Result);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		return (title);
	}

	@SuppressWarnings("unused")
	public String ShipDepartment(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

	WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
		Thread.sleep(100);// Click On Admin Link menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(3, 9, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(3, 18, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		write_data.writedata(3, 18, 4, Result);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		return (title);

	}

	@SuppressWarnings("unused")
	public String VesselFlag(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

	WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
		Thread.sleep(100);// Click On Admin Link menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(3, 9, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(3, 19, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		write_data.writedata(3, 19, 4, Result);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		return (title);
	}

	@SuppressWarnings("unused")
	public String TimeZones(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

	WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
		Thread.sleep(100);// Click On Admin Link menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(3, 9, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(3, 20, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		write_data.writedata(3, 20, 4, Result);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		return (title);
	}

	@SuppressWarnings("unused")
	public String VesselType(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

	WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
		Thread.sleep(100);// Click On Admin Link menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(3, 9, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(3, 21, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		write_data.writedata(3, 21, 4, Result);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		return (title);

	}
	
	
	//Trading Zones
	@SuppressWarnings("unused")
	public String TradingZones(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

	WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
		Thread.sleep(100);// Click On Admin Link menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(3, 9, 2))); // Click Library

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(3, 64, 2))).click();// Click Trading Zones

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		write_data.writedata(3, 64, 4, Result);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		return (title);

	}
	
	
	//Vessel Videos
		@SuppressWarnings("unused")
		public String VesselVideos(WebDriver driver1) throws Exception {
			WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
			Thread.sleep(100);// Click On Admin Link menu

			Actions action = new Actions(driver);

			action.moveToElement(menu).build().perform();

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			WebElement submenu = driver.findElement(By.linkText(data.getData(3, 9, 2))); // Click Library

			action.moveToElement(submenu).build().perform();

			driver.findElement(By.linkText(data.getData(3, 65, 2))).click();// Click Vessel Videos

			String title = driver.getTitle().trim();

			long LoagingStart = System.currentTimeMillis();

			List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

			long Loadingstop = System.currentTimeMillis();

			double TotalTime = (Loadingstop - LoagingStart);

			String Result = Double.toString(TotalTime);

			System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

			write_data.writedata(3, 65, 4, Result);

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(100);

			return (title);

		}

	@SuppressWarnings("unused")
	public String BunkerTestingLab(WebDriver driver1) throws Exception {

		WebDriver driver = driver1;

	WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
		Thread.sleep(100);// Click On Admin Link menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(3, 9, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(3, 22, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		write_data.writedata(3, 22, 4, Result);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		return (title);
	}
	
	
	//Vessel EEDI
	@SuppressWarnings("unused")
	public String VesselEEDI(WebDriver driver1) throws Exception {

		WebDriver driver = driver1;

	WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
		Thread.sleep(100);// Click On Admin Link menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(3, 9, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(3, 66, 2))).click();// Click Vessel EEDI

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		write_data.writedata(3, 66, 4, Result);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		return (title);
	}
	
	//Vessel User
		@SuppressWarnings("unused")
		public String VesselUser(WebDriver driver1) throws Exception {

			WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
			Thread.sleep(100);// Click On Admin Link menu

			Actions action = new Actions(driver);

			action.moveToElement(menu).build().perform();

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			WebElement submenu = driver.findElement(By.linkText(data.getData(3, 9, 2))); // Click

			action.moveToElement(submenu).build().perform();

			driver.findElement(By.linkText(data.getData(3, 67, 2))).click();// Click Vessel User

			String title = driver.getTitle().trim();

			long LoagingStart = System.currentTimeMillis();

			List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

			long Loadingstop = System.currentTimeMillis();

			double TotalTime = (Loadingstop - LoagingStart);

			String Result = Double.toString(TotalTime);

			System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

			write_data.writedata(3, 67, 4, Result);

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(100);

			return (title);
		}

	@SuppressWarnings("unused")
	public String AlertsandNotifications(WebDriver driver1) throws Exception {

		WebDriver driver = driver1;

	WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
		Thread.sleep(100);// Click On Admin Link menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(3, 23, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		write_data.writedata(3, 23, 4, Result);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		return (title);
	}

	@SuppressWarnings("unused")
	public String UserSnippetAccess(WebDriver driver1) throws Exception {

		WebDriver driver = driver1;

	WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
		Thread.sleep(100);// Click On Admin Link menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(3, 24, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		write_data.writedata(3, 24, 4, Result);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		return (title);
	}

	// Onboard sub menu

	@SuppressWarnings("unused")
	public String MenuAssignment(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

	WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
		Thread.sleep(100);// Click On Admin Link menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(3, 25, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(3, 26, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		write_data.writedata(3, 26, 4, Result);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		return (title);

	}

	@SuppressWarnings("unused")
	public String ProjectMgmt(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

	WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
		Thread.sleep(100);// Click On Admin Link menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		WebElement submenu = driver.findElement(By.linkText(data.getData(3, 25, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(3, 27, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		write_data.writedata(3, 27, 4, Result);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		return (title);

	}

	@SuppressWarnings("unused")
	public String NavigationProjectMgmt(WebDriver driver1) throws Exception {

		WebDriver driver = driver1;

	WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
		Thread.sleep(100);// Click On Admin Link menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		WebElement submenu = driver.findElement(By.linkText(data.getData(3, 25, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(3, 28, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		write_data.writedata(3, 28, 4, Result);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		return (title);

	}

	@SuppressWarnings("unused")
	public String LicenseKeyGeneration(WebDriver driver1) throws Exception {

		WebDriver driver = driver1;

	WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
		Thread.sleep(100);// Click On Admin Link menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(3, 25, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(3, 29, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		write_data.writedata(3, 29, 4, Result);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		return (title);

	}

	@SuppressWarnings("unused")
	public String HelpFileSettings(WebDriver driver1) throws Exception {

		WebDriver driver = driver1;

	WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
		Thread.sleep(100);// Click On Admin Link menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(3, 25, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(3, 30, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		write_data.writedata(3, 30, 4, Result);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		return (title);

	}
	
	// office setting menus

	/*	@SuppressWarnings("unused")
		public String SystemParameters(WebDriver driver1) throws Exception {
			WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
			Thread.sleep(100);// Click On Admin Link menu

			Actions action = new Actions(driver);

			action.moveToElement(menu).build().perform();

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			WebElement submenu = driver.findElement(By.linkText(data.getData(3, 31, 2))); // Click

			action.moveToElement(submenu).build().perform();

			driver.findElement(By.linkText(data.getData(3, 42, 2))).click();// Click SystemParameters

			String title = driver.getTitle().trim();

			long LoagingStart = System.currentTimeMillis();

			List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

			long Loadingstop = System.currentTimeMillis();

			double TotalTime = (Loadingstop - LoagingStart);

			String Result = Double.toString(TotalTime);

			System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

			write_data.writedata(3, 42, 4, Result);

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(100);

			return (title);

		}*/
	
	//Dashboard Snippets
	@SuppressWarnings("unused")
	public String DashboardSnippets(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

	WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
		Thread.sleep(100);// Click On Admin Link menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(3, 31, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(3, 43, 2))).click();// Click Dashboard Snippets

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		write_data.writedata(3, 43, 4, Result);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		return (title);

	}
	
	
	//User Type
		@SuppressWarnings("unused")
		public String UserType(WebDriver driver1) throws Exception {
			WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
			Thread.sleep(100);// Click On Admin Link menu

			Actions action = new Actions(driver);

			action.moveToElement(menu).build().perform();

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			WebElement submenu = driver.findElement(By.linkText(data.getData(3, 31, 2))); // Click

			action.moveToElement(submenu).build().perform();

			driver.findElement(By.linkText(data.getData(3, 44, 2))).click();// Click User Type

			String title = driver.getTitle().trim();

			long LoagingStart = System.currentTimeMillis();

			List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

			long Loadingstop = System.currentTimeMillis();

			double TotalTime = (Loadingstop - LoagingStart);

			String Result = Double.toString(TotalTime);

			System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

			write_data.writedata(3, 44, 4, Result);

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(100);

			return (title);

		}
		
		
	// Company Relationships
	@SuppressWarnings("unused")
	public String CompanyRelationships(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
		Thread.sleep(100);// Click On Admin Link menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(3, 31, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(3, 45, 2))).click();// Click
																		// Company
																		// Relationships

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		write_data.writedata(3, 45, 4, Result);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		return (title);

	}
	
	
	// Upload File Size
		@SuppressWarnings("unused")
		public String UploadFileSize(WebDriver driver1) throws Exception {
			WebDriver driver = driver1;

			WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
			Thread.sleep(100);// Click On Admin Link menu

			Actions action = new Actions(driver);

			action.moveToElement(menu).build().perform();

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			WebElement submenu = driver.findElement(By.linkText(data.getData(3, 31, 2))); // Click

			action.moveToElement(submenu).build().perform();

			driver.findElement(By.linkText(data.getData(3, 46, 2))).click();// Click Upload File Size
																			

			String title = driver.getTitle().trim();

			long LoagingStart = System.currentTimeMillis();

			List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

			long Loadingstop = System.currentTimeMillis();

			double TotalTime = (Loadingstop - LoagingStart);

			String Result = Double.toString(TotalTime);

			System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

			write_data.writedata(3, 46, 4, Result);

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(100);

			return (title);

		}
		
		
	// Mail Action Settings
	@SuppressWarnings("unused")
	public String MailActionSettings(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
		Thread.sleep(100);// Click On Admin Link menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(3, 31, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(3, 47, 2))).click();// Click Mail Action Settings
																		

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		write_data.writedata(3, 47, 4, Result);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		return (title);

	}
	
	// Office Sync Settings
	@SuppressWarnings("unused")
	public String OfficeSyncSettings(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
		Thread.sleep(100);// Click On Admin Link menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(3, 31, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(3, 48, 2))).click();// Click
																		// Office
																		// Sync
																		// Settings

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		write_data.writedata(3, 48, 4, Result);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		return (title);

	}
	
	
	// Office Attachment Rule
	@SuppressWarnings("unused")
	public String OfficeAttachmentRule(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
		Thread.sleep(100);// Click On Admin Link menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(3, 31, 2))); // Click Office Settings

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(3, 49, 2))).click();// Click
																		// Office
																		// Attachment
																		// Rule

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		write_data.writedata(3, 49, 4, Result);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		return (title);

	}
	
	// Exception List
	@SuppressWarnings("unused")
	public String ExceptionList(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
		Thread.sleep(100);// Click On Admin Link menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(3, 31, 2))); // Click

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(3, 50, 2))).click();// Click Exception List
		//driver.findElement(By.xpath(".//*[@id='nav']/li[2]/ul/li[7]/ul/li[9]/a/span")).click();																

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		write_data.writedata(3, 50, 4, Result);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		return (title);

	}

	
	
	
	// Crew Settings
		@SuppressWarnings("unused")
		public String CrewSettings(WebDriver driver1) throws Exception {
			WebDriver driver = driver1;

			WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
			Thread.sleep(100);// Click On Admin Link menu

			Actions action = new Actions(driver);

			action.moveToElement(menu).build().perform();

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			WebElement submenu = driver.findElement(By.linkText(data.getData(3, 31, 2))); // Click

			action.moveToElement(submenu).build().perform();

			driver.findElement(By.linkText(data.getData(3, 51, 2))).click();// Click
																			// Crew Settings

			String title = driver.getTitle().trim();

			long LoagingStart = System.currentTimeMillis();

			List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

			long Loadingstop = System.currentTimeMillis();

			double TotalTime = (Loadingstop - LoagingStart);

			String Result = Double.toString(TotalTime);

			System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

			write_data.writedata(3, 51, 4, Result);

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(100);

			return (title);

		}
		
		
		
			
	
	
	
	// office setting menus

	@SuppressWarnings("unused")
	public String SalaryStructure(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

	WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
		Thread.sleep(100);// Click On Admin Link menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(3, 31, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(3, 32, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		write_data.writedata(3, 32, 4, Result);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		return (title);

	}
	
	// Vessel Attachment Rule
	@SuppressWarnings("unused")
	public String VesselAttachmentRule(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
		Thread.sleep(100);// Click On Admin Link menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(3, 31, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(3, 52, 2))).click();// Click Vessel Attachment Rule
		

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		write_data.writedata(3, 52, 4, Result);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		return (title);

	}

	@SuppressWarnings("unused")
	public String CrewJoiningTypes(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

	WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
		Thread.sleep(100);// Click On Admin Link menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(3, 31, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(3, 33, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		write_data.writedata(3, 33, 4, Result);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		return (title);

	}

	@SuppressWarnings("unused")
	public String StaffRemarkCategory(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

	WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
		Thread.sleep(100);// Click On Admin Link menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(3, 31, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(3, 34, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		write_data.writedata(3, 34, 4, Result);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		return (title);

	}

	@SuppressWarnings("unused")
	public String ApprovalType(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

	WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
		Thread.sleep(100);// Click On Admin Link menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(3, 31, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(3, 35, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		write_data.writedata(3, 35, 4, Result);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		return (title);

	}

	@SuppressWarnings("unused")
	public String ApprovalGroup(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

	WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
		Thread.sleep(100);// Click On Admin Link menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(3, 31, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(3, 36, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		write_data.writedata(3, 36, 4, Result);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		return (title);
	}

	@SuppressWarnings("unused")
	public String ApprovalLimit(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

	WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
		Thread.sleep(100);// Click On Admin Link menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(3, 31, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(3, 37, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		write_data.writedata(3, 37, 4, Result);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		return (title);

	}

	@SuppressWarnings("unused")
	public String Department(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

	WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
		Thread.sleep(100);// Click On Admin Link menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(3, 31, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(3, 38, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		write_data.writedata(3, 38, 4, Result);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		return (title);
	}

	@SuppressWarnings("unused")
	public String MenuHelpSettings(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

	WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
		Thread.sleep(100);// Click On Admin Link menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(3, 31, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(3, 39, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		write_data.writedata(3, 39, 4, Result);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		return (title);
	}
	
	@SuppressWarnings("unused")
	public String TechnicalSettings(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

	WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
		Thread.sleep(100);// Click On Admin Link menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(3, 31, 2))); // Click

		action.moveToElement(submenu).build().perform();
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath(".//*[@id='nav']/li[2]/ul/li[7]/ul/li[20]/a/span"));

		driver.findElement(By.xpath(data.getData(3, 40, 2))).click();// Click TechnicalSettings

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		write_data.writedata(3, 40, 4, Result);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		return (title);
	}

	
	
	//User Vessel Assignment1
	@SuppressWarnings("unused")
	public String UserVesselAssignment1(WebDriver driver1) throws Exception {

		WebDriver driver = driver1;

	WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
		Thread.sleep(100);// Click On Admin Link menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(3, 69, 2))).click();// Click User Vessel Assignment1

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		write_data.writedata(3, 69, 4, Result);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		return (title);
	}
	
	
	//Access Rights Report
	@SuppressWarnings("unused")
	public String AccessRightsReport(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

	WebElement menu = driver.findElement(By.xpath(data.getData(3, 2, 2)));
		Thread.sleep(100);// Click On Admin Link menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(3, 70, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(3, 71, 2))).click();// Click Access Rights Report

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		write_data.writedata(3, 71, 4, Result);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);
		
	    return (title);
       
	}
	

	// Screen Shot Function

	public String SShot(String actual1, String title1, WebDriver driver1) throws IOException {

		String actual = actual1;
		String title = title1;
		WebDriver driver = driver1;

		if (title.contentEquals(actual)) {
			System.out.println(title + " page is open.\n");

		} else {

			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(scrFile, new File("C:\\Users\\Arati\\workspace\\JibeTesting\\ScreenShot\\AdminMenus\\"+ driver.getTitle().trim() + "_" + System.currentTimeMillis() + ".jpg"));

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			driver.get(Dashboard); // if the page is not exceuted then it will
			// opne this url
		}

		return (null);

	}

}
