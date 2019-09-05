package com.zju.cst.search;

import java.util.HashSet;
import java.util.TreeSet;

public class TestCollection {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();   //实际上new 了  TreeMap
		set.add("abc");
		set.size();
		
		HashSet hs = new HashSet();
		hs.add("aaa");
	}
}
