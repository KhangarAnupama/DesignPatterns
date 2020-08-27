package com.design.patterns.creational.buildFactory;

public class TestMealnItems {
	
	public static void main(String[] args) {
		System.out.println("-------------------------------- VEG MEAL ----------------------------");
		MealBuilder builder = new MealBuilder();
		Meal m =builder.vegMeal();
		m.get();
		
		System.out.println("-------------------------------- NON VEG MEAL ----------------------------");
		m =builder.nonVegMeal();
		m.get();
	}
	

}
