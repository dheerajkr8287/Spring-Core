package org.example;

public class DieselEngine implements Engine{
    DieselEngine(){
        System.out.println("Diesel engine cons..");
    }
    @Override
    public int start() {
        System.out.println("Diesel Engine Start...");
        return 1;
    }
}
