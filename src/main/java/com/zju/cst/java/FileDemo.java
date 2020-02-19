package com.zju.cst.java;

import java.io.File;

/**
 * @author wulixz
 * @date 9/15/19 : 2:27 PM
 * @introduction :
 */
public class FileDemo {
    public static void main(String[] args) {
        File f = new File("img/test_server.txt");
        System.out.println(
                    f.getName()
        );
    }
}
