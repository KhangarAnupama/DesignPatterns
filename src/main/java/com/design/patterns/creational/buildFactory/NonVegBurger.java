package com.design.patterns.creational.buildFactory;

public class NonVegBurger extends Burger{

	@Override
	public void price() {
		System.out.println("200 Rs");
		
	}
	
	public void foodItem() {
		System.out.println("Non Veg Burger");
	}

}

