package com.licerlee.dp.factorypattern;

public class ShapeFactory {

	Shape getShape(String shapeType) {
		if (null == shapeType)
			return null;
		if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}
		return null;
	}
}
