package com.design.patterns.structural.bridge;

public class Physic  implements Science{

	@Override
	public void chem() {
	}

	@Override
	public void physics() {
		System.out.println("Physics");
	}
	

}
