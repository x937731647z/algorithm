package com.zju.cst.algorithm_note;

import java.util.ArrayList;

/**
 * @author wulixz
 * @date 11/19/19 : 3:25 PM
 * @introduction :
 */
class HalfSearch {

    public ArrayList<Integer> half(int[] arr, int left, int right, int findVal){

        if (left > right){
            return new ArrayList<>();
        }
//            int mid = right - right/2 + left / 2;
            int mid = (left + right) / 2;
            if (findVal > arr[mid]) {
                return half(arr, mid + 1, right, findVal);
            } else if (findVal < arr[mid]) {
                return half(arr, left, mid - 1, findVal);
            } else {
                ArrayList<Integer> res = new ArrayList<>();
                int temp = mid - 1;
                while (temp >= 0 && arr[temp] == findVal) {
                    res.add(temp);
                    temp--;
                }
                res.add(mid);
                temp = mid + 1;
                while (temp < arr.length && arr[temp] == findVal) {
                    res.add(temp);
                    temp++;
                }
                return res;
            }


    }
}

class HalfSearchTest{
    public static void main(String[] args) {
        int [] arr = {1,4,7,10,10,10,10,15,50,100};
        HalfSearch search = new HalfSearch();
        ArrayList<Integer>  res =   search.half(arr,0,arr.length -1,100);
        System.out.println(res);

    }
}
