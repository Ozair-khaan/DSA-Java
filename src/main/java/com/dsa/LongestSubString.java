package com.dsa;

import java.util.HashSet;

public class LongestSubString {
    public static int longestSubString(String s){
        HashSet<Object> set = new HashSet<>();

        int left=0;
        int maxLength=0;

        for(int right=0; right<s.length(); right++){
            char ch = s.charAt(right);
            while (set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            int currentLength = right-left+1;
            maxLength=Math.max(maxLength, currentLength);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "ozorz";
        int i = longestSubString(s);
        System.out.println(i);
    }
}
