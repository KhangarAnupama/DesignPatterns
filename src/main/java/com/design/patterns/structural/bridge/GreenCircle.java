package com.design.patterns.structural.bridge;

public class GreenCircle implements Circle{

	@Override
	public void draw(int radius, int length, int width) {
		System.out.println("Green Circle having radius ="+radius+" length ="+length+" width ="+width);
	}
	

}
