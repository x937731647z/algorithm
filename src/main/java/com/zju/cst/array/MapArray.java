package com.zju.cst.array;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapArray {
  public static void main(String[] args) {
      Map<String,Integer>  map = new LinkedHashMap<>();
      map.put("a",1);
      map.put("b",2);
      map.put("c",3);

      Set<String> set = map.keySet();
      Iterator<String> iterator = set.iterator();
      while (iterator.hasNext()){
          String key = iterator.next();
          Integer num = map.get(key);
      System.out.println("key: " + key + "  value : " + num);
      }
  }
}
