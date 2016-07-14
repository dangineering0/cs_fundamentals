package com.company;

/**
 * Created by dangineering on 7/12/16.
 */
public class OneEditDistanceTest {

    public static void main(String[] args) {
        OneEditDistance o = new OneEditDistance();

        System.out.println(o.isOneEditDistance("pale", "ple"));
        System.out.println(o.isOneEditDistance("pales", "pale"));
        System.out.println(o.isOneEditDistance("pale", "bale"));
        System.out.println(o.isOneEditDistance("pale", "bake"));
//        System.out.println(o.isOneEditDistance("abc", "ab"));
//        System.out.println(o.isOneEditDistance("abc", "ab"));
//        System.out.println(o.isOneEditDistance("abc", "ab"));

        ctci();

    }

    private static void ctci() {
        OneEditDistCtci o = new OneEditDistCtci();
        System.out.println("one==");
        System.out.println(o.isOneEditDistance("pale", "ple"));
//        System.out.println(o.isOneEditDistance("pales", "pale"));
//        System.out.println(o.isOneEditDistance("pale", "bale"));
//        System.out.println(o.isOneEditDistance("pale", "bake"));
    }
}
