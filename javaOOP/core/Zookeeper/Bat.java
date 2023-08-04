package com.Zookeeper;

public class Bat extends Mammal {
	public Bat() {
        setEnergyLevel(300);
    }

    public void fly() {
        System.out.println("Bat taking off!");
        setEnergyLevel(getEnergyLevel()-50);
    }

    public void eatHumans() {
        System.out.println("So-");
        setEnergyLevel(getEnergyLevel()+25);
    }

    public void attackTown() {
        System.out.println("Town on fire!");
        setEnergyLevel(getEnergyLevel()-100);
    }
}
