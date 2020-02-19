package com.zju.cst.algorithm;

import java.util.Random;

public class Test1 {

	public static void main(String[] args) {
//		int arr[][]  =  {{2,3,1,0,2,5,3},{2,3,1,0,2,5,3}};
//		System.out.println(arr.length);
//		System.out.println(arr[0].length);
//		StringBuffer stringBuffer = new StringBuffer("abcd");
//		stringBuffer.deleteCharAt(0);
//    System.out.println(stringBuffer);
//		printColor();
		System.out.format("\33[32;1m i am a blogger %n");
	}
	public static void printColor() {
		// 背景颜色代号(41-46)
		// 前景色代号(31-36)
		//前景色代号和背景色代号可选，就是或可以写，也可以不写
		// 数字+m：1加粗；3斜体；4下划线
		// 格式：System.out.println("\33[前景色代号;背景色代号;数字m");
		Random backgroundRandom = new Random();
		Random fontRandom = new Random();
		for (int i = 1; i <= 50; i++) {
			int font = fontRandom.nextInt(6) + 31;
			int background = backgroundRandom.nextInt(6) + 41;
			System.out.format("front color %d,background %d------\33[%d;%d;4m i am a bolgger %n", font, background, font, background);
		}
	}
}
