package com.coffee.algorithms.longestpalindrome;

public class LongestPalindrome2 {

    public static void main(String[] args) {
        String str = "CBAABDD";
        String result = getPalindrome(str);
        System.out.println("Result: " + result);
    }

    private static String getPalindrome(String str) {

        int i;
        boolean pair = true;

        String result = "";
        char[] chars = str.toCharArray();

        if((chars.length % 2) == 0) {
            i = (chars.length / 2) - 1;
        } else {
            pair = false;
            i = chars.length / 2;
        }

        int right = i + 1;

        if(pair) {
            while (chars[i] == chars[right]) {
                result = getString(chars[i], result,chars[right]);
                i--;
                right++;
            }
        } else {

            String tmp = "";
            int left = i -1;

            while (left >= 0 || right > chars.length) {
                if(chars[left] == chars[right]) {
                    if(tmp.isEmpty()) {
                        tmp =  getString(chars[left], chars[i] + "", chars[right]);
                    } else {
                        tmp = getString(chars[left], tmp, chars[right]);
                    }
                }
                left--;
                right++;
            }
        }

        return result;
    }

    private static String getString(char left, String point, char right) {
        return left + point + right;
    }
}
