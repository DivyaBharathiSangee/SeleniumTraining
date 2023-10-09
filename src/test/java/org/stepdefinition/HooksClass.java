package org.stepdefinition;

import org.bas.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClass{

	@Before(order=1)
	//precondition
	private void precondition2() {
		launchBrowser();
		System.out.println("Launch the browser");

	}
	@Before(order=2)
	private void precondition1() {
		
		windowMaximize();
		System.out.println("Window maximize");

	}
	@Before(order=3,value="@Sanity")
	private void precondition3() {
		System.out.println("precondition3");

	}
	
	@After(order=10,value="@Sanity")
	//postcondition
	private void postcondition2() {

		System.out.println("take screen shot");

	}
	@After(order=4)
	private void postcondition1() {
		closeEntireBrowser();
		System.out.println("Close the entire browser");

	}
}
