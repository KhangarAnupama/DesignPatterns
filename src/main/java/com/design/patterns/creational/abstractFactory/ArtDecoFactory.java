package com.design.patterns.creational.abstractFactory;

public class ArtDecoFactory extends ProductFactory{

	@Override
	public Product getProduct(String product) {
		if(product.equals("Chair")) {
			return new ArtDecoChair();
		}else if(product.equals("Sofa")){
			return new ArtDecoSofa();
		}else {
			return null;
		}
	}

}
