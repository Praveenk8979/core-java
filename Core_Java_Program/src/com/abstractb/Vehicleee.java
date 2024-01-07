package com.abstractb;


abstract class Vehicle {

 abstract void startEngine();
 abstract void stopEngine();
}


class Car extends Vehicle {
 
 @Override
 void startEngine() {
     System.out.println("Car engine started");
 }

 @Override
 void stopEngine() {
     System.out.println("Car engine stopped");
 }
}

class Motorcycle extends Vehicle {
 
 @Override
 void startEngine() {
     System.out.println("Motorcycle engine started");
 }

 @Override
 void stopEngine() {
     System.out.println("Motorcycle engine stopped");
 }
}

public class Vehicleee {
 public static void main(String[] args) {
     
     Car car = new Car();
     Motorcycle motorcycle = new Motorcycle();

     car.startEngine();
     car.stopEngine();

     System.out.println(); 

     motorcycle.startEngine();
     motorcycle.stopEngine();
 }
}

