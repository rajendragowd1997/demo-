package stepRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions (features = {"FeatureFiles"},monochrome=true, glue= {"stepDefination"})
public class Runner {


}
