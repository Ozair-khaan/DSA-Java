package com.dsa;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CheckAnagram {
    //the program check whether the two string has contains the same character when rearranging or not, that is anagram
    public static boolean isAnagram(String s1, String s2) {
        s1 = Stream.of(s1.split("")).map(val -> val.toLowerCase()).sorted().collect(Collectors.joining());
        s2 = Stream.of(s2.split("")).map(val -> val.toLowerCase()).sorted().collect(Collectors.joining());
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        String str = "silent";
        String str2 = "Listen";
        System.out.println(isAnagram(str, str2));
    }
}
