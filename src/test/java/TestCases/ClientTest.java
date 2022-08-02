package TestCases;

import java.io.IOException;
import java.time.Duration;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.payroll.Actions.Action;
import com.payroll.BaseClass.BaseClass;
import com.payroll.PageObjects.ClientPage;
import com.payroll.PageObjects.HomePage;
import com.payroll.PageObjects.LoginPage;
import com.payroll.Utilities.ExcelRead;
import com.payroll.Utilities.Log;
import com.payroll.PageObjects.ClientPage;

public class ClientTest extends BaseClass {

	@Test(groups = { "Regression" })
	  public void searchclientpageTest() throws InterruptedException, IOException {
		Log.startTestCase("Login To Payroll");
		LoginPage lg = new LoginPage(getDriver());
		lg.loginfnt();
		ClientPage cp = new ClientPage(getDriver());
		act.click(getDriver(), cp.Clients());
		act.click(getDriver(), cp.Clientname());
		String s = ExcelRead.readStringData(3, 0);
		System.out.println(s);
		act.type(cp.Clientname(), s);
		act.click(getDriver(), cp.Clientid());
		String s1 = ExcelRead.readIntegerData(3, 1);
		System.out.println(s1);
		act.type(cp.Clientid(), s1);
		act.click(getDriver(), cp.Buttonsubmit());
		boolean actual = act.findElement(getDriver(), cp.getText());
		Assert.assertEquals(actual, true);
		Log.endTestCase("SearchClient And Assertion Completed");

	}
	@Test
	  public void viewclient() throws InterruptedException, IOException {
		Log.startTestCase("Login To Payroll");
		LoginPage lg = new LoginPage(getDriver());
		lg.loginfnt();
		ClientPage cp = new ClientPage(getDriver());
		act.click(getDriver(), cp.Clients());
		act.click(getDriver(), cp.View_icon());
		boolean exp=true;
		boolean actual = act.isDisplayed(getDriver(), cp.invoiceText());
		Assert.assertEquals(actual, exp);
		Log.endTestCase("ViewClient And Assertion Completed");
	}
	
	@Test
	  public void updateclient() throws InterruptedException, IOException {
		Log.startTestCase("Login To Payroll");
		LoginPage lg = new LoginPage(getDriver());
		lg.loginfnt();
		ClientPage cp = new ClientPage(getDriver());
		act.click(getDriver(), cp.Clients());
		act.click(getDriver(), cp.Clientupdate());
		cp.Yourref().clear();
		String yourref = ExcelRead.readStringData(10, 0);
		act.type(cp.Yourref(), yourref);
		act.click(getDriver(), cp.Buttonsubmit());
		boolean exp = true;
		boolean actual = act.isDisplayed(getDriver(), cp.invoiceText());
		Assert.assertEquals(actual, exp);
		Log.endTestCase("Update Client And Assertion Completed");

}
}
