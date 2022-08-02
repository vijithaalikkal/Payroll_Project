package com.payroll.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.payroll.BaseClass.BaseClass;

public class DeductionPage extends BaseClass{
public static 	WebDriver driver;

	By deduction = By.linkText("Deduction");
	By adddeduction = By.xpath("//a[normalize-space()='Add Deduction']");
	By home = By.linkText("Home");
	By view = By.xpath("(//span[@class='glyphicon glyphicon-eye-open'])[1]");
	By update = By.xpath("(//span[@class='glyphicon glyphicon-pencil'])[1]");
	public DeductionPage (WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement deduct()
	{
		return driver.findElement(deduction);
		
	}
	public WebElement adddeduct()
	{
		return driver.findElement(adddeduction);
		
	}
	public WebElement home()
	{
		return driver.findElement(home);
		
	}
	public WebElement View()
	{
		return driver.findElement(view);
	}
	public WebElement Update()
	{
		return driver.findElement(update);
	}
	
	By exp = By.linkText("Deductions");
	public WebElement deductionText()
	{
		return driver.findElement(exp);
	}
	
	/*
	 * public String deductionText() { String getdeduction = deductions.getText();
	 * return getdeduction;
	 * 
	 * }
	 * 
	 */
}
