package com.dsa;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfChar {
    public static void charcterFrequency(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println(map);
    }

    public static void main(String[] args) {
        String str = "Ozair";
        charcterFrequency(str);
//        System.out.println();
    }
}
