package org.pojo;

import org.bas.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FB_CA_Pojo extends BaseClass
{

	public FB_CA_Pojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Create new account']")
	private WebElement createNewAccount;
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement Fname;
	@FindBy(name="lastname")
	private WebElement Lname;
	@FindBy(name="reg_email__")
	private WebElement Mnumber;
	@FindBy(name="reg_passwd__")
	private WebElement password;
	public WebElement getCreateNewAccount() {
		return createNewAccount;
	}
	public WebElement getFname() {
		return Fname;
	}
	public WebElement getLname() {
		return Lname;
	}
	public WebElement getMnumber() {
		return Mnumber;
	}
	public WebElement getPassword() {
		return password;
	}
	
}
