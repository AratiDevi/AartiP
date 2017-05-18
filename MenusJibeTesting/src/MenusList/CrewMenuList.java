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

/*
import TestingFinal.CrewAgencyFeeLibrary;
import TestingFinal.CrewCardIndex;
import TestingFinal.CrewMailSystem;
import TestingFinal.Reports;*/

public class CrewMenuList extends RW {
	@SuppressWarnings("unused")
	public String Rankcategory(WebDriver driver1) throws Exception {

		Thread.sleep(100);
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Crew menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 4, 2))).click();// Click Rank Category

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 4, 4, Result);

		return (title);
	}

	@SuppressWarnings("unused")
	public String CrewRanks(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Crew menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 5, 2))).click();// Click Crew Ranks

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 5, 4, Result);

		return (title);

	}

	@SuppressWarnings("unused")
	public String JoiningType(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Crew menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 6, 2))).click();// Click Joining Type

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 6, 4, Result);

		return (title);
	}
	
	//Document Group

	@SuppressWarnings("unused")
	public String DocumentGroup(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Crew menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 65, 2))).click();// Click Document Group

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 65, 4, Result);

		return (title);
	}
	
		
	
	@SuppressWarnings("unused")
	public String DocumentTypes(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Crew menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.xpath(data.getData(4, 7, 2))).click();// Click on Document Type
																	

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 7, 4, Result);

		return (title);
	}
	
	
	

	@SuppressWarnings("unused")
	public String CrewSignoffReason(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Crew menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 8, 2))).click();// Click Crew Signoff Reason
																		

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 8, 4, Result);

		return (title);
	}

	@SuppressWarnings("unused")
	public String TrainingTypes(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Crew menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 9, 2))).click();// Click Training Types

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 9, 4, Result);

		return (title);
	}

	@SuppressWarnings("unused")
	public String CrewWelfareLibrary(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Crew menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.xpath(data.getData(4, 10, 2))).click();// Click on Crew Welfare Library
																		

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 10, 4, Result);

		return (title);
	}

	@SuppressWarnings("unused")
	public String OnBoardStaffLimit(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Crew menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 11, 2))).click();// Click OnBoard Staff Limit

																		
		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 11, 4, Result);

		return (title);
	}
	
	//Company Seniority Reward
	
	@SuppressWarnings("unused")
	public String CompanySeniorityReward(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Crew menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 66, 2))).click();// Click Company Seniority Reward

																		
		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 66, 4, Result);

		return (title);
	}
	 //SenioritySettings
	
	@SuppressWarnings("unused")
	public String SenioritySettings(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Crew menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 67, 2))).click();// Click SenioritySettings

																		
		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 67, 4, Result);

		return (title);
	}

	@SuppressWarnings("unused")
	public String ContractType(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Crew menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 12, 2))).click();// Click Contract Type

																		
		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 12, 4, Result);

		return (title);
	}
	
	
	@SuppressWarnings("unused")
	    public String CrewRankScale(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Crew menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 61, 2))).click();// Click Crew Rank Scale

																		
		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 61, 4, Result);

		return (title);
	}
	
	

	@SuppressWarnings("unused")
	public String HandOverQuestion(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Crew menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 13, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 13, 4, Result);

		return (title);
	}

	@SuppressWarnings("unused")
	public String CrewContractPeriod(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 14, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 14, 4, Result);

		return (title);
	}

	@SuppressWarnings("unused")
	public String CashAdvanceLimit(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 15, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 15, 4, Result);

		return (title);
	}

	@SuppressWarnings("unused")
	public String Allotmentflagmailsettings(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 16, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 16, 4, Result);

		return (title);
	}
	
	//Crew Contract Templates
	
	@SuppressWarnings("unused")
	public String CrewContractTemplates(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 68, 2))).click();// Click Crew Contract Templates

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 68, 4, Result);

		return (title);
	}

	@SuppressWarnings("unused")
	public String CrewJoiningSeniority(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 17, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 17, 4, Result);

		return (title);
	}

	@SuppressWarnings("unused")
	public String DocumentTypes1(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.xpath(data.getData(4, 18, 2))).click();// Click on

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 18, 4, Result);

		return (title);
	}
	
	
	@SuppressWarnings("unused")
	public String InitializePortageBill(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Crew menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 62, 2))).click();// Click on Initialize Portage Bill

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 62, 4, Result);

		return (title);
	}

	@SuppressWarnings("unused")
	public String CrewCardApprovers(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 19, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 19, 4, Result);

		return (title);
	}
	
	
	@SuppressWarnings("unused")
	public String CrewStatusLibrary(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Crew menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 63, 2))).click();// Click Crew Status Library

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 63, 4, Result);

		return (title);
	}
	
	
	@SuppressWarnings("unused")
	public String CrewStatusMapping(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Crew menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 64, 2))).click();// Click Crew Status Mapping

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 64, 4, Result);

		return (title);
	}
	
	//LeaveWage Withhold Rule 
	
	@SuppressWarnings("unused")
	public String LeaveWageWithholdRule(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Crew menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin
		
		Thread.sleep(1000);

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.xpath(data.getData(4, 69, 2))).click();// Click LeaveWage Withhold Rule 

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 69, 4, Result);

		return (title);
	}
	
	
	//Oil Majors
	
	@SuppressWarnings("unused")
	public String OilMajors(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Crew menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 70, 2))).click();// Click Oil Majors 

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 70, 4, Result);

		return (title);
	}
	
		
		//CrewMatrixConfig
		
	@SuppressWarnings("unused")
	public String CrewMatrixConfig(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;
			
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Crew menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 71, 2))).click();// Click CrewMatrixConfig 

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 71, 4, Result);

		return (title);
	}
		
		
		//Oil Majors Rule Mapping
			
	@SuppressWarnings("unused")
	public String OilMajorsRuleMapping(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Crew menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 72, 2))).click();// Click Oil Majors Rule Mapping 

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 72, 4, Result);

		return (title);
	}
	
	
	//Oil Majors Rule Group
	@SuppressWarnings("unused")
	public String OilMajorsRuleGroup(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Crew menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 73, 2))).click();// Click  Oil Majors Rule Group 

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 73, 4, Result);

		return (title);
	}
	
	//Oil Majors Rules
	@SuppressWarnings("unused")
	public String OilMajorsRules(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Crew menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 74, 2))).click();// Click  Oil Majors Rules 

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();
			
		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 74, 4, Result);

		return (title);
	}
	
	
	//Rank Configuration
		@SuppressWarnings("unused")
		public String RankConfiguration(WebDriver driver1) throws Exception {
			WebDriver driver = driver1;

			WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
			Thread.sleep(100); // Click On Crew menu

			Actions action = new Actions(driver);

			action.moveToElement(menu).build().perform();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

			action.moveToElement(submenu).build().perform();

			driver.findElement(By.linkText(data.getData(4, 75, 2))).click();// Click  Rank Configuration 

			String title = driver.getTitle().trim();

			long LoagingStart = System.currentTimeMillis();
				
			List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

			long Loadingstop = System.currentTimeMillis();

			double TotalTime = (Loadingstop - LoagingStart);

			String Result = Double.toString(TotalTime);

			System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(100);

			write_data.writedata(4, 75, 4, Result);

			return (title);
		}
		
		
	//Crew Details Configuration
	@SuppressWarnings("unused")
	public String CrewDetailsConfiguration(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Crew menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 76, 2))).click();// Click  Crew Details Configuration 

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();
						
		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 76, 4, Result);

		return (title);
	}
	
	//Union And Union Book
		@SuppressWarnings("unused")
		public String UnionAndUnionBook(WebDriver driver1) throws Exception {
			WebDriver driver = driver1;

			WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
			Thread.sleep(100); // Click On Crew menu

			Actions action = new Actions(driver);

			action.moveToElement(menu).build().perform();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

			action.moveToElement(submenu).build().perform();

			driver.findElement(By.linkText(data.getData(4, 77, 2))).click();// Click  Union And Union Book 

			String title = driver.getTitle().trim();

			long LoagingStart = System.currentTimeMillis();
							
			List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

			long Loadingstop = System.currentTimeMillis();

			double TotalTime = (Loadingstop - LoagingStart);

			String Result = Double.toString(TotalTime);

			System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(100);

			write_data.writedata(4, 77, 4, Result);

			return (title);
		}
	
		
 //Schools
	@SuppressWarnings("unused")
	public String Schools(WebDriver driver1) throws Exception {
	    WebDriver driver = driver1;

	    WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
	    Thread.sleep(100); // Click On Crew menu

	    Actions action = new Actions(driver);

	    action.moveToElement(menu).build().perform();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 
	    WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

	    action.moveToElement(submenu).build().perform();

        driver.findElement(By.linkText(data.getData(4, 78, 2))).click();// Click  Schools 

	    String title = driver.getTitle().trim();

	    long LoagingStart = System.currentTimeMillis();
									
	    List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 78, 4, Result);

		return (title);
	}
	
	//Race And Veteran Status
		@SuppressWarnings("unused")
		public String RaceAndVeteranStatus(WebDriver driver1) throws Exception {
		    WebDriver driver = driver1;

		    WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		    Thread.sleep(100); // Click On Crew menu

		    Actions action = new Actions(driver);

		    action.moveToElement(menu).build().perform();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 
		    WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		    action.moveToElement(submenu).build().perform();

	        driver.findElement(By.linkText(data.getData(4, 79, 2))).click();// Click  Race And Veteran Status 

		    String title = driver.getTitle().trim();

		    long LoagingStart = System.currentTimeMillis();
										
		    List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

			long Loadingstop = System.currentTimeMillis();

			double TotalTime = (Loadingstop - LoagingStart);

			String Result = Double.toString(TotalTime);

			System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(100);

			write_data.writedata(4, 79, 4, Result);

			return (title);
		}
	
	
			

	// Index

	@SuppressWarnings("unused")
	public String CrewIndex(WebDriver driver1) throws Exception {

		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(4, 20, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 20, 4, Result);

		return (title);

	}

	@SuppressWarnings("unused")
	public String AddNewCrew(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(4, 21, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 21, 4, Result);

		return (title);
	}

	// Interview

	@SuppressWarnings("unused")
	public String CreateInterviewSheet(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 22, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 23, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 23, 4, Result);

		return (title);

	}

	@SuppressWarnings("unused")
	public String CategoriesandGrades(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 22, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 24, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 24, 4, Result);

		return (title);

	}

	@SuppressWarnings("unused")
	public String InterviewQuestionBank(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 22, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 25, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 25, 4, Result);

		return (title);

	}

	// plan Interview

	@SuppressWarnings("unused")
	public String PlanInterview(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(4, 26, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 26, 4, Result);

		return (title);

	}
	
	
	//Crew Planning

		@SuppressWarnings("unused")
		public String CrewPlanning(WebDriver driver1) throws Exception {
			WebDriver driver = driver1;

			WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
			Thread.sleep(100); // Click On Crew menu

			Actions action = new Actions(driver);

			action.moveToElement(menu).build().perform();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			driver.findElement(By.linkText(data.getData(4, 81, 2))).click();// Click Crew Planning

			String title = driver.getTitle().trim();

			long LoagingStart = System.currentTimeMillis();

			List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

			long Loadingstop = System.currentTimeMillis();

			double TotalTime = (Loadingstop - LoagingStart);

			String Result = Double.toString(TotalTime);

			System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(100);

			write_data.writedata(4, 81, 4, Result);

			return (title);

		}

	@SuppressWarnings("unused")
	public String EventPlanner(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(4, 27, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 27, 4, Result);

		return (title);

	}

	@SuppressWarnings("unused")
	public String EventIndex(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(4, 28, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 28, 4, Result);

		return (title);

	}

	// Crew

	@SuppressWarnings("unused")
	public String EvaluationSchedules(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 29, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 30, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 30, 4, Result);

		return (title);

	}

	@SuppressWarnings("unused")
	public String EvaluationPlanning(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 29, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 31, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 31, 4, Result);

		return (title);
	}

	@SuppressWarnings("unused")
	public String Library(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 29, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 32, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 32, 4, Result);

		return (title);
	}

	@SuppressWarnings("unused")
	public String QuestionBank(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 29, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 33, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 33, 4, Result);

		return (title);
	}
	
	//EvaluationConfiguration
	
	@SuppressWarnings("unused")
	public String EvaluationConfiguration(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Crew menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 29, 2))); // Click Crew Evaluation

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 84, 2))).click();// Click Evaluation Configuration

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 84, 4, Result);

		return (title);
	}
	
	
	//Evaluation Snippet Settings
	
		@SuppressWarnings("unused")
		public String EvaluationSnippetSettings(WebDriver driver1) throws Exception {
			WebDriver driver = driver1;

			WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
			Thread.sleep(100); // Click On Crew menu

			Actions action = new Actions(driver);

			action.moveToElement(menu).build().perform();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			WebElement submenu = driver.findElement(By.linkText(data.getData(4, 29, 2))); // Click Crew Evaluation

			action.moveToElement(submenu).build().perform();

			driver.findElement(By.linkText(data.getData(4, 85, 2))).click();// Click Evaluation Snippet Settings

			String title = driver.getTitle().trim();

			long LoagingStart = System.currentTimeMillis();

			List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

			long Loadingstop = System.currentTimeMillis();

			double TotalTime = (Loadingstop - LoagingStart);

			String Result = Double.toString(TotalTime);

			System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(100);

			write_data.writedata(4, 85, 4, Result);

			return (title);
		}
	

	// Crew Accounts
	@SuppressWarnings("unused")
	public String PortageBill(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 34, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 35, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 35, 4, Result);

		return (title);

	}

	@SuppressWarnings("unused")
	public String SalarybyWireTransfer(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 34, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 36, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 36, 4, Result);

		return (title);

	}

	@SuppressWarnings("unused")
	public String CTMIndex(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 34, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 37, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 37, 4, Result);

		return (title);

	}

	@SuppressWarnings("unused")
	public String VesselMinumumCTM(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 34, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 38, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 38, 4, Result);

		return (title);

	}

	@SuppressWarnings("unused")
	public String RankWageContract(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 34, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 39, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 39, 4, Result);

		return (title);

	}

	@SuppressWarnings("unused")
	public String eCardKitty(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 34, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 40, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 40, 4, Result);

		return (title);

	}

	@SuppressWarnings("unused")
	public String eCardRequest(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 34, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 41, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 41, 4, Result);

		return (title);

	}

	@SuppressWarnings("unused")
	public String eCardReport(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 34, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 42, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 42, 4, Result);

		return (title);

	}

	@SuppressWarnings("unused")
	public String CrewWelfareLibrary1(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 34, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 43, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 43, 4, Result);

		return (title);

	}

	@SuppressWarnings("unused")
	public String ApproveRejoiningBonus(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 34, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 44, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 44, 4, Result);

		return (title);

	}

	@SuppressWarnings("unused")
	public String CompanySeniorityReward1(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 34, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 45, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 45, 4, Result);

		return (title);

	}

	// CrewAgencyFee

	@SuppressWarnings("unused")
	public String CrewAgencyFeeLibrary(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 46, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 47, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 47, 4, Result);

		return (title);
	}

	@SuppressWarnings("unused")
	public String CrewAgencyFeeReport(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 46, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 48, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 48, 4, Result);

		return (title);
	}

	@SuppressWarnings("unused")
	public String CrewCardIndex(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Crew menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(4, 49, 2))).click();// Click Crew Card Index

		
		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 49, 4, Result);

		return (title);
	}

	@SuppressWarnings("unused")
	public String CrewListHistory(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(4, 50, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 50, 4, Result);

		return (title);
	}

	// CrewMail Index

	@SuppressWarnings("unused")
	public String CrewMailSystem(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 51, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 52, 2))).click();// Click CrewMail Index

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 52, 4, Result);

		return (title);
	}

	@SuppressWarnings("unused")
	public String CrewMailAdmin(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 51, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 53, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 53, 4, Result);

		return (title);
	}

	@SuppressWarnings("unused")
	public String CrewFeedbackViewer(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 54, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 55, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 55, 4, Result);

		return (title);
	}

	@SuppressWarnings("unused")
	public String CrewMedicalHistoryViewer(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 54, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 56, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 56, 4, Result);

		return (title);
	}
	
	
	@SuppressWarnings("unused")
	public String CrewMissingDataReport(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 54, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 57, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 57, 4, Result);

		return (title);
	}
	
	
	//Crew Retention Rate
	@SuppressWarnings("unused")
	public String CrewRetentionRate(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 54, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(4, 58, 2))).click();// Click Crew Retention Rate

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 58, 4, Result);

		return (title);
	}
	
	// HandOver Reports

		@SuppressWarnings("unused")
		public String HandOverReports(WebDriver driver1) throws Exception {

			WebDriver driver = driver1;

			WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
			Thread.sleep(100); // Click On Technical menu

			Actions action = new Actions(driver);

			action.moveToElement(menu).build().perform();

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			driver.findElement(By.linkText(data.getData(4, 87, 2))).click();// Click HandOver Reports

			String title = driver.getTitle().trim();

			long LoagingStart = System.currentTimeMillis();

			List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

			long Loadingstop = System.currentTimeMillis();

			double TotalTime = (Loadingstop - LoagingStart);

			String Result = Double.toString(TotalTime);

			System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(100);

			write_data.writedata(4, 87, 4, Result);

			return (title);

		}
	
	// Crew admin

	@SuppressWarnings("unused")
	public String Crewadmin(WebDriver driver1) throws Exception {

		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
	    Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(4, 88, 2))).click();// Click Crew admin

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 88, 4, Result);

		return (title);

	}
		
	// Crew Matrix

	@SuppressWarnings("unused")
	public String CrewMatrix(WebDriver driver1) throws Exception {

		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));
	    Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(4, 89, 2))).click();// Click Crew Matrix

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 89, 4, Result);

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

			FileUtils.copyFile(scrFile, new File("C:\\Users\\Arati\\workspace\\JibeTesting\\ScreenShot\\CrewMenus\\"+ driver.getTitle().trim() + "_" + System.currentTimeMillis() + ".jpg"));


			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			driver.get(Dashboard); // if the page is not exceuted then it will
									// opne this url
		}

		return (null);

	}

}
