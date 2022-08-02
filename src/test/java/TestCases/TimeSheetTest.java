package TestCases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.payroll.BaseClass.BaseClass;
import com.payroll.PageObjects.HomePage;
import com.payroll.PageObjects.LoginPage;
import com.payroll.PageObjects.TimeSheetPage;
import com.payroll.Utilities.Log;

public class TimeSheetTest extends BaseClass {

	@Test
	public void eyeClick_View() throws IOException, InterruptedException {
		Log.startTestCase("Approve TimeSheet Started");
		LoginPage Lg = new LoginPage(getDriver());
		Lg.loginfnt();
		HomePage hp = new HomePage(getDriver());
		hp.Timesheet().click();
		Log.info("Going to click on Eye Link");
		TimeSheetPage tsp = new TimeSheetPage(getDriver());
		act.click(getDriver(), tsp.ViewTimesheet());
		boolean Expected = true;
		boolean actual = act.findElement(getDriver(), tsp.Getasserttext());
		Assert.assertEquals(actual, Expected);
	}
	@Test
	public void clickPending() throws InterruptedException, IOException {
		Log.startTestCase("Approve TimeSheet Started");
		LoginPage Lg = new LoginPage(getDriver());
		Lg.loginfnt();
		HomePage hp = new HomePage(getDriver());
		hp.Timesheet().click();
		Log.info("Going to click approve button");
		TimeSheetPage tsp = new TimeSheetPage(getDriver());
		tsp.ApproveTimeSheet().click();
		boolean expected = true;
		boolean actual = act.isDisplayed(getDriver(), tsp.ViewLogo());
		Assert.assertEquals(actual, expected);
		Log.endTestCase("Timesheets Approved and Assertion Completed");

	}

	@Test
	public void pencilClick_edit() throws IOException, InterruptedException {
		LoginPage Lg = new LoginPage(getDriver());
		Lg.loginfnt();
		HomePage hp = new HomePage(getDriver());
		hp.Timesheet().click();
		Log.info("Going to click on Pencil Link");
		TimeSheetPage tsp = new TimeSheetPage(getDriver());
		act.click(getDriver(), tsp.EditTimesheet());
		boolean Exp = true;
		boolean actual = act.isDisplayed(getDriver(), tsp.View_Dashboard());
		Assert.assertEquals(actual, Exp);
	}

}
