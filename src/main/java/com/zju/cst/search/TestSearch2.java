package com.zju.cst.search;

public class TestSearch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//给定分数数组
		int[]  arr = {11,22,32,45,56,67,74,89,96,100};
		//给定要查找的分数
		int score = 32;
		
//		int index = binarySearch(arr , score);
		
		int index = diguiSearch(arr,score);
		
		//给出结果
		if(index == -1) {
			System.out.println("查找结果不存在");
		}
		else {
			System.out.println(score + "的索引是: "+ index);
		}
	}
	
	/*非递归查找方法
	 * T(n) = O(log2n)
	 * S(n) = O(1)
	 */
	public static int binarySearch(int[] arr, int score) {
		int high = arr.length -1;
		int low = 0;
		
		//求mid 值
		
		//判断是否等于
		while (low < high) {
			int mid = (low + high) /2 ;
			//折半查找
			if (score == arr[mid]) {
				return mid;
			}
			else if(score > arr[mid]) {
				low = mid + 1;
			}
			else {
				high = mid -1;
			}
		}	
		
		return -1;
	}
	
	/**
	* T(n) = O(log(n))
	 * S(n) = O(log(n))
	 * @param arr
	 * @param score
	 * @return
	 */
	
	public static int diguiSearch(int[] arr,int score) {
		int high = arr.length -1;
		int low = 0;
		return digui(arr,score,high,low);	
		
	}
	public static int digui(int[] arr,int score,int high, int low) {	
		//递归的结束条件
		if(low > high)return -1;
		int mid = (low + high) /2 ;
		if (score == arr[mid]) {
			return mid;
		}else if(score > arr[mid]) {
			low = mid + 1;
			return digui(arr,score,high,low);	
		}
		else {
			high = mid -1;
			return digui(arr,score,high,low);	
		}	
	}


}
