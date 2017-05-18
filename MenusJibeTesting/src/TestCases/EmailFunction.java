package TestCases;

import org.testng.annotations.Test;

import MenusList.SendEmail;


public class EmailFunction {

  @Test
	  public void EmailTestReport()
	  {
	  SendEmail SendEmail =new SendEmail();

	   SendEmail.Send();


	  }
}
