package org.stepdefinition;

import org.bas.BaseClass;
import org.pojo.FbLogin_Pojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Positive_NegativeofFb extends BaseClass {

	FbLogin_Pojo f;
	@Given("To launch the chrome browser and maximum window")
	public void to_launch_the_chrome_browser_and_maximum_window() {
	   launchBrowser();
	   windowMaximize();
	}

	@When("To launch the url of the facebook application")
	public void to_launch_the_url_of_the_facebook_application() {
	   launchUrl("https://www.facebook.com/");
	}

	@When("To pass valid username in email field")
	public void to_pass_valid_username_in_email_field(String em) {
	    f=new FbLogin_Pojo();
	    passtext(em, f.getEmail());
	}

	@When("To pass invalis password in password field")
	public void to_pass_invalis_password_in_password_field(String pass) {
	   f=new FbLogin_Pojo();
	   passtext(pass, f.getPassword());
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
	   f=new FbLogin_Pojo();
	   clickbtn(f.getLogin());
	}

	

	@Then("To close the browser")
	public void to_close_the_browser() {
	    closeEntireBrowser();
	}

}
