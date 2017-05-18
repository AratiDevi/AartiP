package TestCases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import MenusList.ReportsMenuList;


public class ReportsMenuTest extends MainTest{
	ReportsMenuList Tech =new ReportsMenuList();
	
	
	  @Test(priority=0)
	  public void PMSOverdue() throws Exception
	  
	  {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

		  Tech.PMSOverdue(driver);	
		   
		  String ExpectedTitle=data.getData(8,54,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Tech.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
		  Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
	  }
	  
	  @Test(priority=1)
	  public void NearMisses() throws Exception
	  
	  {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

		  Tech.NearMisses(driver);	
		   
		  String ExpectedTitle=data.getData(8,55,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Tech.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
		  Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
	  }
	  
	  @Test(priority=2)
	  public void IncidentsPersonnel() throws Exception
	  
	  {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

		  Tech.IncidentsPersonnel(driver);	
		   
		  String ExpectedTitle=data.getData(8,56,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Tech.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
		  Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
	  }
	  
	  
	  @Test(priority=3)
	  public void IncidentswithInjury() throws Exception
	  
	  {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

		  Tech.IncidentswithInjury(driver);	
		   
		  String ExpectedTitle=data.getData(8,57,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Tech.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
		  Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
	  }
	  
	  @Test(priority=4)
	  public void IncidentswithDeath() throws Exception
	  
	  {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

		  Tech.IncidentswithDeath(driver);	
		   
		  String ExpectedTitle=data.getData(8,58,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Tech.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
		  Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
	  }
	  
	  @Test(priority=5)
	  public void IncidentsPollution() throws Exception
	  
	  {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

		  Tech.IncidentsPollution(driver);	
		   
		  String ExpectedTitle=data.getData(8,59,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Tech.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
		  Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
	  }
	  
	  
	  @Test(priority=6)
	  public void InternalInspections() throws Exception
	  
	  {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

		  Tech.InternalInspections(driver);	
		   
		  String ExpectedTitle=data.getData(8,60,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Tech.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
		  Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
	  }
	  
	  @Test(priority=7)
	  public void PortStateControlDeficiencies() throws Exception
	  
	  {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

		  Tech.PortStateControlDeficiencies(driver);	
		   
		  String ExpectedTitle=data.getData(8,61,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Tech.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
		  Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
	  }
	  
	  @Test(priority=8)
	  public void VettingReports() throws Exception
	  
	  {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

		  Tech.VettingReports(driver);	
		   
		  String ExpectedTitle=data.getData(8,62,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Tech.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
		  Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
	  }
	  
	  
	 
	  
}
