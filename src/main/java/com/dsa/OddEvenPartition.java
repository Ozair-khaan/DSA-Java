package com.dsa;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class OddEvenPartition {
    public static void filterNumber(List<Integer> list) {
        Map<Boolean, List<Integer>> oddEvenMap = list.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
        Set<Map.Entry<Boolean, List<Integer>>> entries = oddEvenMap.entrySet();
        for (Map.Entry<Boolean, List<Integer>> entry : entries) {
            if (entry.getKey()) {
                System.out.println("even number : ");
            } else {
                System.out.println("odd number : ");
            }
            List<Integer> value = entry.getValue();
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(23, 78, 95, 73, 23, 56, 12, 90, 334, 71, 95, 73, 23, 561, 12, 90, 33);
        filterNumber(listOfIntegers);
    }
}
