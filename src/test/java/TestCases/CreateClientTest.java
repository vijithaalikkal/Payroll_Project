package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.payroll.Actions.Action;
import com.payroll.BaseClass.BaseClass;
import com.payroll.PageObjects.ClientPage;
import com.payroll.PageObjects.CreateClientPage;
import com.payroll.PageObjects.HomePage;
import com.payroll.PageObjects.LoginPage;
import com.payroll.Utilities.ExcelRead;
import com.payroll.Utilities.Log;

public class CreateClientTest extends BaseClass {

	@Test
	public void createNewClient() throws IOException, InterruptedException {
		Log.startTestCase("Login To Payroll");
		LoginPage Lg = new LoginPage(getDriver());
		Lg.loginfnt();
		ClientPage cp = new ClientPage(getDriver());
		cp.Clients().click();
		cp.CreateClient().click();
		CreateClientPage crp = new CreateClientPage(getDriver());
		Log.info("Start To Enter Client Details");
		act.click(getDriver(), crp.Branch());
		act.selectByIndex(crp.Branch(), 1);
		act.click(getDriver(), crp.Yourref());
		String s = ExcelRead.readIntegerData(4, 0);
		act.type(crp.Yourref(), s);
		act.click(getDriver(), crp.Invoiceorder());
		act.selectByIndex(crp.Invoiceorder(), 3);
		act.click(getDriver(), crp.Division());
		act.selectByIndex(crp.Division(), 1);
		act.click(getDriver(), crp.Invoicecontact());
		String s1 = ExcelRead.readStringData(6, 0);
		act.type(crp.Invoicecontact(), s1);
		act.selectByIndex(crp.Division(), 1);
		act.click(getDriver(), crp.InvoicedeliveryMethod());
		act.selectByIndex(crp.InvoicedeliveryMethod(), 2);
		act.click(getDriver(), crp.Clientname());
		String s2 = ExcelRead.readStringData(5, 0);
		act.type(crp.Clientname(), s2);
		act.scrollByVisibilityOfElement(getDriver(), crp.Save());
		act.click(getDriver(), crp.Phone());
		String s3 = ExcelRead.readIntegerData(5, 1);
		act.type(crp.Phone(), s3);
		act.click(getDriver(), crp.Masterdocument());
		act.selectByIndex(crp.Masterdocument(), 1);
		act.click(getDriver(), crp.Clientaddress());
		String s4 = ExcelRead.readStringData(6, 0);
		act.type(crp.Clientaddress(), s4);
		act.click(getDriver(), crp.Fax());
		String s5 = ExcelRead.readStringData(1, 1);
		act.type(crp.Fax(), s5);
		act.click(getDriver(), crp.Settilementdays());
		String s6 = ExcelRead.readIntegerData(3, 1);
		act.type(crp.Settilementdays(), s6);
		act.click(getDriver(), crp.Clientemail());
		String s7 = ExcelRead.readStringData(7, 1);
		act.type(crp.Clientemail(), s7);
		act.click(getDriver(), crp.Postcode());
		String s8 = ExcelRead.readIntegerData(8, 0);
		act.type(crp.Postcode(), s8);
		act.click(getDriver(), crp.Companyreg());
		String s9 = ExcelRead.readIntegerData(8, 1);
		act.type(crp.Companyreg(), s9);
		act.click(getDriver(), crp.Vatrate());
		act.selectByIndex(crp.Vatrate(), 2);
		act.click(getDriver(), crp.Country());
		String s10 = ExcelRead.readStringData(9, 0);
		act.type(crp.Country(), s10);
		act.click(getDriver(), crp.Requirepro());
		Thread.sleep(3000);
		act.click(getDriver(), crp.Save());
		String actual = "Invoice History";
		String expected = crp.AssertCreateClient();
		System.out.println(expected);
		Assert.assertEquals(actual, expected);
		Log.endTestCase("End to enter Client Details");

	}

	@Test
	public void withoutFilledMandatoryFields() throws IOException, InterruptedException {
		Log.startTestCase("Login To Payroll");
		LoginPage Lg = new LoginPage(getDriver());
		Lg.loginfnt();
		ClientPage cp = new ClientPage(getDriver());
		cp.Clients().click();
		cp.CreateClient().click();
		CreateClientPage crp = new CreateClientPage(getDriver());
		Log.info("Start To Enter Client Details");
		act.click(getDriver(), crp.Clientname());
		String s2 = ExcelRead.readStringData(5, 0);
		act.type(crp.Clientname(), s2);
		act.scrollByVisibilityOfElement(getDriver(), crp.Save());
		act.click(getDriver(), crp.Settilementdays());
		String s6 = ExcelRead.readIntegerData(3, 1);
		act.type(crp.Settilementdays(), s6);
		act.click(getDriver(), crp.Save());
		String actual = "Division cannot be blank.";
		String expected = crp.AssertMandatory();
		System.out.println(expected);
		Assert.assertEquals(actual, expected);
		Thread.sleep(3000);

	}

	@Test
	public void fillAllMandatoryFields() throws IOException, InterruptedException {
		Log.startTestCase("Login To Payroll");
		LoginPage Lg = new LoginPage(getDriver());
		Lg.loginfnt();
		ClientPage cp = new ClientPage(getDriver());
		cp.Clients().click();
		cp.CreateClient().click();
		CreateClientPage crp = new CreateClientPage(getDriver());
		Log.info("Start To Enter Client Details");
		act.click(getDriver(), crp.Branch());
		act.selectByIndex(crp.Branch(), 1);
		act.click(getDriver(), crp.Invoiceorder());
		act.selectByIndex(crp.Invoiceorder(), 3);
		act.click(getDriver(), crp.Division());
		act.selectByIndex(crp.Division(), 1);
		act.click(getDriver(), crp.Invoicecontact());
		String s1 = ExcelRead.readStringData(6, 0);
		act.type(crp.Invoicecontact(), s1);
		act.selectByIndex(crp.Division(), 1);
		act.click(getDriver(), crp.InvoicedeliveryMethod());
		act.selectByIndex(crp.InvoicedeliveryMethod(), 2);
		act.click(getDriver(), crp.Clientname());
		String s2 = ExcelRead.readStringData(5, 0);
		act.type(crp.Clientname(), s2);
		act.scrollByVisibilityOfElement(getDriver(), crp.Save());
		act.click(getDriver(), crp.Phone());
		String s3 = ExcelRead.readIntegerData(5, 1);
		act.type(crp.Phone(), s3);
		act.click(getDriver(), crp.Masterdocument());
		act.selectByIndex(crp.Masterdocument(), 1);
		act.click(getDriver(), crp.Clientaddress());
		String s4 = ExcelRead.readStringData(6, 0);
		act.type(crp.Clientaddress(), s4);
		act.click(getDriver(), crp.Fax());
		String s5 = ExcelRead.readStringData(1, 1);
		act.type(crp.Fax(), s5);
		act.click(getDriver(), crp.Settilementdays());
		String s6 = ExcelRead.readIntegerData(3, 1);
		act.type(crp.Settilementdays(), s6);
		act.click(getDriver(), crp.Clientemail());
		String s7 = ExcelRead.readStringData(7, 1);
		act.type(crp.Clientemail(), s7);
		act.click(getDriver(), crp.Postcode());
		String s8 = ExcelRead.readIntegerData(8, 0);
		act.type(crp.Postcode(), s8);
		act.click(getDriver(), crp.Companyreg());
		String s9 = ExcelRead.readIntegerData(8, 1);
		act.type(crp.Companyreg(), s9);
		act.click(getDriver(), crp.Vatrate());
		act.selectByIndex(crp.Vatrate(), 2);
		act.click(getDriver(), crp.Save());
		String actual = "Invoice History";
		String expected = crp.AssertCreateClient();
		System.out.println(expected);
		Assert.assertEquals(actual, expected);
	}

}
