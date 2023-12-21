package oop.MyLinkedList;

import java.util.LinkedList;

public class MyLinkedList<E> implements LinList{

    private E[] values;
    private int getSize;
    private int count;

    /**
     * @param e
     * @return
     */
    @Override
    public LinList<E> addFirst(E e) {
            return addFirst(e);
    }

    /**
     * @param e
     * @return
     */
    @Override
    public LinList<E> addLast(E e) {
        return addLast(e);
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
