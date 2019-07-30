package com.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//@RunWith(Cucumber.class)
//@CucumberOptions(features="src/test/resources/",glue="com.stepdefinition ",plugin="html:target",dryRun=true,monochrome=true,strict=true)
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue="com.stepdefinition",plugin="html:target",dryRun=true,monochrome=true,strict=true,tags= ("@regression"))

public class TestRunner {
	
	

}
