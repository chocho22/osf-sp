package com.osf.sp.ioc2;

public class Car {
	private String name;
	private int year;

	public Car(String name, int year) {
		this.name = name;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", year=" + year + "]";
	}
	
}
