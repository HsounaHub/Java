package com.CarAndDriver;

public class Driver extends Car {

public void driving() {
	setGas(getGas() - 1);
	System.out.println("You drive the car.");
	System.out.println("Gas remaining: "+getGas()+"/10");
}
public void useBoosters() {
	setGas(getGas() - 3);
	System.out.println("You used boosters.");
	System.out.println("Gas remaining: "+getGas()+"/10");
}
public void refuel() {
	setGas(getGas() + 2);
	System.out.println("You are refueling.");
	System.out.println("Gas remaining: "+getGas()+"/10");
}
}
