package TestCases;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.payroll.BaseClass.BaseClass;
import com.payroll.PageObjects.AddDeductionPage;
import com.payroll.PageObjects.DeductionPage;
import com.payroll.PageObjects.LoginPage;
import com.payroll.Utilities.ExcelRead;
import com.payroll.Utilities.Log;
public class AddDeductionTest extends BaseClass{
	@Test
	public void addWorkerDeduction() throws IOException, InterruptedException
	{
		Log.startTestCase("Login To Payroll");
		LoginPage Lg = new LoginPage(getDriver());
		Lg.loginfnt();
		DeductionPage dp = new DeductionPage (getDriver());
		act.click(getDriver(), dp.deduct());
		act.click(getDriver(), dp.adddeduct());
		AddDeductionPage adp = new AddDeductionPage(getDriver());
		Log.info("Start To Enter Deduction Details");
		act.click(getDriver(), adp.Worker());
		act.selectByIndex(adp.Worker(), 1);
		act.click(getDriver(), adp.Type());
		act.selectByIndex(adp.Type(), 2);
		act.click(getDriver(), adp.Amount());
		String s = ExcelRead.readIntegerData(8, 1);
		act.type(adp.Amount(), s);
		act.click(getDriver(), adp.EffcetFrom());
		act.click(getDriver(), adp.SaveBtn());
		Thread.sleep(3000);
		boolean actual = act.findElement(getDriver(), adp.getText());
		Assert.assertEquals(actual, true);
		Log.endTestCase("Login And Assertion Completed");

	}
	@Test
	public void withoutfillMandatoryFeild() throws IOException, InterruptedException
	{
		Log.startTestCase("Login To Payroll");
		LoginPage Lg = new LoginPage(getDriver());
		Lg.loginfnt();
		DeductionPage dp = new DeductionPage (getDriver());
		act.click(getDriver(), dp.deduct());
		act.click(getDriver(), dp.adddeduct());
		AddDeductionPage adp = new AddDeductionPage(getDriver());
		Log.info("Start To Enter Deduction Details");
		act.click(getDriver(), adp.Worker());
		act.selectByIndex(adp.Worker(), 1);
		act.click(getDriver(), adp.Type());
		act.selectByIndex(adp.Type(), 2);
		act.click(getDriver(), adp.EffcetFrom());
		act.click(getDriver(), adp.SaveBtn());
		Thread.sleep(3000);
		boolean actual = act.findElement(getDriver(), adp.getText());
		Assert.assertEquals(actual, true);
		Log.endTestCase("Login And Assertion Completed");

	}
}
