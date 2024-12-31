package Runneres;

import org.testng.annotations.Test;
import tests.TestBase;


public class TestRunner2  extends TestBase  {

    @Test(priority = 1)
    public void executeRegisterFeature() {
        runCucumberTests("features/1_Register.feature");
    }

    @Test(priority = 2)
    public void executeLoginFeature() {
        runCucumberTests("features/2_Login.feature");
    }
	
	@Test(priority = 2)
    public void executeLoginFeature() {
        runCucumberTests("features/3_Logout.feature");
    }

    // Method to run Cucumber tests
    private void runCucumberTests(String featurePath)
    {
        // Define CucumberOptions
        String[] cucumberOptions = {
                "plugin", "pretty",
                "glue", "Steps", // Specify package containing step definitions
                featurePath // Path to feature file
        };


    }
}
