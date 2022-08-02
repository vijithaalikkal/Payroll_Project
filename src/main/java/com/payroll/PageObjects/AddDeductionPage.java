package com.payroll.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.payroll.BaseClass.BaseClass;

public class AddDeductionPage extends BaseClass{
	WebDriver driver;
	public AddDeductionPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//span[@class='select2-selection__placeholder']")
	WebElement worker;
	public WebElement Worker()
	{
		return worker;
	}
	@FindBy(xpath="//select[@id='deduction-type']")
	WebElement type;
	public WebElement Type()
	{
		return type;
	}
	@FindBy(xpath="//input[@id='deduction-amount']")
	WebElement amount;
	public WebElement Amount()
	{
		return amount;
	}
	@FindBy(xpath="//input[@id='deduction-effective_from']")
	WebElement effectivefrom;
	public WebElement EffcetFrom()
	{
		return effectivefrom;
	}
	@FindBy(xpath="//button[@class='btn btn-success']")
	WebElement savebtn;
	public WebElement SaveBtn()
	{
		return savebtn;
	}
	@FindBy(linkText="Deductions")
	WebElement deductions;
	public WebElement getText()
	{
		return deductions;
	}
}


