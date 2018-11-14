package com.licerlee.dp.build.singleton;

// 懒汉模式
// 锁粒度大
public class LazySingleton {

	private static LazySingleton instance;

	private LazySingleton() {
	}

	public synchronized static LazySingleton getInstance() {
		if (null == instance)
			instance = new LazySingleton();
		return instance;
	}
}
