package org.example.collections.problems;

public enum Suits {
    SPADES(1),
    HEARTS(2),
    DIAMONDS(3),
    CLUBS(4);

    private int priority;

    Suits(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }
}
