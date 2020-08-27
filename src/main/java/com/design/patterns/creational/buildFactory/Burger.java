package com.design.patterns.creational.buildFactory;

public abstract class Burger implements Item{
	
		public void foodItem() {
			System.out.println("Burger");
		}
		
		public Wrapper wrapperType() {
			return new FoodWrapper();
		}

}
