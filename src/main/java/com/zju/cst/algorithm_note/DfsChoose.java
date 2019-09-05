package com.zju.cst.algorithm_note;

import java.util.Stack;

/**
 * @auther wulixz
 * @date 2019/9/3 7:52
 * 序列A中 n 个数选 k 个数使得和为 x， 最大平方和为maxSumSqu
 */
public class DfsChoose {
    int n, k, x, maxSumSqu = -1, A[];
    Stack<Integer> temp = new Stack<>();
    Stack<Integer> ans= new Stack<>();
    public DfsChoose(int n, int k, int x, int[] a) {
        this.n = n;
        this.k = k;
        this.x = x;
        A = a;
    }

    //sumSqu 为当前已选数的平方和
    public void dfsChoose(int index, int sumK, int sumX, int sumSqu){
        if ( sumK == k &&  sumX == x){
            if (sumSqu > maxSumSqu){
                maxSumSqu = sumSqu;
//                ans = temp;
                for (int i = 0 ; i < temp.size();i++){
                    ans.push(temp.get(i));
                }
            }
            return;
        }
        if (index == n || sumK > n || sumX > x)return;
        temp.push(A[index]);
        dfsChoose(index + 1,sumK + 1, sumX + A[index],sumSqu + A[index] * A[index]);
        temp.pop();
        dfsChoose(index +1, sumK,sumX,sumSqu);

    }
}
