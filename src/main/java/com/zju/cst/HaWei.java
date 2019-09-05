package com.zju.cst;
import java.util.Scanner;

public class HaWei {

  public static void main(String[] args) {
    //
      Scanner  scanner = new Scanner(System.in);
      int a = scanner.nextInt();
      String str1 = scanner.next();
      String str2 = scanner.next();

      String[] string1 = str1.split(",");
      String[] string2 = str2.split(",");

      int len1 = string1.length;
      int len2 = string2.length;
      int len_max = len1 > len2 ? len1:len2;
      int all_ken = len1 + len2;
      if ( a == 0 || ( a >= len1 + len2) ){
          System.out.println(str1 + ","+str2);
      }

      boolean flag = true;
      int k = 0;//总的元素
      int x = 0;//第一行序号
      int y = 0;//第二行序号

      while (k < all_ken){
          if (flag == true ){
              if (x + a < len1){
                  for (int i = x; i <x + a; i++){
                      System.out.print(string1[i]);
                      if (k !=(all_ken -1)){
                          System.out.print(",");
                      }
                      k++;
                  }
                  x += a;
                  flag = false;
              }else {
                  for (int i =x ; i <len1;i++){
                       System.out.print(string1[i]);
                        if (k !=(all_ken -1)){
                          System.out.print(",");
                        }
                        k ++;
                  }
//                  x += a;
                  flag = false;
              }

          }
      if (flag == false) {
                        if (y + a < len2) {
                          for (int j = y; j < y + a; j++) {
                            System.out.print(string2[j]);
                            if (k != (all_ken - 1)) {
                              System.out.print(",");
                            }
                            k++;
                          }
                          y += a;
                          flag = true;
                        } else {
                          for (int j = y; j < len2; j++) {
                            System.out.print(string2[j]);
                            if (k != (all_ken - 1)) {
                              System.out.print(",");
                            }
                            k++;
                          }
                          //                  x += a;
                          flag = true;
                        }
              }
      }
  }
}
