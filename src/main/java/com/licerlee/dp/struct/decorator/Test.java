package com.licerlee.dp.struct.decorator;

// 通过装饰器类包装一个原生对象，调用原生方法后，在调用自定义装饰功能
// 1、扩展一个类的功能。 2、动态增加功能，动态撤销。
public class Test {

	public static void main(String[] args) {
		Shape circle = new Circle();

		Shape redCircle = new RedShapeDecorator(new Circle());

		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		System.out.println("Circle with normal border");
		circle.draw();

		System.out.println("\nCircle of red border");
		redCircle.draw();

		System.out.println("\nRectangle of red border");
		redRectangle.draw();
	}
}
