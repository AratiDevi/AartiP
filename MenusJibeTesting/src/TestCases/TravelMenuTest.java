package TestCases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import MenusList.TravelMenuList;

public class TravelMenuTest extends MainTest
{
	TravelMenuList Tml= new TravelMenuList();
	//Travel
				
	@Test(groups="Travel_Menu",priority=152)
	 public void TravelQtnUserAssignment() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Tml.TravelQtnUserAssignment(driver);	
		   
		  String ExpectedTitle=data.getData(9,4,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Tml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
//		New Travel Request
	 	
		
		@Test(groups="Travel_Menu",priority=153)
		 public void NewTravelRequest() throws Exception
		  {
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

			Tml.NewTravelRequest(driver);	
			   
			  String ExpectedTitle=data.getData(9,5,3).trim(); // It will taking the Expected Title name from the excel sheet.
				
			  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
				
				Tml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
				
			// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
				
				Assert.assertEquals(ExpectedTitle, ActuleTitle);
				
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
		  }
	//  Travel Request Index
	 	
	 		
	@Test(groups="Travel_Menu",priority=154)
	 public void TravelRequestIndex() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Tml.TravelRequestIndex(driver);	
		   
		  String ExpectedTitle=data.getData(9,6,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Tml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
//		Refund List
	
	@Test(groups="Travel_Menu",priority=155)
	 public void RefundList() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Tml.RefundList(driver);	
		   
		  String ExpectedTitle=data.getData(9,7,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Tml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	 
	 	
	
}
