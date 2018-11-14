package com.licerlee.dp.build.singleton;

// 线程安全的单例，饿汉模式
// 加重系统启动时负载
public class ThreadSafeSingleton {

	private static ThreadSafeSingleton instance = new ThreadSafeSingleton();

	private ThreadSafeSingleton() {
	}

	public static ThreadSafeSingleton getInstance() {
		return instance;
	}
}
