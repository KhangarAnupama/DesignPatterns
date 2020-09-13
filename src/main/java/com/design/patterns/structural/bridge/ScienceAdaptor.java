package com.design.patterns.structural.bridge;

public class ScienceAdaptor implements Subject{
	
	Chemistory chemistory;
	Physic physic;
	
	public ScienceAdaptor(String sub) {
		if(sub.equals("Chem")) {
			chemistory = new Chemistory();
		}else {
			physic = new Physic();
		}
	}

	@Override
	public void whichSub(String sub) {
		if(sub.equals("Chem")) {
			chemistory.chem();
		}else{
			physic.physics();
		}
	}
}
