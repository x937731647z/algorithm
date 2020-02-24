package com.zju.cst.leetcode;

import com.sun.org.apache.xml.internal.utils.ListingErrorHandler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @auther wulixz
 * @date 2020/2/22 10:13
 * @level medium
 * @desc Input: candidates = [2,3,6,7], target = 7,
 * A solution set is:
 * [
 * [7],
 * [2,2,3]
 * ]
 * @example
 * @solution
 * @standard
 */
public class Q39CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < candidates.length; i++) {
            List<Integer> innerList = new ArrayList<>();
            innerList.add(candidates[i]);
            BackTrack(candidates, i, innerList, candidates[i],target ,res);
        }
        return res;
    }

    public void BackTrack(int[] candidates, int index, List<Integer> list, int sum, int target, List<List<Integer>> res) {
        if (sum > target) return;
        if (sum == target) {
            List<Integer> newList = new ArrayList<>();
            newList.addAll(list);
            //  pay attention here, !!! must make a new List here
            // beacause the current list is not static
            res.add(newList);
            return;
        }
        for (int j = index; j < candidates.length; ++j) {
            list.add(candidates[j]);
            sum += candidates[j];
            BackTrack(candidates, j, list,sum, target, res);
            list.remove(Integer.valueOf(candidates[j]));
            sum = sum - candidates[j];
        }
    }
}

class Q39TestCombinationSum {
    public static void main(String[] args) {
        int[] candidates = {2, 3, 5};
        int target = 8;
        Q39CombinationSum ComSum = new Q39CombinationSum();
        List<List<Integer>> res = ComSum.combinationSum(candidates, target);
        for (List<Integer> list :
                res) {
            System.out.println(Arrays.toString(list.toArray()));
        }

    }
}
