package com.zju.cst.tree;

public class Quick {
  public void quick(int[] arr) {
    int low = 0;
    int high = arr.length - 1;
    quick(arr, low, high);
  }

  public void quick(int[] arr, int low, int high) {
    if (low < high) {
      int index = parition(arr, low, high);
      // 对于左子树
      quick(arr, low, index - 1);
      quick(arr, index + 1, high);
    }
  }

  public int parition(int[] arr, int low, int high) {
    int i = low;
    int j = high;
    int x = arr[low];

    while (i < j) {
      while (arr[j] >= x && i < j) {
        j--;
      }
      if (i < j) {
        arr[i] = arr[j];
        i++;
      }
      while (arr[i] < x && i < j) {
          i++;
      }
      if (i<j){
          arr[j] = arr[i];
          j--;
      }
    }
    arr[i] = x;

    return i;
  }
}
