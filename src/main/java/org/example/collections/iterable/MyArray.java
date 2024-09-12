package org.example.collections.iterable;

import java.util.Iterator;

public class MyArray implements Iterable<Integer> {
    private int[] nums;

    public MyArray(int[] nums) {
        this.nums = nums;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyArrayIterator(nums);
    }
}
