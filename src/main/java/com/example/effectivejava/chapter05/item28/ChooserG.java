package com.example.effectivejava.chapter05.item28;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ChooserG<T> {
    private final List<T> choiceList;

    public ChooserG(List<T> choiceList) {
        this.choiceList = new ArrayList<>(choiceList);
    }

    public T choose() {
        Random random = ThreadLocalRandom.current();
        return choiceList.get(random.nextInt(choiceList.size()));
    }
}


