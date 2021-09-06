package com.example.effectivejava.chapter09.item58.card;

import java.util.ArrayList;
import java.util.Collections;

public class TrumpCard {
    private final Suit suit;
    private final Rank rank;

    public TrumpCard(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Rank getRank() {
        return rank;
    }
}


