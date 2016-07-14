package com.company;

/**
 * Created by dangineering on 7/12/16.
 */
public class OneEditDistCtci {

    boolean isOneEditDistance(String s, String t) {

        // length checks
        if (s.equals(t)) return true;
        int slen = s.length();
        int tlen = t.length();



        if (Math.abs(slen-tlen) > 1) return false;

        String longer = (slen > tlen) ? s : t;
        String shorter = (slen > tlen) ? t : s;

        int index1 = 0;
        int index2 = 0;
        boolean foundDifference = false;
        while (index1 < s.length() && index2 < t.length()) {
            if (s.charAt(index1) != t.charAt(index2)) {
                if (foundDifference) return false;
                foundDifference = true;
            } else {
                index1++;
            }
            index2++;
        }
        return true;
    }
}
