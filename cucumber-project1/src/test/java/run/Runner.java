package run;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (features = {"Feature"},  monochrome = true, glue = {"step"})

public class Runner {

}
