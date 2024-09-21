package org.example.collections.problems;

public class Card implements Comparable<Card> {

    private Suits suits;
    private Integer number;

    public Card(Suits suits, Integer number) {
        this.suits = suits;
        this.number = number;
    }

    public Suits getSuits() {
        return suits;
    }

    public Integer getNumber() {
        return number;
    }

    @Override
    public int compareTo(Card card) {
        if (this.number.equals(card.number)) {
            return card.suits.getPriority() - this.suits.getPriority();
        }
        return this.number - card.number;
    }

    @Override
    public String toString() {
        return  number + '(' + suits.getIcon() + ')';
    }
}
