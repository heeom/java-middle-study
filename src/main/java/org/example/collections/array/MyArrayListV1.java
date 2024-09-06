package org.example.collections.array;

import java.util.Arrays;

public class MyArrayListV1<E> {
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

    public void add(E o) {
        if (size == elems.length) {
            elems = Arrays.copyOf(elems, elems.length * 2); // 길이 두배로 늘림
        }
        elems[size] = o;
        size++;
    }

    public void add(int index, E o) {
        if (size == elems.length) {
            elems = Arrays.copyOf(elems, elems.length * 2); // 길이 두배로 늘림
        }
        shiftRightFrom(index);
        elems[index] = o;
        size++;
    }

    private void shiftRightFrom(int index) {
        for (int i = size; i > index; i--) {
            elems[i] = elems[i-1];
        }
    }
    
    public Object remove(int index) {
        Object o = get(index);
        shiftLeftFrom(index);
        size--;
        return o;
    }

    private void shiftLeftFrom(int index) {
        for (int i = index; i < size; i++) {
            elems[i] = elems[i+1];
        }
    }

    public E get(int index) {
        return (E) elems[index];
    }

    public E set(int index, E elem) {
        E oldValue = this.get(index);
        elems[index] = elem;
        return oldValue;
    }

    public int indexOf(E o) {
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
