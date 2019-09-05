package com.zju.cst.interview.algorithm_note;

import java.util.Scanner;

public class Callata {
  public static void main(String[] args) {
    //
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      int time  = 0;
      while ( n  != 1){
          time ++ ;
          switch ( n % 2 ){
              case 0:
                  n = n / 2;
                  break;
              case 1:
                  n = (3 * n + 1) / 2;
                  break;
          }
      }
    System.out.println(time);
  }

//    @Test
//    public void callate(){
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int time  = 0;
//        while ( n  != 1){
//            time ++ ;
//            switch ( n % 2 ){
//                case 0:
//                    n = n / 2;
//                    break;
//                case 1:
//                    n = (3 * n + 1) / 2;
//                    break;
//            }
//        }
//    }
}
