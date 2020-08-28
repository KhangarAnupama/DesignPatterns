package com.design.patterns.creational.builderFactory;

public abstract class Burger implements Item{
	
		public void foodItem() {
			System.out.println("Burger");
		}
		
		public Wrapper wrapperType() {
			return new FoodWrapper();
		}

}
