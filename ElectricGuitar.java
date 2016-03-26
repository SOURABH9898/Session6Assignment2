package com.acadglid.java.core.session6.assignment2;

class ElectricGuitar extends StringedInstruments {
	private boolean powerSource;
	public boolean isPowerSource() {
		return powerSource;
	}
	public void setPowerSource(boolean powerSource) {
		this.powerSource = powerSource;
	}
	public void play(){
		if(this.isPowerSource()){
			System.out.println("This is "+this.getName()+" with " + this.getNumberOfStrings()+" strings");
			
		}else{
			System.out.println("No power source available, plug the guitar to proper source");
		}
		
	}
}
