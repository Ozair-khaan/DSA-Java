package com.dsa;

public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "Java 8 is awesome";
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for(String word: words){
           StringBuilder reversed = new StringBuilder(word);
           result.append(reversed.reverse()).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
