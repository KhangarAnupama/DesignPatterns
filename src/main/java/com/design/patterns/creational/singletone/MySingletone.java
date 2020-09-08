package com.design.patterns.creational.singletone;

public class MySingletone {

	private MySingletone() {}

	private static MySingletone singletone;
	
	public static MySingletone getInstnace() {
		if(singletone == null) {
			singletone = new MySingletone();
		}
		return singletone;

	}

}
