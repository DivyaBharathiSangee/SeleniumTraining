package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.bas.BaseClass;

public class FbLogin_Pojo extends BaseClass {

	//1.non param constructor
		public FbLogin_Pojo() {
			
			PageFactory.initElements(driver, this);
		}
		//store private web elements
		//WebElement mail=driver.findElement(By.id(""))
		
		@FindAll({
			@FindBy(xpath="//input[@id='email']"),
			@FindBy(xpath="//input[@name='email']"),
			@FindBy(xpath="//input[@data-testid='royal_email']")
		})
		private WebElement varRef;
		
		@FindBy(id="email")
		private WebElement email;
		@FindBy(xpath = "//input[@aria-label='Password']")
		private WebElement password;
		@FindBy(name="login")
		private WebElement login;
		
		
		//getters to access webelement outside the class
		public WebElement getEmail() {
			return varRef;
		}
		public WebElement getPassword() {
			return password;
		}
		public WebElement getLogin() {
			return login;
		}
		
}
