package com.learncode;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /* 1-11-2025 */

        // Stream
        // Intermediate: filter, map
        // Terminal: collect, reduce, forEach

//       // Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
//        List<Integer> evenList = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
//        System.out.println(evenList);
//
//
////         Given a list of integers, find out all the numbers starting with 1 using Stream functions?
//        List<Integer> list = Arrays.asList(101, 201, 103, 104, 305, 206, 1);
//        list.stream().filter(n -> n.toString().startsWith("1")).forEach(System.out::println);
//
//        Map<String, String> hm = new HashMap<>();
//        hm.put("1", "1");
//        hm.put("2", "2");
//
////        hm.forEach((k, v) -> System.out.println(k+ " " + v));
//
//        for(Map.Entry h : hm) {
//            h.getKey();
//            h.getValue();
//        }
//
////         How to find duplicate elements in a given integers list in java using Stream functions?
//        List<Integer> list = Arrays.asList(1, 2, 3, 1, 4, 4);
//        List<Integer> collect = list.stream()
//                .collect(Collectors.groupingBy(integer -> integer, Collectors.counting())) // group it
//                .entrySet()
//                .stream()
//                .filter(item -> item.getValue() > 1) // filter based on value
//                .map(item -> item.getKey()) // convert entryset into value based on key
//                .collect(Collectors.toList());
//        System.out.println(collect);
//
////         optimal solution 1st.
//        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
//        Set<Integer> set = new HashSet();
//        myList.stream()
//                .filter(n -> !set.add(n))
//                .forEach(System.out::println);
//
//
////         Given the list of integers, find the first element of the list using Stream functions?
//        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
//        Integer first = myList.stream().findFirst().orElse(null);
//        System.out.println(first);
//
//
////         Given a list of integers, find the total number of elements present in the list using Stream functions?
//        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
//        long count = myList.stream().count();
//        System.out.println(count);
//
////         naman
////         nadupro
//
//
////         Given a list of integers, find the maximum value element present in it using Stream functions?
//        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
//        Comparator ascSort = new Comparator<>() {
//            @Override
//            public int compare(Object a, Object b) {
//
//                return 0;
//            }
//        };
//         myList.stream().max(Comparator.naturalOrder()).ifPresent(System.out::println);
//        myList.stream().max((a, b) -> a.compareTo(b)).ifPresent(System.out::println);
//
////        Integer.compare()
//
////         a, b, c, d, a, c = a, b, c, d
//
////         Given a String, find the first non-repeated character in it using Stream functions?
//        String str = "abccicdegggzsadd";
//        List<String> list = Arrays.asList(str.split(""));
//        list.stream().filter(item -> str.lastIndexOf(item) == str.indexOf(item)).findFirst().ifPresent(System.out::println);
//
//
////         Given a String, find the first repeated character in it using Stream functions?
//        String str = "abccdefgh";
//        Arrays.asList(str.split("")).stream().filter(item -> str.lastIndexOf(item) != str.indexOf(item)).findFirst().ifPresent(System.out::println);
//
////         Given a list of integers, sort all the values present in it using Stream functions?
//        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
//        myList.stream().sorted().forEach(System.out::println);
//
//
////         Given a list of integers, sort all the values present in it in descending order using Stream functions?
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        List<Integer> collect = myList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
//        System.out.println(collect);

        /* 1-12-2025 */

//        // Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//        List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5, 2, 3);
////        myList.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting())).entrySet().stream().filter(i -> i.getValue() > 1).findFirst().;
//
//        Set<Integer> hs = new HashSet<>();
//        Boolean ans = myList.stream().filter(n -> !hs.add(n)).map(n -> true).findFirst().orElse(false);
//        System.out.println(ans);
//
//
//        boolean ans2 = myList.stream().distinct().count() != myList.size();
//        System.out.println(ans2);
//
//        // How will you get the current date and time using Java 8 Date and Time API?
//        System.out.println(new Date());
//        System.out.println(java.time.LocalDate.now() + " "  + java.time.LocalTime.now() + " " + java.time.LocalDateTime.now());
//
//        List<Integer> list = Arrays.asList(1, 2);
//        Stream<Integer> stream = list.stream();
//
//        // Write a Java 8 program to concatenate two Streams? also sorted
//        Stream<Integer> stream1 = Stream.of(111, 2, 3, 4, 5, 2, 3);
//        Stream<Integer> stream2 = Stream.of(11, 34, 22, 11);
//        Stream<Integer> joinStream = Stream.concat(stream1, stream2).sorted();
//
//        joinStream.forEach(System.out::println);
//
//        // Java 8 program to perform cube on list elements and filter numbers greater than 50.
//        List<Integer> list = Arrays.asList(1, 2, 3, 5, 6, 1, 7, 2, 10);
//        List<Integer> collect = list.stream().map(n -> n * n * n).filter(n -> n > 50).collect(Collectors.toList());
//        System.out.println(collect);
//
//        // Write a Java 8 program to sort an array and then convert the sorted array into Stream?
//        Integer[] arr = new Integer[] {2, 5, 3, 6, 10, 0};
//        Arrays.sort(arr);
//        Arrays.asList(1,2,2);
//        Stream<Integer> stream = Arrays.stream(arr);
//        stream.forEach(System.out::println);
//
//        // How to use stream map to convert String into Uppercase in Java 8?
//        List<String> list = Arrays.asList("dadu", "naman@");
//        List<String> collect = list.stream().map(String::toUpperCase).collect(Collectors.toList());
//        System.out.println(collect);
//
//        // How to convert a List of objects into a Map by considering duplicated keys and store them in sorted order?
//        List<Integer> list = Arrays.asList(1, 2, 3, 5, 6, 1, 7, 2, 10);
//        Map<Integer, Long> collect = list.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()));
//        System.out.println(new TreeMap<>(collect));
//
//
//
//        // How to count each element/word from the String ArrayList in Java8?
//        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
//        Map<String,Long> namesCount = names
//                .stream()
//                .collect(
//                        Collectors.groupingBy(
//                                Function.identity(), Collectors.counting()));
//        System.out.println(namesCount);
//
//
//        // How to find only duplicate elements with its count from the String ArrayList in Java8?
//        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
//        Map<String, Long> namesCount = names.stream()
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                .entrySet()
//                .stream()
//                .filter(entry -> entry.getValue() > 1)
//                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
//
//
//
//        // How to check if list is empty in Java 8 using Optional, if not null iterate through the list and print the object?
//        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
//        Optional.ofNullable(names).orElseGet(ArrayList::new).forEach(System.out::println);
//
//        // Write a Program to find the Maximum element in an array?
//        Integer[] arr = new Integer[] {2, 5, 3, 6, 10, 0};
//        Arrays.stream(arr).max((a, b) -> a.compareTo(b)).ifPresent(System.out::println);
//
//        // Write a program to print the count of each character in a String?
//        String str = "sdfghjdxcfvghgvhfxdrcf";
//        List<String> split = Arrays.asList(str.split(""));
//        Map<String, Long> collect = split.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()))
//                .entrySet().stream()
//                .collect(Collectors.toMap(i -> i.getKey(), i -> i.getValue()));
//        System.out.println(collect);

    }
}
