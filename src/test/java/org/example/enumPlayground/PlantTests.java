package org.example.enumPlayground;

import org.junit.jupiter.api.Test;

import java.util.*;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toSet;
import static org.example.enumPlayground.Plant.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author kiyota
 */
class PlantTests {

    @Test
    void name() {
        Plant[] garden = {
                new Plant("Basil", LifeCycle.ANNUAL),
                new Plant("Carroway", LifeCycle.BIENNIAL),
                new Plant("Dill", LifeCycle.ANNUAL),
                new Plant("Lavendar", LifeCycle.PERENNIAL)
        };

        Map<LifeCycle, Set<Plant>> plantsByLifeCycle = new EnumMap<>(LifeCycle.class);
        for (LifeCycle lifeCycle : LifeCycle.values()) {
            plantsByLifeCycle.put(lifeCycle, new HashSet<>());
        }
        for (Plant plant : garden) {
            plantsByLifeCycle.get(plant.lifeCycle).add(plant);
        }
        System.out.println(plantsByLifeCycle);

        Map<LifeCycle, Set<Plant>> collect = Arrays.stream(garden)
                .collect(groupingBy(p -> p.lifeCycle, () -> new EnumMap<>(LifeCycle.class), toSet()));
        System.out.println(collect);
    }
}