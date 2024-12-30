package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "CucumberSample1/Cucumberoptionss.feature", 
glue = "StepDefination",
dryRun=false,monochrome = false,
plugin = {"json:Report/cucumber.json","html:Report/cucumber.html"})
public class CucumberOptionrunner {

}
