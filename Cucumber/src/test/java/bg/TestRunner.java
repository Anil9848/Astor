package bg;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\main\\resources\\Background", 
		glue = { "bg" }, 
		plugin = { "pretty","html:target/cucumber-reports.html"} 
//		tags = "@Smoke"
)
public class TestRunner {

}
