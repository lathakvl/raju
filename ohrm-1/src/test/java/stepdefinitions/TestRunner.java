package stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features="OHRM_cucumber",glue="stepdefinitions",monochrome=true,//dryRun=true

tags="@LoginFunctionalityTest"


)


public class TestRunner {
	
	
	

}
