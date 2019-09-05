package com.zju.cst.sort;

import java.util.Arrays;

public class TestQuickSort {

	public static void main(String[] args) {
		int arr[] = {72,6,57,88,60,42,83,73,48,85};
		System.out.println(Arrays.toString(arr));
		QuickSort quickSort = new QuickSort();
		quickSort.quicksort(arr);
		System.out.println(Arrays.toString(arr));
	}


}
