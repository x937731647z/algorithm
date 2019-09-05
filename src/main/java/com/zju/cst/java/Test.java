package com.zju.cst.java;

public class Test {
	public static void main(String[] args) {
		String string = "cccbaaabccc";
		char[] a = string.toCharArray();
		int[] hash = new int[1000];
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < a.length; i++) {
			int num = a[i];
			if (hash[num] == 0) {
				sb.append(a[i]);
			} else {
				hash[num]++;
			}
		}
		System.out.println(sb.length());
//		for (int i = 0; i < sb.length(); i++) {
//			System.out.print(sb.charAt(i)+hash[(int)sb.charAt(i)]);
//		}

//		ArrayList<Object> arrayList = new ArrayList<>();
//		for (int i = 0; i < a.length; i++) {
//			if (!arrayList.contains(a[i])) {
//				arrayList.add(a[i]);
//			}
//		}
//
//		String laString = "";
//		for (int i = 0; i < arrayList.size(); i++) {
//			int num = 0;
//			for (int j = 0; j < a.length; j++) {
//				if (arrayList.get(i).equals(a[j])) {
//					num++;
//				}
//			}
//			laString = laString + arrayList.get(i) + num;
//		}
//		System.out.println(laString);

	}
}
