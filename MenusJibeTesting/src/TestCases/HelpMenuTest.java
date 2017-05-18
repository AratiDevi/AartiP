package TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import MenusList.HelpMenuList;

public class HelpMenuTest extends MainTest
{
	
	HelpMenuList Hml =new HelpMenuList();
	
	
	// MainMenus	HelpCenter	
	/*	//Sub-Menus	SupportDesk
	@Test(groups="Help",priority=115)
	 public void SupportDesk() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Hml.SupportDesk(driver);	
		   
		  String ExpectedTitle=data.getData(11,3,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Hml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }	*/
	
	
	
	
	//Sub-Menus	TrainingVideos
	@Test(groups="Help",priority=288,dependsOnMethods = { "eForm" })
	 public void Databuilding() throws Exception
	 {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Hml.Databuilding(driver);	
			   
		  String ExpectedTitle=data.getData(12,7,3).trim(); // It will taking the Expected Title name from the excel sheet.
				
			 String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
				
			 Hml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
				
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
				
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
				
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
  }
	
	//Sub-Menus	TrainingVideos
	@Test(groups="Help",priority=289,dependsOnMethods = { "eForm" })
	public void SupportDesk555() throws Exception
	 {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Hml.SupportDesk555(driver);	
				   
			 String ExpectedTitle=data.getData(12,8,3).trim(); // It will taking the Expected Title name from the excel sheet.
					
			 String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
					
			 Hml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
					
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
					
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
					
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
		
		//Sub-Menus	TrainingVideos
	@Test(groups="Help",priority=290)
	 public void TrainingVideos() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Hml.TrainingVideos(driver);	
		   
		  String ExpectedTitle=data.getData(12,4,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Hml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
		//Sub-Menus	FAQ
	@Test(groups="Help",priority=291)
	 public void FAQ() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Hml.FAQ(driver);	
		   
		  String ExpectedTitle=data.getData(12,5,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Hml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
		//Sub-Menus	FAQTopic
	@Test(groups="Help",priority=292)
	 public void FAQTopic() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Hml.FAQTopic(driver);	
		   
		  String ExpectedTitle=data.getData(12,6,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Hml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
		  
		  Thread.sleep(1000);
			
		 //driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
}
