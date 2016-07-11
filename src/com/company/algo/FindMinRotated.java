package com.company.algo;

/**
 * Created by dangineering on 7/10/16.
 */
public class FindMinRotated {
    int sol;

    public int findMin(int[] nums) {

        findMinHelper(nums, 0, nums.length - 1);
        return sol;
    }


    private void findMinHelper(int[] nums, int start, int end) {


        // assume that if there has been a rotation there must be a pair where a>b
        // base case
        if ((end-start) == 2) {
            if (nums[start] > nums[end]) {
                sol = nums[start];
                return;
            }
        }

        int mid = (start+end)/2;
        if (nums[start] < nums[mid]) {
            findMinHelper(nums, mid, end);
        } else {
            findMinHelper(nums, start, mid);
        }


    }
}
