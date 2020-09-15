package com.design.patterns.structural.filter;

import java.util.List;

public class SingleMale implements Criteria {
	
	Criteria male;
	Criteria single;
	
	public SingleMale(Criteria male, Criteria single) {
		this.male = male;
		this.single = single;
	}

   @Override
   public List<Person> meetCriteria(List<Person> persons) {
	   List<Person> f = male.meetCriteria(persons);
	   return single.meetCriteria(f);
	   
   }
}
