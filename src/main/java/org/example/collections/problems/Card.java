package org.example.collections.problems;

public class Card {

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
}
