package stepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/swaglabs.feature", glue="hooks",
monochrome=true,
plugin= {"Pretty","junit.target/jUnitReports/report.xml","json:target/JESONReports/report.jeson","html:target/HtmlReports"})
public class TestRunner {

}
