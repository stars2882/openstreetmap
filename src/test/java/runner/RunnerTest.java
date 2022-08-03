package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

public class RunnerTest {

    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/test/resources",
            glue = "src/test/stepdefinitions"
    )
    public class RunnerTests {

    }
}
