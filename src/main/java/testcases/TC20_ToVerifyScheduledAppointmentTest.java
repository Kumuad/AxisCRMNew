package testcases;

import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import commonutilities.CommonMethods;
import commonutilities.CustomListener;
import commonutilities.TestUtil;
import pages.CalendarPage;
import pages.HomePage;
import pages.LoginPage;
import pages.RetailAppointmentPage;
import testbase.TestBase;
@Listeners(CustomListener.class)
public class TC20_ToVerifyScheduledAppointmentTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	RetailAppointmentPage retailAppointmentPage;
     CalendarPage calendarPage;   
	TestUtil testutil;
	CommonMethods commonmethods;

	@Test
	public void ToVerifyScheduledAppointment() throws Exception {

		if (!(CommonMethods.isTestRunnable("TC20_ToVerifyScheduledAppointmentTest"))) {

			throw new SkipException("Skipping the test "
					+ "To Verify Scheduled Appointment".toUpperCase() + "as the Run mode is NO");

		}
		//Excel sheet path
		String appointment_sheetname ="appointment";
				
		initialization();
		Thread.sleep(1000);
		
		loginpage = new LoginPage(driver);
		
		// Login to admin page
		loginpage.Login("axisadmin", "acid_qa");
		
		homepage = new HomePage(driver);

		// Select Administrator Role
		homepage.selectrole("CSO");
		Thread.sleep(2000);
		
		// Move to Home Tab
		homepage.moveToHomeTab();
		
		//click on calendar link
		homepage.clickOnCalendarLink();
		Thread.sleep(2000);
		
	
		
		retailAppointmentPage = new RetailAppointmentPage(driver);
		
		String appointmentsubject=retailAppointmentPage.getAppointmentSubject(appointment_sheetname);
		
		System.out.println("Appointment Subject:  " +appointmentsubject);
		
		calendarPage = new CalendarPage(driver);
		
		calendarPage.clickCalendarButton();
		Thread.sleep(2000);
		calendarPage.clickDayButton();
		Thread.sleep(2000);
		
		
		calendarPage.verfiyCreatedAppointmentOnDay(appointmentsubject);
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		calendarPage.clickCalendarButton();
		
		Thread.sleep(2000);
		
		calendarPage.clickWeekButton();
		Thread.sleep(2000);
		calendarPage.verfiyCreatedAppointmentOnWeek(appointmentsubject);
}
	
	
}