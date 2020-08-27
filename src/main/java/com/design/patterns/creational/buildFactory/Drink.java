package com.design.patterns.creational.buildFactory;

public abstract class Drink implements Item{
	
	public void foodItem() {
		System.out.println("Drink");
	}
	
	public Wrapper wrapperType() {
		return new BottleWrapper();
	}
	

}
