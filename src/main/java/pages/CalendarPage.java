package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import commonutilities.CommonMethods;
import testbase.TestBase;

public class CalendarPage extends TestBase {

	// WebDriver driver;
	public CalendarPage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	// *************************Object Repository************

//"(//div[@class='rbc-event'])[2]")

	@FindBy(xpath = "//a[@class='button--calendar justify-between']")
	WebElement calendarButton;

	@FindBy(xpath = "//a[contains(text(),'Month')]")
	WebElement MonthButton;

	@FindBy(xpath = "//a[contains(text(),'Day')]")
	WebElement DayButton;

	@FindBy(xpath = "//a[contains(text(),'Week')]")
	WebElement WeekButton;

	// **************Methods*************

	// click On Calendar Button
	public void clickCalendarButton() {
		CommonMethods.highlightelement(calendarButton);
		calendarButton.click();

	}

	// click On Month Button
	public void clickMonthButton() {
		CommonMethods.highlightelement(MonthButton);
		MonthButton.click();

	}

	// click On Day Button
	public void clickDayButton() {
		CommonMethods.highlightelement(DayButton);
		DayButton.click();

	}

	// click On Week Button
	public void clickWeekButton() {
		CommonMethods.highlightelement(WeekButton);
		WeekButton.click();

	}
	
	
	//to verify created appointed on day
	
	public void verfiyCreatedAppointmentOnDay(String text) {

		WebElement ele = driver.findElement(By.xpath("//div[contains(text(), '" + text + "')]"));
		// ele.getText();
		// System.out.println(ele);
		boolean flag = false;
		if (ele.isDisplayed() == true) {
			System.out.println("Appointment Present");
			flag = true;
		}
		// boolean value=ele.isDisplayed();

		Assert.assertTrue(flag, "Created appointment not present");
		// System.out.println(value);

	}
	
	//to verify created appointed on week
	
	public void verfiyCreatedAppointmentOnWeek(String text) {

		WebElement ele = driver.findElement(By.xpath("//div[contains(text(), '" + text + "')]"));
		// ele.getText();
		// System.out.println(ele);
		boolean flag = false;
		if (ele.isDisplayed() == true) {
			System.out.println("Appointment Present");
			flag = true;
		}
		// boolean value=ele.isDisplayed();

		Assert.assertTrue(flag, "Created appointment not present");
		// System.out.println(value);

	}

}
