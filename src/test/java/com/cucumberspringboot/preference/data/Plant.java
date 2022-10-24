package com.cucumberspringboot.preference.data;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

@Data
@Component
@Scope(SCOPE_CUCUMBER_GLUE)
public class Plant {
    private int waterNeededPerDayLt = 2;
    private int waterConsumedPerDayLt = 0;
    private int fertilizerNeededPerWeekKg = 4;
    private int fertilizerConsumedPerWeekKg = 0;

    public void water(int amountOfWater) {
        System.out.println("Consuming " + amountOfWater + " of water");
        setWaterConsumedPerDayLt(amountOfWater);
    }

    public void fertilize(int amountOfFertilizer){
        System.out.println("Fertilized with " + amountOfFertilizer + " of fertilizer");
        setFertilizerConsumedPerWeekKg(amountOfFertilizer);
    }

    public boolean grow(){
        if ((getWaterConsumedPerDayLt() < getWaterNeededPerDayLt())
                || (getFertilizerConsumedPerWeekKg() != getFertilizerNeededPerWeekKg())) {
            System.out.println("The plant is not growing");
            return false;
        }
        else{
            System.out.println("The plant is growing");
            return true;
        }

    }
}
