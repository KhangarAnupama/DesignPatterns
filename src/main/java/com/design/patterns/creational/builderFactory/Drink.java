package com.design.patterns.creational.builderFactory;

public abstract class Drink implements Item{
	
	public void foodItem() {
		System.out.println("Drink");
	}
	
	public Wrapper wrapperType() {
		return new BottleWrapper();
	}
	

}
