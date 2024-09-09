package org.example.collections.link;

public class MyLinkedList {

    private Node root;
    private int size = 0;

    public void add(Object o) {
        Node node = new Node(o);
        if (root == null) {
            root = node;
        } else {
            Node last = getLastNode();
            last.next = node;
        }
        size++;
    }

    private Node getLastNode() {
        Node node = root;
        while (node.next != null) {
            node = node.next;
        }
        return node;
    }
}
