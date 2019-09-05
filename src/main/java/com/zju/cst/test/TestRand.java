package com.zju.cst.test;


import java.util.ArrayList;

public class TestRand {
   static ArrayList<String> arrayList = new ArrayList<>();
  public static void main(String[] args) {
      String s = "abcd";
      char[] arr = s.toCharArray();
      int len = arr.length;
      permutation1(arr,0,len -1);
  }
    public static void permutation1(char[] str,int sbegin,int send)
    {
        if( sbegin == send) //当 sbegin = send时输出
        {
            for(int i = 0;i <= send; i++)   //输出一个排列
                System.out.print(str[i]);
            System.out.println();
        }
        else
        {
            for(int i = sbegin; i <= send; i++)
            {
                swap(str,i,sbegin);   //把第i个和第sbegin进行交换
                permutation1(str,sbegin + 1,send);
                swap(str,i,sbegin);   //【注1】交换回来
            }
        }
    }
    public static void swap(char[] str , int i , int sbegin){

    }

}
