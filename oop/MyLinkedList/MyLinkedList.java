package oop.MyLinkedList;

import java.util.LinkedList;

import org.w3c.dom.Node;

public class MyLinkedList<E> implements LinList{

    private E[] values;
    private int getSize;
    private int count;

    @Override
    public LinList<E> addFirst(E item) {
 
        
    }

    @Override
    public LinList<E> addLast(E item) {
        
    }

    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public int getSize() {
        return getSize;
    }

    @Override
    public int getIndex() {
        return getIndex();
    }
}
