package com.zju.cst.algorithm;

/**
 * @author wulixz
 * @date 11/12/19 : 4:37 PM
 * @introduction :
 */
public class QueenBack {
    int count = 0;
    int max = 8;
    int[] P = new int[max];
    boolean[] hashTable = new boolean[max];

    void generateP(int index) {
        if (index == max) {
            count++;
            return;
        }
        for (int x = 0; x < max; x++) {
            if (!hashTable[x]) {
                //the current location will not conflict to previous
                boolean flag = true;
                for (int pre = 0; pre < index; pre++) {
                    if (Math.abs(pre - index) == Math.abs(P[pre] - x)) {
                        flag = false;
                    }
                }

                if (flag) {
                    P[index] = x;
                    hashTable[x] = true;
                    generateP(index + 1);
                    hashTable[x] = false;
                }
            }
        }
    }

}

class QueenBackTest {
    public static void main(String[] args) {
        QueenBack queen = new QueenBack();
        queen.generateP(0);
        System.out.println(queen.count);
    }
}
