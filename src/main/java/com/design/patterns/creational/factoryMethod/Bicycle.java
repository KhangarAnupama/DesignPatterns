package com.design.patterns.creational.factoryMethod;

public class Bicycle implements Vehicle {

	@Override
	public String type() {
		return "Bicycle";
	}

	@Override
	public String color() {
		return "Green";
	}

}
