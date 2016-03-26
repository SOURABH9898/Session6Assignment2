package com.acadglid.java.core.session6.assignment2;

public abstract class Instruments {

   private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void play();
	
}
