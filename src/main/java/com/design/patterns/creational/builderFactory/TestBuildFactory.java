package com.design.patterns.creational.builderFactory;

/**
 * Refered https://www.tutorialspoint.com/design_pattern/builder_pattern.htm
 * @author Anupama Khangar
 *
 */
public class TestBuildFactory {
	
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
