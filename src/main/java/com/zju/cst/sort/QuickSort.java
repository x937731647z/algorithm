package com.zju.cst.sort;

public class QuickSort {

  public void quicksort(int[] arr) {
    int low = 0;
    int high = arr.length - 1;
    quicksort(arr, low, high);
  }
  private void quicksort(int[] arr, int low, int high){
      if (low < high){
          int index = partition(arr, low, high);
          quicksort(arr,low,index -1);
          quicksort(arr,index +1 ,high);
      }
  }
  private int partition(int[] arr, int low,int high){
      int x= arr[low];
      int i = low;
      int j = high;
      while (i <j){
       while (arr[j] >= x && i <j){
           j--;
       }
       if (i < j){
           arr[i] = arr[j];
           i++;
       }
          while (arr[i] < x && i <j){
              i++;
          }
          if (i < j){
              arr[j] = arr[i];
              j--;
          }
      }
      arr[i] = x;
      return i;
  }
}
