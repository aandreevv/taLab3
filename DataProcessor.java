package com.company;


public class DataProcessor {
   private Linker linker;

    public DataProcessor(Linker linker) {
        this.linker = linker;
    }

    public void fill() {
        for (int i=0; i<10000; i++) {
            linker.addFirst(i);
        }
    }

    public void addFront() {
        for (int i=0; i<1000; i++) {
            linker.addFirst(50000);
        }
    }

    public void removeFront() {
        for (int i=0; i<1000; i++) {
            linker.removeFirst();
        }
    }

    public void addMiddle() {
        for (int i=0; i<1000; i++) {
            linker.add(50000, i+10);
        }
    }

    public void removeMiddle() {
        int i = 999;
        while (i >= 0) {
            linker.remove(i+10);
            i--;
        }
    }

    public void addEnd() {
        int i = 999;
        while (i >= 0) {
            linker.addLast(50000);
            i--;
        }
    }

    public void removeEnd() {
        int i = 999;
        while (i >= 0) {
            linker.removeLast();
            i--;
        }
    }

    public void indexing() {
        for (int i = 0; i > -1000; i--) {
            linker.getIndex(i);
        }
    }

    public void print() {
        linker.print();
    }

    public long frontAddingTime() {
        long startTime = System.nanoTime();
        addFront();
        return System.nanoTime() - startTime;
    }

    public String getLinker() {
        if (linker instanceof CircularLinkedList) {
            return "Circular Linked List";
        } else return "Singly Linked List";
    }
}
