package com.CarAndDriver;

public class Car {
private double gas=10;


public void displayGas() {
	System.out.println("Gas :"+this.gas+"L");
}

public double getGas() {
	return gas;
}

public void setGas(double gas) {
	this.gas = gas;
}
}
