package com.example.effectivejava.chapter10.item75;

public class IndexOutOfBoundsException {
    int lowerBound;
    int upperBound;
    int index;

    public IndexOutOfBoundsException(int lowerBound, int upperBound, int index){
        // super(String.format("최솟값: %d, 최댓값: %d, 인덱스: %d", lowerBound, upperBound, index));
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.index = index;
    }

}
