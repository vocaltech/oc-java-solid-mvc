package fr.vocaltech.cardgame.model;

public enum Suit {
    DIAMONDS (1), // carreau
    HEARTS(2), // coeur
    SPADES(3), // pique
    CLUBS(4); // trefle

    private final int value;

    Suit(int value) {
        this.value = value;
    }
    public int value() {
        return value;
    }
}
