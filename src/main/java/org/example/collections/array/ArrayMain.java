package org.example.collections.array;

import java.util.Arrays;

public class ArrayMain {
    public static void main(String[] args) {
        String[] array = new String[5];
        String hello = "hello";
        for (int i = 0; i < array.length; i++) {
            array[i] = String.valueOf(hello.charAt(i));
        }
        String[] newArray = Arrays.copyOf(array, array.length * 2);
        int index = 2;
        newArray[index] = "hello";
        System.out.println("index : " + 2 + ", array value : " + array[index] + ", newArray value : " + newArray[index]);
    }
}
