package com.zju.cst.java;


import java.lang.reflect.Constructor;

public class Test {
	public static void main(String[] args) throws Exception {
//		Object studentsClasses = Class.forName("com.zju.cst.java.Students").newInstance();
//		Students students = (Students)studentsClasses;
//		students.showInfo();

//		Constructor constructor = Class.forName("com.zju.cst.java.Students").getConstructor(String.class);
//		Students students =(Students)constructor.newInstance("ZheJiang University");
//		students.showInfo();

		Constructor declaredConstructor = Class.forName("com.zju.cst.java.Students").getDeclaredConstructor(String.class, int.class);
		Students students = (Students) declaredConstructor.newInstance("ZheJiang University", 3);
		students.showRank();

	}
}
