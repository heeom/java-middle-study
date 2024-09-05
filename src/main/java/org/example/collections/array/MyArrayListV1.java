package org.example.collections.array;

import java.util.Arrays;

public class MyArrayListV1 {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elems;
    private int size = 0;

    public MyArrayListV1() {
        elems = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV1(int initialCapacity) {
        elems = new Object[initialCapacity];
        this.size = initialCapacity;
    }

    public void add(Object o) {
        if (size == elems.length) {
            Object [] newElems = new Object[elems.length * 2];
            System.arraycopy(elems, 0, newElems, 0, size);
            elems = newElems;
        }
        elems[size] = o;
        size++;
    }

    public Object get(int index) {
        return elems[index];
    }

    public Object set(int index, Object elem) {
        Object oldValue = this.get(index);
        elems[index] = elem;
        return oldValue;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elems[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "MyArrayListV1{" +
                "elems=" + Arrays.toString(Arrays.copyOf(elems, size)) + // Arrays.copyOf(elems, size) : size 크기의 배열을 새로 만듬
                ", size=" + size +
                ", capacity=" + elems.length +
                '}';
    }
}
