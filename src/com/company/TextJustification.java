package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dangineering on 7/13/16.
 */
public class TextJustification {

    List<String> fullJustify(String[] words, int limit) {
        List<String> ans = new ArrayList<>();

        List<List<String>> divided = divide(words, limit);

        for (List<String> l : divided) {
            String res = addSpaces(l, limit);
            ans.add(res);
        }

        return ans;

    }


    public List<List<String>> divide(String[] words, int limit) {
        List<List<String>> ans = new ArrayList<>();
        boolean isFirstWord = true;
        int curInd = 0;

        List<String> immed = new ArrayList<>();

        for (String w : words) {
            if (isFirstWord) {
                immed.add(w);
                curInd += w.length();
                isFirstWord = false;
            } else {
                if (curInd + 1 + w.length() > limit) {
                    ans.add(immed);
                    immed = new ArrayList<>();
                    isFirstWord = true;
                    curInd = 0;
                } else {
                    immed.add(w);
                    curInd += 1 + w.length();
                }
            }
        }
        return ans;
    }

    public String addSpaces(List<String> l, int limit){
        StringBuilder sb = new StringBuilder();
        int curWordInd = 0;

        for (String s : l) sb.append(s);
        int charCount = sb.length();
        int spaceInd = 0;
        while(true) {

            String curWord = l.get(curWordInd % l.size());

            if (curWordInd == 0) {
                spaceInd = curWord.length();

            } else {
                spaceInd += curWord.length();
            }
            charCount += curWord.length();

            if (charCount + 1 > limit) break;
            charCount++;
            sb.insert(spaceInd, " ");

            curWordInd++;

        }
        return sb.toString();
    }
}
