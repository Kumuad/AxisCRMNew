package testcases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import commonutilities.CommonMethods;
import commonutilities.TestUtil;
import pages.HomePage;
import pages.LoginPage;

import pages.OffersAndLeadPage;
import testbase.TestBase;

public class TC17_ToVerifyonEditOffersAlldataDisplayInEditPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	OffersAndLeadPage offersAndLeadPage;
	
	
	TestUtil testutil;
	CommonMethods commonmethods;

	@Test
	public void ToVerifyonEditOffersAlldataDisplayInEditPage() throws Exception {
		

		if (!(CommonMethods.isTestRunnable("TC17_ToVerifyonEditOffersAlldataDisplayInEditPageTest"))) {
			  
			  throw new SkipException("Skipping the test " + "To Verify on Edit Offers All data Display In Edit age".toUpperCase() + "as the Run mode is NO"); 
			  
			  }
		
		
         String offer_sheetname="offercreation";
		
		//loginpage = new LoginPage(driver);
		//homepage = new HomePage(driver);
		//offersAndLeadPage = new OffersAndLeadPage(driver);
		testutil = new TestUtil();
		commonmethods = new CommonMethods();
		
		
           initialization();
		
		loginpage = new LoginPage(driver);
		// Login to admin page
		loginpage.Login("axisadmin", "acid_qa");

		homepage = new HomePage(driver);
		
		
		// Select Administrator Role
		homepage.selectrole("Administrator");
		Thread.sleep(2000);
		
		// Move to sales Tab
		homepage.moveToMarketingTab();
		Thread.sleep(2000);
				
		//click On Offers Link
		homepage.clickOnOffersLink();
		
		Thread.sleep(2000);
		
		//click On recently Accessed Offer on Home Page
		homepage.clickOnRecentlyAccessedOffer();
		Thread.sleep(2000);
		
		offersAndLeadPage = new OffersAndLeadPage(driver);
		
		//click On Edit Offer Button
		offersAndLeadPage.clickEditOfferButton();
		
		Thread.sleep(5000);
		offersAndLeadPage.verifyEditOfferPage(offer_sheetname);
		
		loginpage.Logout();

	}
}
