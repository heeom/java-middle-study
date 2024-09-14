package org.example.collections.compare;

import java.util.*;

public class SortMain5 {

    public static void main(String[] args) {
        MyUser a = new MyUser("a", 30);
        MyUser b = new MyUser("b", 20);
        MyUser c = new MyUser("c", 10);

        MyUser [] myUsers = {a,b,c};

        // MyUser객체의 기본 정렬 사용
        Set<MyUser> treeSet = new TreeSet<>(Arrays.asList(myUsers));
        System.out.println(treeSet);

        // 정렬 기준을 새로 주고 싶다면 객체 생성시에 비교자를 줌
        TreeSet<MyUser> treeSet2 = new TreeSet<>(new IdComparator());
        treeSet2.addAll(Arrays.asList(myUsers));
        System.out.println(treeSet2);
    }
}
