package com.zju.cst.algorithm_note;


public class MinNum {

    public int num(int [] inte){
        if (inte == null){
            throw new RuntimeException();
        }
        int [] hash = new int[inte.length];
        for (int i = 0;  i <  inte.length; i ++ ){
            hash[inte[i]] ++;
        }
        if (hash[0] == inte.length){
            return 0;
        }
        int front = 1;
        for (int j = 1 ; j <hash.length;j++ ){
            if (hash[j] >= 0){
                front = j;
                break;
            }
        }
        String str = front+"";
        hash[front] --;
        for (int k = 0; k < hash.length; k ++){
            while (hash[k] != 0){
                hash[k] --;
                str += k;
            }
        }
        int result = Integer.parseInt(str);
        return result;
    }
}
