package Runner;

import org.junit.runner.RunWith;

import io.cucumber.core.backend.Glue;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "CucumberSample1/CucumberHooksOrderby.feature",
glue = {"StepDefination","Hookkess"})
public class HookesOrderbyRunner {

}
