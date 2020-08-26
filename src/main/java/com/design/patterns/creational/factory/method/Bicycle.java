package com.design.patterns.creational.factory.method;

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
