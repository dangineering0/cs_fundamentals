package com.company;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by dangineering on 7/11/16.
 */
public class WordBreakTest {
    public static void main(String[] args){
        WordBreak w = new WordBreak();
        Set<String> hs = new HashSet<String>();

        hs.add("leet");
        hs.add("cod");
        hs.add("e");

        System.out.println(w.wordBreak("leetcode", hs));
    }
}
