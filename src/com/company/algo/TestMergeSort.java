package com.company.algo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dangineering on 7/11/16.
 */
public class TestMergeSort {

    public static void main(String[] args) {
        testCombine();
    }

    private static void testCombine() {

        MergeSort m = new MergeSort();

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();


        a.add(1);
        a.add(20);


        b.add(500);
        b.add(200);
        b.add(20);
        b.add(100);
        b.add(400);



        List<Integer> ans = m.sort(b);

        for (Integer i: ans) {
            System.out.println(i);
        }

    }
}
