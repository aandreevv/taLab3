package com.company;


public class Main {

    public static void main(String[] args) {
        printResults(new DataProcessor(new SinglyLinkedList()));
        printResults(new DataProcessor(new CircularLinkedList()));

        queueTest();
        stackTest();
    }

    static void queueTest() {
        System.out.println("===== QUEUE =====");
        Queue queue = new Queue();
        System.out.println("1. Adding elements to queue:");
        for (int i=0; i<5; i++) {
            queue.add(i+1);
            queue.print();
        }
        System.out.println("\n" + "2. Removing elements from queue:");
        for (int i=0; i<5; i++) {
            queue.print();
            queue.remove();
        }
        System.out.println();
    }

    static void stackTest() {
        System.out.println("===== STACK =====");
        Stack stack = new Stack();
        System.out.println("1. Pushing elements to stack:");
        for (int i=0; i<5; i++) {
            stack.push(i+1);
            stack.print();
        }
        System.out.println("\n" + "2. Popping elements from stack:");
        for (int i=0; i<5; i++) {
            stack.print();
            stack.pop();
        }
        System.out.println();
    }

    static void printResults(DataProcessor dp) {
        System.out.println("===== " + dp.getLinker() + " =====");
        Time time = new Time(dp);
        time.start();
        long frontAddingTime = time.frontAdditionTime();
        long frontRemovingTime = time.frontRemovingTime();
        long middleAddingTime = time.middleAdditionTime();
        long middleRemovingTime = time.middleRemovingTime();
        long endAddingTime = time.endAdditionTime();
        long endRemovingTime = time.endRemovingTime();

        long indexTime = time.indexingTime();
        System.out.println("Adding in front: " + frontAddingTime);
        System.out.println("Adding a.g.n.: " + middleAddingTime);
        System.out.println("Adding in end: " + endAddingTime);
        System.out.println();
        System.out.println("Removing in front: " + frontRemovingTime);
        System.out.println("Removing a.g.n. " + middleRemovingTime);
        System.out.println("Removing in end: " + endRemovingTime);
        System.out.println();
        System.out.println("Indexing: " + indexTime);
        System.out.println();
    }
}
