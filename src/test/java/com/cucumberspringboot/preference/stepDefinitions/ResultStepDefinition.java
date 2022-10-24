package com.cucumberspringboot.preference.stepDefinitions;

import com.cucumberspringboot.preference.data.Border;
import com.cucumberspringboot.preference.data.Font;
import io.cucumber.java.en.Then;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Creates the instance variables with data types of Border and Font
 * Marks them with an annotation @Autowire to inject the beans
 * Displays the updated values of Border and Font object
 */
@Log4j2
public class ResultStepDefinition {
    @Autowired
    private Font font;
    @Autowired
    private Border border;

    @Then("Confirm user selections")
    public void confirm_user_selections() {
        log.info("Results are : ");
        log.info(font);
        log.info(border);
    }

}

