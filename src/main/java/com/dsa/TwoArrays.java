package com.dsa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoArrays {

/*    Input:  [2, 7, 11, 15]
    Target: 9
    Output: [0, 1] */

    public static int[] twoSums(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            if (map.containsKey(compliment)) {
                return new int[]{map.get(compliment), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSums(nums, 9)));
    }
}
