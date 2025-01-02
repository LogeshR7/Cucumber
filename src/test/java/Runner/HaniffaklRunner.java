package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "CucumberSample1/Haniffakl.feature",
glue = "StepDefination",dryRun = true,plugin = "html:Report/Haniffakl.html")

public class HaniffaklRunner {

}
