package com.design.patterns.creational.buildFactory;

public class VegBruger extends Burger{

	@Override
	public void price() {
		System.out.println("100 Rs");
		
	}
	
	public void foodItem() {
		System.out.println("Veg Burger");
	}

}
