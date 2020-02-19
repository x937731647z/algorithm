package com.zju.cst.datastructure;

import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author wulixz
 * @date 10/28/19 : 3:15 PM
 * @introduction :
 */
public class StackCalculator {
    public static void main(String[] args) {
        //获取 字符串，遍历字符串，简单版单个数字
        String expression = "70+12*5-10";
        char[] value = expression.toCharArray();
        Deque numStack = new ArrayDeque();
        Deque signStack = new ArrayDeque();
        int len = expression.length();
        int index = 0;
        while (index <= len - 1){
            if (value[index] >= '0' && value[index] <= '9'){ 
                int v =  (int)value[index] - 48;
                numStack.push(v);
                if (index != len-1 ){
                    if (value[index + 1] >='0' && value[index+1 ]<='9'){
                        String val = numStack.pop() + "" + value[index+1];
                        index++;
                        int anInt = Integer.parseInt(val);
                        numStack.push(anInt);
                    }
                }
            }else {
                if (signStack.size() == 0){
                    signStack.push(value[index]);
                }else {
                    int levelNow = SignLevel(value[index]);
                    char sign = (char)signStack.peek();
                    int levelPre = SignLevel(sign);
                    if (levelNow > levelPre){
                        signStack.push(value[index]);
                    }else {
                        int num1= (int)numStack.pop() ;
                        int num2 = (int)numStack.pop();
                        char c_sign = (char)signStack.pop();
                        int newRes = calculator(num1, num2,c_sign);
                        numStack.push(newRes);
                        signStack.push(value[index]);
                    }

                }
            }
            index ++;
        }
        int res = 0;
        while (!signStack.isEmpty()){
            int num1 = (int)numStack.pop() ;
            int num2 = (int)numStack.pop();
            char c = (char)signStack.pop();
            res = calculator(num1,num2,c);
            numStack.push(res);
        }
        res = (int)numStack.pop();
        System.out.println("the reslut is  " + res);
    }

    public static int SignLevel(char chr){
        int level = 0 ;
        switch (chr){
            case '+':
                level = 0;
                break;
            case  '-':
                level = 0;
                break;
            case '*':
                level = 1;
                break;
            case  '/':
                level = 1;
                break;
        }
        return level;
    }

    public static int calculator(int num1, int num2, char c){
        int result = 0;
        switch (c){
            case '+':
                result = num1 + num2;
                break;
            case  '-':
                result = num2 - num1;
                break;
            case '*':
                result = num1 * num2;
                break;
            case  '/':
                result = num2 / num1;
                break;
        }
        return result;
    }

}
