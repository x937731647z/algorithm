package com.zju.cst.algorithm;

public class DuplicateHash {
	public boolean duplicate(int numbers[], int length, int[] duplication) {
		int[] hash = new int[length];

		for (int i = 0; i < length; i++) {
			if (hash[numbers[i]] == 0) {
				hash[numbers[i]]++;
			}
			if (hash[numbers[i]] == 1) {
				duplication[0] = numbers[i];
				return true;
			}
		}
		return false;
	}
}
