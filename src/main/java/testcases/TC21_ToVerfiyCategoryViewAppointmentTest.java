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
public class TC21_ToVerfiyCategoryViewAppointmentTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	RetailAppointmentPage retailAppointmentPage;
	TestUtil testutil;
	CommonMethods commonmethods;
	
	@Test
	
	public void ToVerfiyCategoryViewAppointment() throws Exception {

		if (!(CommonMethods.isTestRunnable("TC21_ToVerfiyCategoryViewAppointmentTest"))) {

			throw new SkipException("Skipping the test "
					+ "To Verfiy Category View Appointment".toUpperCase() + "as the Run mode is NO");

		}
		//Excel sheet path
		String appointment_sheetname ="appointment";
				
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
		Thread.sleep(3000);
		
		
		retailAppointmentPage = new RetailAppointmentPage(driver);
		
		String appointmentsubject=retailAppointmentPage.getAppointmentSubject(appointment_sheetname);
		
		
		retailAppointmentPage.verifyMyActivitiesView(appointmentsubject);
		
		// click On New Button
		homepage.clickOnNewButton();

		Thread.sleep(2000);
		// click On Retail Appointment link
		homepage.clickOnRetailAppointmentLink();
		Thread.sleep(2000);
		retailAppointmentPage.createAppointmentForSubordinateActivities(appointment_sheetname);
		
	
		//logout
				loginpage.Logout();

		
		
		
}
}