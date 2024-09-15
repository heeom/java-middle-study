package org.example.collections.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ImmutableMain {

    public static void main(String[] args) {
        // 불변 리스트 생성
        List<Integer> list = List.of(1, 2, 3);

        // 가변리스트로 변환
        ArrayList<Integer> mutableList = new ArrayList<>(list);
        mutableList.add(4);
        System.out.println(mutableList);

        // 다시 불변 리스트로 변경
        Collection<Integer> immutableList = Collections.unmodifiableCollection(mutableList);
        System.out.println("unmodifiableList : " + immutableList.getClass());
//        immutableList.add(5); // 예외 발생 : Exception in thread "main" java.lang.UnsupportedOperationException
    }
}
