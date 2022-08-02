package com.payroll.PageObjects;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.payroll.BaseClass.BaseClass;
import com.payroll.Actions.*;

public class ClientPage extends BaseClass {
	// Action act = new Action();
	WebDriver driver;
	@FindBy(linkText = "Clients")
	WebElement clients;

	@FindBy(linkText = "Create Client")
	WebElement createclient;

	@FindBy(linkText = "Home")
	WebElement backhome;

	@FindBy(xpath = "//input[@id='clientsearch-client_name']")
	WebElement clientname;

	@FindBy(xpath = "//input[@id='clientsearch-id']")
	WebElement clientid;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement buttonsubmit;

	@FindBy(xpath = "//button[@type='reset']")
	WebElement resetbutton;

	@FindBy(xpath = "//li[contains(text(),'Clients')]")
	WebElement assertclient;

	@FindBy(xpath = "(//span[@class='glyphicon glyphicon-eye-open'])[1]")
	WebElement view;

	public WebElement View_icon() {
		return view;
	}
	@FindBy(xpath="(//span[@class='glyphicon glyphicon-pencil'])[1]")
	WebElement update;
	public WebElement Clientupdate()
	{
		return update;
		
	}

	public WebElement getText() {
		return assertclient;
	}

	public ClientPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement Clients() {
		return clients;
	}

	public WebElement CreateClient() {
		return createclient;
	}

	public WebElement Home() {
		return backhome;
	}

	public WebElement Clientname() {
		return clientname;

	}

	public WebElement Clientid() {
		return clientid;

	}

	public WebElement Buttonsubmit()

	{

		act.explicitWait(driver, buttonsubmit, Duration.ofSeconds(20));
		return buttonsubmit;
	}

	public WebElement Reset() {
		return resetbutton;
	}

	@FindBy(linkText="Clients")
	WebElement invoicehistory;

	public WebElement invoiceText() {
		return invoicehistory;
	}
	
	/*
	 * public String InvoiceHist_getText() { String invo = invoicehistory.getText();
	 * return invo; }
	 */
	@FindBy(xpath = "//th[normalize-space()='Branch']")
	WebElement branch;

	public WebElement Branch() {
		return branch;
	}

	@FindBy(xpath="//input[@id='client-your_ref']")
	WebElement yourref;

	public WebElement Yourref() {
		return yourref;
	}

	@FindBy(xpath = "//select[@id='client-invoice_order']")
	WebElement invoiceorder;

	public WebElement Invoiceorder() {
		return invoiceorder;
	}

	@FindBy(css = "button[type='submit']")
	WebElement save;

	public WebElement Save() {
		return save;
	}

}
