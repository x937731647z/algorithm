package com.zju.cst.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThread {

	public static void main(String[] args) {
		ExecutorService es = Executors.newSingleThreadExecutor();

		es.execute(new TestThread2());
		es.execute(new TestThread2());
		es.execute(new TestThread2());
		es.execute(new TestThread2());
		es.execute(new TestThread2());
		es.execute(new TestThread2());

	}

}

class TestThread2 implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}