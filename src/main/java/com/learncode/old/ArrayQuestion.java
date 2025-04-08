package com.learncode.old;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayQuestion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -4, -1, 4};
        List<Integer> posList = Arrays.stream(arr).boxed().filter(f -> f >= 0).collect(Collectors.toList());
        List<Integer> negList = Arrays.stream(arr).boxed().filter(f -> f < 0).collect(Collectors.toList());

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < Math.min(posList.size(), negList.size()); i++) {
            result.add(posList.get(i));
            result.add(negList.get(i));
        }

        if (posList.size() < negList.size()) {
            for (int i = negList.size() - posList.size() ; i < negList.size(); i++) {
                result.add(negList.get(i));
            }
        } else {
            for (int i = posList.size() - negList.size() ; i < posList.size(); i++) {
                result.add(posList.get(i));
            }
        }

        System.out.println(result);
    }
}
