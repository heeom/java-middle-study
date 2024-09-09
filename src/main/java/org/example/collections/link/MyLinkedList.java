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

    public void add(int index, Object o) {
        Node newNode = new Node(o);
        if (index == 0) {
            newNode.next = root;
        } else {
            Node prev = getNode(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
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

    public Object set(int idx, Object o) {
        Node node = getNode(idx);
        Object item = node.item;
        node.item = o;
        return item;
    }

    public Object remove(int idx) {
        Node removeNode = getNode(idx);
        Object removedItem = removeNode.item;
        if (idx == 0) {
            root = removeNode.next;
        } else {
            Node prev = getNode(idx - 1);
            prev.next = removeNode.next;
        }
        size--;
        return removedItem;
    }

    public Node getNode(int idx) {
        Node node = root;
        for (int i = 0; i < idx; i++) {
            node = node.next;
        }
        return node;
    }
}
