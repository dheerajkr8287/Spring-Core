package org.example;

public class PetrolEngine implements Engine {
    PetrolEngine(){
        System.out.println("Petrol engine cons....");
    }
    @Override
    public int start() {
        System.out.println("Petrol Engine Start...");
        return 1;
    }
}
