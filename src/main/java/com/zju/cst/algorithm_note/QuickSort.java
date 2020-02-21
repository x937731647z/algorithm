package com.zju.cst.algorithm_note;


import java.util.Arrays;

/**
 * @author wulixz
 * @date 11/16/19 : 3:33 PM
 * @introduction :
 */
public class QuickSort {
    public void quick(int[] arr,int left, int right){
        if (left<right){
            int index = quickSort(arr, left, right);
            quick(arr,left,index - 1);
            quick(arr,index + 1, right);
        }
    }
    public int quickSort(int[] arr,int left, int right){
        int i = left;
        int j = right;
        int index = left;
        int indexValue = arr[index];
        while (i < j){
            while ( i < j && indexValue <= arr[j]){
                j--;
            }
            if (indexValue > arr[j]){
                arr[i] = arr[j];
                i++;
            }
            while (i < j && indexValue >= arr[i]){
                i++;
            }
            if (i < j && indexValue < arr[i]){
                arr[j] = arr[i];
                j --;
            }
        }
        arr[i] = indexValue;
        return i;
    }
}

class QuickSortTest{
    public static void main(String[] args) {
        int[] arr = {72, 6, 57, 88, 60, 42, 83, 73, 48, 85};
        QuickSort quic = new QuickSort();
        quic.quick(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));
//        BinaryTree

    }
}