package com.learncode.old;

import java.util.*;
import java.util.stream.Collectors;

public class StringQuestions {

    //        Write a program to reverse a given string without using built-in reverse functions
    static void q1() {
        String s = "abcde";
        String rs = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            rs = rs + s.charAt(i);

        }
        System.out.println(rs);


//        StringBuilder s = new StringBuilder("abcde");
//        System.out.println(s.reverse());
    }

    //        Check if a given string is a palindrome.
    static void q2() {
        String s = "naman";

        int left = 0, right = s.length() - 1;
        boolean flag = true;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                flag = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println(flag ? "pallidrome" : "not pallidrome");

    }

    //        Count the number of vowels and consonants in a given string.
    static void q3() {
        String s = "naman";
        List<Character> l = Arrays.asList('a', 'e', 'i', 'o', 'u');
        int vCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (l.contains(s.charAt(i))) {
                vCount++;
            }
        }
        int cCount = s.length() - vCount;
        System.out.println(vCount + " " + cCount);
    }


    //        Replace all occurrences of a character in a string with another character.
    static void q4() {

        String a = "naman";
        String rs = "";
        char b = 'a';
        char replace = 'e';


        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b) {
                rs = rs + replace;
            } else {
                rs = rs + a.charAt(i);
            }
        }

        System.out.println(rs);


//        System.out.println(a.replace(b, replace));
    }

    // find first repeating string.
//    HashSet<Character> hs = new HashSet<>();
//        for (int i = 0; i < s.length(); i++) {
//        if (!hs.add(s.charAt(i))) {
//            System.out.println(s.charAt(i));
//            break;
//        }
//    }

    // Write a program to find the first non-repeating character in a string
    static void q5() {
        String s = "naman";

        for (int i = 0; i < s.length(); i++) {
            if (s.lastIndexOf(s.charAt(i)) == s.indexOf(s.charAt(i))) {
                System.out.println(s.charAt(i));
                break;
            }
        } // O(N^2)


        // Big (O) notation
//        1. for loop.
//        2. space consume.
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        } // O(N)
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (freq[ch - 'a'] == 1) {
                System.out.println(ch);
                break;
            }
        } // O(N)
//        = O(N) + O(N) = 2 O(N) ~ O(N). || space: O(26)
        //nested loop O(N^2) || O(zero)

//        good case : O(1);
//        medium case: N * log(N)
//        worst case: O(N^N)
    }

    //        Remove all duplicate characters from a given string
    static void q6() {
        String s1 = "naman";
        String[] split = s1.split("");

        List<String> l1 = Arrays.stream(split).collect(Collectors.toList());

        List<String> myList = l1.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting())).entrySet().stream().filter(n -> n.getValue() > 1).map(i -> i.getKey()).collect(Collectors.toList());

        l1.removeAll(myList);
        System.out.println(l1);
    }

    // Compress a string based on character counts (e.g., "aaabbccc" becomes "a3b2c3").
    static void q7() {

        String s = "zzzzqqqbbbbwwwwyyyyyyybbbbb";
        String[] split = s.split("");
        List<String> l1 = Arrays.stream(split).collect(Collectors.toList());
        Map<String, Long> myMap = l1.stream().collect(Collectors.groupingBy(n -> n, LinkedHashMap::new, Collectors.counting()));

        String a = "";
        Set<String> strings = myMap.keySet();
        for (String key : strings) {
            a = a + key + myMap.get(key);
        }

        System.out.println(a);
    }

    static String capitalize(String input) {
        return Arrays.stream(input.split("\\s"))
                .map(word -> String.valueOf(word.charAt(0)).toUpperCase() + word.substring(1))
                .collect(Collectors.joining(" "));
    }

    public static void q8() {
        String str = "ab2cd10ef1"; // ababcdcdcdcdcdcdcdcdcdcdef
        for (int i = 0; i < str.length() - 1; i++) {
            char ch = str.charAt(i + 1);
//            if (Character.isDigit(ch)) {
//
//            }
        }
    }

    // A function to check if a string is a valid rotation of another string (e.g., "abcde" is a rotation of "deabc")
    static void q9() {
        String s1 = "deabc";
        String s2 = "abcde";

        for (int i = 1; i < s1.length(); i++) {
            String rotate = s1.substring(i) + s1.substring(0, i);
            if (rotate.equals(s2)) {
                System.out.println("valid");
                break;
            }
        }

    }

    public static void main(String[] args) {
//        q1();
//        q2();
//        q3();
//        q4();
//        q5();
//        q6();
//        q7();
//        q8();
//        System.out.println(expandString("ab2cd10ef1"));
//        System.out.println(capitalize("hello world Q Naman #sep"));
        q9();

    }
}
