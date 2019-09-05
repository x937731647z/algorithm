package com.zju.cst.threadpool;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestThreadPool {
	public static void main(String[] args) {
		// corePoolSize核心线程数
		// maximumPoolSize最大线程数
		// keepAliveTime时间
		// unit 时间单位
		// workQueue阻塞队列
		int corePoolSize = 1;
		int maximumPoolSize = 3;
		long keepAliveTime = 0L;
		TimeUnit unit = TimeUnit.SECONDS;
		LinkedBlockingDeque<Runnable> workQueue = new LinkedBlockingDeque<>(3);

		ThreadPoolExecutor pool = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);

		// 利用线程池的线程开始执行任务
		// 执行第一个任务
		pool.execute(new TestThread1());
		// 执行第二个任务

		pool.execute(new TestThread1());
		pool.execute(new TestThread1());
		pool.execute(new TestThread1());
		// 执行第四个任务
		pool.execute(new TestThread1());
		pool.execute(new TestThread1());
//		pool.execute(new TestThread1());
//		pool.execute(new TestThread1());
//		pool.execute(new TestThread());
		// 关闭线程池
		pool.shutdown();
	}
}

class TestThread1 implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}