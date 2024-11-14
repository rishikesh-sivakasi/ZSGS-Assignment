package MethodOverriding;

abstract class Vehicle {
     abstract void start(); 
     abstract void stop(); 
}

class Car extends Vehicle{
     void start(){
          System.out.println("Car is started");
     }
     void stop(){
          System.out.println("Car is stoped");
     }
}

class Bike extends Vehicle{
     void start(){
          System.out.println("Bike is started");
     }
     void stop(){
          System.out.println("Bike is stoped");
     }
}

class Main {
     public static void main(String[] args) {
          Vehicle car = new Car();
          car.start();
          car.stop();
          Vehicle bike = new Bike();
          bike.start();
          bike.stop();
     }
     
}
