package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dangineering on 7/13/16.
 */
public class MergeTwoArrays {


    public int[] merge(int[] a, int[] b) {
        int aLen = a.length;
        int bLen = b.length;

        int aIndx = 0;
        int bIndx = 0;
        int kIndx = 0;

        int[] res = new int[a.length + b.length];

        while (aIndx < aLen && bIndx < bLen) {
            if (a[aIndx] < b[bIndx]) {
                res[kIndx++] = a[aIndx++];
            } else {
                res[kIndx++] = b[bIndx++];
            }
        }

        while (aIndx < aLen) {
            res[kIndx++] = a[aIndx++];
        }

        while (bIndx < bLen) {
            res[kIndx++] = b[bIndx++];
        }
        return res;
    }
}
