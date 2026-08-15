package com.dsa;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonFirstRepeating {
    public static void main(String[] args) {
        String findRep="orogramming";
        System.out.println(firstNonRepeating(findRep));
    }
    public static char firstNonRepeating(String str) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return '\0';
    }
}
