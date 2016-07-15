//package com.company;
//
//import java.util.Set;
//
///**
// * Created by dangineering on 7/14/16.
// */
//public class WordLadder {
//
//
//    public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
//
//        if (beginWord.equals(endWord)) return 0;
//
//
//    }
//
//
//    private List generateAllPerms(word, visited, wordList) {
//
//        wordArr = word.toCharArray();
//        for (int i = 0; i<wordArr.length; i++) {
//            for (int a = 'a'; a <= 'z'; a++) {
//                wordArr[i] = (char)a;
//                String res = new String(wordArr);
//                if (wordList.contains(res) && !visited.contains(res)) {
//
//                    visited.add(res);
//                }
//
//            }
//        }
//    }
//
//}
