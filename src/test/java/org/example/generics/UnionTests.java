package org.example.generics;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author kiyota
 */
class UnionTests {

    @Test
    void name() {
        Set<String> s1 = Set.of("tom", "york", "kendrick");
        Set<String> s2 = Set.of("lamar", "west", "kanye", "tom");
        Set<String> union = Union.union(s1, s2);
        System.out.println(union);
    }
}