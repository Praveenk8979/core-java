package com.abstractb;


abstract class Animalb {
 
 abstract void eat();
 abstract void sleep();
}


class Wolf extends Animalb {

 @Override
 void eat() {
     System.out.println("Wolf is eating meat");
 }

 
 @Override
 void sleep() {
     System.out.println("Wolf is sleeping ");
 }
}


class Elephant extends Animalb {

 @Override
 void eat() {
     System.out.println("Elephant is eating sugarcane");
 }

 
 @Override
 void sleep() {
     System.out.println("Elephant is sleeping ");
 }
}


class Deer extends Animalb {

 @Override
 void eat() {
     System.out.println("Deer is eating the grass");
 }


 @Override
 void sleep() {
     System.out.println("Deer is sleeping");
 }
}


public class AnimalBehavior {
 public static void main(String[] args) {
     
	 Wolf w = new Wolf();
     Elephant e = new Elephant();
     Deer deer = new Deer();

    
     w.eat();
     w.sleep();

     e.eat();
     e.sleep();

     deer.eat();
     deer.sleep();
 }
}

