package com.payroll.PageObjects;
	import java.io.IOException;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import com.payroll.BaseClass.BaseClass;
	import com.payroll.Actions.*;

public class CreateClientPage  extends BaseClass
{
	//Action act = new Action();
	WebDriver driver;
	@FindBy(xpath="//select[@id='client-branch_id']")
	WebElement branch;
	/*
	 * @FindBy(xpath="(//option[@value='1'])[2]") WebElement alphanew;
	 */
	
	@FindBy(xpath="//input[@id='client-your_ref']")
	WebElement yourref;

	@FindBy(xpath="//select[@id='client-invoice_order']")
	WebElement invoiceorder;
	
	@FindBy(xpath="//select[@id='client-division_id']")
	WebElement division;
	
	@FindBy(xpath="//input[@id='client-invoice_contact']")
	WebElement invoicecontact;
	
	@FindBy(xpath="//select[@id='client-invoice_delivery_method']")
	WebElement invoicedeliveryMethod;
	
	@FindBy(xpath="//input[@id='client-client_name']")
	WebElement clientname;
	
	@FindBy(xpath ="//input[@id='client-phone']")
	WebElement phone;
	
	@FindBy(xpath ="//select[@id='client-master_document']")
	WebElement masterdocument;
	
	@FindBy(xpath="//textarea[@id='client-client_address']")
	WebElement clientaddress;
	
	@FindBy(xpath="//input[@id='client-fax']")
	WebElement fax;
	
	@FindBy(xpath="//input[@id='client-settilement_days']")
	WebElement settilementdays;
	
	@FindBy(xpath="//input[@id='client-email']")
	WebElement clientemail;
	
	@FindBy(xpath="//input[@id='client-postcode']")
	WebElement postcode;
	
	@FindBy(xpath="//input[@id='client-company_reg']")
	WebElement companyreg;
	
	@FindBy(xpath="//select[@id='client-vat_rate']")
	WebElement vatrate;
	
	@FindBy(xpath="//input[@id ='client-country']")
	WebElement country;
	
	@FindBy(xpath="//input[@id='client-require_po']")
	WebElement requirepro;
	
	@FindBy(xpath="//button[@class='btn btn-success']")
	WebElement save;
	
	@FindBy(linkText="Invoice History")
	WebElement clientassert;
	
	
	@FindBy(xpath="(//div[normalize-space()='Division cannot be blank.'])[1]")
	WebElement divisionnotblank;
	
	public CreateClientPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement Branch() 
	{
		return branch;
	}
	
	public WebElement Yourref() 
	{
		return yourref;
    }
	public WebElement Invoiceorder() 
	{
		return invoiceorder;
	}public WebElement Division() 
	{
		return division;
		
	}
	public WebElement Invoicecontact() 
	{
		return invoicecontact;
		
	}
	public WebElement InvoicedeliveryMethod()
	{
		return invoicedeliveryMethod;
	}
	
	public WebElement Clientname()
	{
		return clientname;
	}
	
	public WebElement  Phone()
	{
		return phone;
	}
	
	public WebElement Masterdocument()
	{
		return masterdocument;
	}
	
	public WebElement Clientaddress()
	{
		return clientaddress;
	}
	
	public WebElement Fax()
	{
		return fax;
	}
	
	public WebElement Settilementdays()
	{
		return settilementdays;
	}
	
	public WebElement Clientemail()
	{
		return clientemail;
	}
	public WebElement Postcode()
	{
		return postcode;
	}
	public WebElement Companyreg()
	{
		return companyreg;
	}
	public WebElement Vatrate()
	{
		return vatrate;
	}
	public WebElement Country()
	{
		return country;
	}
	public WebElement Requirepro()
	{
		return requirepro;
	}
	public WebElement Save()
	{
		return save;
	}
 public String AssertCreateClient()
 {
	 String clientexp = clientassert.getText();
	 return clientexp;
 }
 public WebElement DivisionnotBlank()
 {
	
	 return  divisionnotblank;
 }
	public String AssertMandatory()
	{
		String mandatoryexp=divisionnotblank.getText();
		return mandatoryexp;
		
	}
}

	
	


