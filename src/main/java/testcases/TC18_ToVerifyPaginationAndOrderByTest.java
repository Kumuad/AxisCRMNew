package testcases;

import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import commonutilities.CommonMethods;
import commonutilities.CustomListener;
import commonutilities.TestUtil;
import pages.HomePage;
import pages.LoginPage;
import pages.RetailAppointmentPage;
import testbase.TestBase;
@Listeners(CustomListener.class)
public class TC18_ToVerifyPaginationAndOrderByTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	TestUtil testutil;
	CommonMethods commonmethods;
	RetailAppointmentPage retailAppointmentPage;

	@Test
	public void ToVerifyPaginationAndOrderByTest() throws Exception {
		
		
		if (!(CommonMethods.isTestRunnable("TC18_ToVerifyPaginationAndOrderByTest"))) {
			  
			  throw new SkipException("Skipping the test " + "To Verify Pagination And Order By".toUpperCase() + "as the Run mode is NO"); 
			  
			  }

		
		testutil = new TestUtil();
		commonmethods = new CommonMethods();
		
		initialization();
		
		loginpage = new LoginPage(driver);
		// Login to admin page
		loginpage.Login("axisadmin", "acid_qa");
		
		homepage = new HomePage(driver);
		
		// Select Administrator Role
		homepage.selectrole("CSO");
		Thread.sleep(2000);

		// Move to Home Tab
		homepage.moveToHomeTab();

		Thread.sleep(3000);
		
		// CLick On Activities Link
		homepage.clickOnActivitiesLink();
		
		retailAppointmentPage = new RetailAppointmentPage(driver);
		
		// click on Arrow button Under Views
		retailAppointmentPage.clickOnArrowButton();
		Thread.sleep(10000);

		//retailAppointmentPage.verifyPaginationDropDownValues();
		
		Thread.sleep(3000);
		//retailAppointmentPage.verifypaginationGoToTextBox();
		
		retailAppointmentPage.verifyOrderByNames();
		
		//logout
				loginpage.Logout();


	}
}