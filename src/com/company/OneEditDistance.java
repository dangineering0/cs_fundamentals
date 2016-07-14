package com.company;

/**
 * Created by dangineering on 7/12/16.
 */
public class OneEditDistance {

    public boolean isOneEditDistance(String s, String t) {

        if (s.equals(t)) return true;
        int slen = s.length();
        int tlen = t.length();

        if (Math.abs(slen-tlen) > 1) return false;
        String longer = (slen > tlen) ? s : t;
        String shorter = (slen > tlen) ? t : s;


        int miss = 0;
        int[] shorterArr = countFreq(shorter.toCharArray());

        for (char c : longer.toCharArray()) {

            if (shorterArr[(c - 'a')] == 0) {
                if (++miss > 1) return false;
            } else {
                shorterArr[(c - 'a')]--;
            }

        }
        return true;

    }

    public int[] countFreq(char[] input) {
        int[] res = new int[26];
        for (char c : input) {
            res[c-'a']++;
        }
        return res;
    }

}
