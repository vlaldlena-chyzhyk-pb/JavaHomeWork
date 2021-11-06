package com.pb.chyzhyk.hw6;

import java.util.Objects;
import java.util.concurrent.Callable;

public class Dog extends Animal{
    public Dog(){
        super("Джой, " , "корм для собак, " , "дом");
    }

    @Override
    public void eat() {
        System.out.println(getName() + "ест" + getFood());
    }

    @Override
    public void makeNoise() {
        System.out.println(getName() + " говорит гав");
    }
    @Override
    public String toString(){
        return "Dog{"+ "name: " + getName() + ", food: " + getFood() + ", location: " + getLocation() + '}';
    }
    @Override
    public int hashCode(){
        return Objects.hash(getName(), getFood(), getLocation());
    }

}
