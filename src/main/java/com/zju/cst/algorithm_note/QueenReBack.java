package com.zju.cst.algorithm_note;

/**
 * @author wulixz
 * @date 11/12/19 : 5:38 PM
 * @introduction :
 */
public class QueenReBack {
    int count = 0;
    int max = 8;
    int[] P = new int[max];
    boolean[] hashTable = new boolean[max];

    void generateP(int index){
        if (index == max){
            count ++;
            return;
        }
        for (int x = 0; x < max; x ++){
            if ( ! hashTable[x] ){
                boolean flag = true;
                for (int pre = 0 ; pre < index; pre ++){
                    if (Math.abs(pre - index) == Math.abs(P[pre] - x)){
                        flag = false;
                        break;
                    }
                }
                if (flag){
                    P[index]  =  x ;
                    hashTable[x] = true;
                    generateP(index + 1);
                    hashTable[x] = false;
                }
            }
        }
    }
}
class QueenReBackTest{
    public static void main(String[] args) {
        QueenReBack queen = new QueenReBack();
        queen.generateP(0);
        System.out.println(queen.count);
    }
}