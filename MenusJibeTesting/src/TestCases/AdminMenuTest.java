package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import MenusList.AdminMenuList;

public class AdminMenuTest extends MainTest
{

	AdminMenuList Adl=new AdminMenuList();
	
	/* @Test
	  @Parameters("browser")
	  public void Cross(String browserName) throws Exception {
		 if(browserName.equalsIgnoreCase("IE")){
			  
			   System.setProperty("webdriver.ie.driver", "C:\\Users\\Arati\\workspace\\IEDriverServer.exe");

			   driver = new InternetExplorerDriver();
			     
			   Thread.sleep(3000);
			   
			   			     
			    
		 }
	 }*/

	@Test(groups="Admin",priority=0)   //(groups="CreateUser",priority=26)

	 public void CreateUser() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.CreateUser(driver);

		  String ExpectedTitle=data.getData(3,4,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

			  Thread.sleep(100);

	  }

	@Test(groups="Admin",priority=1)   //(groups="CreateUser",priority=26)

	 public void UserList() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.UserList(driver);

		  String ExpectedTitle=data.getData(3,5,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }
	
	
	@Test(groups="Admin",priority=2)   //(groups="CreateUser",priority=26)

	 public void UserVesselAssignment() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.UserVesselAssignment(driver);

		  String ExpectedTitle=data.getData(3,57,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }

	@Test(groups="Admin",priority=3)   //(groups="CreateUser",priority=26)

	 public void MenuManagement() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.MenuManagement(driver);

		  String ExpectedTitle=data.getData(3,7,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }


	@Test(groups="Admin",priority=4)   //(groups="CreateUser",priority=26)

	 public void UserMenuRelationship() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.UserMenuRelationship(driver);

		  String ExpectedTitle=data.getData(3,8,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }
	
	@Test(groups="Admin",priority=5)   //(groups="CreateUser",priority=26)

	 public void AsyncUserMenuAssignment() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.AsyncUserMenuAssignment(driver);

		  String ExpectedTitle=data.getData(3,60,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }
	
	@Test(groups="Admin",priority=6)   //(groups="CreateUser",priority=26)

	 public void AccessRightsChanges() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.AccessRightsChanges(driver);

		  String ExpectedTitle=data.getData(3,61,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }

	@Test(groups="Admin",priority=7)   //(groups="CreateUser",priority=26)

	 public void Company() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.Company(driver);

		  String ExpectedTitle=data.getData(3,10,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }

	@Test(groups="Admin",priority=8)   //(groups="CreateUser",priority=26)

	 public void Fleet() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.Fleet(driver);

		  String ExpectedTitle=data.getData(3,11,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }

	@Test(groups="Admin",priority=9)   //(groups="CreateUser",priority=26)

	 public void Vessels() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.Vessels(driver);

		  String ExpectedTitle=data.getData(3,12,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }

	@Test(groups="Admin",priority=10)   //(groups="CreateUser",priority=26)

	 public void Country() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.Country(driver);

		  String ExpectedTitle=data.getData(3,13,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }

	@Test(groups="Admin",priority=11)   //(groups="CreateUser",priority=26)

	 public void Port() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.Port(driver);

		  String ExpectedTitle=data.getData(3,14,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }


	@Test(groups="Admin",priority=12)   //(groups="CreateUser",priority=26)

	 public void Airport() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.Airport(driver);

		  String ExpectedTitle=data.getData(3,15,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }


	@Test(groups="Admin",priority=13)   //(groups="CreateUser",priority=26)

	 public void Currency() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.Currency(driver);

		  String ExpectedTitle=data.getData(3,16,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }


	@Test(groups="Admin",priority=14)   //(groups="CreateUser",priority=26)

	 public void OfficeDepartment() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.OfficeDepartment(driver);

		  String ExpectedTitle=data.getData(3,17,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }


	@Test(groups="Admin",priority=15)   //(groups="CreateUser",priority=26)

	 public void ShipDepartment() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.ShipDepartment(driver);

		  String ExpectedTitle=data.getData(3,18,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }


	@Test(groups="Admin",priority=16)   //(groups="CreateUser",priority=26)

	 public void VesselFlag() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.VesselFlag(driver);

		  String ExpectedTitle=data.getData(3,19,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }


	@Test(groups="Admin",priority=17)   //(groups="CreateUser",priority=26)

	 public void Timezones() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.TimeZones(driver);

		  String ExpectedTitle=data.getData(3,20,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }


	@Test(groups="Admin",priority=18)   //(groups="CreateUser",priority=26)

	 public void VesselType() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.VesselType(driver);

		  String ExpectedTitle=data.getData(3,21,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }
	
	@Test(groups="Admin",priority=19)   //(groups="CreateUser",priority=26)

	 public void TradingZones() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.TradingZones(driver);

		  String ExpectedTitle=data.getData(3,64,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }
	
	@Test(groups="Admin",priority=20)   //(groups="CreateUser",priority=26)

	 public void VesselVideos() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.VesselVideos(driver);

		  String ExpectedTitle=data.getData(3,65,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }


	@Test(groups="Admin",priority=21)   //(groups="CreateUser",priority=26)

	 public void BunkerTestingLab() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.BunkerTestingLab(driver);

		  String ExpectedTitle=data.getData(3,22,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }
	
	
	@Test(groups="Admin",priority=22)   //(groups="CreateUser",priority=26)

	 public void VesselEEDI() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.VesselEEDI(driver);

		  String ExpectedTitle=data.getData(3,66,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }
	
	@Test(groups="Admin",priority=23)   //(groups="CreateUser",priority=26)

	 public void VesselUser() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.VesselUser(driver);

		  String ExpectedTitle=data.getData(3,67,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }
	
	/*@Test(groups="Admin",priority=23)   //(groups="CreateUser",priority=26)

	 public void TestMenu() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.TestMenu(driver);

		  String ExpectedTitle=data.getData(3,67,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }*/




	@Test(groups="Admin",priority=24)   //(groups="CreateUser",priority=26)

	 public void AlertsandNotifications() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.AlertsandNotifications(driver);

		  String ExpectedTitle=data.getData(3,23,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }


	@Test(groups="Admin",priority=25)   //(groups="CreateUser",priority=26)

	 public void UserSnippetAccess() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.UserSnippetAccess(driver);

		  String ExpectedTitle=data.getData(3,24,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }


	// sub menu on Board Setting

	@Test(groups="Admin",priority=26)   //(groups="CreateUser",priority=26)

	 public void MenuAssignment() throws Exception
	  {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.MenuAssignment(driver);

		  String ExpectedTitle=data.getData(3,26,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);
	  }

	@Test(groups="Admin",priority=27)   //(groups="CreateUser",priority=26)

	 public void ProjectMgmt() throws Exception
	  {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.ProjectMgmt(driver);

		  String ExpectedTitle=data.getData(3,27,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }
	@Test(groups="Admin",priority=28)   //(groups="CreateUser",priority=26)

	 public void NavigationProjectMgmt() throws Exception
	  {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.NavigationProjectMgmt(driver);

		  String ExpectedTitle=data.getData(3,28,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }
	@Test(groups="Admin",priority=29)   //(groups="CreateUser",priority=26)

	 public void LicenseKeyGeneration() throws Exception
	  {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.LicenseKeyGeneration(driver);

		  String ExpectedTitle=data.getData(3,29,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }
	@Test(groups="Admin",priority=30)   //(groups="CreateUser",priority=26)

	 public void HelpFileSettings() throws Exception
	  {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.HelpFileSettings(driver);

		  String ExpectedTitle=data.getData(3,30,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }
	
	/*public void SystemParameters() throws Exception
	  {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.HelpFileSettings(driver);

		  String ExpectedTitle=data.getData(3,42,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  } */
	
	@Test(groups="Admin",priority=31)   //(groups="CreateUser",priority=26)

	 public void DashboardSnippets() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.DashboardSnippets(driver);

		  String ExpectedTitle=data.getData(3,43,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }
	
	@Test(groups="Admin",priority=32)   //(groups="CreateUser",priority=26)

	 public void UserType() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.UserType(driver);

		  String ExpectedTitle=data.getData(3,44,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }
	
	@Test(groups="Admin",priority=33)   //(groups="CreateUser",priority=26)

	 public void CompanyRelationships() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.CompanyRelationships(driver);

		  String ExpectedTitle=data.getData(3,45,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }
	
	
	@Test(groups="Admin",priority=34)   //(groups="CreateUser",priority=26)

	 public void UploadFileSize() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.UploadFileSize(driver);

		  String ExpectedTitle=data.getData(3,46,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }
	
	@Test(groups="Admin",priority=35)   //(groups="CreateUser",priority=26)

	 public void MailActionSettings() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.MailActionSettings(driver);

		  String ExpectedTitle=data.getData(3,47,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }
	
	
	@Test(groups="Admin",priority=36)   //(groups="CreateUser",priority=26)

	 public void OfficeSyncSettings() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.OfficeSyncSettings(driver);

		  String ExpectedTitle=data.getData(3,48,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }
	
	
	@Test(groups="Admin",priority=37)   //(groups="CreateUser",priority=26)

	 public void OfficeAttachmentRule() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.OfficeAttachmentRule(driver);

		  String ExpectedTitle=data.getData(3,49,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }
	
	
	@Test(groups="Admin",priority=38)   //(groups="CreateUser",priority=26)

	 public void ExceptionList() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.ExceptionList(driver);

		  String ExpectedTitle=data.getData(3,50,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }
	
	
	@Test(groups="Admin",priority=39)   //(groups="CreateUser",priority=26)

	 public void CrewSettings() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.CrewSettings(driver);

		  String ExpectedTitle=data.getData(3,51,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }
	
	
	

	@Test(groups="Admin",priority=40)   //(groups="CreateUser",priority=26)

	 public void SalaryStructure() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.SalaryStructure(driver);

		  String ExpectedTitle=data.getData(3,32,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }
	
	
	@Test(groups="Admin",priority=41)   //(groups="CreateUser",priority=26)

	 public void VesselAttachmentRule() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.VesselAttachmentRule(driver);

		  String ExpectedTitle=data.getData(3,52,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }
	@Test(groups="Admin",priority=42)   //(groups="CreateUser",priority=26)

	 public void CrewJoiningTypes() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.CrewJoiningTypes(driver);

		  String ExpectedTitle=data.getData(3,33,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }
	@Test(groups="Admin",priority=43)   //(groups="CreateUser",priority=26)

	 public void StaffRemarkCategory() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.StaffRemarkCategory(driver);

		  String ExpectedTitle=data.getData(3,34,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }

	@Test(groups="Admin",priority=44)   //(groups="CreateUser",priority=26)

	 public void ApprovalType() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.ApprovalType(driver);

		  String ExpectedTitle=data.getData(3,35,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }

	@Test(groups="Admin",priority=45)   //(groups="CreateUser",priority=26)

	 public void ApprovalGroup() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.ApprovalGroup(driver);

		  String ExpectedTitle=data.getData(3,36,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }

	@Test(groups="Admin",priority=46)   //(groups="CreateUser",priority=26)

	 public void ApprovalLimit() throws Exception
	  {

		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.ApprovalLimit(driver);

		  String ExpectedTitle=data.getData(3,37,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }
	@Test(groups="Admin",priority=47)   //(groups="CreateUser",priority=26)

	 public void Department() throws Exception
	  {

		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.Department(driver);

		  String ExpectedTitle=data.getData(3,38,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }
	@Test(groups="Admin",priority=48)   //(groups="CreateUser",priority=26)

	 public void MenuHelpSettings() throws Exception
	  {

		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.MenuHelpSettings(driver);

		  String ExpectedTitle=data.getData(3,39,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }
	@Test(groups="Admin",priority=49)   //(groups="CreateUser",priority=26)

	 public void TechnicalSettings() throws Exception
	  {

		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.TechnicalSettings(driver);

		  String ExpectedTitle=data.getData(3,40,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }
	
	
	@Test(groups="Admin",priority=50)   //(groups="CreateUser",priority=26)

	 public void UserVesselAssignment1() throws Exception
	  {

		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.UserVesselAssignment1(driver);

		  String ExpectedTitle=data.getData(3,69,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }
	
	

	@Test(groups="Admin",priority=51)   //(groups="CreateUser",priority=26)

	 public void AccessRightsReport() throws Exception
	  {

		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.AccessRightsReport(driver);

		  String ExpectedTitle=data.getData(3,71,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }








}
