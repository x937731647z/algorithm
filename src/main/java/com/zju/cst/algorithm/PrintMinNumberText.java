package com.zju.cst.algorithm;

import java.util.ArrayList;

public class PrintMinNumberText {
  ArrayList<String> arr = new ArrayList<>();

  public static void main(String[] args) {
    int[] numbers = {3334, 3, 3333332};
    //		int n = Math.min(a, b)
    PrintMinNumberText printMinNumberText = new PrintMinNumberText();
    String string = printMinNumberText.PrintMinNumber(numbers);
    System.out.println(string);
  }

  public String PrintMinNumber(int[] numbers) {
    String string = "";
    ArrayList<String> arrayList = new ArrayList<>();
    for (int i = 0; i < numbers.length; i++) {
      arrayList.add("" + numbers[i]);
    }
    gun(arrayList, string);

    String tmp = arr.get(0);
    for (int i = 1; i < arr.size(); i++) {
      tmp = tmp.compareTo(arr.get(i)) < 0 ? tmp : arr.get(i);
    }

    return String.valueOf(tmp);
  }

  private void gun(ArrayList<String> arrayList, String string) {
    // TODO Auto-generated method stub
    if (arrayList.size() == 0) {
      arr.add(string);
    }
    for (int i = 0; i < arrayList.size(); i++) {
      String tmpStr = string;
      ArrayList<String> tmpArr = new ArrayList<>(arrayList);
      string = string + arrayList.get(i);
      arrayList.remove(i);
      gun(arrayList, string);
      string = tmpStr;
      arrayList = tmpArr;
    }
  }
}
