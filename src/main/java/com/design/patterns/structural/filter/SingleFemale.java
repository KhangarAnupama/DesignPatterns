package com.design.patterns.structural.filter;

import java.util.List;

public class SingleFemale implements Criteria {
	
		Criteria female;
		Criteria single;
		
		public  SingleFemale(Criteria female, Criteria single) {
			this.female = female;
			this.single = single;
			
		}

	   @Override
	   public List<Person> meetCriteria(List<Person> persons) {
		   List<Person> f = female.meetCriteria(persons);
		   return single.meetCriteria(f);
		   
	   }
}
