package com.payroll.PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.payroll.BaseClass.BaseClass;

public class HomePage extends BaseClass{
	WebDriver driver;
	@FindBy(xpath = "//div[@class='col-sm-2 logo']")
	WebElement applogo;
	
	@FindBy(linkText="Dashboard")
	WebElement dashboard;

	@FindBy(linkText="a[href='/payrollapp/company/index']")
	WebElement payroll;
	
	@FindBy(linkText="Clients")
	WebElement client;
	
	@FindBy(linkText="a[href='/payrollapp/worker/index']")
	WebElement worker;
	
	@FindBy(linkText="a[href='/payrollapp/deduction/index']")
	WebElement deduction;
	
	@FindBy(linkText="TimeSheet")
	WebElement timesheet;
	
	@FindBy(linkText="a[href='/payrollapp/payslip/index']")
	WebElement payslip;
	
	@FindBy(linkText="a[href='/payrollapp/invoice/index']")
	WebElement invoice;
	
	@FindBy(linkText="a[href='/payrollapp/report/payslip']")
	WebElement report;
	
	@FindBy(linkText="a[href='/payrollapp/user']")
	WebElement settings;
	
	@FindBy(className=".dropdown-toggle")
	WebElement carolthomas;
	
	
	public HomePage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement Homelogo() 
	{
		return applogo;
	}
	public WebElement Dashboard() 
	{
		return dashboard;
	}
	public WebElement Payroll() 
	{
		return payroll;
	}
	public WebElement Client() 
	{
		return client;
	}
	public WebElement Deduction() 
	{
		return deduction;
	}
	public WebElement Timesheet() 
	{
		return timesheet;
	}
	public WebElement Payslip() 
	{
		return payslip;
	}
	public WebElement Invoice() 
	{
		return invoice;
	}
	public WebElement Report() 
	{
		return report;
	}
	public WebElement Carol() 
	{
		return carolthomas;
	}

	
	
	

}
