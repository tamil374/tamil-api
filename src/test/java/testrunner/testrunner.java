package testrunner;

//import org.junit.runner.RunWith;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)

@CucumberOptions(
		
		features="./src/test/resources/features",
		glue= {"stepdefinition","hooksmanager"},
		dryRun=false,	
	   tags = "@new_emp_post",
     	plugin= {"pretty","html:target/report/cucumber-html-report.html","json:target/cucumber.json","usage:target/cucumber-usage.json"}
     	
		
		
		
	)

public class testrunner extends AbstractTestNGCucumberTests
{
	
	
}









