package com.example.effectivejava.chapter09.item58.card;

import java.util.*;

public class Item58 {
    public static Collection<Suit> suits = Arrays.asList(Suit.values());
    public static Collection<Rank> ranks = Arrays.asList(Rank.values());

    List<TrumpCard> deck = new ArrayList<>();

    void hasBug() {
        for(Iterator<Suit> i = suits.iterator(); i.hasNext();){
            for(Iterator<Rank> j = ranks.iterator(); j.hasNext();){
                deck.add(new TrumpCard(i.next(), j.next()));
            }
        }
    }
}


