package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",

		glue="org.stepdefinitation",dryRun=false,
		monochrome=true,
		plugin= {"pretty",
				"json:src\\test\\resources\\Report\\JsonReport.json"
				}
		)
public class TestRunner {
	
	@AfterClass
	public static void Report() {
		JVMReport.generationJVMReport("src\\test\\resources\\Report\\JsonReport.json");

		System.out.println("========done==========");
	}

}
