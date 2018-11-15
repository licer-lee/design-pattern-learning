package com.licerlee.dp.struct.decorator;

public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape shape) {
		super(shape);
	}

	@Override
	public void draw() {
		shape.draw();
		// 加入被装饰逻辑
		setRedBorder();
	}
	
	public void setRedBorder(){
		System.out.println("Border color: Red");
	}

}
