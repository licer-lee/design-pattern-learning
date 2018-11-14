package com.licerlee.dp.build.singleton;

// 双重检测的懒汉模式
public class DoubleCheckSingleton {

	private static DoubleCheckSingleton instance;

	private DoubleCheckSingleton() {

	}

	public static DoubleCheckSingleton getInstance() {
		if (instance == null) {
			synchronized (DoubleCheckSingleton.class) {
				if (instance == null)
					instance = new DoubleCheckSingleton();
			}
		}
		return instance;
	}
}
