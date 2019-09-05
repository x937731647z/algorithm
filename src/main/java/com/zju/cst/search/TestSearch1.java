package com.zju.cst.search;

/**
 * 在成绩中查询分数的第一个分数
 * T(n) = O(n)
 * S(n) = O(1)
 * @author dell
 *
 */
public class TestSearch1 {

	public static void main(String[] args) {
		//给定分数数组
		int[]  arr = {43,54,12,67,98,100,54,65,100,83};
		//给定要查找的分数
		int score = 100;
		//完成查找
		int index = search(arr , score);
		
		//给出结果
		if(index == -1) {
			System.out.println("查找结果不存在");
		}
		else {
			System.out.println(score + "的索引是: "+ index);
		}

	}
	public static int search(int[] arr,int value) {
		int index = -1;
		for(int i = 0; i < arr.length; i ++) {
			if(arr[i] == value) {
				index = i;
				break;
			}
		}
		return index;
		
	}

}
