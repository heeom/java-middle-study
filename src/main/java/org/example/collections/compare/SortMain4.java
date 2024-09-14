package org.example.collections.compare;

import java.util.Arrays;
import java.util.LinkedList;

public class SortMain4 {

    public static void main(String[] args) {
        MyUser a = new MyUser("a", 30);
        MyUser b = new MyUser("b", 20);
        MyUser c = new MyUser("c", 10);

        LinkedList<MyUser> myUsers = new LinkedList<>(Arrays.asList(a, b, c));
        System.out.println(myUsers);

        System.out.println("===================");
        myUsers.sort(null);
        System.out.println(myUsers);
        System.out.println("===================");
        myUsers.sort(new IdComparator());
        System.out.println(myUsers);
    }
}
