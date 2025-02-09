package org.example;

public class Car {

    Engine engine;

Car(){
    System.out.println("Car cons....");
}

//this constuctor is use beacuse to implement DI by Constructor
    public Car(Engine engine) {
        System.out.println(" Car Cons with 1 args .....");
        this.engine = engine;
    }

    public void setEngine(Engine engine) {
        System.out.println("Setter is Start..");
        this.engine = engine;
    }


    public void driver(){
        int res = engine.start();
        if(res>=1){
            System.out.println("Car started ....");
        }else{
            System.out.println("Engine not Supported");
        }
    }

}
