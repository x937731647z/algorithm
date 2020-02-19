package com.zju.cst.algorithm;

/**
 * @author wulixz
 * @date 11/6/19 : 4:30 PM
 * @introduction :
 */
public class Queen {
    int count = 0;
    int max = 8;
    int[] P = new int[max];
    boolean[] hashTable = new boolean[max];

    public void generateP(int index) {
//        if (count > 0) System.out.println(count);
        if (index == max) {
            boolean flag = true;
            for (int i = 0; i < max; i++) {
                for (int j = i + 1; j < max; j++) {
                    if (Math.abs(i - j) == Math.abs(P[i] - P[j])) {
                        flag = false;
                    }
                    if (!flag) break;
                }
                if (!flag) break;
            }
            if (flag) count++;
            return;
        }

        for (int x = 0; x < max; x++) {
            if (hashTable[x] == false) {
                P[index] = x;
                hashTable[x] = true;
                generateP(index + 1);
                hashTable[x] = false;
            }
        }
    }

}

class testQueen {
    public static void main(String[] args) {
        Queen queen = new Queen();
        queen.generateP(0);
        System.out.println(queen.count);

    }
}