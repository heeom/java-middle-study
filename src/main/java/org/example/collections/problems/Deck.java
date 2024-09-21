package org.example.collections.problems;

import java.util.ArrayList;
import java.util.List;

public class Deck {

    List<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
        for (Suits suits : Suits.values()) {
            for (int i = 1; i < 14; i++) {
                cards.add(new Card(suits, i));
            }
        }
    }
}
