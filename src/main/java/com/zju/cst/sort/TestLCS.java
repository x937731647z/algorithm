package com.zju.cst.sort;

import java.util.Deque;
import java.util.LinkedList;

public class TestLCS {
  public static void main(String[] args) {
    String a = "1234zefghf";
    String b = "xexfxgxhf1x2x3x4x";
    getLCS(a,b);
  }

    public static void getLCS(String x,String y) {
        char[]s1=x.toCharArray();
        char[]s2=y.toCharArray();
        int[][]array=new int[x.length()+1][y.length()+1];
        for(int j=0;j<array[0].length; j++){
            array[0][j]=0;
        }
        for(int i=0;i<array.length;i++){
            array[i][0]=0;
        }
        for(int m=1;m<array.length;m++){
            for(int n=1;n<array[m].length;n++){
                if(s1[m-1]==s2[n-1]){
                    array[m][n]=array[m-1][n-1] + 1;
                }else{
                    array[m][n]=Integer.max(array[m -1][n],array[m][n -1]);
                }
            }
        }
        Deque<Character> stack=new LinkedList<>();
        int i=x.length()-1;
        int j=y.length()-1;
        while(i>=0&&j>=0) {
            if(s1[i]==s2[j]) {
                stack.push(s1[i]);
                i--;
                j--;
            }else {
                if(array[i+1][j]>array[i][j+1]){
                    j--;
                }else {
                    i--;
                }
            }
        }
        while(!stack.isEmpty()){//打印输出栈正好是正向输出最大的公共子序列
            System.out.print(stack.pop());
        }
    }

}
