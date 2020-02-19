package com.zju.cst.thread;

public class TestThread implements Runnable {

	private   boolean flag = false;

	@Override
	public void run() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		flag = true;
		System.out.println("flag  "+ isFlag());
	}

	public boolean isFlag(){
		return flag;
	}
//	public void sss(){
//		System.out.println("sss");
//	}
}
class thhh {
	public static void main(String[] args) {
		TestThread testThread = new TestThread();
		Thread thread = new Thread(testThread);
		thread.start();

		while (true){
			if (testThread.isFlag()){
				System.out.println("******");
				break;
			}
		}
	}
}