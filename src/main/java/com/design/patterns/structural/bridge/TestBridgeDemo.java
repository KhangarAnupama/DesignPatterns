package com.design.patterns.structural.bridge;

public class TestBridgeDemo {
	
	public static void main(String[] args) {
		SubjectAdaptor adaptor = new SubjectAdaptor();
		adaptor.whichSub("English");
		adaptor.whichSub("Chem");
		adaptor.whichSub("Physics");
		adaptor.whichSub("Math");
	}

}
