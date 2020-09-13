package com.design.patterns.structural.bridge;

public class OrangeCircle  implements Circle{

	@Override
	public void draw(int radius, int length, int width) {
		System.out.println("Orange Circle having radius ="+radius+" length ="+length+" width ="+width);
	}

}
