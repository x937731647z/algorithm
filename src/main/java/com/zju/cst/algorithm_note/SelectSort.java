package com.zju.cst.algorithm_note;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author wulixz
 * @date 11/14/19 : 11:18 AM
 * @introduction :
 */
public class SelectSort {
    public static void main(String[] args) {
        int [] arr = {3, 9, -1, 20, 10};
        SelectSort select = new SelectSort();
        select.DoSelect(arr);
        System.out.println(Arrays.toString(arr));
    }
    public void DoSelect(int[] arr){
        for (int i = 0 ; i < arr.length; i++){
            int temp = arr[i];
            int index = i;
            for (int j = i; j < arr.length; j ++){
                if (temp > arr[j]){
                    temp = arr[j];
                    index = j;
                }
            }
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }
}

