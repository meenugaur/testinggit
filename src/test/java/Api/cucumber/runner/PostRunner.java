package Api.cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/Api/cucumber/Feature/post.feature"},glue = {"Api.cucumber.step"},dryRun = false)
public class PostRunner {
}
