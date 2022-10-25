package org.example.generics;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author kiyota
 */
class WildcardUnionTests {

    @Test
    void name() {
        Set<Integer> integers = new HashSet<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);

        Set<Double> doubles = new HashSet<>();
        doubles.add(1.0);
        doubles.add(2.0);
        doubles.add(3.0);

        Set<Number> numbers = WildcardUnion.union(integers, doubles);
        System.out.println(numbers);
    }
}