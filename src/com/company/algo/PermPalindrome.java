package com.company.algo;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by dangineering on 7/9/16.
 */
public class PermPalindrome {

    public static void main(String... args){
        System.out.println(canPermutePalindrome("aba"));
        System.out.println(canPermutePalindrome("code"));

        System.out.println(canPermutePalindrome("aab"));
    }

    public static boolean canPermutePalindrome(String s) {
        Set<Character> charSet = new HashSet<>();

        char[] chars = s.toCharArray();

        for (char c : chars) {
            if (charSet.contains(c)) {
                charSet.remove(c);
            } else {
                charSet.add(c);
            }
        }
        return charSet.size() <= 1;
    }

}
