package com.zju.cst.algorithm_note;

import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @author wulixz
 * @date 11/14/19 : 10:16 AM
 * @introduction :
 */
public class BubbleSort {

    public static void main(String[] args) {
        BubbleSort b = new BubbleSort();
        int [] arr = {3, 9, -1, 20, 10};
        int [ ] arr2 = {3, 9, -1, 20, 10};
        int[] arrRandom = new int[80000];
        for (int i = 0 ; i < arrRandom.length ; i ++){
            arrRandom[i] = (int)(Math.random() * 80000);
        }

        b.showTime();
        b.DoBubble2(arrRandom);
        b.showTime();
    }

    public void  DoBubble(int[] arr){
        for (int i = 0 ; i < arr.length - 1 ; i ++){
            for (int j = i + 1 ; j < arr.length; j ++){
                if (arr[i] > arr[j]){
                    int temp =  arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public void DoBubble2(int[] arr){
        for (int i = 0 ; i < arr.length - 1; i ++){
            boolean flag = true;
            for (int j = 0  ; j < arr.length -1 - i; j ++){
                if (arr[j] > arr[j + 1]){
                    flag = false;
                    int temp =  arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
            if (flag)return;
        }
    }
    public void showTime(){
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
        System.out.println(dateFormat.format(date));
    }
}
