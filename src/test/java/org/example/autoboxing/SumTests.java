package org.example.autoboxing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author kiyota
 */
class SumTests {

    @Test
    void slow() {
        long x = 0;

        long start = System.nanoTime();
        x += Sum.slowSum();
        long end = System.nanoTime();
        System.out.println((end - start) / 1_000_000. + " ms.");
    }

    @Test
    void fast() {
        long x = 0;

        long start = System.nanoTime();
        x += Sum.fastSum();
        long end = System.nanoTime();
        System.out.println((end - start) / 1_000_000. + " ms.");
    }
}