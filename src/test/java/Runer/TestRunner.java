package Runer;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 *
 * @author Sergii
 */

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/main/java/Features/taggedhooks.feature" //the path of the feature files
		,glue={"stepDefinitions"} //the path of the step definition files
                ,format={"pretty", "html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}
//method is deprecated^     ^pretty report                    ^ json report                           ^ xml report
                ,dryRun = false //-when true it checks steps and definitions
                ,monochrome = true // display readable output
                ,strict = true //failed execution of pending or undefind steps in .feature
//                ,tags= {"~@SmokeTest","@EndToEnd"} // execution different suits of test
				)
public class TestRunner {
}

//		,tags={"@SmokeTest, @EndToEnd"} // execution different suits of test OR
//		,tags={"@SmokeTest", "@EndToEnd"} // execution different suits of test AND
//		,tags={"~@SmokeTest", "@EndToEnd"} // execution different suits of test IGNORE ~@SmokeTest