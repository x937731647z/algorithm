package com.zju.cst.algorithm;
/**
 * 饿汉式单例模式
 * @author dell
 *
 */
public class HungrySingleton {
	private HungrySingleton() {
	}
	
	private static HungrySingleton instance = new HungrySingleton();//类初始化时，立刻加载这个对象。天然线程安全
	
	public static HungrySingleton getInstance() {//不用同步，所以调用效率高
		return instance;
	}
}
