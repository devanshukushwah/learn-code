package com.learncode.codechef;


import java.util.*;
import java.lang.*;

public class _22JAN25 {

    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here\
        Scanner scn = new Scanner(System.in);
        int testCase = scn.nextInt();
        while(testCase-->0){
            int n = scn.nextInt();
            int x = scn.nextInt();

            List<Integer> list = new ArrayList<>();

            for (int i=0;i<n;i++) {
                list.add(scn.nextInt() + (x * n - 1));
            }

            System.out.println(list);
        }
    }

}
