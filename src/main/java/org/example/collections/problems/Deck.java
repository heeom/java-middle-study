package org.example.collections.problems;

import java.util.*;

public class Deck {

    private List<Card> cards;
    private int index = -1;

    public Deck() {
        List<Card> cards = new ArrayList<>();
        for (Suits suits : Suits.values()) {
            for (int i = 1; i < 14; i++) {
                cards.add(new Card(suits, i));
            }
        }
        Collections.shuffle(cards);
    }

    /**
     * 카드 뽑기
     * @return card
     */
    public Card draw() {
        return cards.get(++index);
    }
}
