package com.company.algo;

/**
 * Created by dangineering on 7/9/16.
 */
public class MedianTwoSorted {

    public static void main(String[] args) {
        MedianTwoSorted m = new MedianTwoSorted();
        int[] test1 = new int[]{};
        int[] test2 = new int[]{2};
        System.out.println(m.findMedianSortedArrays(test1, test2));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        // median must exist in n+m/2
        int nStart = 0, mStart = 0;
        int nEnd = nums1.length, mEnd = nums2.length;
        int curMin = 0;

        boolean isEven = (nEnd + mEnd) % 2 == 0;

        int curNum1 = Integer.MAX_VALUE;
        int curNum2 = Integer.MAX_VALUE;
        // solve for odd first
        int limit = isEven? ((nEnd+mEnd)/2) : ((nEnd+mEnd)/2)+1;

        for (int i = 0; i < limit; i++) {
            if (nums1.length > 0) curNum1 = nums1[nStart];
            if (nums2.length > 0) curNum2 = nums2[mStart];

            if (curNum1 < curNum2) {
                curMin = curNum1;
                if (nStart < nums1.length - 1) nStart++;

            } else {
                curMin = curNum2;
                if (mStart < nums2.length - 1) mStart++;
            }
        }
        if (isEven) {
            // find the previous element
            if (curMin == curNum1) {
                return (curMin + curNum2) / 2.0;
            } else {
                return (curMin + curNum1) / 2.0;
            }
        }
        return curMin;
    }
}
