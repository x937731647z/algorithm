package com.zju.cst.tree;

import java.util.Arrays;

public class Bubble {
  public static void main(String[] args) {
    Bubble bub = new Bubble();
    int[] arr = {72,6,57,88,60,42,83,73,48,85};
    bub.bubble(arr);
    System.out.println(Arrays.toString(arr));
  }

    public void bubble(int [] arr){
      int len = arr.length ;
      for (int i =0; i <len -1  ; i ++ ){
          for (int j =0;j< len - i -1;j++){
              if (arr[j] >= arr[j+1]){
                  int tmp = arr [j+1];
                  arr[j+1] =arr[j];
                  arr[j] = tmp;
              }
          }
      }














//        for (int i = 0; i <arr.length - 1; i ++){
//            for (int j = 0;j < arr.length - i -1  ;j++){
//                int tmp;
//                if (arr[j] > arr[j + 1]){
//                    tmp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = tmp;
//                }
//            }
//        }
    }

}
