package com.fourstay.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber-report",
                "json:target/cucumber.json"
        },
        tags = "@first1",
        features = "src/test/resources/features/",
        glue = "com/fourstay/stepdefinitions",
        dryRun = false

)
public class CukesRunner extends AbstractTestNGCucumberTests {
}
