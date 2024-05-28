package stepDefinations;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/tags.feature", glue={"stepDefinations"},
tags= "@regression" )


public class TestRunner_RunWithSingleTag {

}
