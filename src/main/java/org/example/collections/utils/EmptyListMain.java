package org.example.collections.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmptyListMain {

    public static void main(String[] args) {
        // empty 가변 리스트
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();


        // empty 가변 리스트
        List<Integer> list3 = Collections.emptyList(); // java 5
        list3.add(1);
        List<Integer> list4 = List.of(); // java 9

        System.out.println("list3 = " + list3.getClass());
        System.out.println("list4 = " + list4.getClass());

        // 완전 불변 리스트 아님
        // 고정된 크기를 가지지만, 요소 변경은 가능, set을 통해 변경은 가능하지만 add(), remove()로 길이변경은 불가능
        List<Integer> list5 = Arrays.asList(1, 2, 3); // java 1.2 : 배열 -> List
        System.out.println("list5 = " + list5.getClass());

        Integer[] arr = {1,2,3,4,5};
        List<Integer> arr1 = List.of(arr); // 새로운 리스트를 생성
        List<Integer> arr2 = Arrays.asList(arr); // 리스트 생성시 배열의 참조값을 그대로 사용 -> 리스트 생성하는 비용이 더 적음 / 배열의 크기가 아주 크다면 Arrays.asList가 나을 수도 있음
        System.out.println("arr2 = " + arr2.getClass());
    }
}
