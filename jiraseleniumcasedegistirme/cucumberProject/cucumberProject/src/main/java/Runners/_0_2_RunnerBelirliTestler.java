package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = {"src/test/java/CantactUs5.feature"},

        glue = {"stepDefinition"},

        plugin = {"pretty",
                "html:target/site/cucumber-pretty",
                "json:target/cucumber.json","html:target/cucumber-html-report","usage:target/cucumber-usage.json","" +
                "junit:target/cucumber-results.xml" },

        dryRun = false
)





public class _0_2_RunnerBelirliTestler extends AbstractTestNGCucumberTests {
}
