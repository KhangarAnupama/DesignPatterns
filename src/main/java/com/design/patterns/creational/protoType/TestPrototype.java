package com.design.patterns.creational.protoType;

/**
 * https://www.tutorialspoint.com/design_pattern/prototype_pattern.htm
 * @author Anupama Khangar
 *
 */
public class TestPrototype {
	
	public static void main(String[] args) {
		
		SetData data = new SetData();
		data.setValues();
		Shape s = data.getShape(1);
		s.draw();
		Shape s1 = data.getShape(2);
		s1.draw(); 
		Shape s2 = data.getShape(3);
		s2.draw(); 
		
	}

}
