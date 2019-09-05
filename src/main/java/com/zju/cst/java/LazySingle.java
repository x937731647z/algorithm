package com.zju.cst.java;

public class LazySingle {

	private LazySingle() {
	}

	private static LazySingle instance;

	public static synchronized LazySingle getInstance() {
		if (instance == null) {
			instance = new LazySingle();
		}
		return instance;
	}
}
