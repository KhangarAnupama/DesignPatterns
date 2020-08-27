package com.design.patterns.creational.buildFactory;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	
	 List<Item> items = new ArrayList<Item>();
	
	public void add(Item e) {
		items.add(e);
	}
	
	public void get() {
		for(Item i : items) {
			i.foodItem();
			i.price();
			i.wrapperType();
		}
		
	}
	
	

}
