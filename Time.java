package com.company;

public class Time {
    private DataProcessor dp;

    public Time(DataProcessor dp) {
        this.dp = dp;
    }

    public void start() {
        dp.fill();
    }

    public long frontAdditionTime() {
        long startTime = System.nanoTime();
        dp.addFront();
        return System.nanoTime() - startTime;
    }

    public long middleAdditionTime() {
        long startTime = System.nanoTime();
        dp.addMiddle();
        return System.nanoTime() - startTime;
    }

    public long endAdditionTime() {
        long startTime = System.nanoTime();
        dp.addEnd();
        return System.nanoTime() - startTime;
    }

    public long frontRemovingTime() {
        long startTime = System.nanoTime();
        dp.removeFront();
        return System.nanoTime() - startTime;
    }

    public long middleRemovingTime() {
        long startTime = System.nanoTime();
        dp.removeMiddle();
        return System.nanoTime() - startTime;
    }

    public long endRemovingTime() {
        long startTime = System.nanoTime();
        dp.removeEnd();
        return System.nanoTime() - startTime;
    }

    public long indexingTime() {
        long startTime = System.nanoTime();
        dp.indexing();
        return System.nanoTime() - startTime;
    }
}
