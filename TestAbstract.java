package com.acadglid.java.core.session6.assignment2;

import java.util.Scanner;

public class TestAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		StringedInstruments stringedGuitar=new StringedInstruments();
		System.out.println("Enter the name of StringedInstruments: Electric or Electric bass");
		StringBuilder strb=new StringBuilder();
		strb.append(s.nextLine());
		System.out.println(strb.toString().toUpperCase().trim().replace(" ", ""));
		if(strb.toString().toUpperCase().trim().replace(" ", "").equals("ELECTRIC")){
			ElectricGuitar egt=new ElectricGuitar();
			egt.setName(strb.toString());
			System.out.println("Enter the number of strings for ElectricGuitar");
			egt.setNumberOfStrings(s.nextInt());
			System.out.println("the power source is plugged or not: true/false");
			egt.setPowerSource(s.nextBoolean());
			egt.play();
		}else if(strb.toString().toUpperCase().trim().replace(" ", "").equals("ELECTRICBASS")){
			ElectricBassGuitar egbt= new ElectricBassGuitar();
			egbt.setName(strb.toString());
			System.out.println("Enter the number of strings for ElectricBassGuitar");
			egbt.setNumberOfStrings(s.nextInt());
			System.out.println("the power source is plugged or not: true/false");
			egbt.setPowerSource(s.nextBoolean());
			System.out.println("is amplifier available? true/false");
			egbt.setAmplifyingDevice(s.nextBoolean());
			egbt.play();
		}
		
	}

}
