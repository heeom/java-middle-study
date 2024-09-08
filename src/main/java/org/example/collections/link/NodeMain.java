package org.example.collections.link;

public class NodeMain {

    public static void main(String[] args) {
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        Node node = first;
        while(node.next != null) {
            System.out.println(node.item);
            node = node.next;
        }
    }
}
