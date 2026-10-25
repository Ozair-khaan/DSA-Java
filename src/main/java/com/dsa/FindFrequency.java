package com.dsa;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFrequency {
    public static Map<Character, Long> getFreq(String str) {
        Stream<Character> characterStream = str.chars().mapToObj(i -> (char) i);
        Map<Character, Long> result = characterStream.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return result;
    }

    public static void main(String[] args) {
        String s = "Java is an awesome programming language";
        System.out.println(getFreq(s));
    }
}
