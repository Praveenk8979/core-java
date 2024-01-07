package com.abstractb;

//Abstract class Shape3D
abstract class Shape3D {
 // Abstract methods to calculate volume and surface area
 abstract double calculateVolume();
 abstract double calculateSurfaceArea();
}

//Sphere class extending Shape3D
class Sphere extends Shape3D {
 // Radius of the sphere
 private double radius;

 // Constructor for Sphere
 public Sphere(double radius) {
     this.radius = radius;
 }

 // Implementation of calculateVolume method for Sphere
 @Override
 double calculateVolume() {
     return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
 }

 // Implementation of calculateSurfaceArea method for Sphere
 @Override
 double calculateSurfaceArea() {
     return 4 * Math.PI * Math.pow(radius, 2);
 }
}

//Cube class extending Shape3D
class Cube extends Shape3D {
 // Side length of the cube
 private double sideLength;

 // Constructor for Cube
 public Cube(double sideLength) {
     this.sideLength = sideLength;
 }

 // Implementation of calculateVolume method for Cube
 @Override
 double calculateVolume() {
     return Math.pow(sideLength, 3);
 }

 // Implementation of calculateSurfaceArea method for Cube
 @Override
 double calculateSurfaceArea() {
     return 6 * Math.pow(sideLength, 2);
 }
}

//Main class to test the program
public class Shape3dd {
 public static void main(String[] args) {
     // Creating instances of Sphere and Cube
     Sphere sphere = new Sphere(3.0);
     Cube cube = new Cube(4.0);

     // Calculating and printing volume and surface area for Sphere
     System.out.println("Sphere Volume: " + sphere.calculateVolume());
     System.out.println("Sphere Surface Area: " + sphere.calculateSurfaceArea());

     // Calculating and printing volume and surface area for Cube
     System.out.println("Cube Volume: " + cube.calculateVolume());
     System.out.println("Cube Surface Area: " + cube.calculateSurfaceArea());
 }
}

