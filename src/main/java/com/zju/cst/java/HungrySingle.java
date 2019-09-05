package com.zju.cst.java;

public class HungrySingle {
	private HungrySingle() {
	}

	private static HungrySingle instance = new HungrySingle();

	public static HungrySingle getInstance() {
		return instance;
	}

}
