package com.main;

public class Main {

	public static void main(String[] args) {
		System.out.println("\nCar A");
		Car carA = new Car("Vacío",200);
		System.out.println(carA.refuel());
		System.out.println(carA.drive());
		System.out.println(carA.drive());
		System.out.println(carA.drive());

		System.out.println("\nCar B");
		Car carB = new Car();
		carB.setFuel("Medio");
		carB.setSpeed(300);
		System.out.println(carB.drive());
		System.out.println(carB.refuel());

		System.out.println("\nCar C");
		Car carC = new Car("Lleno", 250);
		System.out.println(carC.getFuel());
		System.out.println(carC.getSpeed());
	}

}
