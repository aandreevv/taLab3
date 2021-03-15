package com.company;

public class Queue implements QueueInterface{
    private SinglyLinkedList queueList = new SinglyLinkedList();

    @Override
    public void add(int element) {
        queueList.addLast(element);
    }

    @Override
    public void remove() {
        queueList.removeFirst();
    }

    @Override
    public boolean isEmpty() {
        return queueList.size == 0;
    }

    public void print() {
        queueList.print();
    }
}
