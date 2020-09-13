package com.design.patterns.structural.bridge;

public class SubjectAdaptor  implements Subject{
	
	ScienceAdaptor science;

	@Override
	public void whichSub(String sub) {
		if(sub.equals("English")) {
			System.out.println("Engllish Subject");
		}else if (sub.equals("Chem") || sub.equals("Physics")){
			science = new ScienceAdaptor(sub);
			science.whichSub(sub);
		}else {
			System.out.println("Invalid Subject");
		}
		
	}

}
