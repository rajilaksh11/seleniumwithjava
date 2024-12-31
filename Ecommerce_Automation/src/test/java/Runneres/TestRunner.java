package Runneres;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import tests.TestBase;


@CucumberOptions(
        features = "src/test/java/Features",
        glue = {"Steps"},
        plugin = {"pretty", "html:target/cucumber-reports"}
)

public class TestRunner extends TestBase
{

}
