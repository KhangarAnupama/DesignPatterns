package com.design.patterns.creational.factory.method;

public class VehicleFactoryMethodTest {
	
	/**
	 * Refer : https://refactoring.guru/design-patterns/factory-method
	 * @param type
	 * @return
	 */
	
	public Vehicle callVehicle(String type) {
		
		switch(type) {
		case "Bicycle":
			return new Bicycle();
			
		case "Car":
			return new Car();
			
		case "Plane":
			return new Plane();
		
		default:
			return null;
		}
		
	}
	
	public static void main(String[] args) {
		
		VehicleFactoryMethodTest factory = new VehicleFactoryMethodTest();
		Vehicle vehicle = factory.callVehicle("Bicycle");
		System.out.println(vehicle.color());
		System.out.println(vehicle.type());
		
	}
}
