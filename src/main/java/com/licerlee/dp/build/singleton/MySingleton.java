package com.licerlee.dp.build.singleton;

// 线程不安全的单例
public class MySingleton {

	private static MySingleton instance;

	private MySingleton() {
	}

	public static MySingleton getInstance() {
		if (null == instance)
			instance = new MySingleton();
		return instance;
	}
}
