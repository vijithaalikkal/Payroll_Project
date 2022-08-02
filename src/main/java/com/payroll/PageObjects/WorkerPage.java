package com.payroll.PageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.payroll.BaseClass.BaseClass;

public class WorkerPage extends BaseClass {

	WebDriver driver;
	@FindBy(linkText="Workers")
	WebElement workers;
	
	@FindBy(linkText="Create Worker")
	WebElement createworker;

	@FindBy(linkText="Home")
	WebElement backhome;
	
	@FindBy(xpath="//input[@id='workersearch-first_name']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@id='workersearch-last_name']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@id='workersearch-postcode']")
	WebElement postcode;
	@FindBy(xpath="//input[@id='workersearch-ni_number']")
	WebElement ninumber;
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement buttonsearch;
	
	@FindBy(xpath="//button[@class='btn btn-default']")
	WebElement reset;
	
	@FindBy(xpath="//th[normalize-space()='#']")
	WebElement assertsearchwkr;
	
	public WorkerPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement Workers() 
	{
		return workers;
	}
	
	public WebElement CreateWorker() 
	{
		return createworker;
	}
	public WebElement Home() 
	{
		return backhome;
	}public WebElement FirstName() 
	{
		return firstname;
		
	}public WebElement LastName() 
	{
		return lastname;
		
	}
	public WebElement Postcode()
	{
		return postcode;
		
	}
	public WebElement NiNumber()
	{
		return ninumber;
		
	}
	public WebElement ButtonSearch()
	{
		return buttonsearch;
		
	}
	public WebElement ButtonReset()
	
	{
	
		act.explicitWait(driver,reset,Duration.ofSeconds(20));
		return reset;
	}
	
	public WebElement AssertSearchWork()
	{
		return assertsearchwkr;
	}
	public String AssertText()
	{
		String textexp = assertsearchwkr.getText();
		return textexp;
	}

}
