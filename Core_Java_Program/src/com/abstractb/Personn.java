package com.abstractb;


abstract class Person {
 
 abstract void eat();
 abstract void exercise();
}

class Athlete extends Person {

 @Override
 void eat() {
     System.out.println("Athlete eats a balanced diet with high protein.");
 }

 @Override
 void exercise() {
     System.out.println("Athlete engages in rigorous training and exercises regularly.");
 }
}

class LazyPerson extends Person {

 @Override
 void eat() {
     System.out.println("LazyPerson enjoys junk food and snacks while watching TV.");
 }

 @Override
 void exercise() {
     System.out.println("LazyPerson avoids physical activities and prefers a sedentary lifestyle.");
 }
}


public class Personn {
 public static void main(String[] args) {
    
     Athlete athlete = new Athlete();
     LazyPerson lazyPerson = new LazyPerson();

     System.out.println("Athlete's Lifestyle:");
     athlete.eat();
     athlete.exercise();

     System.out.println(); 
     
     System.out.println("LazyPerson's Lifestyle:");
     lazyPerson.eat();
     lazyPerson.exercise();
 }
}
