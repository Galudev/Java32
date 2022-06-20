package com.main;

public class Car {
	private String fuel;
	private int maxspeed;
	
	// Constructores
	public Car(String fuel, int maxspeed) {
		this.fuel = fuel;
		this.maxspeed = maxspeed;
	}
	
	public Car() {
		this.fuel = "";
		this.maxspeed = 0;
	}
	
	// Getters y setters
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public int getSpeed() {
		return maxspeed;
	}
	public void setSpeed(int maxspeed) {
		this.maxspeed = maxspeed;
	}
	
	// Métodos
	public String refuel() {
		this.fuel = "Lleno";
		return "Depósito recargado";
	}
	
	public String drive() {
		if(fuel == "Lleno") {
			fuel = "Medio";
		} else if(fuel == "Medio") {
			fuel = "Vacío";
		} else {
			return "Depósito vacío, no se puede conducir";
		}
		return "Conduciendo";
	}
}
