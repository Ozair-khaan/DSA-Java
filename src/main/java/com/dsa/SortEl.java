package com.dsa;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEl {
    public static List<Double> getSortList(List<Double> list) {
        return list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Double> decimalList = Arrays.asList(12.45, 9.81, 45.9, 12.7, 89.90, 34.56, 11.3);
        List<Double> sortList = getSortList(decimalList);
        System.out.println(sortList);
        List<String> listOfStr = Arrays.asList("Java", "Ruby", "C#", "Java", "Kotlin", "Ruby", "C++", "COBOL", "C#");
        List<String> strings = removeDuplicate(listOfStr);
        System.out.println(strings);
    }

    public static List<String> removeDuplicate(List<String> listOfStr) {
        List<String> removeDup = listOfStr.stream().distinct().collect(Collectors.toList());
        return removeDup;
    }
}
