package com.acadglid.java.core.session6.assignment2;

class ElectricBassGuitar extends StringedInstruments{
private boolean powerSource;
private boolean amplifyingDevice;
	public boolean isPowerSource() {
	return powerSource;
}
public void setPowerSource(boolean powerSource) {
	this.powerSource = powerSource;
}
public boolean isAmplifyingDevice() {
	return amplifyingDevice;
}
public void setAmplifyingDevice(boolean amplifyingDevice) {
	this.amplifyingDevice = amplifyingDevice;
}
	public void play(){
		if(this.isPowerSource()){
		System.out.println("This is "+this.getName()+" with " + this.getNumberOfStrings()+" strings");
		
		if(!this.amplifyingDevice){
			System.out.println("Bass cannot be recognised since amplifying device not available");
		}
		}
		else{
			System.out.println("Electric bass guitar needs to be plugged to power source");
		}
	}
}
