package oop.MyLinkedList;

public class MyLinkedList<E> implements LInList<E> {

public static void main(String[] args) {
    MyLinkedList<String> stringLinked = new MyLinkedList<String>();
    stringLinked.addFirst("asd");
    stringLinked.addLast("zxc");
    stringLinked.addLast("qwe");

    System.out.println(stringLinked.size());
    System.out.println(stringLinked.getElementIndex(0));
    System.out.println(stringLinked.getElementIndex(1));
    System.out.println(stringLinked.getElementIndex(2));

}

    private Node<E> fstNode;
    private Node<E> lstNode;
    private int size = 0;

    public MyLinkedList () {
        lstNode = new Node<E>(null, fstNode, null);
        fstNode = new Node<E>(null, null, lstNode);
    }

    @Override
    public void addLast(E e) {
        Node<E> prev = lstNode;  //создали указатель на объект который был последней ножк
        prev.setCurrentElement(e);
        lstNode = new Node<E> (null, prev, null);  // заменили старую ноду на новую. задали предидущим элементо,элемент который сделали контейнером
        prev.setNextElement(lstNode);
        size++;
    }
     @Override
    public void addFirst(E e) {
       Node<E> next = fstNode;
       next.setCurrentElement(e);
       fstNode = new Node<E>(null, null, next);
       next.setNextElement(lstNode);
       size++;
    }
    @Override
    public E getElementIndex(int counter) {
        Node<E> target = fstNode.getNextElement();
        for (int i = 0; i < counter; i++) {
            target = getNextElement(target);
        }
        return target.getCurrentElement();
    }
    private Node<E> getNextElement(Node<E> current){
        return current.getNextElement();
    }
    @Override
    public int size() {
        return size;
    }


    private class Node<E> {
        private E currentElement;
        private Node<E> nextElement;
        private Node<E> lastElemtnt;

    private Node(E currentElement, Node<E> prevElement, Node<E> nextElement){
        this.currentElement = currentElement;
        this.nextElement = nextElement;
        this.lastElemtnt = nextElement;
    }

    public E getCurrentElement() {
        return currentElement;
    }

    public void setCurrentElement(E currentElement) {
        this.currentElement = currentElement;
    }

    public Node<E> getNextElement() {
        return nextElement;
    }

    public void setNextElement(Node<E> nextElement) {
        this.nextElement = nextElement;
    }

    public Node<E> getLastElemtnt() {
        return lastElemtnt;
    }

    public void setLastElemtnt(Node<E> lastElemtnt) {
        this.lastElemtnt = lastElemtnt;
    }
    }
}
