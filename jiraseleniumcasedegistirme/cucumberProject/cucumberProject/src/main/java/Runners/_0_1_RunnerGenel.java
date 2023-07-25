package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {
                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportRegression.html"
        },

        features = {"src\\java\\resources\\CantactUs5.feature"},

        glue = {"stepDefinition"}
        ,
        dryRun = false
)

public class _0_1_RunnerGenel extends AbstractTestNGCucumberTests {
}
