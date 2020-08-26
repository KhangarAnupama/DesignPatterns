package com.design.patterns.creational.abstractFactory;

public class VictoriaFactory extends ProductFactory{
	
	@Override
	public Product getProduct(String product) {
		
		if(product.equals("Chair")) {
			return new VictoriaChair();
		}else if(product.equals("Sofa")){
			return new VictoriaSofa();
		}else {
			return null;
		}
	}

}
