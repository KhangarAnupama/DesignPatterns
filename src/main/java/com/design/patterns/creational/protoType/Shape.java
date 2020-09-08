package com.design.patterns.creational.protoType;

public abstract class Shape implements Cloneable{
	
	private int id;
	
	private String type;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	abstract void draw();
	
	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		}catch (CloneNotSupportedException e) {
			// TODO: handle exception
		}
		return clone;
	}
	
}
