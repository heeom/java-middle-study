package org.example.collections.array;

public class Node {
    Object item;
    Node next;

    public Node(Object item) {
        this.item = item;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }
}
