package oop.MyLinkedList;

public interface LinList<E> {
    LinList<E> addFirst (E item);
    LinList<E> addLast (E item);
    E get(int index);
    int getSize();
    int getIndex();
}
