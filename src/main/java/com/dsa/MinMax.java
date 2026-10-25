package com.dsa;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinMax {
    public static void minMaxFind(List<Integer> list){
        Optional<Integer> min = list.stream().min(Comparator.naturalOrder());
        Optional<Integer> max = list.stream().max(Comparator.naturalOrder());
        System.out.println(min.get());
        System.out.println(max.get());
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(89, 212, 11, 10, 21, 12, 34, 90);
        minMaxFind(list);
    }
}
