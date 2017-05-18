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

public class TravelMenuList extends RW {

	// Travel

	// Admin link

	@SuppressWarnings("unused")
	public String TravelQtnUserAssignment(WebDriver driver1) throws Exception {
		Thread.sleep(100);
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(9, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(9, 3, 2))); // Click
		Thread.sleep(100);

		action.moveToElement(submenu).build().perform();
		Thread.sleep(100);

		driver.findElement(By.linkText(data.getData(9, 4, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(9, 4, 4, Result);

		return (title);
	}
	// New Travel Request

	@SuppressWarnings("unused")
	public String NewTravelRequest(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(9, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		/*
		 * WebElement submenu= driver.findElement(By.linkText(data.getData(9, 3,
		 * 2))); // Click On Admin Menu
		 *
		 * action.moveToElement(submenu).build().perform();
		 */

		driver.findElement(By.linkText(data.getData(9, 5, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(9, 5, 4, Result);

		return (title);
	}

	// Travel Request Index

	@SuppressWarnings("unused")
	public String TravelRequestIndex(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(9, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		/*
		 * WebElement submenu= driver.findElement(By.linkText(data.getData(9, 3,
		 * 2))); // Click On Admin Menu
		 *
		 * action.moveToElement(submenu).build().perform();
		 */

		driver.findElement(By.linkText(data.getData(9, 6, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(9, 6, 4, Result);

		return (title);
	}

	// Refund List

	@SuppressWarnings("unused")
	public String RefundList(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(9, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		/*
		 * WebElement submenu= driver.findElement(By.linkText(data.getData(9, 3,
		 * 2))); // Click On Admin Menu
		 *
		 * action.moveToElement(submenu).build().perform();
		 */

		driver.findElement(By.linkText(data.getData(9, 7, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(9, 7, 4, Result);

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

			FileUtils.copyFile(scrFile, new File("C:\\Users\\Arati\\workspace\\JibeTesting\\ScreenShot\\TravelMenus\\"+ driver.getTitle().trim() + "_" + System.currentTimeMillis() + ".jpg"));


			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			driver.get(Dashboard); // if the page is not exceuted then it will
			// opne this url

		}

		return (null);

	}

}
