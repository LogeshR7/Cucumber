package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "CucumberSample1/Hookes.feature",
glue={"StepDefenition","Hookkess"})
public class ThanosRnunner {
	

}
