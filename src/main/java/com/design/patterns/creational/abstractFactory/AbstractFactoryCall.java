package com.design.patterns.creational.abstractFactory;

public class AbstractFactoryCall {
	
	public ProductFactory getCompany(String company) {
		if(company.equals("Art Deco")) {
			return new ArtDecoFactory();
		}else if(company.equals("Victoria")) {
			return new VictoriaFactory();
		}else {
			return null;
		}
	}

}
