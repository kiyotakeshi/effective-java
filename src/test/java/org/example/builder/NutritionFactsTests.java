package org.example.builder;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.from;

/**
 * @author kiyota
 */
class NutritionFactsTests {

    @Test
    void createInstance() {
        NutritionFacts food = new NutritionFacts.Builder(150)
                .calories(100)
                .fat(8)
                .sodium(2)
                .carbohydrate(20)
                .build();

        assertThat(food)
                .returns(150, from(NutritionFacts::getSize))
                .returns(100, from(NutritionFacts::getCalories))
                .returns(8, from(NutritionFacts::getFat))
                .returns(2, from(NutritionFacts::getSodium))
                .returns(20, from(NutritionFacts::getCarbohydrate));

        assertThat(food)
                // .extracting("size", "calories")
                .extracting(NutritionFacts::getSize, NutritionFacts::getCalories)
                .containsExactly(150, 100);
    }
}