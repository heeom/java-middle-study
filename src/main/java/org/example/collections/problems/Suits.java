package org.example.collections.problems;

public enum Suits {
    SPADES(1, "♠"),
    HEARTS(2, "♥"),
    DIAMONDS(3, "♦"),
    CLUBS(4, "♣");

    private int priority;
    private String icon;

    Suits(int priority, String icon) {
        this.priority = priority;
        this.icon = icon;
    }

    public int getPriority() {
        return priority;
    }

    public String getIcon() {
        return icon;
    }
}
