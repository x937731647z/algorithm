package com.zju.cst.algorithm;

public class FindTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		int target = 7;
		Find find = new Find();
		System.out.println(find.find(target, array));
		
		Integer[] data = {1,2,3,4};
		System.out.println(Integer.SIZE);
		int a =2;
		int b =2;
		if(a == b) {
			System.out.println("yes");
		}
		else {
			System.out.println("");
		}
		String str1 = "hello world";
		String str2 = "hello world";
		if(str1 == str2) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}


}
}
