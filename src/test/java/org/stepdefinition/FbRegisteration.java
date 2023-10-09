package org.stepdefinition;
import io.cucumber.datatable.*;

import java.util.List;
import java.util.Map;

import org.bas.BaseClass;
import org.pojo.FB_CA_Pojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbRegisteration extends BaseClass {

	FB_CA_Pojo f;
	@Given("To launch the browser and maximize the window")
	public void to_launch_the_browser_and_maximize_the_window() {
	   launchBrowser();
	   windowMaximize();
	}

	@When("To launch the url of fb application")
	public void to_launch_the_url_of_fb_application() {
	    launchUrl("https://www.facebook.com/");
	}

	@When("To click the create new account button")
	public void to_click_the_create_new_account_button() {
	    f=new FB_CA_Pojo();
	    clickbtn(f.getCreateNewAccount());
	}

	@When("To pass firstname in firstname text box")
	public void to_pass_firstname_in_firstname_text_box(DataTable d) throws InterruptedException {
		 Thread.sleep(3000);
		 Map<String,String> m=d.asMap(String.class,String.class);
		//List<String> l= d.asList();
		
		 f=new FB_CA_Pojo();
		 passtext(m.get("firstname2"), f.getFname());
	}

	@When("To pass secondname in secondname text box")
	public void to_pass_secondname_in_secondname_text_box() {
		f=new FB_CA_Pojo();
		passtext("bharathy", f.getLname());
	}

	@When("To pass mobileno or email in email text box")
	public void to_pass_mobileno_or_email_in_email_text_box() {
		//List<List<String>> ll=d.asLists();
		
		f=new FB_CA_Pojo();
		passtext("889898989", f.getMnumber());
	}

	@When("To create new password using new password text box")
	public void to_create_new_password_using_new_password_text_box() {
		f=new FB_CA_Pojo();
		passtext("bharahti100", f.getPassword());
	}

	@Then("To close the chrome browser")
	public void to_close_the_chrome_browser() {
	   //closeEntireBrowser();
	}
}
