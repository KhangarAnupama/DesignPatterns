package com.design.patterns.creational.buildFactory;

public class MealBuilder {
	
	public Meal vegMeal() {
		Meal m = new Meal();
		VegBruger v = new VegBruger();
		Coffee c = new Coffee();
		m.add(v);
		m.add(c);
		return m;
	}
	
	public Meal nonVegMeal() {
		Meal m = new Meal();
		NonVegBurger v = new NonVegBurger();
		Coke c = new Coke();
		m.add(v);
		m.add(c);
		return m;
	}

}
