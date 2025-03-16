package com.learncode;

import java.util.*;
import java.util.stream.Collectors;

public class Program {

    public static void q1() {
        Integer[] arr = {9, 1, 3, 5, 7};
        List<Integer> list = Arrays.asList(arr);
        int max = list.stream().max(Comparator.naturalOrder()).get();
        int min = list.stream().min(Comparator.naturalOrder()).get();
        for (int i = min; i <= max; i++) {
            if (!list.contains(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static void q2() {
        int[] arr = {9, 1, 3, 5, 7};
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= arr.length - 3; i--) {
            System.out.println(arr[i]);
        }
    }

    private static void q3() {
        String str = "devanshu pro player";

        String ans = "";

        for (String arr : str.split(" ")) {
            ans = ans.concat(new StringBuilder(arr).reverse().toString()).concat(" ");
        }

        System.out.println(ans.trim());

    }

    /* Second Largest Element in an Array */
    static void getSecondLargest() {
        int[] arr = {9, 1, 3, 5, 7};
        int n = arr.length;

        // Sort the array in non-decreasing order
        Arrays.sort(arr);
        System.out.println(arr[n - 2]);

        /*in case array have duplicate data */
//        // function to find the second largest element
//        static int getSecondLargest(int[] arr) {
//            int n = arr.length;
//
//            // Sort the array in non-decreasing order
//            Arrays.sort(arr);
//
//            // start from second last element as last element is the largest
//            for (int i = n - 2; i >= 0; i--) {
//
//                // return the first element which is not equal to the
//                // largest element
//                if (arr[i] != arr[n - 1]) {
//                    return arr[i];
//                }
//            }
//
//            // If no second largest element was found, return -1
//            return -1;
//        }
    }

    // Function to find a maximum
// product of a triplet in array
// of integers of size n
    static int maxProduct(int[] arr) {
        int n = arr.length;
        // if size is less than
        // 3, no triplet exists
        if (n < 3)
            return -1;

        // will contain max product
        int max_product = Integer.MIN_VALUE;

        for (int i = 0; i < n - 2; i++)
            for (int j = i + 1; j < n - 1; j++)
                for (int k = j + 1; k < n; k++)
                    max_product = Math.max(max_product,
                            arr[i] * arr[j] * arr[k]);

        return max_product;
    }

    // Function to find a maximum
// product of a triplet in array
// of integers of size n
    static int maxProduct_naman(int[] arr) {
        int n = arr.length;
        // if size is less than
        // 3, no triplet exists
        if (n < 3)
            return -1;

        Arrays.sort(arr);
//        return arr[n - 1] * arr[n - 2] * arr[n - 3];

        // Return the maximum of product of last three
        // elements and product of first two elements
        // and last element
        return Math.max(arr[0] * arr[1] * arr[n - 1],
                arr[n - 1] * arr[n - 2] * arr[n - 3]);


//        1, -4, 3, -6, 7, 0
//         -6, -4, 0, 1, 3, 7
//        max = 21 (1,3, 7)
//        max2 = 168 (-6, -4, 7)

    }

    // 19-01-25
    // Write a program to find the smallest and largest numbers in an array.
    private static void maxMinFind() {
//        Input: int[] arr = [3, 5, 7, 2, 8]
//        Output:
//        Max: 8
//        Min: 2
//
        int[] arr = {3, 5, 7, 2, 8};
        int max = arr[0];
        int min = arr[0];
        for (int n : arr) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        System.out.println(max + " " + min);
    }

    //    Write a function to reverse the elements of an array in place.
    public static void revArr() {
//        Input: [1, 2, 3, 4, 5]
//        Output: [5, 4, 3, 2, 1]
        int arr[] = {1, 2, 3, 4, 5};
        int[] rArr = new int[arr.length];
        int n = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            rArr[n] = arr[i];
            n++;
        }

        System.out.println(Arrays.toString(rArr));
    }

    //    Given an array, rotate it to the right by k steps.
    public static void rotate() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 4;
//        size = 7
//                k = 7 - k - 1
//        for 4  = [4, 5, 6, 7, 1, 2, 3]
//        Output: [5, 6, 7, 1, 2, 3, 4]    [-,-,-,1,2,3,4]

        int[] rArr = new int[arr.length];

        for (int i = 0; i < arr.length - k; i++) {
            rArr[i + k] = arr[i];
        }

        int n = 0;
        for (int i = arr.length - k; i < arr.length; i++) {
            rArr[n] = arr[i];
            n++;
        }

        System.out.println(Arrays.toString(rArr));
    }

    //  Write a program to find the duplicate number in an array where only one element is repeated.
    public static void duplicate() {

//        op soln
//        int arr[] = {1, 3, 3, 4, 2, 2};
//        HashSet hs = new HashSet();
//        for(int n: arr){
//            if(!hs.add(n)){
//                System.out.println(n);
//            }
//        }


        int[] arr = {1, 3, 3, 4, 2, 2};
        boolean[] found = new boolean[100];
        for (int n : arr) {
            if (found[n] == true) {
                System.out.println(n);
//                break;
            }
            found[n] = true;
        }
    }

    // Write a function to merge two sorted arrays into a single sorted array.
    public static void sortedMerge() {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
//
//                Input:
//        Array 1: [1, 3, 5]
//        Array 2: [2, 4, 6]

//        Output: [1, 2, 3, 4, 5, 6]

        int i = 0;
        int[] mArr = new int[arr1.length + arr2.length];
        int l = 0, r = 0;
        while (l < arr1.length) {
            while (r < arr2.length) {
                if (arr1[l] < arr2[r]) {
                    mArr[i] = arr1[l];
                    i++;
                    break;
                } else {
                    mArr[i] = arr2[r];
                    i++;
                }
                r++;
            }
            l++;
        }

        while (l < arr1.length) {
            mArr[i] = arr1[l];
            l++;
            i++;
        }

        while (r < arr2.length) {
            mArr[i] = arr2[r];
            r++;
            i++;
        }

        System.out.println(Arrays.toString(mArr));
    }

    //    Write a program to check if one array is a subset of another.
//
//            Input:
//    Array 1: [11, 1, 13, 21, 3, 7]
//    Array 2: [11, 3, 7, 1]
//
//    Output: Array 2 is a subset of Array 1
    public static void findSubset() {

//        List<Integer> list1 = Arrays.asList(11, 1, 13, 21, 3, 7);
//        List<Integer> list2 = Arrays.asList(11, 3, 7, 1);
//
//        System.out.println(list1.containsAll(list2) ? "subset" : "not subset");

        int[] arr1 = {11, 1, 13, 21, 3, 7};
        int[] arr2 = {11, 3, 7, 1};
        boolean flag = true;
        for (int n2 : arr2) {
            for (int n1 : arr1) {
                if (n2 == n1) {
                    flag = true;
                    break;
                } else flag = false;
            }
            if (flag == false) {
                break;
            }
        }
        System.out.println(flag ? "subset" : "not subset");
    }

    // find missing number.
    public static void findMissingNumbers() {
        int[] arr = {3, 5, 7, 2, 8};
        int a = arr[0];
        int b = arr[0];
        boolean[] found = new boolean[100];
        for (int n : arr) {
            a = Math.max(a, n);
            b = Math.min(b, n);
            found[n] = true;
        }

        for (int i = a; i <= b; i++) {
            if (found[i] == false) {
                System.out.println(i);
            }
        }
    }


//    8. Find the First Non-Repeating Element
//    Write a program to find the first non-repeating element in an array.
//
//            Input: [9, 4, 9, 6, 7, 4]
//    Output: 6

    public static void nonRepeating() {
        int[] arr2 = {9, 4, 9, 6, 7, 4};
        Integer key = Arrays.stream(arr2)
                .boxed()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(item -> item.getValue() == 1)
                .findFirst()
                .get()
                .getKey();
        System.out.println("first = " + key);
        int[] arr = {9, 4, 9, 6, 7, 4};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) continue;
                if (arr[i] == arr[j]) {
                    break;
                }
                if (j == arr.length - 1) {
                    System.out.println(arr[i]);
                    System.exit(0);
                }
            }
        }
    }

    //    Sort an Array of 0s, 1s, and 2s
//    Given an array containing only 0s, 1s, and 2s, sort it without using a sorting algorithm.
    public static void sortWithoutAlgo() {
        int arr[] = {2, 0, 2, 1, 1, 0};

        List<Integer> l1 = new ArrayList();
        List<Integer> l2 = new ArrayList();
        List<Integer> l3 = new ArrayList();

        for (int n : arr) {
            if (n == 0) {
                l1.add(n);
            } else if (n == 1) {
                l2.add(n);
            } else {
                l3.add(n);
            }
        }
        l2.addAll(l3);
        l1.addAll(l2);
        System.out.println(l1);
    }

    // An element is a leader if it is greater than all elements to its right.
    public static void findLeader() {
        int[] arr = {16, 17, 4, 3, 5, 2};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int n = i + 1; n < arr.length; n++) {
                if (arr[i] < arr[n]) break;
                if (n == arr.length - 1) {
                    System.out.println(arr[i]);
                }
            }
        }
        System.out.println(arr[arr.length - 1]);
    }

    // Find the number of pairs in an array whose sum is equal to a given value.
    public static void findPairs() {

        int[] arr = {1, 5, 7, 1, 3, 3, -1};
        int sum = 6;

        // Output: 2 (Pairs: [1, 5] and [5, 1]).

        for (int i = 0; i < arr.length - 1; i++) {

            for (int n = i + 1; n < arr.length; n++) {
                if (arr[i] + arr[n] == sum) {
                    System.out.println(arr[i] + " " + arr[n]);
                }
            }
        }
    }

    //  Write functions to find the union and intersection of two arrays.
    public static void unionIntersaction() {
        int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = {2, 3, 5, 7};

//        Output:
//        Union: [1, 2, 3, 4, 5, 6, 7]
//        Intersection: [2, 5]


        TreeSet<Integer> ts = new TreeSet<>();
        List<Integer> ins = new ArrayList<>();
        for (int n : arr1) {
            ts.add(n);
        }
        for (int n : arr2) {
            if (!ts.add(n)) {
                ins.add(n);
            }
        }

        System.out.println(ts);
        System.out.println(ins);
    }

    //        Rearrange the array in a max-min order.
    public static void minmaxspecial() {
        int[] arr = {1, 2, 3, 4, 5, 6};
//                Input: [1, 2, 3, 4, 5, 6]
//        Output: [6, 1, 5, 2, 4, 3]


//
//        List<Integer> l = Arrays.stream(arr).boxed().collect(Collectors.toList());
//
//        while (!l.isEmpty()) {
//            Integer vmax = l.get(0);
//            Integer vmin = l.get(0);
//
//            for (Integer n : l) {
//                vmax = Math.max(vmax, n);
//                vmin = Math.min(vmin, n);
//            }
//            System.out.println(vmax + " " + vmin);
//            l.remove(vmax);
//            l.remove(vmin);
//
////            l.remove(Integer.valueOf(vmax));
////            l.remove(Integer.valueOf(vmin));
//
//
//
//        }
        for (int i = 0; i < arr.length / 2; i++) {
            System.out.println(arr[i] + " " + arr[arr.length - 1 - i]);
        }
    }


//    #### Stream group by
//Find the element that appears more than n/2 times in an array.
//
//    Input: [3, 3, 4, 2, 4, 4, 2, 4, 4]
//    Output: 4

    //        A peak element is one that is greater than its neighbors.
    static void asldkf() {
        int[] arr = {5, 3, 20, 4, 21, 0, 11};
//                Input: [1, 3, 20, 4, 1, 0]
//        Output: 20

        if (arr[0] > arr[1]) {
            System.out.println(arr[0]);
        }

        if (arr[arr.length - 1] > arr[arr.length - 2]) {
            System.out.println(arr[arr.length - 1]);
        }

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1] && arr[i] > arr[i - 1]) {
                System.out.println(arr[i]);
            }
        }
    }

    //        Given a list of intervals, merge overlapping intervals.
    static void skaldjfl() {
//
//        Input: [[1, 3], [2, 6], [8, 10], [15, 18]]
//        Output: [[1, 6], [8, 10], [15, 18]]
        int[][] arr = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};

//        for (int i=0;i< arr.length;i++) {
//            for(int j=0;j< arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

        // Sort intervals by the start time
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i][arr[i].length - 1] > arr[i + 1][0]) {
                System.out.println("[" + arr[i][0] + ", " + arr[i + 1][1] + "]");
                i++;
            } else {
                System.out.println("[" + arr[i][0] + ", " + arr[i][1] + "]");
            }
        }

        if (arr[arr.length - 2][1] < arr[arr.length - 1][0]) {
            System.out.println("[" + arr[arr.length - 1][0] + ", " + arr[arr.length - 1][1] + "]");
        }
    }

    public static void main(String[] args) {
//        q1();
//        q2();
//        q3();
//        getSecondLargest();

//        int []arr = { 1, -4, 3, -6, 7, 0};
//        System.out.println(maxProduct(arr));
//        System.out.println(maxProduct_naman(arr));
//        maxMinFind();
//        revArr();
//        rotate();
//        duplicate();
//        sortedMerge();
//        findSubset();
//        findMissingNumbers();
//        nonRepeating();
//        sortWithoutAlgo();
//        findLeader();
//        findPairs();
//        unionIntersaction();
//        minmaxspecial();
//        asldkf();
        skaldjfl();
    }


}
