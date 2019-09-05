package com.zju.cst.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestCollection {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		ArrayList<Integer> linkedList = new ArrayList<>();
		linkedList.add(123);
		linkedList.add(22);

		System.out.println(linkedList.contains(12));
//		System.out.println(linkedList.contains(22));
		map.put(1001, "aa");
		map.put(302, "bb");
		map.put(1001, "cc");
		System.out.println(map);
		Set<Integer> keySet = map.keySet();
		for (Integer integer : keySet) {
			System.out.println(integer);
		}

		Set<Entry<Integer, String>> entrySet = map.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey() + ":" + entry.getValue());

		}
	}
}
