package com.design.patterns.structural.bridge;

public class RedCircle  implements Circle{

	@Override
	public void draw(int radius, int length, int width) {
		System.out.println("Red Circle having radius ="+radius+" length ="+length+" width ="+width);
	}
}
