package com.zju.cst.HuaWei;

import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String ip_fir = scanner.next();
      String ip_sec = scanner.next();
      String gate = scanner.next();
      int flag = 1;
      String [] ip_fir_str = ip_fir.split("\\.");
      String [] ip_sec_str = ip_sec.split("\\.");
      String [] gate_str = gate.split("\\.");
      Solution main = new Solution();
      int [] ip_fir_value = main.match(ip_fir_str,gate_str);
      int [] ip_sec_value = main.match(ip_sec_str,gate_str);
      for (int i = 0; i <ip_fir_value.length; i ++){
          if (ip_fir_value[i] != ip_sec_value[i]){
              flag = 0;
          }
      }
    System.out.println(flag+" "+ip_fir_value[0]+"."+ip_fir_value[1]+"."+ip_fir_value[2]+"."+ip_fir_value[3]);
  }

    public  int [] match(String [] ip_arr, String [] gate_arr){
        int [] vaule = new int[ip_arr.length] ;
        for (int i = 0;i < ip_arr.length; i++){
            int a = Integer.parseInt(ip_arr[i]);
            int b = Integer.parseInt(gate_arr[i]);
            int c = a&b;
            vaule[i] = c;
        }
        return vaule;
    }


}
