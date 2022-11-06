package org.example.streamPlayground;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author kiyota
 */
public class Card {
    public enum Suit {SPADE, HEART, DIAMOND, CLUB}

    public enum Rank {
        ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN,
        EIGHT, NINE, TEN, JACK, QUEEN, KING
    }

    private final Suit suit;
    private final Rank rank;

    @Override
    public String toString() {
        return rank + " of " + suit + "S";
    }

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;

    }

    static final List<Card> NEW_DECK = newDeck();

    static final List<Card> NEW_DECK_BY_STREAM = newDeckByStream();

    private static List<Card> newDeck() {
        List<Card> result = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                result.add(new Card(suit, rank));
            }
        }
        return result;
    }

    private static List<Card> newDeckByStream() {
        return Stream.of(Suit.values())
                // stream の各要素を stream にマップし、
                // そこから新たな stream を単一の stream に結合(flat)する
                .flatMap(suit ->
                        Stream.of(Rank.values())
                                .map(rank -> new Card(suit, rank))
                ).collect(Collectors.toList());

        //         return Arrays.stream(Suit.values())
        //                .flatMap(suit -> Arrays.stream(Rank.values())
        //                        .map(rank -> new Card(suit, rank)))
        //                .collect(Collectors.toList());
    }
}
