package com.zju.cst.leetcode;

public class ContainerWithMostWater11Standard {
    public int maxArea(int[] height) {
        int i = 0, j = height.length -1 ;
        if (height.length == 0){
            return 0;
        }
        int maxArea = Math.min(height[i],height[j]) * (j -i);
        while (i < j){
            int newArea = Math.min(height[i],height[j]) * (j -i);
            maxArea = Math.max(newArea , maxArea);
            if (height[i] > height[j]){
                j--;
            }else {
                i++;
            }
        }
        return maxArea;
    }

}
