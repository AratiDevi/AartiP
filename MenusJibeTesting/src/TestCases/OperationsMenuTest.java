package TestCases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import MenusList.OperationsMenuList;

public class OperationsMenuTest extends MainTest
{
  
	OperationsMenuList Oml =new OperationsMenuList();
	 
	// Admin 
		//WaterInHoldTank
	
	@Test(groups="Operation_Menu",priority=126)
	 public void WaterInHoldTank() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Oml.WaterInHoldTank(driver);	
	   
	  String ExpectedTitle=data.getData(5,4,3).trim(); // It will taking the Expected Title name from the excel sheet.
		
	  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
		
		Oml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
		
	// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
		
		Assert.assertEquals(ExpectedTitle, ActuleTitle);
		
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	
	@Test(groups="Operation_Menu",priority=127)
	 public void DeckLogBookThreshold() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Oml.DeckLogBookThreshold(driver);	
	   
	  String ExpectedTitle=data.getData(5,20,3).trim(); // It will taking the Expected Title name from the excel sheet.
		
	  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
		
		Oml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
		
	// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
		
		Assert.assertEquals(ExpectedTitle, ActuleTitle);
		
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	
@Test(groups="Operation_Menu",priority=128)
	 public void PiracyAlarmSettings() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Oml.PiracyAlarmSettings(driver);	
	   
	  String ExpectedTitle=data.getData(5,5,3).trim(); // It will taking the Expected Title name from the excel sheet.
		
	  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
		
		Oml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
		
	// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
		
		Assert.assertEquals(ExpectedTitle, ActuleTitle);
		
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }			
			
			//VslGeneralParameters
@Test(groups="Operation_Menu",priority=129)
	 public void VslGeneralParameters() throws Exception
	  {
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

	Oml.VslGeneralParameters(driver);	
   
  String ExpectedTitle=data.getData(5,6,3).trim(); // It will taking the Expected Title name from the excel sheet.
	
  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
	
	Oml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
	
// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
	
	Assert.assertEquals(ExpectedTitle, ActuleTitle);
	
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 Thread.sleep(100); 
		
	  }		

@Test(groups="Operation_Menu",priority=130)
public void ReportsRankConfig() throws Exception
 {
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

Oml.ReportsRankConfig(driver);	

String ExpectedTitle=data.getData(5,21,3).trim(); // It will taking the Expected Title name from the excel sheet.

String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

Oml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

//driver.get(Dashboard);// if the page is not exceuted then it will opne this url

Assert.assertEquals(ExpectedTitle, ActuleTitle);

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
Thread.sleep(100); 
	
 }	

//		Sub-Menus	VoyageReports

 //DailyReportIndex

@Test(groups="Operation_Menu",priority=131)
	 public void DailyReportIndex() throws Exception
	  {
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

	Oml.DailyReportIndex(driver);	
   
  String ExpectedTitle=data.getData(5,23,3).trim(); // It will taking the Expected Title name from the excel sheet.
	
  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
	
	Oml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
	
// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
	
	Assert.assertEquals(ExpectedTitle, ActuleTitle);
	
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }	
		
//ReportIndex
 
@Test(groups="Operation_Menu",priority=132)
	 public void ReportIndex() throws Exception
	  {
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

	Oml.ReportIndex(driver);	
   
  String ExpectedTitle=data.getData(5,8,3).trim(); // It will taking the Expected Title name from the excel sheet.
	
  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
	
	Oml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
	
// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
	
	Assert.assertEquals(ExpectedTitle, ActuleTitle);
	
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }			
		
			
//	C\PFiguresEntry
@Test(groups="Operation_Menu",priority=133)
	 public void CPFiguresEntry() throws Exception
	  {
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

	Oml.CPFiguresEntry(driver);	
   
  String ExpectedTitle=data.getData(5,9,3).trim(); // It will taking the Expected Title name from the excel sheet.
	
  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
	
	Oml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
	
// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
	
	Assert.assertEquals(ExpectedTitle, ActuleTitle);
	
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }	

@Test(groups="Operation_Menu",priority=134)
public void BunkerReport() throws Exception
 {
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

Oml.BunkerReport(driver);	

String ExpectedTitle=data.getData(5,24,3).trim(); // It will taking the Expected Title name from the excel sheet.

String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

Oml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

//driver.get(Dashboard);// if the page is not exceuted then it will opne this url

Assert.assertEquals(ExpectedTitle, ActuleTitle);

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
 }


@Test(groups="Operation_Menu",priority=135)
public void PortReport() throws Exception
 {
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

Oml.PortReport(driver);	

String ExpectedTitle=data.getData(5,25,3).trim(); // It will taking the Expected Title name from the excel sheet.

String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

Oml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

//driver.get(Dashboard);// if the page is not exceuted then it will opne this url

Assert.assertEquals(ExpectedTitle, ActuleTitle);

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
 }


@Test(groups="Operation_Menu",priority=136)
public void ReportIndexChemical() throws Exception
 {
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

Oml.ReportIndexChemical(driver);	

String ExpectedTitle=data.getData(5,26,3).trim(); // It will taking the Expected Title name from the excel sheet.

String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

Oml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

//driver.get(Dashboard);// if the page is not exceuted then it will opne this url

Assert.assertEquals(ExpectedTitle, ActuleTitle);

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
 }

			
//		Sub-Menus	BunkerSampleReports
@Test(groups="Operation_Menu",priority=137)
	 public void BunkerSampleReports() throws Exception
	  {
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

	Oml.BunkerSampleReports(driver);	
   
  String ExpectedTitle=data.getData(5,10,3).trim(); // It will taking the Expected Title name from the excel sheet.
	
  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
	
	Oml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
	
// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
	
	Assert.assertEquals(ExpectedTitle, ActuleTitle);
	
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }	

//Sub-Menus	BunkerSampleReports
@Test(groups="Operation_Menu",priority=138)
public void BunkerSampleLab() throws Exception
{
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

Oml.BunkerSampleLab(driver);	

String ExpectedTitle=data.getData(5,27,3).trim(); // It will taking the Expected Title name from the excel sheet.

String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

Oml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

//driver.get(Dashboard);// if the page is not exceuted then it will opne this url

Assert.assertEquals(ExpectedTitle, ActuleTitle);

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
}
	  	
//Sub-Menus	BunkerAttachments
/*@Test(groups="Operation_Menu",priority=85)
	 public void BunkerAttachments() throws Exception
	  {
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

	Oml.BunkerAttachments(driver);	
   
  String ExpectedTitle=data.getData(5,11,3).trim(); // It will taking the Expected Title name from the excel sheet.
	
  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
	
	Oml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
	
// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
	
	Assert.assertEquals(ExpectedTitle, ActuleTitle);
	
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	 
	 driver.get(Dashboard);// if the page is not exceuted then it will opne this url
	  }	*/
	  
	  	
// Sub-Menus	DeckLogBook
@Test(groups="Operation_Menu",priority=139)
	 public void DeckLogBook() throws Exception
	  {
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

	Oml.DeckLogBook(driver);	
   
  String ExpectedTitle=data.getData(5,12,3).trim(); // It will taking the Expected Title name from the excel sheet.
	
  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
	
	Oml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
	
	Assert.assertEquals(ExpectedTitle, ActuleTitle);	
	
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	 
	
	 
	  }

//DeckLogBookLibHoldTank
@Test(groups="Operation_Menu",priority=140)
public void DeckLogBookLibHoldTank() throws Exception
 {
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

Oml.DeckLogBookLibHoldTank(driver);	

String ExpectedTitle=data.getData(5,28,3).trim(); // It will taking the Expected Title name from the excel sheet.

String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

Oml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

Assert.assertEquals(ExpectedTitle, ActuleTitle);	

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 



 }


		
//	 		Vessel Movement
		
			
@Test(groups="Operation_Menu",priority=141)
	 public void PortCallsNew() throws Exception
	  {
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

	Oml.PortCallsNew(driver);	
   
  String ExpectedTitle=data.getData(5,14,3).trim(); // It will taking the Expected Title name from the excel sheet.
	
  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
	
	Oml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
	
// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
	
	Assert.assertEquals(ExpectedTitle, ActuleTitle);
	
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }			
			
@Test(groups="Operation_Menu",priority=142)
	 public void PortCalls() throws Exception
	  {
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

	Oml.PortCalls(driver);	
   
  String ExpectedTitle=data.getData(5,15,3).trim(); // It will taking the Expected Title name from the excel sheet.
	
  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
	
	Oml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
	
// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
	
	Assert.assertEquals(ExpectedTitle, ActuleTitle);
	
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }

@Test(groups="Operation_Menu",priority=143)
public void PortCost() throws Exception
 {
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

Oml.PortCost(driver);	

String ExpectedTitle=data.getData(5,30,3).trim(); // It will taking the Expected Title name from the excel sheet.

String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

Oml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

//driver.get(Dashboard);// if the page is not exceuted then it will opne this url

Assert.assertEquals(ExpectedTitle, ActuleTitle);

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
 }

@Test(groups="Operation_Menu",priority=144)
public void PortCallHistory() throws Exception
 {
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

Oml.PortCallHistory(driver);	

String ExpectedTitle=data.getData(5,31,3).trim(); // It will taking the Expected Title name from the excel sheet.

String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

Oml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

//driver.get(Dashboard);// if the page is not exceuted then it will opne this url

Assert.assertEquals(ExpectedTitle, ActuleTitle);

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
 }

			
@Test(groups="Operation_Menu",priority=145)
	 public void PortCallNotification() throws Exception
	  {
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

	Oml.PortCallNotification(driver);	
   
  String ExpectedTitle=data.getData(5,16,3).trim(); // It will taking the Expected Title name from the excel sheet.
	
  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
	
	Oml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
	
// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
	
	Assert.assertEquals(ExpectedTitle, ActuleTitle);
	
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }	


@Test(groups="Operation_Menu",priority=146)
public void PortCalls1() throws Exception
 {
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

Oml.PortCalls1(driver);	

String ExpectedTitle=data.getData(5,37,3).trim(); // It will taking the Expected Title name from the excel sheet.

String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

Oml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

//driver.get(Dashboard);// if the page is not exceuted then it will opne this url

Assert.assertEquals(ExpectedTitle, ActuleTitle);

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
 }	
//		Sub-Menus	DPLMap
	 				
@Test(groups="Operation_Menu",priority=147)
	 public void DPLMap() throws Exception
	  {
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

	Oml.DPLMap(driver);	
   
  String ExpectedTitle=data.getData(5,17,3).trim(); // It will taking the Expected Title name from the excel sheet.
	
  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
	
	Oml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
	
	driver.get(Dashboard);// if the page is not exceuted then it will opne this url
	
	Assert.assertEquals(ExpectedTitle, ActuleTitle);
	
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	 
	 
	  }	  
//		Sub-Menus	AddVoyageNumber
	 				
@Test(groups="Operation_Menu",priority=148)
	 public void AddVoyageNumber() throws Exception
	  {
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

	Oml.AddVoyageNumber(driver);	
   
  String ExpectedTitle=data.getData(5,18,3).trim(); // It will taking the Expected Title name from the excel sheet.
	
  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
	
	Oml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
	
// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
	
	Assert.assertEquals(ExpectedTitle, ActuleTitle);
	
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
		
	  }
		
@Test(groups="Operation_Menu",priority=149)
public void DeckLogBookThreshold1() throws Exception
 {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

	Oml.DeckLogBookThreshold1(driver);	
  
 String ExpectedTitle=data.getData(5,35,3).trim(); // It will taking the Expected Title name from the excel sheet.
	
 String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
	
	Oml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
	
// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
	
	Assert.assertEquals(ExpectedTitle, ActuleTitle);
	
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
 }

@Test(groups="Operation_Menu",priority=150)
public void Worklist() throws Exception
 {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

	Oml.Worklist(driver);	
  
 String ExpectedTitle=data.getData(5,32,3).trim(); // It will taking the Expected Title name from the excel sheet.
	
 String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
	
	Oml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
	
// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
	
	Assert.assertEquals(ExpectedTitle, ActuleTitle);
	
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
 }

@Test(groups="Operation_Menu",priority=151)
public void LOSample() throws Exception
 {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

	Oml.LOSample(driver);	
  
 String ExpectedTitle=data.getData(5,34,3).trim(); // It will taking the Expected Title name from the excel sheet.
	
 String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
	
	Oml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
	
// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
	
	Assert.assertEquals(ExpectedTitle, ActuleTitle);
	
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
 }
	
}
