package com.zju.cst.algorithm;
/**
 * 静态内部类模式
 * @author wulixz
 *
 */
public class ClassSingleton {
	private ClassSingleton() {	
	}
	private static class ClassSingletonInstance{
		private static final ClassSingleton instance = new ClassSingleton();
	}
	public static ClassSingleton getInstance() {
		return ClassSingletonInstance.instance;
	}
}
