package org.example.collections.compare;

import java.util.Arrays;

public class SortMain3 {

    public static void main(String[] args) {
        MyUser a = new MyUser("a", 30);
        MyUser b = new MyUser("b", 20);
        MyUser c = new MyUser("c", 10);

        MyUser [] users = {a, b, c};
        System.out.println(Arrays.toString(users));
        System.out.println("===========sorted");
        Arrays.sort(users);
        System.out.println(Arrays.toString(users));

        Arrays.sort(users, new IdComparator());
        System.out.println(Arrays.toString(users));
    }
}
