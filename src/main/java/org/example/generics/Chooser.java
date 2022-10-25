package org.example.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author kiyota
 */
public class Chooser<T> {
    private final List<T> choiceList;

    public Chooser(List<T> choiceList) {
        this.choiceList = new ArrayList<>(choiceList);
    }

    public T choose(){
        Random random = ThreadLocalRandom.current();
        return choiceList.get(random.nextInt(choiceList.size()));
    }
}
