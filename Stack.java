package com.company;

public class Stack implements StackInterface{
    private SinglyLinkedList stackList = new SinglyLinkedList();

    @Override
    public void push(int element) {
        stackList.addLast(element);
    }

    @Override
    public void pop() {
        if (!isEmpty()) {
            stackList.removeLast();
        }
    }

    @Override
    public boolean isEmpty() {
        return stackList.getSize() == 0;
    }

    public void print() {
        stackList.print();
    }

}
