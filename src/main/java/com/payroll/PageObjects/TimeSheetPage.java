package com.payroll.PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.payroll.BaseClass.BaseClass;
public class TimeSheetPage extends BaseClass{
		WebDriver driver;
		public TimeSheetPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath="//a[@href='/payrollapp/user']")
		WebElement settings;
		public WebElement Clicksettings()
		
		{
			return settings;
		}
		
		@FindBy(className=".dropdown-toggle")
		WebElement user;
		public WebElement ClickUser()
		{
			return user;
		}
		@FindBy(name="Dashboard")
		WebElement dashboard;
		
		public WebElement ClickDashboard()
		{
			return dashboard;
		}
		@FindBy(name="Company")
		WebElement company;
		
		public WebElement ClickCompany()
		{
			return company;
		}
		
		@FindBy(name="Clients")
		WebElement clients;
		
		public WebElement ClickClients()
		{
			return clients;
		}
		
		@FindBy(name="Workers")
		WebElement workers;
		
		public WebElement Clickworker()
		{
			return workers;
		}
		
		@FindBy(name="Deduction")
		WebElement deduction;
		public WebElement Clickdeduction()
		{
			return deduction;
		}
		@FindBy(name="TimeSheet")
		WebElement timesheet;
		
		public WebElement ClickTimesheet()
		{
			return timesheet;
		}
		
		@FindBy(name="Payslip")
		WebElement payslip;
		public WebElement ClickPayslip()
		{
			return payslip;
		}
		@FindBy(name="Invoice")
		WebElement invoice;
		public WebElement ClickInvoice()
		{
			return invoice;
		}
		@FindBy(name="Report")
		WebElement report;
		public WebElement Clickreports()
		{
			return report;
		}
		@FindBy(partialLinkText="Pending")
		WebElement pending;
		public WebElement ClickPending()
		{
			return pending;
		}
		@FindBy(partialLinkText="Approved")
		WebElement approved;
		public WebElement ClickApproved()
		{
			return approved;
		}
		@FindBy(linkText="Create Timesheet")
		WebElement create;
		public WebElement CreateTimesheet()
		{
			return create;
		}
		@FindBy(xpath="//button[@value='playslip']")
		WebElement genepay;
		public WebElement GeneratePayslip()
		{
			return genepay;
		}
		@FindBy(xpath="//button[@class='btn btn-warning btn-responsive playslip']")
		WebElement geneinv;
		public WebElement GenerateInvoice()
		{
			return geneinv;
		}
		@FindBy(linkText="Approved Timesheets")
		WebElement approvetime;
		public WebElement ApproveTimeSheet()
		{
			return approvetime;
		}
		@FindBy(xpath="//img[@alt='logo']")
		WebElement logo;
		public WebElement ViewLogo()
		{
			return logo;
		}
		@FindBy(xpath="(//span[@class='glyphicon glyphicon-eye-open'])[1]")
		WebElement view;
		public WebElement ViewTimesheet()
		{
			return view;
		}
		@FindBy(xpath="//span[@class='glyphicon glyphicon-pencil'])[1]")
		WebElement update;
		public WebElement EditTimesheet()
		{
			return update;
		}
		@FindBy(linkText="Frequency")
		WebElement rate;
		public WebElement  Getasserttext()
		{
			return rate;
		}
		public String Gettext_Rate()
		{
			String exp = rate.getText();
			return exp;
		}
 @FindBy(xpath="//button[@class='pull-right add-item btn btn-success btn-xs']")
 WebElement viewdashboard;
 public WebElement View_Dashboard()
 {
	 return viewdashboard;
 }
	}

