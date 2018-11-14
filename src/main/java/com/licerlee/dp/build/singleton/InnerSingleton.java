package com.licerlee.dp.build.singleton;

public class InnerSingleton {

	private InnerSingleton() {
	}

	public static InnerSingleton getInstance() {
		return InnerClass.inner;
	}

	private static class InnerClass {
		private static InnerSingleton inner = new InnerSingleton();

	}

}
