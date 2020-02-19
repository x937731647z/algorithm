package com.zju.cst.algorithm_note;

/**
 * @author wulixz
 * @date 11/12/19 : 5:33 PM
 * @introduction :
 */
public class QueenViolent {
    int count = 0;
    int max = 8;
    int[] P = new int[max];
    boolean[] hashTable = new boolean[max];

    void generateP(int index){
        if (index == max){
            boolean flag = true;
            for (int i = 0 ; i < max; i ++){
                for(int j = i + 1;j < max; j ++){
                    if (Math.abs(i -j ) == Math.abs(P[i] - P[j])){
                        flag = false;
                    }
                }
            }
            if (flag) count++;
            return;
        }

        for (int x = 0; x < max ; x ++){
            if (!hashTable[x]){
                P[index] = x;
                hashTable[x] = true;
                generateP(index + 1);
                hashTable[x] = false;
            }
        }

    }
}

class QueenViolentTest{
    public static void main(String[] args) {
        QueenViolent queen = new QueenViolent();
        queen.generateP(0);
        System.out.println(queen.count);
    }

}