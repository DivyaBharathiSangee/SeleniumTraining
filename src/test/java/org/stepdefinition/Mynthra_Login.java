package org.stepdefinition;

import org.bas.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Mynthra_Login extends BaseClass {

	@Given("To launch browser and maximize window")
	public void to_launch_browser_and_maximize_window() {
	    launchBrowser();
	    windowMaximize();
	}
	@When("To launch the url of Mynthra application")
	public void to_launch_the_url_of_Mynthra_application() {
	   launchUrl("https://www.myntra.com/");
	}

	@When("To click the profile button")
	public void to_click_the_profile_button() {
	    
	}

	@When("To enter the mobilenumber in textbox")
	public void to_enter_the_mobilenumber_in_textbox() {
	    
	}

	@When("To click the continue button")
	public void to_click_the_continue_button() {
	    
	}

	@Then("Close the chrome browser")
	public void close_the_chrome_browser() {
	    
	}

}
