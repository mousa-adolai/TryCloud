package com.TryCloud.test_runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "com/TryCloud/step_definitions",
        tags = "@ui and @test",
        publish = true,
      //  dryRun = false,
        plugin = {"pretty","html:target/cucumber.html",
        "me.jvt.cucumber.report.PrettyReports:target"}
)
public class TestRunner {
}
