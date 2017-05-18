package TestCases;



import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import MenusList.CrewMenuList;

public class CrewMenuTest extends MainTest
{
	CrewMenuList Crl=new CrewMenuList();
	
	@Test(groups="Crew",priority=52)
	
	 public void Rankcategory() throws Exception
	  {
		
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.Rankcategory(driver);	
		   
		  String ExpectedTitle=data.getData(4,4,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
		  
	  }
	
	@Test(groups="Crew",priority=53)
	 public void CrewRanks() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.CrewRanks(driver);	
		   
		  String ExpectedTitle=data.getData(4,5,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=54)
	 public void JoiningType() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.JoiningType(driver);	
		   
		  String ExpectedTitle=data.getData(4,6,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	
	@Test(groups="Crew",priority=55)
	 public void DocumentGroup() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.DocumentGroup(driver);	
		   
		  String ExpectedTitle=data.getData(4,65,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=56)
	 public void DocumentTypes() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.DocumentTypes(driver);	
		   
		  String ExpectedTitle=data.getData(4,7,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=57)
	 public void CrewSignoffReason() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.CrewSignoffReason(driver);	
		   
		  String ExpectedTitle=data.getData(4,8,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=58)
	 public void TrainingTypes() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.TrainingTypes(driver);	
		   
		  String ExpectedTitle=data.getData(4,9,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=59) 
	public void CrewWelfareLibrary() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.CrewWelfareLibrary(driver);	
		   
		  String ExpectedTitle=data.getData(4,10,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=60)
	 public void OnBoardStaffLimit() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.OnBoardStaffLimit(driver);	
		   
		  String ExpectedTitle=data.getData(4,11,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	
	@Test(groups="Crew",priority=61)
	 public void CompanySeniorityReward() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.CompanySeniorityReward(driver);	
		   
		  String ExpectedTitle=data.getData(4,66,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	
	@Test(groups="Crew",priority=62)
	 public void SenioritySettings() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.SenioritySettings(driver);	
		   
		  String ExpectedTitle=data.getData(4,67,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=63)
	 public void ContractType() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.ContractType(driver);	
		   
		  String ExpectedTitle=data.getData(4,12,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	
	@Test(groups="Crew",priority=64)
	 public void CrewRankScale() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.CrewRankScale(driver);	
		   
		  String ExpectedTitle=data.getData(4,61,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	
		
	@Test(groups="Crew",priority=65)
	 public void HandOverQuestion() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.HandOverQuestion(driver);	
		   
		  String ExpectedTitle=data.getData(4,13,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=66)
	 public void CrewContractPeriod() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.CrewContractPeriod(driver);	
		   
		  String ExpectedTitle=data.getData(4,14,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=67)
	 public void CashAdvanceLimit() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.CashAdvanceLimit(driver);	
		   
		  String ExpectedTitle=data.getData(4,15,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=68)
	 public void Allotmentflagmailsettings() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.Allotmentflagmailsettings(driver);	
		   
		  String ExpectedTitle=data.getData(4,16,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	
	@Test(groups="Crew",priority=69)
	 public void CrewContractTemplates() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.CrewContractTemplates(driver);	
		   
		  String ExpectedTitle=data.getData(4,68,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=70)
	 public void CrewJoiningSeniority() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.CrewJoiningSeniority(driver);	
		   
		  String ExpectedTitle=data.getData(4,17,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }	
	@Test(groups="Crew",priority=71)
	 public void DocumentTypes1() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.DocumentTypes1(driver);	
		   
		  String ExpectedTitle=data.getData(4,18,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=72)
	 public void InitializePortageBill() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.InitializePortageBill(driver);	
		   
		  String ExpectedTitle=data.getData(4,62,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	
	@Test(groups="Crew",priority=73)
	 public void CrewCardApprovers() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.CrewCardApprovers(driver);	
		   
		  String ExpectedTitle=data.getData(4,19,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }	
	
	
	@Test(groups="Crew",priority=74)
	 public void CrewStatusLibrary() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.CrewStatusLibrary(driver);	
		   
		  String ExpectedTitle=data.getData(4,63,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	
	@Test(groups="Crew",priority=75)
	 public void CrewStatusMapping() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.CrewStatusMapping(driver);	
		   
		  String ExpectedTitle=data.getData(4,64,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	
	@Test(groups="Crew",priority=76)
	 public void LeaveWageWithholdRule() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.LeaveWageWithholdRule(driver);	
		   
		  String ExpectedTitle=data.getData(4,69,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=77)
	 public void OilMajors() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.OilMajors(driver);	
		   
		  String ExpectedTitle=data.getData(4,70,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	
	@Test(groups="Crew",priority=78)
	 public void CrewMatrixConfig() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.CrewMatrixConfig(driver);	
		   
		  String ExpectedTitle=data.getData(4,71,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	
	@Test(groups="Crew",priority=79)
	 public void OilMajorsRuleMapping() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.OilMajorsRuleMapping(driver);	
		   
		  String ExpectedTitle=data.getData(4,72,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	
	@Test(groups="Crew",priority=80)
	 public void OilMajorsRuleGroup() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.OilMajorsRuleGroup(driver);	
		   
		  String ExpectedTitle=data.getData(4,73,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	
	@Test(groups="Crew",priority=81)
	 public void OilMajorsRules() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.OilMajorsRules(driver);	
		   
		  String ExpectedTitle=data.getData(4,74,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	
	@Test(groups="Crew",priority=82)
	 public void RankConfiguration() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.RankConfiguration(driver);	
		   
		  String ExpectedTitle=data.getData(4,75,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	
	@Test(groups="Crew",priority=83)
	 public void CrewDetailsConfiguration() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.CrewDetailsConfiguration(driver);	
		   
		  String ExpectedTitle=data.getData(4,76,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	

	@Test(groups="Crew",priority=84)
	 public void UnionAndUnionBook() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.UnionAndUnionBook(driver);	
		   
		  String ExpectedTitle=data.getData(4,77,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=85)
	 public void Schools() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.Schools(driver);	
		   
		  String ExpectedTitle=data.getData(4,78,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=86)
	 public void RaceAndVeteranStatus() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.RaceAndVeteranStatus(driver);	
		   
		  String ExpectedTitle=data.getData(4,79,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	
	//Index
 
	@Test(groups="Crew",priority=87)
	 public void CrewIndex() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.CrewIndex(driver);	
		   
		  String ExpectedTitle=data.getData(4,20,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=88)
	 public void AddNewCrew() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.AddNewCrew(driver);	
		   
		  String ExpectedTitle=data.getData(4,21,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	
	//Interview
	@Test(groups="Crew",priority=89)
	 public void CreateInterviewSheet() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.CreateInterviewSheet(driver);	
		   
		  String ExpectedTitle=data.getData(4,23,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=90)
	 public void CategoriesandGrades() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.CategoriesandGrades(driver);	
		   
		  String ExpectedTitle=data.getData(4,24,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	

	@Test(groups="Crew",priority=91)
	 public void InterviewQuestionBank() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.InterviewQuestionBank(driver);	
		   
		  String ExpectedTitle=data.getData(4,25,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	//Plan Interview
	@Test(groups="Crew",priority=92)
	 public void PlanInterview() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.PlanInterview(driver);	
		   
		  String ExpectedTitle=data.getData(4,26,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=93)
	 public void CrewPlanning() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.CrewPlanning(driver);	
		   
		  String ExpectedTitle=data.getData(4,81,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	
	
	//Event Planner
@Test(groups="Crew",priority=94)
	 public void EventPlanner() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.EventPlanner(driver);	
		   
		  String ExpectedTitle=data.getData(4,27,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	//Event Index
	@Test(groups="Crew",priority=95)
	 public void EventIndex() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.EventIndex(driver);	
		   
		  String ExpectedTitle=data.getData(4,28,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
//Crew Evaluation	
	
	@Test(groups="Crew",priority=96)
	 public void EvaluationSchedules() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.EvaluationSchedules(driver);	
		   
		  String ExpectedTitle=data.getData(4,30,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=97)
	 public void EvaluationPlanning() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.EvaluationPlanning(driver);	
		   
		  String ExpectedTitle=data.getData(4,31,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=98)
	 public void Library() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.Library(driver);	
		   
		  String ExpectedTitle=data.getData(4,32,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=99)
	 public void QuestionBank() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.QuestionBank(driver);	
		   
		  String ExpectedTitle=data.getData(4,33,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	
	@Test(groups="Crew",priority=100)
	 public void EvaluationConfiguration() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.EvaluationConfiguration(driver);	
		   
		  String ExpectedTitle=data.getData(4,84,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	
	@Test(groups="Crew",priority=101)
	 public void EvaluationSnippetSettings() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.EvaluationSnippetSettings(driver);	
		   
		  String ExpectedTitle=data.getData(4,85,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	
	

//	Crew Accounts	
	@Test(groups="Crew",priority=102)
	 public void PortageBill() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.PortageBill(driver);	
		   
		  String ExpectedTitle=data.getData(4,35,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
		
	  }
	@Test(groups="Crew",priority=103)
	 public void SalarybyWireTransfer() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.SalarybyWireTransfer(driver);	
		   
		  String ExpectedTitle=data.getData(4,36,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }

	@Test(groups="Crew",priority=104)
	 public void CTMIndex() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.CTMIndex(driver);	
		   
		  String ExpectedTitle=data.getData(4,37,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	
	@Test(groups="Crew",priority=105)
	 public void VesselMinumumCTM() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.VesselMinumumCTM(driver);	
		   
		  String ExpectedTitle=data.getData(4,38,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=106)
	 public void RankWageContract() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.RankWageContract(driver);	
		   
		  String ExpectedTitle=data.getData(4,39,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
	  }
	
	@Test(groups="Crew",priority=107)
	 public void eCardKitty() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.eCardKitty(driver);	
		   
		  String ExpectedTitle=data.getData(4,40,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=108)
	 public void eCardRequest() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.eCardRequest(driver);	
		   
		  String ExpectedTitle=data.getData(4,41,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=109)
	 public void eCardReport() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.eCardReport(driver);	
		   
		  String ExpectedTitle=data.getData(4,42,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=110)
	 public void CrewWelfareLibrary1() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.CrewWelfareLibrary1(driver);	
		   
		  String ExpectedTitle=data.getData(4,43,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=111)
	 public void ApproveRejoiningBonus() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.ApproveRejoiningBonus(driver);	
		   
		  String ExpectedTitle=data.getData(4,44,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=112)
	 public void CompanySeniorityReward1() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.CompanySeniorityReward1(driver);	
		   
		  String ExpectedTitle=data.getData(4,45,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
//	CrewAgencyFee
	
	@Test(groups="Crew",priority=113)
	 public void CrewAgencyFeeLibrary() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.CrewAgencyFeeLibrary(driver);	
		   
		  String ExpectedTitle=data.getData(4,47,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=114)
	 public void CrewAgencyFeeReport() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.CrewAgencyFeeReport(driver);	
		   
		  String ExpectedTitle=data.getData(4,48,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	//Card Index
	@Test(groups="Crew",priority=115)
	 public void CrewCardIndex() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.CrewCardIndex(driver);	
		   
		  String ExpectedTitle=data.getData(4,49,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=116)
	 public void CrewListHistory() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.CrewListHistory(driver);	
		   
		  String ExpectedTitle=data.getData(4,50,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	// Crew Mail System
	
	@Test(groups="Crew",priority=117)
	 public void CrewMailSystem() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.CrewMailSystem(driver);	
		   
		  String ExpectedTitle=data.getData(4,52,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	

	@Test(groups="Crew",priority=118)
	 public void CrewMailAdmin() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.CrewMailAdmin(driver);	
		   
		  String ExpectedTitle=data.getData(4,53,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	

	@Test(groups="Crew",priority=119)
	 public void CrewFeedbackViewer() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.CrewFeedbackViewer(driver);	
		   
		  String ExpectedTitle=data.getData(4,55,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	

	@Test(groups="Crew",priority=120)
	 public void CrewMedicalHistoryViewer() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.CrewMedicalHistoryViewer(driver);	
		   
		  String ExpectedTitle=data.getData(4,56,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	
	@Test(groups="Crew",priority=121)
	 public void CrewMissingDataReport() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.CrewMissingDataReport(driver);	
		   
		  String ExpectedTitle=data.getData(4,57,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=122)
	 public void CrewRetentionRate() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.CrewRetentionRate(driver);	
		   
		  String ExpectedTitle=data.getData(4,58,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	
	@Test(groups="Crew",priority=123)
	 public void HandOverReports() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.HandOverReports(driver);	
		   
		  String ExpectedTitle=data.getData(4,87,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	
	 @Test(groups="Crew",priority=124)
	 public void Crewadmin() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.Crewadmin(driver);	
		   
		  String ExpectedTitle=data.getData(4,88,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	 
	 
	 @Test(groups="Crew",priority=125)
	 public void CrewMatrix() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		Crl.CrewMatrix(driver);	
		   
		  String ExpectedTitle=data.getData(4,89,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	 
	 
	
	
	
	
/*	
	@Test(groups="Crew",priority=80)
	 public void QuestionBank() throws Exception
	  {
		
	  }*/

	
	
}
