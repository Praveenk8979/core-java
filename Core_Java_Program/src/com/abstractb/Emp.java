package com.abstractb;


abstract class Employee {
 
 protected String name;
 protected int employeeId;

 
 public Employee(String name, int employeeId) {
     this.name = name;
     this.employeeId = employeeId;
 }

 
 
 abstract double calculateSalary();
 abstract void displayInfo();
}


class Manager extends Employee {

 private double bonus;


 public Manager(String name, int employeeId, double bonus) {
     super(name, employeeId);
     this.bonus = bonus;
 }

 
 @Override
 double calculateSalary() {
     
     double baseSalary = 50000;
     return baseSalary + bonus;
 }

 
 @Override
 void displayInfo() {
     System.out.println("Manager Information:");
     System.out.println("Name: " + name);
     System.out.println("Employee ID: " + employeeId);
     System.out.println("Salary: $" + calculateSalary());
 }
}

class Programmer extends Employee {
 private int hoursWorked;

 public Programmer(String name, int employeeId, int hoursWorked) {
     super(name, employeeId);
     this.hoursWorked = hoursWorked;
 }

 @Override
 double calculateSalary() {
     double hourlyRate = 30;
     return hoursWorked * hourlyRate;
 }

 
 @Override
 void displayInfo() {
     System.out.println("Programmer Information:");
     System.out.println("Name: " + name);
     System.out.println("Employee ID: " + employeeId);
     System.out.println("Salary: $" + calculateSalary());
 }
}


public class Emp {
 public static void main(String[] args) {
   
     Manager manager = new Manager("Praveen Chauhan", 101, 10000);
     Programmer programmer = new Programmer("Anoop", 102, 160);

     manager.displayInfo();
     System.out.println(); 
     programmer.displayInfo();
 }
}

