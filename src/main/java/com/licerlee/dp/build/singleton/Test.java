package com.licerlee.dp.build.singleton;

public class Test {

	public static void main(String[] args) {

		MySingleton m1 = MySingleton.getInstance();
		MySingleton m2 = MySingleton.getInstance();
		System.out.println(m1 == m2);
	}
}
