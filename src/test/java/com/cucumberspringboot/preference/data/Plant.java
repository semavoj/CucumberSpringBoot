package com.cucumberspringboot.preference.data;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

/**
 * Pojo class for Plant
 * @Scope(SCOPE_CUCUMBER_GLUE) is used to create the beans before the scenario’s execution.
 * It also removes the beans after the scenario’s execution to avoid sharing the state between scenarios.
 */
@Data
@Component
@Scope(SCOPE_CUCUMBER_GLUE)
public class Plant {
    private int waterNeedLt = 2;
    private int waterSuppliedLt = 0;
    private int fertilizerNeedGr = 4;
    private int fertilizerConsumedGr = 0;
}
