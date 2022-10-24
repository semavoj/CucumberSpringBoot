package com.cucumberspringboot.preference;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 *  CucumberIntegrationTest.class is the test entry point
 *
 *  @RunWith(Cucumber.class) annotation is used to instruct Junit to have Cucumber functionality.
 *
 * @CucumberOptions annotation enables the same options as in cucumber jvm command line,
 * similar to using the following feature options: to specify feature path,
 * glue option to specify step definition path, tags option for running specific tags,
 * Plugin option for generating report specific format such as html, json etc.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = {"com.cucumberspringboot.preference.stepDefinitions",
                "com.cucumberspringboot.preference.configuration"},
        dryRun = false,
        plugin = {"pretty", "html:target/cucumber-html-report.html",
                "json:target/cucumber.json",
                "rerun:target/cucumber-api-rerun.txt"
        })
public class CucumberIntegrationTest {
}

