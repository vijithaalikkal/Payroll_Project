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
public class DeductionTest extends BaseClass{
	@Test
	public void viewDeduction() throws InterruptedException, IOException {
		Log.startTestCase("Login To Payroll");
		LoginPage lg = new LoginPage(getDriver());
		lg.loginfnt();
		DeductionPage dp = new DeductionPage (getDriver());
		act.click(getDriver(), dp.deduct());
		act.click(getDriver(), dp.View());
		boolean exp = true;
		boolean actual =act.isDisplayed(getDriver(), dp.deductionText());
		System.out.println(actual);
		Assert.assertEquals(actual, exp);
		Log.endTestCase("Deduction View and Assertion Completed");
	}
	@Test
	public void cliconedit_Deduction() throws InterruptedException, IOException {
		Log.startTestCase("Edit Deduction Started");
		Log.startTestCase("Login To Payroll");
		LoginPage lg = new LoginPage(getDriver());
		lg.loginfnt();
		DeductionPage dp = new DeductionPage (getDriver());
		act.click(getDriver(), dp.deduct());
		Log.info("Click on pencil icon");
		act.click(getDriver(), dp.Update());
		AddDeductionPage adp = new AddDeductionPage(getDriver());
		adp.Amount().clear();
		String amt = ExcelRead.readIntegerData(4, 0);
		act.type(adp.Amount(), amt);
		act.click(getDriver(), adp.SaveBtn());
		boolean Exp = true; 
		boolean actual = act.isDisplayed(getDriver(),dp.deductionText());
		Assert.assertEquals(actual, Exp);
		Log.endTestCase("Deduction Edit and Assertion Completed");
	}
}
