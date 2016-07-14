package com.company.algo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by dangineering on 7/11/16.
 */
public class MergeSort {

    public List sort(List<? extends Comparable> list) {

        // recursively divide till you have 1 element <= sorted
        // call combine on each subset

        if (list.size() == 1) {
            return list;
        }

        int start = 0;
        int end = list.size() -1;
        int mid= ((start+end)/2)+1;

        List partA = sort(list.subList(start, mid));
        List partB = sort(list.subList(mid, end+1));

        return combine(partA, partB);
    }


    public List combine(List<? extends Comparable> a, List<? extends Comparable> b) {
        int aIndx = 0;
        int bIndx = 0;

        Comparable aObj;
        Comparable bObj;

        List<Comparable> ans = new ArrayList<>();

        while(aIndx < a.size() || bIndx < b.size()) {
            Comparable curAdd;

            if (aIndx >= a.size()) {
                bObj = b.get(bIndx);
                curAdd = bObj;
                bIndx++;
            } else if (bIndx >= b.size()) {
                aObj = a.get(aIndx);
                curAdd = aObj;
                aIndx++;
            } else {
                aObj = a.get(aIndx);
                bObj = b.get(bIndx);

                // normal case
                if (aObj.compareTo(bObj) < 0) {
                    curAdd = aObj;
                    aIndx++;
                } else {
                    curAdd = bObj;
                    bIndx++;
                }
            }

            ans.add(curAdd);

        }
        return ans;

    }

}
