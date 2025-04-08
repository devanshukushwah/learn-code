package com.learncode.old;

import java.util.*;
import java.util.stream.Collectors;

public class StreamAPI2 {

    static void q1() {
        List<String> strings = Arrays
                .asList("apple", "banana", "cherry", "date", "grapefruit", "skajsdlkfjadslkfj");

        strings.stream().collect(Collectors.toMap(k -> k, l -> l.length()))
                .entrySet()
                .stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .findFirst()
                .ifPresent((item) -> System.out.println(item.getKey()));

        // alksjflsa
        // asdf

        strings.stream().max((s1, s2) -> Integer.compare(s1.length(), s2.length())).ifPresent(System.out::println);
    }


    public boolean uniqueOccurrences(int[] arr) {
        List<Long> l = Arrays.stream(arr).boxed().collect(Collectors
                        .groupingBy(i -> i, Collectors.counting()))
                .entrySet().stream().map(i -> i.getValue()).collect(Collectors.toList());

        return l.stream().distinct().count() < l.size();
    }

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> lnum1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> lnum2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());

        List<Integer> _1 = new ArrayList<>();
        List<Integer> _2 = new ArrayList<>();

        for (Integer item: lnum1) {
            if (!lnum2.contains(item))
                _1.add(item);
        }

        for (Integer item: lnum2) {
            if (!lnum1.contains(item))
                _2.add(item);
        }
//        Collectors
//        return Arrays.asList(_1.strem().distinct().collect(Collectors.toList()),
//                _2.strem().distinct().collect(Collectors.toList()));

        return Collections.emptyList();
    }

    public static void main(String[] args) {
        q1();
    }
}
