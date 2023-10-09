package org.stepdefinition;

import org.bas.BaseClass;
import org.pojo.FbLogin_Pojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbLogin extends BaseClass {
	FbLogin_Pojo f;
	@Given("User has to launch the browser and maximize the window")
	public void user_has_to_launch_the_browser_and_maximize_the_window() {
	    launchBrowser();
	    windowMaximize();
	}

	@When("User has to hit the facebook url")
	public void user_has_to_hit_the_facebook_url() {
	   launchUrl("https://www.facebook.com/");
	}

	@When("User has to pass the data {string} in email field")
	public void user_has_to_pass_the_data_in_email_field(String em) {
	   f=new FbLogin_Pojo();
	   passtext(em, f.getEmail());
	}

	@When("User has to pass the data {string} in password field")
	public void user_has_to_pass_the_data_in_password_field(String pass) {
	    f=new FbLogin_Pojo();
	    passtext(pass, f.getPassword());
	}

	@When("User has to click login button")
	public void user_has_to_click_login_button() {
	    f=new FbLogin_Pojo();
	    clickbtn(f.getLogin());
	}

	@Then("User has to close the browser")
	public void user_has_to_close_the_browser() {
	    closeEntireBrowser();
	}

}
