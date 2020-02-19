package com.zju.cst.leetcode;

import com.zju.cst.list.ArrayList;

import java.util.Arrays;

/**
 * @author wulixz
 * @date 1/20/20 : 11:53 AM
 * @introduction :
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        RemoveDuplicates rd = new RemoveDuplicates();
        int [] nums = {1,1,2,2,3,3,4,4};
       int  count = rd.removeDuplicates(nums);
        System.out.println(count);
    }
    //[1,1,2,2,3,3,4,4]
    public int removeDuplicates(int[] nums) {
        Integer temp = null, cur = null;
        int j = 0;
        for(int i = 0;i < nums.length; ++i) {
            cur = nums[i];
            if(temp == null || temp.intValue() != cur.intValue()) {
                nums[j] = cur;
                ++j;
            }
            temp = cur;
        }
        System.out.println(Arrays.toString(nums));
        return j;

//        int flag = 0;
//        boolean [] hash = new boolean[nums.length];
//        for (int i = 0 ; i < nums.length; i ++){
//            hash[nums[i]]  = true;
//        }
//        ArrayList arrayList = new ArrayList();
//        for (int i = 0 ; i < hash.length; i ++){
//            if (hash[i]){
//                flag ++;
//                arrayList.add(i);
//            }
//        }
//        int[ ] arr = new int[flag];
//        for (int i = 0 ; i < flag;i ++){
//            arr[i] = (int)arrayList.get(i);
//        }
//        nums= arr;
//        System.out.println(Arrays.toString(nums));
//        return flag;
    }
}

