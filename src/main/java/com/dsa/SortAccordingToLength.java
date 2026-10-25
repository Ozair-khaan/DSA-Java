package com.dsa;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortAccordingToLength {
    public static List<String> sort(List<String> list) {
        List<String> result = list.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        return result;
    }

    public static void main(String[] args) {
        List<String> listOfState = Arrays.asList("Kashmir", "Munich", "Keralam", "Mumbai", "Pune", "Kolkata", "Chennai");
        System.out.println(sort(listOfState));
    }
}
