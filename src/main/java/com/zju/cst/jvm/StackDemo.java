package com.zju.cst.jvm;

/**
 * @author wulixz
 * @date 9/24/19 : 11:01 AM
 * @introduction :
 */
public class StackDemo {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024);
    }
}
