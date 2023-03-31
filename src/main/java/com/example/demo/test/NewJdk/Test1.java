package com.example.demo.test.NewJdk;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        System.out.println(set);
        Set<String> collect = Stream.of("a", "b", "c").collect(Collectors.toSet());
        System.out.println("collect = " + collect);
        Set<String> set2 = Set.of("a", "b", "c");
        System.out.println("______"+set2);


        Set<String> set1 = Collections.unmodifiableSet(set);
        System.out.println(set1);


    }
}
