package org.example.generics;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author kiyota
 */
class ChooserTests {

    @Test
    void name() {
        List<Integer> integerList = List.of(1, 2, 3, 4, 5);
        Chooser<Integer> integerChooser = new Chooser<>(integerList);
        System.out.println(integerChooser.choose());

        List<String> stringList = List.of("hello", "world", "effective", "java");
        Chooser<String> stringChooser = new Chooser<>(stringList);
        System.out.println(stringChooser.choose());
    }
}