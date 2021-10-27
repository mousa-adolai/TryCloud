package com.cydeo.test_runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "com/cydeo/step_definitions",
        tags = "@ui and @us3",
        publish = true,
      // dryRun = false,
        plugin = {"pretty","html:target/cucumber.html",
        "me.jvt.cucumber.report.PrettyReports:target"}

)
public class TestRunner {
}
