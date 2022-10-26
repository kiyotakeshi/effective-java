package org.example.enumPlayground;

/**
 * @author kiyota
 */
public enum Ensemble {
    SOLO(1), DUET(2), TRIO(3), QUARTET(4), QUINTET(5);

    private final int numberOfMusicians;

    Ensemble(int size) {
        this.numberOfMusicians = size;
    }

    public int numberOfMusicians(){
        return numberOfMusicians;
    }
}
