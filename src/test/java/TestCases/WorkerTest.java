package TestCases;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.payroll.BaseClass.BaseClass;
import com.payroll.PageObjects.LoginPage;
import com.payroll.PageObjects.WorkerPage;
import com.payroll.Utilities.ExcelRead;
import com.payroll.Utilities.Log;

public class WorkerTest extends BaseClass {
	
	@Test
	 public void searchworkerpageTest() throws InterruptedException, IOException {
		Log.startTestCase("Login To Payroll");
		LoginPage lg = new LoginPage(getDriver());
		lg.loginfnt();
		Log.info("Start To Enter Worker Details");
		WorkerPage wp = new WorkerPage(getDriver());
		act.click(getDriver(), wp.Workers());
		act.click(getDriver(), wp.FirstName());
		String s = ExcelRead.readStringData(5, 0);
		System.out.println(s);
		act.type(wp.FirstName(), s);
		act.click(getDriver(), wp.LastName());
		String s1 = ExcelRead.readStringData(4, 1);
		System.out.println(s1);
		act.type(wp.LastName(), s1);
		act.click(getDriver(), wp.Postcode());
		String s2= ExcelRead.readIntegerData(8, 0);
		act.type(wp.Postcode(), s2);
		act.click(getDriver(), wp.NiNumber());
		String s3= ExcelRead.readIntegerData(3, 1);
		act.type(wp.NiNumber(), s3);
		act.click(getDriver(), wp.ButtonSearch());
		String exp ="#";
		String actual=wp.AssertText(); 
		Assert.assertEquals(actual, exp);
		Log.endTestCase("Test And Assertion Completed");
	}

	}


