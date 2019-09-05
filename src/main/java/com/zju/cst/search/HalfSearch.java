package com.zju.cst.search;

public class HalfSearch {
  public static void main(String[] args) {
    int[] arr = {5, 13, 19, 21, 37, 56, 64, 75, 80, 88, 92};
    int index = halfsearch(arr, 92);
    System.out.println(index);
  }
    public static int halfsearch(int[] arr, int value) {
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (value == arr[mid]) {
                return mid;
            }
            if (value < arr[mid]) {
                j = mid - 1;
            }
            if (value > arr[mid]) {
                i = mid + 1;
            }
        }
        return -1;
    }

//  public static int halfsearch(int[] arr, int value) {
//    int i = 0;
//    int j = arr.length - 1;
//    while (i <= j) {
//      int mid = (i + j) / 2;
//      if (value == arr[mid]) {
//        return mid;
//      }
//      if (value < arr[mid]) {
//        j = mid - 1;
//      }
//      if (value > arr[mid]) {
//        i = mid + 1;
//      }
//    }
//    return -1;
//  }
}
