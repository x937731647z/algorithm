package com.zju.cst.algorithm;

public class DuplicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]  =  {2,3,1,0,2,5,3};
		int len =7;
		int[] deplication = new int[10];
		DuplicateHash duplications = new DuplicateHash();
		boolean dup = duplications.duplicate(arr, len, deplication);
		System.out.println(dup);
		System.out.println(deplication[0]);

	}
}
