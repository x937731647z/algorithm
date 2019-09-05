package com.zju.cst.array;

public class FindArray {
  public static void main(String[] args) {
      FindArray findArray =  new FindArray();
      int[] array = {6,-3,-2,7,-15,1,2,2};
     int num =  findArray.FindGreatestSumOfSubArray(array);
    System.out.println(num);
  }
    public int FindGreatestSumOfSubArray(int[] array){
      int len =  array.length ;
      int cur = array[0];
      int max = array[0];
      for (int i =1; i <len;i++){
          if (cur > 0){
              cur = cur + array[i];
          }else {
              cur = array[i];
          }
          if (max < cur){
              max = cur;
          }
      }
      return max;
    }


//    public int FindGreatestSumOfSubArray(int[] array){
//        if (array.length == 0)return 0;
//        int cur = array[0], max = array[0];
//        for(int i = 1 ; i < array.length;i++){
//            if (cur > 0 ){
//                cur = cur + array[i];
//            }else {
//                cur = array[i];
//            }
//            if (max < cur)
//                max = cur;
//        }
//        return max;
//    }
}
