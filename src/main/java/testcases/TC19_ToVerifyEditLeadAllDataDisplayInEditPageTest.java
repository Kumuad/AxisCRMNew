package testcases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import commonutilities.CommonMethods;
import commonutilities.TestUtil;
import pages.HomePage;
import pages.LeadsPage;
import pages.LoginPage;
import pages.OffersAndLeadPage;
import testbase.TestBase;

public class TC19_ToVerifyEditLeadAllDataDisplayInEditPageTest extends TestBase {

	LoginPage loginpage;
	HomePage homepage;
	OffersAndLeadPage offersAndLeadPage;
	LeadsPage leadspage;
	TestUtil testutil;
	CommonMethods commonmethods;

	@Test
	public void ToVerifyEditLeadAllDataDisplayInEditPage() throws Exception {

		if (!(CommonMethods.isTestRunnable("TC19_ToVerifyEditLeadAllDataDisplayInEditPageTest"))) {

			throw new SkipException("Skipping the test "
					+ "To Verify Edit Lead All Data Display In Edit Page".toUpperCase() + "as the Run mode is NO");

		}

		// Excel sheet path
		String leadcreation_sheetname = "leadcreation";

		initialization();
		
		
		loginpage = new LoginPage(driver);
		log.info("************Login to Home Page*************************");
		// Login to admin page
		loginpage.Login("axisadmin", "acid_qa");

		homepage = new HomePage(driver);
		// Select Administrator Role
		homepage.selectrole("CSO");
		Thread.sleep(2000);

		// Click On Recent Items
		homepage.clickOnRecentItems();

		leadspage = new LeadsPage(driver);
		
		Thread.sleep(2000);
		leadspage.clickOnEditButton();
		
		Thread.sleep(5000);
		leadspage.verifyEditLeadPage(leadcreation_sheetname);
		Thread.sleep(2000);
		loginpage.Logout();

	}
}