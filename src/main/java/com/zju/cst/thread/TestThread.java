package com.zju.cst.thread;

public class TestThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println("TestThread: " + i);
		}
	}

}
