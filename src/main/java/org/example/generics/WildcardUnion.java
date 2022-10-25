package org.example.generics;

import java.util.HashSet;
import java.util.Set;

/**
 * @author kiyota
 */
public class WildcardUnion {
    public static <E> Set<E> union(Set<? extends E> s1, Set<? extends E> s2){
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }
}
