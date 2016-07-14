package com.company;

import java.util.Set;

import static com.sun.tools.javac.jvm.ByteCodes.ret;

/**
 * Created by dangineering on 7/11/16.
 */
public class WordBreak {

    public boolean wordBreak(String s, Set<String> wordDict) {
        return wordBreakHelper(s, 0, wordDict);
    }

    private boolean wordBreakHelper(String s, int curIndx, Set<String> wordDict) {

        if (curIndx > s.length()) {
            return false;
        }
        if (curIndx == s.length()) {
            return true;
        }

        for (String word : wordDict) {
            if (curIndx + word.length() > s.length()) continue;
            String sstring = s.substring(curIndx, curIndx+word.length());

            if (sstring.equals(word)) {
                return wordBreakHelper(s, curIndx+word.length(), wordDict);
            }

        }
        return false;
    }
}
