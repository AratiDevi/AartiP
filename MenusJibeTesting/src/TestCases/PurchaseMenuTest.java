package TestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

/*import org.testng.Assert;
import org.testng.annotations.Test;*/

import MenusList.PurchaseMenuList;

public class PurchaseMenuTest extends MainTest
{
	
	PurchaseMenuList PurchMenu =new PurchaseMenuList();
	
	 // Purchase
 	// admin

	@Test(groups="Purechase_menu",priority=193)
	 public void LOTestingLabList() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

		PurchMenu.LOTestingLabList(driver);	
		   
		  String ExpectedTitle=data.getData(7,49,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			PurchMenu.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			AssertJUnit.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
	  }
	
//Location 
	@Test(groups="Purechase_menu",priority=194)
	 public void Location() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

		PurchMenu.Location(driver);	
		   
		  String ExpectedTitle=data.getData(7,4,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			PurchMenu.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			AssertJUnit.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
	  }
//Catalogue/Items
	@Test(groups="Purechase_menu",priority=195)
	 public void CatalogueItems() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

		PurchMenu.CatalogueItems(driver);	
		   
		  String ExpectedTitle=data.getData(7,5,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			PurchMenu.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			AssertJUnit.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
	  }
//Set Item's Min Max Qty
	@Test(groups="Purechase_menu",priority=196)
	 public void SetItemsMinMaxQty() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

		PurchMenu.SetItemsMinMaxQty(driver);	
		   
		  String ExpectedTitle=data.getData(7,6,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			PurchMenu.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			AssertJUnit.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
	  }
//Unit Packings
	@Test(groups="Purechase_menu",priority=197)
	 public void UnitPackings() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

		PurchMenu.UnitPackings(driver);	
		   
		  String ExpectedTitle=data.getData(7,7,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			PurchMenu.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			AssertJUnit.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
	  }

	
	
	//Purchase Questionnaire
	@Test(groups="Purechase_menu",priority=198)
	 public void PurchaseQuestionnaire() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

		PurchMenu.PurchaseQuestionnaire(driver);	
		   
		  String ExpectedTitle=data.getData(7,41,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			PurchMenu.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			AssertJUnit.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
	  }
	
	
	//Email Template
		@Test(groups="Purechase_menu",priority=199)
		 public void EmailTemplate() throws Exception
		  {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

			PurchMenu.EmailTemplate(driver);	
			   
			  String ExpectedTitle=data.getData(7,42,3).trim(); // It will taking the Expected Title name from the excel sheet.
				
			  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
				
				PurchMenu.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
				
			// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
				
				AssertJUnit.assertEquals(ExpectedTitle, ActuleTitle);
				
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
		  }
		
		//Purchase Settings
		@Test(groups="Purechase_menu",priority=200)
		 public void PurchaseSettings() throws Exception
		  {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

			PurchMenu.PurchaseSettings(driver);	
			   
			  String ExpectedTitle=data.getData(7,8,3).trim(); // It will taking the Expected Title name from the excel sheet.
				
			  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
				
				PurchMenu.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
				
			// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
				
				AssertJUnit.assertEquals(ExpectedTitle, ActuleTitle);
				
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
		  }
		
	//ApprovalSetting
			@Test(groups="Purechase_menu",priority=201)
			 public void ApprovalSetting() throws Exception
			  {
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

				PurchMenu.ApprovalSetting(driver);	
				   
				  String ExpectedTitle=data.getData(7,43,3).trim(); // It will taking the Expected Title name from the excel sheet.
						
				  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
						
					PurchMenu.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
						
				// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
						
					AssertJUnit.assertEquals(ExpectedTitle, ActuleTitle);
						
					 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
			  }
			
//	Create New Reqsn
	//Create New Reqsn
	@Test(groups="Purechase_menu",priority=202)
	 public void CreateNewReqsn() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

		PurchMenu.CreateNewReqsn(driver);	
		   
		  String ExpectedTitle=data.getData(7,9,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			PurchMenu.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			AssertJUnit.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
	  }
	
//	Purchase Process
	//Purchase Process
	@Test(groups="Purechase_menu",priority=203)
	 public void PurchaseProcess() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

		PurchMenu.PurchaseProcess(driver);	
		   
		  String ExpectedTitle=data.getData(7,10,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			PurchMenu.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			AssertJUnit.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
	  }
	
//Reports
// View Reqsn Summary
	@Test(groups="Purechase_menu",priority=204)
	 public void ViewReqsnSummary() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

		PurchMenu.ViewReqsnSummary(driver);	
		   
		  String ExpectedTitle=data.getData(7,12,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			PurchMenu.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			AssertJUnit.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
	  }
// View Reqsn Attachments
	@Test(groups="Purechase_menu",priority=205)
	 public void ViewReqsnAttachments() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

		PurchMenu.ViewReqsnAttachments(driver);	
		   
		  String ExpectedTitle=data.getData(7,13,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			PurchMenu.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			AssertJUnit.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
	  }
// View Reqsn Onhold History
	@Test(groups="Purechase_menu",priority=206)
	 public void ViewReqsnOnholdHistory() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

		PurchMenu.ViewReqsnOnholdHistory(driver);	
		   
		  String ExpectedTitle=data.getData(7,14,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			PurchMenu.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			AssertJUnit.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
	  }
// Inventory Details
	@Test(groups="Purechase_menu",priority=207)
	 public void InventoryDetails() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

		PurchMenu.InventoryDetails(driver);	
		   
		  String ExpectedTitle=data.getData(7,15,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			PurchMenu.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			AssertJUnit.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
	  }
// Machinery Listing
	@Test(groups="Purechase_menu",priority=208)
	 public void MachineryListing() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);	

		PurchMenu.MachineryListing(driver);	
		   
		  String ExpectedTitle=data.getData(7,16,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			PurchMenu.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			AssertJUnit.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
	  }
	
// Purchase Report
	@Test(groups="Purechase_menu",priority=209)
	 public void PurchaseReport() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

		PurchMenu.PurchaseReport(driver);	
		   
		  String ExpectedTitle=data.getData(7,17,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			PurchMenu.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			AssertJUnit.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
	  }
	
	
	// InvoiceSummaryReport
		@Test(groups="Purechase_menu",priority=210)
		 public void InvoiceSummaryReport() throws Exception
		  {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

			PurchMenu.InvoiceSummaryReport(driver);	
			   
			  String ExpectedTitle=data.getData(7,46,3).trim(); // It will taking the Expected Title name from the excel sheet.
				
			  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
				
				PurchMenu.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
				
			// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
				
				AssertJUnit.assertEquals(ExpectedTitle, ActuleTitle);
				
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
		  }
	
	
	
	
// Stale PO Report
	@Test(groups="Purechase_menu",priority=211)
	 public void StalePOReport() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

		PurchMenu.StalePOReport(driver);	
		   
		  String ExpectedTitle=data.getData(7,18,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			PurchMenu.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			AssertJUnit.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
	  }
// Logistic PO	
// Create Logistic PO
	@Test(groups="Purechase_menu",priority=212)
	 public void CreateLogisticPO() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

		PurchMenu.CreateLogisticPO(driver);	
		   
		  String ExpectedTitle=data.getData(7,20,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			PurchMenu.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			AssertJUnit.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
	  }
// View Logistic PO
	@Test(groups="Purechase_menu",priority=213)
	 public void ViewLogisticPO() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

		PurchMenu.ViewLogisticPO(driver);	
		   
		  String ExpectedTitle=data.getData(7,21,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			PurchMenu.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			AssertJUnit.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
	  }
//Contract Pricing
	
	// Create new Contract
	@Test(groups="Purechase_menu",priority=214)
	 public void ContractPricing() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

		PurchMenu.ContractPricing(driver);	
		   
		  String ExpectedTitle=data.getData(7,23,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			PurchMenu.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			AssertJUnit.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
	  }
	// Contract List
	@Test(groups="Purechase_menu",priority=215)
	 public void ContractList() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

		PurchMenu.ContractList(driver);	
		   
		  String ExpectedTitle=data.getData(7,24,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			PurchMenu.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			AssertJUnit.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
	  }
	
	// Non Contract items
	@Test(groups="Purechase_menu",priority=216)
	 public void NonContractitems() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

		PurchMenu.NonContractitems(driver);	
		   
		  String ExpectedTitle=data.getData(7,25,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			PurchMenu.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			AssertJUnit.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
	  }
	// Copy Contract
	@Test(groups="Purechase_menu",priority=217)
	 public void CopyContract() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

		PurchMenu.CopyContract(driver);	
		   
		  String ExpectedTitle=data.getData(7,26,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			PurchMenu.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			AssertJUnit.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
	  }
	
	
	// LubeOilSamples
	@Test(groups="Purechase_menu",priority=218)
	 public void LubeOilSamples() throws Exception
	 {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

		PurchMenu.LubeOilSamples(driver);	
			   
		  String ExpectedTitle=data.getData(7,47,3).trim(); // It will taking the Expected Title name from the excel sheet.
				
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
				
			PurchMenu.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
				
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
				
			AssertJUnit.assertEquals(ExpectedTitle, ActuleTitle);
				
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
		 }
	
	
	
 /*  //Bulk Purchase
   //Bulk Purchase Index
	@Test(groups="Purechase_menu",priority=179)
	 public void BulkPurchaseIndex() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

		PurchMenu.BulkPurchaseIndex(driver);	
		   
		  String ExpectedTitle=data.getData(7,28,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			PurchMenu.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder		
			
			AssertJUnit.assertEquals(ExpectedTitle, ActuleTitle);
			
			driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
	  }*/
//ASL
	
	//Supplier Group
	@Test(groups="Purechase_menu",priority=219)
	 public void SupplierList() throws Exception
	 {
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

		PurchMenu.SupplierList(driver);	
			   
		String ExpectedTitle=data.getData(7,34,3).trim(); // It will taking the Expected Title name from the excel sheet.
				
		 String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
				
			PurchMenu.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
				
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
				
			AssertJUnit.assertEquals(ExpectedTitle, ActuleTitle);
				
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
		  }
	
	//Supplier Group
	@Test(groups="Purechase_menu",priority=220)
	 public void SupplierGroup() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

		PurchMenu.SupplierGroup(driver);	
		   
		  String ExpectedTitle=data.getData(7,30,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			PurchMenu.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			AssertJUnit.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
	  }
	
	
	//Supplier Approver
	@Test(groups="Purechase_menu",priority=221)
	 public void SupplierApprover() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

		PurchMenu.SupplierApprover(driver);	
		   
		  String ExpectedTitle=data.getData(7,31,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			PurchMenu.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			AssertJUnit.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
	  }
	
	
	//ManageContacts
		@Test(groups="Purechase_menu",priority=222)
		 public void ManageContacts() throws Exception
		  {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

			PurchMenu.ManageContacts(driver);	
			   
			  String ExpectedTitle=data.getData(7,35,3).trim(); // It will taking the Expected Title name from the excel sheet.
				
			  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
				
				PurchMenu.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
				
			 driver.get(Dashboard);// if the page is not exceuted then it will opne this url
				
				AssertJUnit.assertEquals(ExpectedTitle, ActuleTitle);
				
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
		  }
	
	
	
	//User-Type-Relationship
	@Test(groups="Purechase_menu",priority=223)
	 public void UserTypeRelationship() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

		PurchMenu.UserTypeRelationship(driver);	
		   
		  String ExpectedTitle=data.getData(7,32,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			PurchMenu.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			AssertJUnit.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
	  }
	
	
	//EmailTemplate1
		@Test(groups="Purechase_menu",priority=224)
		 public void EmailTemplate1() throws Exception
		  {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

			PurchMenu.EmailTemplate1(driver);	
			   
			  String ExpectedTitle=data.getData(7,36,3).trim(); // It will taking the Expected Title name from the excel sheet.
				
			  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
				
				PurchMenu.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
				
			// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
				
				AssertJUnit.assertEquals(ExpectedTitle, ActuleTitle);
				
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
		  }
	
	//SupplierFieldsGroup
		@Test(groups="Purechase_menu",priority=225)
		 public void SupplierFieldsGroup() throws Exception
		 {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

			PurchMenu.SupplierFieldsGroup(driver);	
					   
			 String ExpectedTitle=data.getData(7,37,3).trim(); // It will taking the Expected Title name from the excel sheet.
						
			 String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
						
				PurchMenu.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
						
			// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
						
				AssertJUnit.assertEquals(ExpectedTitle, ActuleTitle);
						
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
	  }
		
		//SupplierFieldsGroup
		@Test(groups="Purechase_menu",priority=226)
		 public void EvaluationHistory() throws Exception
		 {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(1000);

			PurchMenu.EvaluationHistory(driver);	
			Thread.sleep(1000);
			
			 String ExpectedTitle=data.getData(7,38,3).trim(); // It will taking the Expected Title name from the excel sheet.
								
			 String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
								
			 PurchMenu.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
								
			// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
								
				AssertJUnit.assertEquals(ExpectedTitle, ActuleTitle);
								
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
		 }
		
	
}
