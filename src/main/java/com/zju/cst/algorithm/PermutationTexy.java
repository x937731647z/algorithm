package com.zju.cst.algorithm;

import java.util.ArrayList;

public class PermutationTexy {
	static ArrayList arrayList = new ArrayList();

	public ArrayList<String> Permutation(String str) {
		if (str.equals(""))
			return arrayList;
		char[] arrays = str.toCharArray();
		String string = "";
		ArrayList array = new ArrayList();
		for (int i = 0; i < arrays.length; i++) {
			array.add(arrays[i]);
		}
		gen(array, string);
		return arrayList;
	}

	private void gen(ArrayList array, String str) {

		if (array.size() == 0) {
			if (!arrayList.contains(str)) {
				arrayList.add(str);
			}

		}
		for (int i = 0; i < array.size(); i++) {
			String tmpStr = str;
			ArrayList tmpArray = new ArrayList(array);
			tmpStr = "" + tmpStr + array.get(i);
			array.remove(i);
			gen(array, tmpStr);
			array = tmpArray;
		}

	}

}
