package com.zju.cst.array;

public class HalfArray {

  public static void main(String[] args) {
      int[] arr = {1,3,3,1,3,2,1,1,4};
      int a =arr[0];
      int b = 1;
      int len = arr.length;
      for (int i = 1;i < len; i++){
          if (arr[i] == a){
              b++;
          }else {
              b--;
              if (b==0){
                  a = arr[i];
              }
          }
      }
    System.out.println("最多的数是"+a);
  }
}
