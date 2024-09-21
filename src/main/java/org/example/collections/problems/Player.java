package org.example.collections.problems;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    private List<Card> cards;

    public Player(String name) {
        this.name = name;
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

    /**
     * 카드 정렬
     */
    public void sortCards() {
        cards.sort(null);
    }

    /**
     * 카드 뽑기
     * @param deck 덱
     */
    public void drawCard(Deck deck) {
        this.cards.add(deck.pop());
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + "의 카드: " + cards +
                ", 합계:" + this.sum();
    }
}
