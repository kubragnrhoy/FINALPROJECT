package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/resources/features/ViceDean.feature",
        glue = "stepdefinitions",
        tags = "@delete"


)
public class Runner {
}
