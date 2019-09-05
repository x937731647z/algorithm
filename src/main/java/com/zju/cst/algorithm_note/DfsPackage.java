package com.zju.cst.algorithm_note;

/**
 * 	1. 死胡同
 * 	2. 分岔路口
 *
 * 死胡同即最终判定结果，分岔路口即不同情况。
 * 两种情形：
 * 1.最终判定结果是否符合条件。
 * 2.在选择分岔路口时 断定结果是否符合条件。
 *
 * 第二种情形的效率更高。
 */
public class DfsPackage {
    int n , v ;// 5件物品，背包容量是8
    int w[]; //每个物品容量
    int c[] ;  //每个物品价格
    int max = 0;
    public DfsPackage() {
    }

    public DfsPackage(int n, int v, int[] w, int[] c) {
        this.n = n;
        this.v = v;
        this.w = w;
        this.c = c;
    }


    public void dfsPack(int index, int sumW, int sumC){
        //死路口
        if (index == n -1){
            return;
        }
        //分岔路口
        dfsPack(index + 1 , sumW, sumC); //不选第index个物品
        if (w[index + 1] + sumW <= v){
            if (sumC + c[index + 1] > max){
                max = sumC + c[index + 1];
            }
            dfsPack(index + 1 , sumW + w[index], sumC + c[index]);
        }
    }
}
