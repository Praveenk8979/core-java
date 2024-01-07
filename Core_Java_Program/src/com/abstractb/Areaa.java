package com.abstractb;

abstract class Shape {
	abstract double calculateArea();

	abstract double calculatePerameter();
}

class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	double calculateArea() {

		return Math.PI * radius * radius;
	}

	@Override
	double calculatePerameter() {

		return 2 * Math.PI * radius;
	}
}

class Triangle extends Shape {

	private double sideA, sideB, sideC;

	public Triangle(double sideA, double sideB, double sideC) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	@Override
	double calculateArea() {
		double s = (sideA + sideB + sideC) / 2;
		return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
	}

	@Override
	double calculatePerameter() {

		return sideA + sideB + sideC;
	}

}

public class Areaa {
	public static void main(String[] args) {
		Circle c = new Circle(5.0);
		Triangle t = new Triangle(3.0, 4.0, 5.0);

		// Calculating and printing area and perimeter for Circle
		System.out.println("Circle Area: " + c.calculateArea());
		System.out.println("Circle Perimeter : " + c.calculatePerameter());

		// Calculating and printing area and perimeter for Triangle
		System.out.println("Triangle Area: " + t.calculateArea());
		System.out.println("Triangle Perimeter: " + t.calculatePerameter());
	}
}
