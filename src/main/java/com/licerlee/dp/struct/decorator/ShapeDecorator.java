package com.licerlee.dp.struct.decorator;

public abstract class ShapeDecorator implements Shape {

	protected Shape shape;
	
	public ShapeDecorator(Shape shape) {
		this.shape = shape;
	}
	
	// 默认实现
	@Override
	public void draw() {
		shape.draw();
	}

}
