package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="CucumberSample1/DataDrivenHeader.feature",glue="StepDefination")
public class DataProviderHeaderRunner {

}
