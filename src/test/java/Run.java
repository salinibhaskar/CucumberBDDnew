import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@CucumberOptions(features = ".", tags = "@menu", dryRun = false,
plugin = {"pretty", "html:target/test-bdd-framework-report2.html"})
@RunWith(Cucumber.class)
public class Run {
}
