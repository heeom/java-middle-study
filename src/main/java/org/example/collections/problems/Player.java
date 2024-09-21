package org.example.collections.problems;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private List<Card> cards;

    public Player() {
        this.cards = new ArrayList<>();
    }

    /**
     * positive -> win
     * negative -> lose
     * zero -> tie
     * @param competitor
     * @return
     */
    public int play(Player competitor) {
        return this.sum() - competitor.sum();
    }

    public int sum() {
        int sum = 0;
        for (Card card : cards) {
            sum += card.getNumber();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "카드: [" + cards +
                "], 합계:" + this.sum();
    }
}
