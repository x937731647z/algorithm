package com.zju.cst.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wulixz
 * @date 1/20/20 : 10:38 AM
 * @introduction :
 */
public class GenerateParentheses {

    List<String> list = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        int leftCount = n -1;
        int rightCount = n -1;
        generate(leftCount,rightCount,"(");
        System.out.println(list.toString());
        return list;
    }
    public void generate(int leftCount,int rightCount,String str){
        if (leftCount==0 && rightCount >=0 ){
            for (int i = 0 ; i <= rightCount; i ++){
                str += ")";
            }
            list.add(str);
            return;

        }
        if (leftCount>= 0 && rightCount>=0){
            generate(leftCount -1, rightCount,str+"(" );
            if (rightCount >= leftCount ){
                generate(leftCount,rightCount -1,str + ")");
            }


        }

    }
}

class GenP{
    public static void main(String[] args) {
        int n = 3;
        GenerateParentheses gp = new GenerateParentheses();
        gp.generateParenthesis(n);
    }
}