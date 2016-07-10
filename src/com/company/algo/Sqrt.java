package com.company.algo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dangineering on 7/8/16.
 */
public class Sqrt {
    public static void main(String[] args) {
        // test with dumb inputs
        System.out.print(findSq(2147395599));
    }


    private static int findSq(int x) {

        int start = 0;
        int end = x/2 + 1;
        long mid;
        while (start <= end) {
            mid = (start + end) / 2;
            long res = mid * mid;
            if (res == x) {
                return (int) mid;
            }
            else if (res > x) {
                end = (int) mid - 1;
            } else {
                start = (int) mid + 1;
            }
        }
        return end;
    }
}
