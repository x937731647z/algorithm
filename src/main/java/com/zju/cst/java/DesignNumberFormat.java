package com.zju.cst.java;
import java.text.*;
public class DesignNumberFormat {
	String name;
	int age;
	
	public DesignNumberFormat() {
		super();
	}
	public DesignNumberFormat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "DesignNumberFormat [name=" + name + ", age=" + age + "]";
	}
	
}
