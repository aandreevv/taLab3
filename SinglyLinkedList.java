package com.company;

public class SinglyLinkedList implements Linker {
    protected Node head;
    protected Node tail;
    protected int size;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public void addFirst(int element) {
        Node insertedNode = new Node(element, null);
        if (head == null) {
            head = insertedNode;
            tail = insertedNode;
        } else {
        insertedNode.setNext(head);
        head = insertedNode; }
        size++;
    }

    @Override
    public void addLast(int element) {
        Node insertedNode = new Node(element, null);
        if (tail != null) {
            tail.setNext(insertedNode);
            tail = insertedNode;
        } else {
            head = insertedNode;
            tail = insertedNode;
        }
        size++;
    }

    @Override
    public void add(int element, int index) {
        if (index <= size) {
            if (index == 0) {
                addFirst(element);
            } else if (index == size) {
                addLast(element);
            } else {
                Node currentNode = head;
                for (int i = 1; i < index; i++) {
                    currentNode = currentNode.getNext();
                }
                currentNode.setNext(new Node(element, currentNode.getNext()));
                size++;
            }
        }
    }

    @Override
    public void removeFirst() {
        if (head != null) {
            head = head.getNext();
            size--;
        }
    }

    @Override
    public void removeLast() {
        if (tail != null) {
            Node currentNode = head;
            for (int i = 1; i < size-1; i++) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(null);
            size--;
        }
    }

    @Override
    public void remove(int index) {
        if (index <= size) {
            if (index == 0) {
                removeFirst();
            } else if (index == size) {
                removeLast();
            } else {
                Node currentNode = head;
                for (int i=1; i<index; i++) {
                    currentNode = currentNode.getNext();
                }
                currentNode.setNext(currentNode.getNext().getNext());
            }
            size--;
        }
    }


    @Override
    public int getIndex(int element) {
        Node currentNode = head;
        int index = 0;
        while (currentNode != null) {
            if (currentNode.getData() == element) {
                return index;
            }
            index++;
            currentNode = currentNode.getNext();
        }
        return -1;
    }

    @Override
    public void print() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.getData() + " ");
            currentNode = currentNode.getNext();
        }
        System.out.println();
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getSize() {
        return size;
    }
}
