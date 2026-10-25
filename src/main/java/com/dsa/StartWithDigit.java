package com.dsa;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartWithDigit {
    public static List<String> startWithDigit(List<String> list) {
        List<String> result = list.stream().filter(str -> Character.isDigit(str.charAt(0))).collect(Collectors.toList());
        return result;
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "6ix", "45ro,'7ko");
        System.out.println(list);
    }
}
