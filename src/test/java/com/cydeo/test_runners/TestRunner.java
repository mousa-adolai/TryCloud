package com.cydeo.test_runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "com/cydeo/step_definitions",
        tags = "@practice and @exploring",
        publish = true,
        dryRun = false
)
public class TestRunner {
}
