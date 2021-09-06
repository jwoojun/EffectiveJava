package com.example.effectivejava.chapter06.item35;

import lombok.Getter;

public enum Ensemble {
    SOLO(1), DUET(2), TRIO(3), QUARTET(4),
    QUINTET(5), SEXTET(6), SEPTET(7), OCTET(8),
    DOUBLE_QUARTET(8), NONET(9), DECTET(10),
    TRIPLE_QUARTET(12);

    private final int numberOfMusicians;

    Ensemble(int numberOfMusicians) {
        this.numberOfMusicians = numberOfMusicians;
    }

    public int getNumberOfMusicians() {
        return numberOfMusicians;
    }
}



enum BadEnsemble {
    SOLO, DUET, TRIO, QUARTET, QUINTET, SEXTET, SEPTET, OCTET,
    DOUBLE_QUARTET, NONET, DECTET, TRIPLE_QUARTET;

    BadEnsemble() {
    }
}





