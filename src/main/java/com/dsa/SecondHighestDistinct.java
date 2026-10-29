package com.dsa;

import java.util.Arrays;
import java.util.List;

public class SecondHighestDistinct {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 5, 20, 15);
        Integer result = list.stream()
                .distinct()
                .sorted((a, b)-> b.compareTo(a))
                .skip(1)
                .findFirst()
                .orElseThrow(() ->
                        new IllegalArgumentException("No second highest Number"));
        System.out.println(result);
    }
}
