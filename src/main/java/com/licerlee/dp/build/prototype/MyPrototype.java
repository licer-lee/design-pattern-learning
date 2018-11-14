package com.licerlee.dp.build.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// 原型模式对其进行复制、克隆，产生一个和原对象类似的新对象
// 涉及对象的 深复制、浅复制知识
// 浅复制：将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型，指向的还是原对象所指向的。
// 深复制：将一个对象复制后，不论是基本数据类型还有引用类型，都是重新创建的。
// 简单来说，就是深复制进行了完全彻底的复制，而浅复制不彻底。
public class MyPrototype implements Cloneable, Serializable {

	private static final long serialVersionUID = 3432251170241101667L;
	private String name;
	private SerializableObject obj;

	/* 浅复制 */
	public Object clone() throws CloneNotSupportedException {
		MyPrototype mp = (MyPrototype) super.clone();
		return mp;
	}

	/* 深复制 */
	public Object deepClone() throws IOException, ClassNotFoundException {

		/* 写入当前对象的二进制流 */
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);

		/* 读出二进制流产生的新对象 */
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return ois.readObject();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SerializableObject getObj() {
		return obj;
	}

	public void setObj(SerializableObject obj) {
		this.obj = obj;
	}

}
