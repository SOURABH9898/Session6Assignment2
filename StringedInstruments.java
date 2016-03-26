package com.acadglid.java.core.session6.assignment2;

class StringedInstruments extends Instruments {
	private int numberOfStrings;
	public int getNumberOfStrings() {
		return numberOfStrings;
	}
	public void setNumberOfStrings(int numberOfStrings) {
		this.numberOfStrings = numberOfStrings;
	}
	public void play(){
		System.out.println("PLaying stringed class play method: "+this.getName()+" number of strings "+this.getNumberOfStrings());
	}

}
