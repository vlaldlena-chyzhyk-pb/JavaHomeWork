package com.pb.chyzhyk.hw6;

import java.util.Objects;

public class Cat extends Animal{
    public Cat(){
        super("Леон, " , "корм для кошек, " , "квартира");
    }

    @Override
    public void eat() {
        System.out.println(getName() + "ест" + getFood());
    }

    @Override
    public void makeNoise() {
        System.out.println(getName() + " говорит мяу");
    }

    @Override
    public String toString(){
        return "Cat{"+ "name: " + getName() + ", food: " + getFood() + ", location: " + getLocation() + '}';
    }
    @Override
    public int hashCode(){
        return Objects.hash(getName(), getFood(), getLocation());
    }

}
