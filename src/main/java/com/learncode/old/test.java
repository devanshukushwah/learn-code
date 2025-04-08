package com.learncode.old;

public class test {
    public static void main(String[] args) {
        String str = "ababccedffeeizq";

        int[] occur = new int[26];
        for (int i=0;i<str.length();i++) { // O(N)
            int ascii = str.charAt(i) - 'a';
            occur[ascii] += 1;
        }

        for(int i=0;i<str.length();i++) { // O(N)
            int ascii = str.charAt(i) - 'a';
            if (occur[ascii] == 1) {
                System.out.println(str.charAt(i));
                break;
            }
        }

        // total time complexity 2 * O(N) ~ O(N) 
    }
}
