package com.example.effectivejava.chapter07.item45;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Card {
    public enum Suit {
      SPADE, HEART, DIAMOND, CLUB
    }

    public enum Rank {
      ACE, DEUCE, THREE, FOUR, FIVE,
      SIX, SEVEN, EIGHT, NINE, TEN,
        JACK, QUEEN, KING
    }

    private final Suit suit;
    private final Rank rank;

    public Card(Suit suit, Rank rank) {
      this.suit = suit;
      this.rank = rank;
    }

    private static List<Card> newDeckV1(){
        List<Card> result = new ArrayList<>();
        for (Suit suit : Suit.values()){
            for (Rank rank : Rank.values()){
                result.add(new Card(suit, rank));
            }
        }
        return result;
    }

    private static List<Card> newDeckV2(){
        return Stream.of(Suit.values())
                .flatMap(suit ->
                    Stream.of(Rank.values())
                            .map(rank -> new Card(suit, rank)))
                .collect(toList());
    }
}


