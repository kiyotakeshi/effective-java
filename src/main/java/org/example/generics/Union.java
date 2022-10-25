package org.example.generics;

import java.util.HashSet;
import java.util.Set;

/**
 * @author kiyota
 */
public class Union {

    // static の後の <E> は3つのセット(2つの引数と戻り値)に対する要素型を表す型パラメータ
    public static <E> Set<E> union(Set<E> s1, Set<E> s2){
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }
}
