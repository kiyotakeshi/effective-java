package org.example.enumPlayground;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author kiyota
 */
class EnsembleTests {

    @Test
    void name() {
        assertThat(Ensemble.valueOf("SOLO").numberOfMusicians()).isEqualTo(1);
        assertThat(Ensemble.SOLO.numberOfMusicians()).isEqualTo(1);
        List<Ensemble> collect = Arrays.stream(Ensemble.values()).toList();
        collect.forEach(System.out::println);
    }
}