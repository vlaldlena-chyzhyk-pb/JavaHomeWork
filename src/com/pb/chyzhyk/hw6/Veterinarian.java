package com.pb.chyzhyk.hw6;

public class Veterinarian {
    public void treatAnimal(Animal animal){
        System.out.println("На приеме у ветеринара: " + animal + animal.getFood() + animal.getLocation());
    }
}
