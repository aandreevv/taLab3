package com.company;

public interface Linker {

    void addFirst(int element);
    void addLast(int element);
    void add(int element, int index);

    void removeFirst();
    void removeLast();
    void remove(int index);

    int getIndex(int element);
    void print();


}
