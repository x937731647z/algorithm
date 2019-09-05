package com.zju.cst.array;

import java.util.ArrayList;

public class SortCombine {
    ArrayList<String> array = new ArrayList<>();

    public static void main(String[] args) {
    SortCombine sortCombine = new SortCombine();
    ArrayList<String> arr = new ArrayList<>();
    arr.add("a");
    arr.add("b");
    arr.add("c");
    String string = "";
    sortCombine.gun(arr,string);
    System.out.println(sortCombine.array);
    }

    private void gun(ArrayList<String> arrayList, String string){
        if (arrayList.size() == 0){
            array.add(string);
        }
        for (int i = 0 ; i < arrayList.size();i++){
            String newstring = string;
            ArrayList<String> tmparr = new ArrayList<>(arrayList);
            string = newstring + arrayList.get(i);
            arrayList.remove(i);
            gun(arrayList,string);
            string = newstring;
            arrayList = tmparr;
        }
    }
}
