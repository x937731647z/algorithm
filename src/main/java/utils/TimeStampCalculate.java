package utils;

import java.sql.Timestamp;

/**
 * @author wulixz
 * @date 11/15/19 : 11:08 AM
 * @introduction :
 */
public class TimeStampCalculate {
    public static void main(String[] args) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp);
        System.out.println(System.currentTimeMillis());
    }
}
