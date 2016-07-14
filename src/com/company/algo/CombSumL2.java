package com.company.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by dangineering on 7/11/16.
 */
public class CombSumL2 {


    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();

        helper(candidates, target, 0, new ArrayList<>(), ans);
        return ans;
    }

    private void helper(int[] candidates, int target, int curCandidate, List<Integer> intsSoFar, List<List<Integer>> ans) {



        if (target == 0) {
            List<Integer> temp = new ArrayList<>(intsSoFar);
            ans.add(temp);
            return;
        }

        for (int i = curCandidate; i<candidates.length; i++) {
            if(i>0 && candidates[i]==candidates[i-1]) continue;
            int curNum = candidates[i];

            if(target-curNum<0) return;
            intsSoFar.add(curNum);
            helper(candidates, target-curNum, curCandidate, intsSoFar, ans);
            intsSoFar.remove(intsSoFar.size()-1);


        }
    }
}
