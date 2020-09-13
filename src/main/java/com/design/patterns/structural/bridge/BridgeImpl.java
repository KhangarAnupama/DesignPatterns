package com.design.patterns.structural.bridge;


public class BridgeImpl extends Bridge{
	
	private int radius, length, width;
	
	public BridgeImpl(int radius, int length, int width, Circle circle) {
		super(circle);
		this.radius = radius;
		this.length =  length;
		this.width = width;
	}

	@Override
	void draw() {
		circle.draw(radius, length, width);
	}
	
	

}
