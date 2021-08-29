package com.example.effectivejava.chapter05.item31;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Chooser {
    private final Object [] choiceArray;

    public Chooser(Object[] choiceArray) {
        this.choiceArray = choiceArray;
    }

    public Object choose() {
        Random random = ThreadLocalRandom.current();
        return choiceArray[random.nextInt(choiceArray.length)];
    }
}


