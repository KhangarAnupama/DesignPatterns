package com.design.patterns.creational.factoryMethod;

public class Car implements Vehicle {

	@Override
	public String type() {
		return "Car";
	}

	@Override
	public String color() {
		return "Grey";
	}

}
