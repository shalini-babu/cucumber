package Runner_pack;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,features = "Feature\\tagsdemo.feature",glue = "Step_def",plugin= {"html:target/cucumber.html"},tags = {"@SmokeTest,~@RegressionTest,@End2End"})
public class runner {
	

}
