package com.zju.cst.algorithm_note;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author wulixz
 * @date 11/14/19 : 11:44 AM
 * @introduction :
 */
public class InsertSort {
    public static void main(String[] args) {
        int [] arr = {3, 9, -1, 20, 10 , 2 , 4 , 3 , 7};
        InsertSort insert = new InsertSort();
        insert.DoInsert(arr);
        System.out.println(Arrays.toString(arr));


    }
    public void DoInsert(int[] arr){
        //two array
        //分为2段，前面是有序数组，后面是无序数组
        // 长度大于1
        for (int i = 1 ; i <arr.length ; i ++){
            int index = i -1 ;
            int insertVal = arr[i];
            while (index >= 0 && insertVal < arr[index]){
                arr[index + 1 ] = arr[index];
                index --;
            }
            arr[index + 1] = insertVal;
        }
    }
}
