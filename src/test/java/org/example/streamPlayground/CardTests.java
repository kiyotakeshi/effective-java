package org.example.streamPlayground;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author kiyota
 */
class CardTests {
    @Test
    void name() {
        System.out.println(Card.NEW_DECK);
        System.out.println("==============================");
        System.out.println(Card.NEW_DECK_BY_STREAM);
    }
}