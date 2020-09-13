package com.design.patterns.structural.bridge;

public abstract class Bridge {
	
	 protected Circle circle;
	 
	 public Bridge(Circle circle) {
		 this.circle = circle;
	}
	 
	 abstract void draw();
	 
}