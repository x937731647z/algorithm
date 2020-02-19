package com.zju.cst.jdbc;


/**
 * @author wulixz
 * @date 9/14/19 : 3:57 PM
 * @introduction :
 */
public class BmwBTest {
    public static void main(String[] args) {
        BMW b3 = new BMW3Factory().product();
        b3.info();

        BMW b5 = new BMW5Factory().product();
        b5.info();

        BMW b7 = new BMW7Factory().product();
        b7.info();
    }
}
