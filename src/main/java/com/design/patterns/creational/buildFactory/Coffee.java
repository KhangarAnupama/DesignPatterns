package com.design.patterns.creational.buildFactory;

public class Coffee extends Drink{

	@Override
	public void price() {
		System.out.println("111 Rs");
		
	}
	
	public void foodItem() {
		System.out.println("Cold Coffee");
	}

}