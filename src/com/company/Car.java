package com.company;

public class Car {

    String model;
    String color;
    boolean engineState = false;

    void startEngine(){
        if(engineState == true)
            System.out.println("The engine is already on. ");
        else {
            engineState = true;
            System.out.println("The engine is now on. ");
        }
    }

    void showAtts(){
        System.out.println("This car is a " + color + " " +model);
        if(engineState == true)
            System.out.println("The engine is on.");
        else System.out.println("The engine is off.");


    }

    public static void main(String[] args) {

        Car car = new Car();
        car.model = "Audi";
        car.color = "Black";
        System.out.println("Calling showAtts...");
        car.showAtts();
        System.out.println("-----------------------------");
        System.out.println("Starting engine...");
        car.startEngine();
        System.out.println("-------------------------------");
        System.out.println("Calling showAtts...");
        car.showAtts();
        System.out.println("---------------------------------");
        System.out.println("Start engine...");
        car.startEngine();

    }
}
