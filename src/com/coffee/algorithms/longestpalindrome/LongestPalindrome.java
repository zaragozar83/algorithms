package com.coffee.algorithms.longestpalindrome;

public class LongestPalindrome {

    public static void main(String[] args) {

        String str = "forgeeksskeegfor";
        int result = longestPalindrome(str);
        System.out.println(result);
    }

    private static int longestPalindrome(String str) {

        int[] occurrences = new int[128];

        for (char letter : str.toCharArray()) {
            occurrences[(int) letter]++;
        }

        int length = 0;
        for(int c : occurrences) {
            length += c % 2 == 0 ? c : c - 1;
        }

        if(length < str.length())
            length++;

        return length;
    }
}
