package com.adactin.stepdefinition;

import com.adactin.org.Base_Class;
import cucumber.api.java.en.*;

public class Stepdefinition extends Base_Class {

	static void m1() throws Exception {
		throw new Exception();
	}

	static {
		try {
			m1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Given("^User launch the adactin application$")
	public void user_launch_the_adactin_application() throws Throwable {
		try {
			getDriver("chrome");
			getUrl("https://adactinhotelapp.com/");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("^User enter the valid username$")
	public void user_enter_the_valid_username() throws Throwable {
	}

	@When("^user enter the valid password$")
	public void user_enter_the_valid_password() throws Throwable {
	}

	@Then("^User validate the username and password then it navigate the search hotel$")
	public void user_validate_the_username_and_password_then_it_navigate_the_search_hotel() throws Throwable {
	}

}
