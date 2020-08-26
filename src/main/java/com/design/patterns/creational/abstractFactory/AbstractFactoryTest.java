package com.design.patterns.creational.abstractFactory;

/**
 * https://refactoring.guru/design-patterns/abstract-factory
 * @author Anupama Khangar
 *
 */
public class AbstractFactoryTest {

	public static void main(String[] args) {

		AbstractFactoryCall impl = new AbstractFactoryCall();
		ArtDecoFactory p = (ArtDecoFactory) impl.getCompany("Art Deco");
		ArtDecoChair artDecoChair = (ArtDecoChair) p.getProduct("Chair");
		artDecoChair.getType();

	}
}
