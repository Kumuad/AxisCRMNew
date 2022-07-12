package pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import commonutilities.CommonMethods;
import commonutilities.TestUtil;
import testbase.TestBase;
import pages.CustomerPage;
public class RetailAppointmentPage extends TestBase{
	
	/*
	 * // Constructor public RetailAppointmentPage(WebDriver driver) { //super();
	 * this.driver = driver; PageFactory.initElements(driver, this);
	 * 
	 * 
	 * }
	 */

		public RetailAppointmentPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		//public static String appointment_sheet ="appointment";
		
		public static String fileupload_appointment_path=  "C:\\Users\\kumuad.sagar\\eclipse-workspace\\AxisCRM\\src\\main\\java\\commonutilities\\Test.docx";
		
		
		
		  public static int num=CommonMethods.generateRandomNumber(); 
		  public static String s=String.valueOf(num); 
		  public static String value="appointment";
		  public static String subject=value.concat(s);
		 
		// *********Object Repository Retail Appointment Page***************

		@FindBy(xpath = "//a[@data-autoid='New_0']")
		WebElement newButton;
		
		@FindBy(xpath ="//a[@data-autoid='cust_957_srch']")
		WebElement typeCustomerPickerSearch;
		
		@FindBy(xpath ="//a[@data-autoid='ACT_ASSIGNEDTO_srch']")
		WebElement assignedToPickerSearch;
		
		
		@FindBy(xpath ="//input[@data-autoid='Grid_SearchTextBox_ctrl']")
		WebElement searchTextBox;
		
		
		@FindBy(xpath ="//a[@data-autoid='gridHF_cust_957']")
		WebElement filterbutton;
		
		@FindBy(xpath ="//a[@data-autoid='gridHF_ACT_ASSIGNEDTO']")
		WebElement assignedTofilterbutton;
		
		
		@FindBy(xpath ="//div[@data-autoid='ShortName_0']")
		WebElement assignedToshortName;
		
		@FindBy(xpath ="//input[@name='checkbox0']")
		WebElement customercheckbox;
		
		@FindBy(xpath ="//input[@data-autoid='ACT_SUBJECT_ctrl']")
		WebElement subjectTextBox;
		
		@FindBy(xpath ="//textarea[@data-autoid='Act_Detail_ctrl']")
		WebElement detailsTextBox;
		
		@FindBy(xpath ="//a[@data-autoid='Save']")
		WebElement saveButton;
		
		@FindBy(xpath ="//button[contains(text(),'Ok')]")
		WebElement okButton;
		
		@FindBy(xpath ="//input[@name='qqfile']")
	    //@FindBy(xpath="//i[@class='icon icon-viewattachment f4']")
		WebElement attachement;
		
		
		@FindBy(xpath ="//a[@data-autoid='gridHF_View0']")
		WebElement arrowbutton;
		
		@FindBy(xpath ="//select[@data-autoid='QueryCategoryId_ctrl']")
		WebElement activityViewsdropdown;
		
		@FindBy(xpath ="//div[@data-autoid='ActivityNo_0']")
		WebElement activityID;
		
		
		@FindBy(xpath ="//a[@data-autoid='Subject_0']/span[2]")
		WebElement appointmentSubject;
		
		
		@FindBy(xpath ="//div[@data-autoid='Status_0']")
		WebElement appointmentStatus;
		
		@FindBy(xpath ="//div[@data-autoid='Activity_DueDate_0']")
		WebElement appointmentDuedate;
		
		
		@FindBy(xpath ="//div[@data-autoid='DueDate_0']")
		WebElement appointmentDuedateOnRetailsCustomerPage;
		
		@FindBy(xpath ="//div[@data-autoid='0_AI']/div/i")
		WebElement appointmentClosEditLink;
		
		
		
		@FindBy(xpath ="//a[@data-autoid='0_LINK_EDITView01']")
		WebElement EditViewLink;
		
		@FindBy(xpath ="//a[@data-autoid='0_LINK_CLOSEView00']")
		WebElement CloseViewLink;
		
		@FindBy(xpath ="//select[@data-autoid='ACT_STATUS_ctrl']")
		WebElement activityStatusdropdown;
		
		
		@FindBy(xpath ="//div[@class='crm-grid-row relative']")
		WebElement activityPagination;
		
		
		@FindBy(xpath ="//div[contains(text(),'Retail Customer')]")
		WebElement RetailsCustomerPage;
		
		@FindBy(xpath ="//div[contains(text(),'Activities')]")
		WebElement activitiesPage;
		
		
		
		
		@FindBy(xpath ="//div[@class='pagination__item']")
		WebElement pagination;
		
		@FindBy(xpath ="//div[@class='pagination__item justify-end']")
		WebElement paginationend;
		
		@FindBy(xpath ="//div[@class='crm-grid-row relative']")
		WebElement paginationlist;
		
		@FindBy(xpath ="//select[@data-autoid='pagesize_listing']")
		WebElement pagelistingdropdown;
		
		@FindBy(xpath ="//div[@class='field filter__textbox']/input")
		WebElement pageGoToTextbox;
		
		
		@FindBy(xpath ="//div[@class='showrecords f12 mr2']")
		WebElement paginationShowRecordsText;
		
		@FindBy(xpath ="//div[@class='react-grid-HeaderCell-sortable react-grid-HeaderCell-sortable--ascending']")
		WebElement nameaAscending;
		
		@FindBy(xpath ="//div[@class='react-grid-HeaderCell-sortable react-grid-HeaderCell-sortable--descending']")
		WebElement nameDescending;
		
		@FindBy(xpath ="//div[@class='react-grid-Cell__value']//span[@class='acd-link-text']")
		WebElement nameListPagination;
		
		@FindBy(xpath ="(//div[contains(text(),'Subject')])[1]/ancestor::div[@class='react-grid-HeaderCell-sortable']")
		//@FindBy(xpath ="(//div[contains(text(),'Subject')])[1]")
		WebElement nameSorter;
		//**********views xpath********
		
		@FindBy(xpath ="//select[@data-autoid='QueryCategoryId_ctrl']")
		WebElement categorydDropdown;
		
		@FindBy(xpath ="//select[@data-autoid='QueryViewId_ctrl']")
		WebElement viewIdDropdown;
		
		
		
		
		
		
		// **************Methods********************

		// click On New Button On Customer Page
		public void clickOnNewButton() throws InterruptedException {
			CommonMethods.mouseHover(newButton);
			CommonMethods.highlightelement(newButton);

		}
		
		public String getactualSubject() {

			return subject;
		}

		public  void createappointment(String appointment_sheet) throws InterruptedException, IOException {
			
			CommonMethods.switchwindow();
			Thread.sleep(3000);
			driver.manage().window().maximize();
			//Enter Type of Customer
			typeCustomerPickerSearch.click();
			Thread.sleep(2000);
			
			searchTextBox.sendKeys(TestUtil.getCellData(appointment_sheet, "TypeOfCustomer", 1));
			
			String typeofcustomer=TestUtil.getCellData(appointment_sheet, "TypeOfCustomer", 1);
			System.out.println("Type of Customer Selected: "+typeofcustomer);
			System.out.println();
			filterbutton.click();
			Thread.sleep(3000);
			
			CommonMethods.clickelementbyjavascript(customercheckbox);
			Thread.sleep(3000);
			
			okButton.click();
			
			//Enter Subject 
			//int num=CommonMethods.generateRandomNumber();
			//String s=String.valueOf(num);
			//String value="appointment";
		   // String subject=value.concat(s);
			subjectTextBox.sendKeys(subject);
			System.out.println("Subject Entered: "+subject);
			System.out.println();
			TestUtil.writeToExcel(appointment_sheet, 1, 1, subject);
			
			Thread.sleep(3000);
			
			
			CommonMethods.scrollByVisibilityofElement(detailsTextBox);
            //enter Details
			detailsTextBox.sendKeys(TestUtil.getCellData(appointment_sheet, "Details", 1));
			
			String details=TestUtil.getCellData(appointment_sheet, "Details", 1);
			System.out.println("Details Entered: "+details);
			System.out.println();
			Thread.sleep(3000);
			CommonMethods.clickelementbyjavascript(attachement);
			
			Thread.sleep(3000);
			
			
			// upload file on appointments page
			CommonMethods.fileupload(fileupload_appointment_path);
			Thread.sleep(2000);
			
			saveButton.click();
			
			Thread.sleep(10000);
			
			//switch to parent window
			CommonMethods.switchtoparentwindow();
			Thread.sleep(8000);
			
		   String exptitle="Activities - CRMnext - Smart.Easy.Complete";
			//boolean value=activitiesPage.isDisplayed();
			//boolean value1=RetailsCustomerPage.isDisplayed();
			//click On Arrow Button on Views Page
			if(driver.getTitle().equalsIgnoreCase(exptitle))
			{
			clickOnArrowButton();
			Thread.sleep(3000);
			CommonMethods.selectByText(activityViewsdropdown, "Appointment");
			
            System.out.println("=======================================================================================================");
			
			System.out.println("Activity is created with Activity ID:   "+activityID.getText()+", Subject: " 
			+appointmentSubject.getText()+", Status: "+appointmentStatus.getText()+"  and Due date:"+appointmentDuedate.getText());
		
			System.out.println("========================================================================================================");
			TestUtil.takeScreenShot("Appointment Creation");
			}
			
			else {
				Thread.sleep(4000);
				System.out.println("=======================================================================================================");
				
				System.out.println("Activity is created with Subject:   "+" Subject: " 
				+appointmentSubject.getText()+", Status: "+appointmentStatus.getText()+"  and Due date:"+appointmentDuedateOnRetailsCustomerPage.getText());
				
				System.out.println("========================================================================================================");
				TestUtil.takeScreenShot("Appointment Creation");
			}
			
		}
		
		
		
		//click On Arrow Button on views
		
		public void clickOnArrowButton() throws InterruptedException {
			Thread.sleep(1000);
			CommonMethods.highlightelement(arrowbutton);
			Thread.sleep(2000);
			CommonMethods.clickelementbyjavascript(arrowbutton);
			
		}
		
		//Mouse Hover On Appointment Close Edit link in Views
		public void movehoverOnCLoseEditLink() {
			
			CommonMethods.mouseHover(appointmentClosEditLink);
			
			CommonMethods.highlightelement(appointmentClosEditLink);
		}
		//click on Edit Link under Views
		
		public void clickOnEditViewLink() {
			CommonMethods.highlightelement(EditViewLink);
			EditViewLink.click();
		}
		//click on Close Link under Views
		public void clickOnCLoseViewLink() {
			CommonMethods.highlightelement(CloseViewLink);
			CloseViewLink.click();
		}
		
		
		//Edit Appointment
		public void editAppointment(String appointment_sheet) throws InterruptedException, IOException {
			CommonMethods.switchwindow();
			Thread.sleep(3000);
			driver.manage().window().maximize();
			
			// Edit activity Status
			CommonMethods.selectByText(activityStatusdropdown, "In Progress");

			Thread.sleep(2000);
			CommonMethods.scrollDown(200);
			
			String details = TestUtil.getCellData(appointment_sheet, "Details", 1);
			detailsTextBox.sendKeys(details.concat("Edited"));
			Thread.sleep(2000);
			saveButton.click();

			// switch to parent window
			CommonMethods.switchtoparentwindow();
			Thread.sleep(3000);
			
			clickOnArrowButton();
			
			Thread.sleep(3000);
			System.out.println("===================================================================");

			System.out.println("Appointment Edited With Status: : " + appointmentStatus.getText());
			TestUtil.takeScreenShot("Appointment Edited");

			System.out.println("====================================================================");
		}
		
		
		
		//close Appointment
		
		public void closeAppointment() throws InterruptedException, IOException {
			CommonMethods.switchwindow();
			Thread.sleep(3000);
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			//TestUtil.takeScreenShot("Appointment Closed");
			saveButton.click();
			
			// switch to parent window
			CommonMethods.switchtoparentwindow();
			Thread.sleep(2000);
             clickOnArrowButton();
			
			Thread.sleep(4000);
			System.out.println("===================================================================");
			System.out.println("Appointment Closed With Status: : " + appointmentStatus.getText());
			System.out.println("====================================================================");
			TestUtil.takeScreenShot("Appointment Closed");
		}
		
		
		
		public String getAppointmentSubject(String appointment_sheet) throws IOException {
			
		
				//String appointmentsubject=	appointmentSubject.getText();
				String appointmentsubject=TestUtil.getCellData(appointment_sheet, "Subject", 1);
				return appointmentsubject;
			
		}
		
		//pagination
		
		
		
		//for dropdown  check values
		public void verifyPaginationDropDownValues() throws InterruptedException, IOException {
			//select value from dropdown as 10
			
			verifypaginationdropdownvalues10();
			 Thread.sleep(4000);
			 verifypaginationdropdownvalue20();
				 
		}
		
		//select value from pagination dropdown as 10
		public void verifypaginationdropdownvalues10() throws InterruptedException {
			 CommonMethods.scrollByVisibilityofElement(pagelistingdropdown);
			  Thread.sleep(4000);
			  CommonMethods.selectByText(pagelistingdropdown, "10");
			  
			  Thread.sleep(4000);
			  List<WebElement>  ele=driver.findElements(By.xpath("//div[@class='crm-grid-row relative']"));
			  int actualcount10=ele.size(); 
			  System.out. println("Row count after selecting dropdown Value as 10 from Pagination: "+ele.size()); 
			  		 //System.out.println(ele.size());
		
			  int expcount=10; 
			  Assert.assertEquals(expcount, actualcount10,"Count mismatched");
			 
		}
		
		public void verifypaginationdropdownvalue20() throws InterruptedException {
			
			 CommonMethods.scrollByVisibilityofElement(pagelistingdropdown);
			  Thread.sleep(4000);
			  CommonMethods.selectByText(pagelistingdropdown, "20");
			  
			  Thread.sleep(4000);
			  List<WebElement>  ele=driver.findElements(By.xpath("//div[@class='crm-grid-row relative']"));
			  int actualcount10=ele.size(); 
			  System.out. println("Row count after selecting dropdown Value as 20 from Pagination: "+ele.size()); 
			  		 //System.out.println(ele.size());
		
			  int expcount=20; 
			  Assert.assertEquals(expcount, actualcount10,"Count mismatched");
		}
		
		
		
		//verify Go To pagination TextBox
		
		public void verifypaginationGoToTextBox() throws InterruptedException {
			
			  Thread.sleep(4000);
			  CommonMethods.scrollByVisibilityofElement(pageGoToTextbox);
			pageGoToTextbox.sendKeys("2");
			  Thread.sleep(4000);
			pageGoToTextbox.sendKeys(Keys.ENTER);
			  Thread.sleep(4000);
			Assert.assertTrue(driver.findElement(By.xpath("//a[@data-autoid='pagination_2']")).isEnabled());
			
		}
		
		
		//select value from dropdown from views
		
		public void verifyMyActivitiesView(String subject) throws InterruptedException {
			CommonMethods.selectByText(categorydDropdown, "Appointment");
			  Thread.sleep(2000);
			CommonMethods.selectByText(viewIdDropdown, "My Activites");
			  Thread.sleep(2000);
			arrowbutton.click();
			
			String actualappointment=appointmentSubject.getText();
			
			Assert.assertEquals(subject, actualappointment, "Created appointment not present in My Activities Views");
			
			
			
		}
		
		
       public  String createAppointmentForSubordinateActivities(String appointment_sheet) throws InterruptedException, IOException {
			
			CommonMethods.switchwindow();
			Thread.sleep(3000);
			driver.manage().window().maximize();
			
			//select assigned to
			assignedToPickerSearch.click();
			Thread.sleep(2000);
			searchTextBox.sendKeys(TestUtil.getCellData(appointment_sheet, "AssignedTo", 2));
			String assignedTo=TestUtil.getCellData(appointment_sheet, "AssignedTo", 2);
			System.out.println("Assigned To Selected: "+assignedTo);
			System.out.println();
			assignedTofilterbutton.click();
			Thread.sleep(2000);
			assignedToshortName.click();
			
			Thread.sleep(2000);
			
			
			//Enter Type of Customer
			typeCustomerPickerSearch.click();
			Thread.sleep(2000);
			
			searchTextBox.sendKeys(TestUtil.getCellData(appointment_sheet, "TypeOfCustomer", 2));
			
			String typeofcustomer=TestUtil.getCellData(appointment_sheet, "TypeOfCustomer", 2);
			System.out.println("Type of Customer Selected: "+typeofcustomer);
			System.out.println();
			filterbutton.click();
			Thread.sleep(3000);
			
			CommonMethods.clickelementbyjavascript(customercheckbox);
			Thread.sleep(3000);
			
			okButton.click();
			
			//Enter Subject 
			//int num=CommonMethods.generateRandomNumber();
			//String s=String.valueOf(num);
			//String value="appointment";
		   // String subject=value.concat(s);
			subjectTextBox.sendKeys(subject);
			System.out.println("Subject Entered: "+subject);
			System.out.println();
			TestUtil.writeToExcel(appointment_sheet, 2, 1, subject);
			
			Thread.sleep(3000);
			
			
			CommonMethods.scrollByVisibilityofElement(detailsTextBox);
            //enter Details
			detailsTextBox.sendKeys(TestUtil.getCellData(appointment_sheet, "Details", 2));
			
			String details=TestUtil.getCellData(appointment_sheet, "Details", 2);
			System.out.println("Details Entered: "+details);
			System.out.println();
			Thread.sleep(3000);
			CommonMethods.clickelementbyjavascript(attachement);
			
			Thread.sleep(3000);
			
			
			// upload file on appointments page
			CommonMethods.fileupload(fileupload_appointment_path);
			Thread.sleep(2000);
			
			saveButton.click();
			
			Thread.sleep(10000);
			
			//switch to parent window
			CommonMethods.switchtoparentwindow();
			Thread.sleep(8000);
			
		   String exptitle="Activities - CRMnext - Smart.Easy.Complete";
			//boolean value=activitiesPage.isDisplayed();
			//boolean value1=RetailsCustomerPage.isDisplayed();
			//click On Arrow Button on Views Page
			if(driver.getTitle().equalsIgnoreCase(exptitle))
			{
			clickOnArrowButton();
			Thread.sleep(3000);
			CommonMethods.selectByText(activityViewsdropdown, "Appointment");
			
            System.out.println("=======================================================================================================");
			
			System.out.println("Activity is created with Activity ID:   "+activityID.getText()+", Subject: " 
			+appointmentSubject.getText()+", Status: "+appointmentStatus.getText()+"  and Due date:"+appointmentDuedate.getText());
		
			System.out.println("========================================================================================================");
			//TestUtil.takeScreenShot("Appointment Creation");
			}
			
			else {
				Thread.sleep(4000);
				System.out.println("=======================================================================================================");
				
				System.out.println("Activity is created with Subject:   "+" Subject: " 
				+appointmentSubject.getText()+", Status: "+appointmentStatus.getText()+"  and Due date:"+appointmentDuedateOnRetailsCustomerPage.getText());
				
				System.out.println("========================================================================================================");
				//TestUtil.takeScreenShot("Appointment Creation");
			}
			return appointmentSubject.getText();
       }	
		public void verifySubordinateActivitiesView(String appointment_sheet) throws InterruptedException, IOException {
			String expappointmentsubject=createAppointmentForSubordinateActivities(appointment_sheet);
			
			  Thread.sleep(2000);
			
			CommonMethods.selectByText(categorydDropdown, "Appointment");
			  Thread.sleep(2000);
			CommonMethods.selectByText(viewIdDropdown, "Subordinate Activities");
			
          arrowbutton.click();
          Thread.sleep(2000);
			String actualappointment=appointmentSubject.getText();
			Assert.assertEquals(expappointmentsubject, actualappointment, "Created appointment not present in My Subordinate Views");
			
		}
		
		
		//order by name .sorting pagination
		
		public void verifyOrderByNames() throws InterruptedException {
			boolean flag = nameSorter.isDisplayed();
			//boolean flagasc=nameaAscending.isDisplayed();
			System.out.println(flag);
			//System.out.println(flagasc);
			/*
			 * if( nameSorter.isDisplayed()) { nameSorter.click(); System.out.println("hi");
			 * 
			 * } else {
			 * 
			 * nameDescending.click(); Thread.sleep(2000); nameSorter.click();
			 * System.out.println("hi");
			 * 
			 * 
			 * }
			 */
			
	/*		ArrayList<String> ActualList = new ArrayList<String>();
				List<WebElement> elementList= driver.findElements(By.xpath("//div[@class='react-grid-Cell__value']//span[@class='acd-link-text']"));
				
				for(WebElement we:elementList){
					ActualList.add(we.getText());
					System.out.println("Actual List "+we.getText());
					}
				
				
				ArrayList<String> sortedList = new ArrayList<String>();   
				for(String s:ActualList){
					
				sortedList.add(s);
				System.out.println("Sorted List "+s);
				}
				
				Collections.sort(sortedList);
				System.out.println("Ascending  List"+sortedList);
				Collections.reverse(sortedList);
				System.out.println("Reverse List"+sortedList);
				Assert.assertTrue(sortedList.equals(ActualList));	
			}
			
		*/
		}
			
			public void verifyActivityIDAscendingOrder() {
				ArrayList<String> ActualList = new ArrayList<String>();
				List<WebElement> elementList= driver.findElements(By.xpath("//div[@class='react-grid-Cell__value']//span[@class='acd-link-text']"));
				
				for(WebElement we:elementList){
					
					ActualList.add(we.getText());
					System.out.println("Actual List order:  "+we.getText());
					
					ArrayList<String> ExpectedList = new ArrayList<String>();

					// COPY actual list to another list
					ExpectedList.addAll(ActualList);
					Collections.sort(ExpectedList);
					
					System.out.println("Expected List order:  "+ExpectedList);
					
					
					
					
					
					//Assert.assertEquals(" list are sorted in assending order: ", ExpectedList, ActualList);
					Assert.assertEquals(ActualList, ExpectedList, "list are sorted in assending order: ");
					}
				
				
			}
		

		
	}
