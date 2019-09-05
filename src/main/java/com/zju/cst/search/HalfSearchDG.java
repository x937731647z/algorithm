package com.zju.cst.search;

public class HalfSearchDG {
    public static void main(String[] args) {
        int[] arr = {5, 13, 19, 21, 37, 56, 64, 75, 80, 88, 92};
        int low = 0;
        int high = arr.length -1;
        int index = halfsearch(arr, 5,low ,high);
        System.out.println(index);
    }
    public static int halfsearch(int[] arr, int value,int low, int high) {
        if (low > high)return -1;
        int mid = (low + high) / 2;
        if (value == arr[mid]){
            return mid;
        }
        if (value < arr[mid]){
            return halfsearch(arr,value,low ,mid -1);
        }
        if (value > arr[mid]){
           return halfsearch(arr,value,mid +1,high );
        }
        return -1;
    }
}
