package com.design.patterns.creational.protoType;

import java.util.HashMap;
import java.util.Map;


public class SetData {
	
	public static Map<Integer, Shape> map = new HashMap<Integer, Shape>();
	
	public void setValues() {
		Circle circle = new Circle();
		circle.setId(1);
		map.put(circle.getId(), circle);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setId(2);
		map.put(rectangle.getId(),rectangle);
		
		Square square = new Square();
		square.setId(3);
		map.put(square.getId(), square);
	}

	public static Shape getShape(int i) {
		Shape cachedShape = map.get(i);
		return (Shape) cachedShape.clone();
	}
}

