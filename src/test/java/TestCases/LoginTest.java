package TestCases;
import java.io.IOException;
import java.time.Duration;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.payroll.BaseClass.BaseClass;
import com.payroll.PageObjects.HomePage;
import com.payroll.PageObjects.LoginPage;
import com.payroll.Utilities.ExcelRead;
import com.payroll.Utilities.Log;
public class LoginTest extends BaseClass {
	@Test(priority = -1)
	public void LoginTest() throws InterruptedException, IOException {
		Log.startTestCase("Login To Payroll");
		LoginPage Lg = new LoginPage(getDriver());
		Log.info("Start To Enter Username And Password");
		Lg.loginfnt();
		HomePage Hp = new HomePage(getDriver());
		act.explicitWait(getDriver(), Hp.Dashboard(), Duration.ofSeconds(10));
		boolean actual = act.findElement(getDriver(), Hp.Client());
		Assert.assertEquals(actual, true);
		Log.endTestCase("Login And Assertion Completed");
	}
	// USING DATA PROVIDER
	@DataProvider
	public Object[][] getlogin() {
		Object[][] data = new Object[2][2];
		data[0][0] = "carol123";
		data[0][1] = "123";
		data[1][0] = "carol";
		data[1][1] = "1q2w3e";
		return data;
	}
	@Test(dataProvider = "getlogin", priority = 1)
	public void InvalidPassword(String Username, String Password) throws InterruptedException {
		Log.startTestCase("Login To Payroll");
		LoginPage Lg = new LoginPage(getDriver());
		Log.info("Start To Enter Username And Password");
		Lg.uname().click();
		Lg.uname().sendKeys(Username);
		Lg.pwd().click();
		Lg.pwd().sendKeys(Password);
		Lg.loginBtn().click();
		act.implicitWait(getDriver(), 5);
		boolean actual = act.findElement(getDriver(), Lg.Assertmsg());
		Assert.assertEquals(actual, true);
		Log.endTestCase("Login And Assertion Completed");
	}
	// @Parameters({"u","p"})
	@Test(priority = 2)
	public void InvalidUserName() throws IOException {
		Log.startTestCase("Login To Payroll");
		LoginPage Lg = new LoginPage(getDriver());
		Log.info("Start To Enter Username And Password");
		String s = ExcelRead.readStringData(0, 1);
		Lg.uname().sendKeys(s);
		Lg.pwd().click();
		String s1 = ExcelRead.readStringData(2, 1);
		Lg.pwd().sendKeys(s1);
		System.out.println(s + s1);
		Lg.loginBtn().click();
		act.implicitWait(getDriver(), 5);
		boolean actual = act.findElement(getDriver(), Lg.Assertmsg());
		Assert.assertEquals(actual, true);
		Log.endTestCase("Login And Assertion Completed");
		}
	@Test(groups = { "Regression" })
	public void BothInvalid() throws IOException {
		Log.startTestCase("Login To Payroll");
		LoginPage Lg = new LoginPage(getDriver());
		Log.info("Start To Enter Username And Password");
		Lg.uname().click();
		String a = ExcelRead.readStringData(1, 1);
		System.out.println(a);
		Lg.uname().sendKeys(a); // (a)
		Lg.pwd().click();
		String b = ExcelRead.readStringData(1, 0);
		System.out.println(b);
		Lg.pwd().sendKeys(b);
		Lg.loginBtn().click();
		Log.endTestCase("Login And Assertion Completed");
	}
	@Test(priority = 4)
	public void Emptyuserpass() {
		Log.startTestCase("Login To Payroll");
		LoginPage Lg = new LoginPage(getDriver());
		Log.info("Start To Enter Username And Password");
		Lg.uname().click();
		Lg.uname().sendKeys("");
		Lg.pwd().click();
		Lg.pwd().sendKeys("");
		Lg.loginBtn();
		boolean actual = act.findElement(getDriver(), Lg.Assertmsg());
		Assert.assertEquals(actual, true);
		Log.endTestCase("Login And Assertion Completed");
	}
}
