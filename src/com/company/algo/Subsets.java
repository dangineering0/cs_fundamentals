package com.company.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by dangineering on 7/9/16.
 */
public class Subsets {

    int[] nums;
    List<List<Integer>> solutions;

    public List<List<Integer>> subsets(int[] nums) {
        this.nums = nums;
        solutions = new ArrayList<>();

        helper(0, new ArrayList<>());
        return solutions;
    }

    private void helper(int curInd, List<Integer> soFar ) {
        if(curInd == nums.length) {
            solutions.add(soFar);
            System.out.println(Arrays.toString(soFar.toArray()));
            return;
        }
        //do not include
        helper(curInd + 1, new ArrayList<>(soFar));

        // include
        soFar.add(nums[curInd]);
        helper(curInd + 1, new ArrayList<>(soFar));
    }
}
