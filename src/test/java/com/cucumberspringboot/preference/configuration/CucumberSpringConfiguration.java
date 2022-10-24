package com.cucumberspringboot.preference.configuration;

import com.cucumberspringboot.preference.Config;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
/**
 * CucumberSpringConfiguration.class is the code that implements the dependency injection in Cucumber test cases.
 *
 * The context configuration is accessed by the @CucumberContextConfiguration annotation.
 * You do not need to change the configuration, nor to add extra beans because it is already
 * configured by the CucumberSpringConfiguration class.
 *
 * The configuration class can then be accessed by @SpringBootTest given we are using Spring.Boot.
 */
@CucumberContextConfiguration
@SpringBootTest(classes = Config.class)
public class CucumberSpringConfiguration {
}
