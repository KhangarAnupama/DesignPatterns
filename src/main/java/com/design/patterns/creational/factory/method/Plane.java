package com.design.patterns.creational.factory.method;

public class Plane implements Vehicle {

	@Override
	public String type() {
		return "Aeroplane";
	}

	@Override
	public String color() {
		return "While";
	}

}
