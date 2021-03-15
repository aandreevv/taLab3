package com.company;

public class CircularLinkedList extends SinglyLinkedList {

    @Override
    public void addFirst(int element) {
        super.addFirst(element);
        tail.setNext(getHead());
    }

    @Override
    public void addLast(int element) {
        super.addLast(element);
        tail.setNext(getHead());
    }

    @Override
    public void add(int element, int index) {
        while (index > size) {
            index -= size;
        }
        super.add(element, index);
        tail.setNext(getHead());
    }

    @Override
    public void removeFirst() {
        super.removeFirst();
        tail.setNext(getHead());
    }

    @Override
    public void removeLast() {
        super.removeLast();
        tail.setNext(getHead());
    }

    @Override
    public void remove(int index) {
        while (index > size) {
            index -= size;
        }
        super.remove(index);
        tail.setNext(getHead());
    }

    @Override
    public int getIndex(int element) {
        Node currentNode = head;
        int index = 0;
        while (currentNode != tail && currentNode != null) {
            if (currentNode.getData() == element) {
                return index;
            }
            index++;
            currentNode = currentNode.getNext();
        } if (tail.getData() == element) {
            return size-1;
        }
        return -1;
    }
}
