package com.payroll.PageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.payroll.BaseClass.BaseClass;

public class CreateWorkerPage extends BaseClass 
{
	WebDriver driver;
	public CreateWorkerPage(WebDriver driver) 
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//select[@id='worker-title']")
	WebElement title;
	public WebElement Title() 
	{
		return title;
	}
	@FindBy(xpath="	//select[@id='worker-gender'] ")
	WebElement gender;
	public WebElement Gender() 
	{
		return gender;
	}

	@FindBy(xpath="//select[@id='worker-branch_id']")
	WebElement branch;
	public WebElement Branch() 
	{
		return branch;
	}

	@FindBy(xpath="//input[@id='worker-first_name']")
	WebElement firstname;
	public WebElement Firstname() 
	{
		return firstname;
	}

	@FindBy(xpath="	//input[@id='worker-middle_name']")
	WebElement middilename;
	public WebElement Middilename() 
	{
		return middilename;
	}

	@FindBy(xpath="//input[@id='worker-last_name']")
	WebElement lastname;
	public WebElement Lastname() 
	{
		return lastname;
	}

	@FindBy(xpath="//select[@id='worker-division_id']")
	WebElement division;
	public WebElement Division() 
	{
		return division;
	}

	@FindBy(xpath="//input[@id='worker-dob']")
	WebElement dob;
	public WebElement Dob() 
	{
		return dob;
	}
	@FindBy(xpath="//td[@id='.active day']")
	WebElement activeday;
	public WebElement ActiveDate()
	{
		return activeday;
	}

	@FindBy(xpath="//input[@id='worker-known']")
	WebElement known;
	public WebElement Known() 
	{
		return known;
	}

	@FindBy(xpath="	//input[@id='worker-address1']")
	WebElement addressline1;
	public WebElement Addressline1() 
	{
		return addressline1;
	}

	@FindBy(xpath="//input[@id='worker-phone']")
	WebElement phone;
	public WebElement Phone() 
	{
		return phone;
	}

	@FindBy(xpath="//input[@id='worker-address2']")
	WebElement addressline2;
	public WebElement Addressline2() 
	{
		return addressline2;
	}

	@FindBy(xpath="//input[@id='worker-address3']")
	WebElement addressline3;
	public WebElement Addressline3() 
	{
		return addressline2;
	}

	
	@FindBy(xpath="//input[@id='worker-mobile']")
	WebElement mobile;
	public WebElement Mobile() 
	{
		return mobile;
	}

	@FindBy(xpath="//input[@id='worker-email']")
	WebElement email;
	public WebElement Email() 
	{
		return email;
	}

	@FindBy(xpath="//input[@id='worker-postcode']")
	WebElement postcode;
	public WebElement Postcode() 
	{
		return postcode;
	}

	@FindBy(xpath="//select[@id='worker-employment_type']")
	WebElement employementtype;
	public WebElement Employementtype() 
	{
		return employementtype;
	}

	@FindBy(xpath="//select[@id='worker-payslip_method']")
	WebElement payslip;
	public WebElement Payslip() 
	{
		return payslip;
	}

	@FindBy(xpath="//select[@id='worker-engage_status']")
	WebElement status;
	public WebElement Status() 
	{
		return status;
	}

	@FindBy(xpath="//input[@id='worker-ni_number'] ")
	WebElement ninumber;
	public WebElement Ninumber() 
	{
		return ninumber;
	}

	@FindBy(xpath="//input[@id='worker-country']")
	WebElement country;
	public WebElement Country() 
	{
		return country;
	}

	@FindBy(xpath="//button[@class='btn btn-success'] ")
	WebElement buttonsuccess;
	
	public WebElement ButtonNext() 
	{
		act.explicitWait(driver, buttonsuccess, Duration.ofSeconds(20));
		return buttonsuccess;
	}

	@FindBy(linkText="Create Worker")
	WebElement assertblank;
	public WebElement AssertBlank()
	{
		return assertblank;
	}
	
	public String Assert()
	{
		String blankexp = assertblank.getText();
		return blankexp;
	}
	@FindBy(xpath="//button[@class='btn btn-success']")
	WebElement gettextsave;
	public WebElement GetassertText()
	{
		return gettextsave;
	}
	public String workerBankDetailsSavebtn()
	{
		String exp = gettextsave.getText();
		return exp;
	}
	
	
	
}
