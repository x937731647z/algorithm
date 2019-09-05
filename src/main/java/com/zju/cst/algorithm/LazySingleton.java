package com.zju.cst.algorithm;

public class LazySingleton {
	private LazySingleton() {
	}

	private static LazySingleton instance;

	public static LazySingleton getInstance() {

		if (instance == null) {

			synchronized (LazySingleton.class) {
				instance = new LazySingleton();
			}
		}

		return instance;
	}
}
