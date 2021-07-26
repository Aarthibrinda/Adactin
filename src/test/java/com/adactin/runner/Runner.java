package com.adactin.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature", glue = "com\\adactin\\stepdefinition")

public class Runner {

//	public static WebDriver driver;
//	
//	@BeforeClass
//	public static void set_Up() {
//		driver = Base_Class.getDriver("chrome");
//	}

}
