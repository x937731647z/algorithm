package com.zju.cst.algorithm_note;
/**
 * 位运算符中包含四个:
 * 位与 : &  , 二进制位同为 1 时,结果为 1 , 否则为 0
 * 位或 : | , 二进制位同为 0 时, 结果为 0 ,否则为 1
 * 位异或 : ^  二进制位相同时为 0 , 不同为 1
 * 位取反(位非) : ~ 将每一位的 1 变成 0 , 0 变成 1
 *  ** 位 取反为单目运算符, 其余的都是双目运算符
 */
public class BitOperation {
    public int and(int a , int b){
        return a & b;
    }
    public int or(int a , int b){
        return a | b;
    }
    public int xor(int a , int b){
        return a ^ b;
    }
    public int non(int a ){
        return ~a;
    }
}
