package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "src/test/resources/Features", 
	glue = { "stepDefinition" }, 
	monochrome = true, 
	plugin = { 
				"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm", 
				"html:target/JUNITHtmlReports/report.html",
				"junit:target/JUNITReports/reports.xml" })

public class TestRunner {

}
