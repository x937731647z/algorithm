package com.zju.cst.algorithm_note;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @author wulixz
 * @date 2/8/20 : 4:44 PM
 * @introduction :
 */
public class HeapSort {
    public static void main(String[] args) {
//        int [] arr  =  {2,43,25,3,6,12,9};
        int[] arr = new int[8000000];
        for (int i = 0 ; i < 8000000;i++){
            arr[i] = (int) (Math.random() * 8000000);

        }

        System.out.println("before the sort");
        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd : hh:mm:ss");
        String date1Str = simpleDateFormat.format(date1);
        System.out.println("the time before the sort is :" + date1Str);
        HeapSort sort = new HeapSort();
        sort.heapSort(arr);
//        System.out.println(Arrays.toString(arr));
        Date date2 = new Date();
        String date2Str = simpleDateFormat.format(date1);
        System.out.println("the time after the sort is :" + date2Str);


    }

    public void heapSort(int [] arr){
        int index = arr.length - 1;
         while (index > 1 ){
            for (int i = index / 2 - 1; i >= 0 ; i = (i - 1) / 2){
                compare(i,arr,index);
                if (i ==0)break;
            }
            int end = arr[0];
            arr[0] = arr[index];
            arr[index] = end;
            index --;
        }

    }
    public void compare(int index, int [] arr,int len){
        int temp  =  arr[index];
        for (int k = 2 * index + 1 ; k <= len ; k = 2 * k + 1){
            if (k + 1 <= len && arr[k + 1] >= arr[k]){
                k ++;
            }
            if (arr[k] >= temp){
                arr[index] = arr[k];
                index = k ;
            }else break;
            arr[index] = temp;
        }



















//        int temp = index;
//        if ( (2*index + 2) <=len && (2*index + 1) <=len){
//            temp = arr[2 * index + 1] >= arr[2*index + 2] ? 2 * index + 1 : 2 * index + 2;
//        }
//        else if ((2*index + 1) <=len){
//            temp = 2 * index + 1;
//        }else {
//            return;
//        }
//        if (arr[index] < arr[temp]){
//            int change = arr[index];
//            arr[index] = arr[temp];
//            arr[temp] = change;
//            compare(temp,arr,len);
//
//        }
    }
}
