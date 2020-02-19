package com.zju.cst.algorithm_note;

/**
 * @author wulixz
 * @date 1/13/20 : 4:46 PM
 * @introduction :
 */
public class PackProblem {

    int goodsNum;
    int packAmount;
    int[] weight;
    int[] values;
    int TotalValue = 0;

    public PackProblem(int goodsNum, int packAmount, int[] weight, int[] values) {
        this.goodsNum = goodsNum;
        this.packAmount = packAmount;
        this.weight = weight;
        this.values = values;
    }

    public void PackDFS(int index, int sumWeight, int sumValues) {
        System.out.println("index : " + index + " , sumValues : " + sumValues +  ", sumWeight : " +sumWeight + "  and the amount is : "+TotalValue);
        if (index == goodsNum) {
            return;
        }
        PackDFS(index + 1, sumWeight, sumValues);
        if (sumWeight + weight[index] <= packAmount) {
            if (sumValues + values[index] > TotalValue) {
                TotalValue = sumValues + values[index];
            }
        }
        PackDFS(index + 1, sumWeight + weight[index], sumValues + values[index]);
    }


}

class TestPack {
    public static void main(String[] args) {
        int goodsNum = 5;
        int packAmount = 8;
        int[] weight = {3, 5, 1, 2, 2};
        int[] values = {4, 5, 2, 1, 3};

        PackProblem p = new PackProblem(goodsNum, packAmount, weight, values);
        p.PackDFS(0, 0, 0);
        System.out.println(p.TotalValue);


    }
}