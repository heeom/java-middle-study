package org.example.collections.utils;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfMain {

    public static void main(String[] args) {
        // 편리한 불변 컬렉션 생성
        List<Integer> list = List.of(1, 2, 3);
        Set<Integer> set = Set.of(1, 2, 3);
        Map<Integer, String> map = Map.of(1, "one", 2, "two", 3, "three");
        System.out.println("list : " + list.getClass());
        // list : class java.util.ImmutableCollections$ListN
        // 컬렉션을 변경하려고 하면 예외가 발생한다.
    }
}
