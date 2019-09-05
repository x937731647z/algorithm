package com.zju.cst.leetcode;

public class ContainerWithMostWater11 {
    public int maxArea(int[] height) {
        int square = 0;
        if (height.length == 0){
            return square;
        }
        int i =0 , j= height.length -1;
        square = (height[i] > height[j]? height[j]:height[i]) * (j-i);
        while (i < j) {
            int tallHeight = height[j];
            int frontHeight = height[i];
            for (int last = j ; last > i; last--) {
                if (height[last] >= tallHeight) {
                    tallHeight = height[last];
                    int high = height[i] > height[last]? height[last]:height[i];
                    int newsquare =high * (last - i);
                    square = square > newsquare ? square : newsquare;
                }
            }
            for (int a = i + 1; a <= j; a++) {
                if (height[a] > frontHeight) {
                    i = a;
                    break;
                }else {
                    i ++ ;
                }
            }
        }
        return square;
    }
}
