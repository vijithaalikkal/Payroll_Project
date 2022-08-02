package com.payroll.PageObjects;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.payroll.BaseClass.BaseClass;
import com.payroll.Utilities.ExcelRead;
import com.payroll.Actions.*;
public class LoginPage extends BaseClass {
	//Action act = new Action();
	public static WebDriver driver;
	By username = By.id("loginform-username");
	By password = By.id("loginform-password");
	By login = By.xpath("//button[@class='btn btn-default']");
	By errormsg = By.xpath("//p[normalize-space()='Incorrect username or password.']");
	By assertmsg =By.xpath("(//p[@class='help-block help-block-error'])[2]");
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	public WebElement uname() {
		return driver.findElement(username);
	}
	public WebElement pwd() {
		return driver.findElement(password);
	}
	public WebElement loginBtn() {
		return driver.findElement(login);
	}
	public WebElement errormsg() {
		return driver.findElement(errormsg);
	}
	public WebElement Assertmsg(){
	return driver.findElement(assertmsg);
	}
	public void loginfnt() throws IOException {

		act.type(driver.findElement(username), "carol");
		act.type(driver.findElement(password), "1q2w3e4r");
		act.click(driver, loginBtn());
	}
}
