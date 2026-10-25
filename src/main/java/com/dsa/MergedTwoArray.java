package com.dsa;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MergedTwoArray {
    public static int[] mergeTwoArray(int[] aar1, int[] arr2) {
        int[] merged = IntStream.concat(Arrays.stream(aar1), Arrays.stream(arr2)).distinct().sorted().toArray();
        return merged;
    }

    public static int secondLargest(List<Integer> lst) {
        Optional<Integer> first = lst.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        return first.get();
    }

    public static void sumAvg(int[] arr) {
        int sum = Arrays.stream(arr).sum();
        OptionalDouble average = Arrays.stream(arr).average();
        double asDouble = average.getAsDouble();
        System.out.println("Length of the list is " + arr.length + ", Sum is " + sum + " and average is " + asDouble);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{12, 43, 121, 54, 76};
        int[] arr2 = new int[]{24, 67, 24, 87};
        System.out.println(Arrays.toString(mergeTwoArray(arr, arr2)));
        List<Integer> list = Arrays.asList(12, 43, 121, 54, 76);
        System.out.println("Second largest number is :: " + secondLargest(list));
        int[] a = new int[]{12, 32, 3, 23, 34, 123, 23, 4324, 3, 4, 3, 4, 3, 5443, 534, 5, 34, 52, 4, 34, 234, 325, 353};
        sumAvg(a);
    }
}
