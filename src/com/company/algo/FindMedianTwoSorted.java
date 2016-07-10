package com.company.algo;

/**
 * Created by dangineering on 7/9/16.
 * taken from rdtr.net
 */
public class FindMedianTwoSorted {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int mid = (len1 + len2) / 2;

        double res = 0.0;
        res = 1.0 * findKthSmallest(nums1, 0, len1-1, nums2, 0, len2-1, mid);
        if ((len1+len2) % 2 == 0) {
            double res2 = 1.0 * findKthSmallest(nums1, 0, len1-1, nums2, 0, len2-1, mid-1);
            res += res2;
            res /= 2.0;
        }
        return res;
    }

    public int findKthSmallest(int[] nums1, int start1, int end1, int[] nums2, int start2, int end2, int k) {
        int len1 = end1 - start1 + 1;
        int len2 = end2 - start2 + 1;
        int mid1 = start1 + len1 / 2;
        int mid2 = start2 + len2 / 2;
        int dis1 = mid1 - start1 + 1;
        int dis2 = mid2 - start2 + 1;

        if (len1 == 0) return nums2[start2+k];
        if (len2 == 0) return nums1[start1+k];

        if (k <= len1 / 2 + len2 / 2) {
            if (nums1[mid1] >= nums2[mid2]) {
                return findKthSmallest(nums1, start1, mid1-1, nums2, start2, end2, k);
            } else {
                return findKthSmallest(nums1, start1, end1, nums2, start2, mid2-1, k);
            }
        } else {
            if (nums1[mid1] >= nums2[mid2]) {
                return findKthSmallest(nums1, start1, end1, nums2, mid2+1, end2, k-dis2);
            } else {
                return findKthSmallest(nums1, mid1+1, end1, nums2, start2, end2, k-dis1);
            }
        }
    }
}
