package com.cucumberspringboot.preference.data;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

/**
 * Pojo class for Font
 *
 * @Scope(SCOPE_CUCUMBER_GLUE) is used to create the beans before the scenario’s execution.
 * It also removes the beans after the scenario’s execution to avoid sharing the state between scenarios.
 */
@Data
@Component
@Scope(SCOPE_CUCUMBER_GLUE)
public class Font {
    private String style = "arial";
    private String color = "black";
    private String weight = "normal";
}