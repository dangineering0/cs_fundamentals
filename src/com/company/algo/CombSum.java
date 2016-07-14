package com.company.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by dangineering on 7/11/16.
 */
public class CombSum {

    List<Integer> cand;
    List<List<Integer>> ans;

    public List<List<Integer>> combinationSum(Integer[] candidates, int target) {

        // sort candidates
        ans = new ArrayList<>();

        this.cand = Arrays.asList(candidates);
        Collections.sort(this.cand);
        Collections.reverse(this.cand);


        helper(target,0, new ArrayList<>(), 0);
        return ans;

    }

    private void helper(int target, int curSum, List<Integer> intsSoFar, int curCandidate) {

        if (curSum > target) {
            return;
        }

        if (curSum == target) {
            ans.add(intsSoFar);
            return;
        }


        for (int i = curCandidate; i<cand.size(); i++) {
            int num = cand.get(i);
            List<Integer> f = new ArrayList<>(intsSoFar);
            if (curSum + num <= target) {
                f.add(num);
                helper(target, curSum+num, f, curCandidate);
            } else {
                helper(target, curSum, f, curCandidate+1);
            }
        }


    }
}
