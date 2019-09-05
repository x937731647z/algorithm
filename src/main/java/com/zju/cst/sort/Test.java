package com.zju.cst.sort;

public class Test {

  public static void main(String[] args) {
    String string = "123";
    String s = "";
    StringBuffer stringBuffer = new StringBuffer(string);
    Test test = new Test();
    test.permutation(stringBuffer, s);
  }

  public void permutation(StringBuffer stringBuffer, String s) {
    int len = stringBuffer.length();
    if (len == 0) {
      System.out.print(s + " ");
    }
    for (int i = 0; i < len; i++) {
      String tmpString = s + stringBuffer.charAt(i);
      StringBuffer sb = new StringBuffer(stringBuffer);
      sb.deleteCharAt(i);
      permutation(sb, tmpString);
    }
  }
}
