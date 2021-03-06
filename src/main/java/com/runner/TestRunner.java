package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		//tield
		features="src/main/java/com/feature", 
		glue="com.stepDefs",
		format= {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
	    tags= {"@excel"},
		//tags= {"@data"},//~tield is use for running all the test cases except this
		monochrome=true,
		strict=true,
		
		dryRun=false
		)
public class TestRunner {
}
