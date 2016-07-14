package com.company.algo;

/**
 * Created by dangineering on 7/11/16.
 */
public class CombSumTest {

    public static void main(String[] args) {

        CombSum c = new CombSum();
        Integer[] i = new Integer[2];
        i[0] = 2;
        i[1] = 3;




        int target = 5;

        System.out.println(c.combinationSum(i, target));


    }
}
