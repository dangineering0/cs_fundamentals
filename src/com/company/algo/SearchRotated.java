package com.company.algo;

/**
 * Created by dangineering on 7/10/16.
 */
public class SearchRotated {


    public int search(int[] nums, int target) {
        return searchHelper(nums, 0, nums.length-1, target);
    }


    private int searchHelper(int[] nums, int start, int end, int target) {
        if (end<start) {
            return -1;
        }

        int mid = (start+end)/2;
        if (nums[mid] == target) {
            return mid;
        }



        if (isSorted(nums[start],nums[mid])) {
            if (withinBounds(target,nums[start],nums[mid])) {
                return searchHelper(nums, start, mid-1, target);
            } else {
                return searchHelper(nums, mid+1, end, target);
            }
        } else {
            if (withinBounds(target, nums[mid], nums[end])) {
                return searchHelper(nums, mid+1, end, target);
            } else {
                return searchHelper(nums, start, mid-1, target);
            }
        }


    }

    private boolean isSorted(int a, int b) {
        return a <= b;
    }

    private boolean withinBounds(int target, int start, int end) {
        return target >= start && target <= end;
    }
}
