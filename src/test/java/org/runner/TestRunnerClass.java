package org.runner;


import org.report.JVMReport;
import org.testng.annotations.AfterClass;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features= {"src/test/resources"}, glue = {"org.stepdefinition"}, 
monochrome=true, plugin= {"pretty", "json:\\Report\\JsonReport\\KlearCard.json"})
public class TestRunnerClass extends AbstractTestNGCucumberTests {
	

}
