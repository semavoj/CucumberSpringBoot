package com.cucumberspringboot.preference.stepDefinitions;

import com.cucumberspringboot.preference.data.Plant;
import com.cucumberspringboot.preference.data.Font;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Creates the instance variables with data types of Border and Font
 * Marks them with an annotation @Autowire to inject the beans
 * Prints the values of Border and Font objects
 */
@Log4j2
public class PlantStepsDefinition {
    @Autowired
    private Plant plant;

    @Given("I have a plant")
    public void i_have_a_plant() {
        log.info("Default values are :");
        log.info(plant);
    }

    @When("I water my plant with {int} liter")
    public void i_water_my_plant_with_liter(Integer int1) {
        plant.water(int1);
    }

    @When("I fertilize it with {int} kg of fertilizer every week")
    public void i_fertilize_it_with_kg_of_fertilizer_every_week(Integer int1) {
        plant.fertilize(int1);
    }

    @Then("my plant grows")
    public void my_plant_grows() {
        Assertions.assertTrue(plant.grow());
    }
}

