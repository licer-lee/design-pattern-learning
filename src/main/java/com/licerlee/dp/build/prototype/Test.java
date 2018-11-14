package com.licerlee.dp.build.prototype;

import java.io.IOException;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException {

		MyPrototype mp = new MyPrototype();
		MyPrototype mp1 = (MyPrototype) mp.clone();
		System.out.println(mp == mp1);
		System.out.println(mp + " \n" + mp1);

		mp.setName("n1");
		MyPrototype mp2 = (MyPrototype) mp.clone();
		System.out.println(mp2.getName());
		System.out.println(mp.getObj() == mp2.getObj());

		MyPrototype mp3 = (MyPrototype) mp.deepClone();
		System.out.println(mp3.getName());
		System.out.println(mp.getObj() == mp3.getObj());
	}
}
