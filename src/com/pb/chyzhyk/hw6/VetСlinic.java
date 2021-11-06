package com.pb.chyzhyk.hw6;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class VetСlinic {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException {
        Animal[] animals = new Animal[3];
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Horse();

        String[] string = new String[animals.length];


        Veterinarian veterinar = new Veterinarian();
        Class clazz = veterinar.getClass();
        System.out.println(clazz.getName());
        System.out.println(Arrays.toString(clazz.getMethods()));

        Class veterinarClazz = Class.forName("com.pb.chyzhyk.hw6.Veterinarian");
        Class veterinarianClazz = Veterinarian.class;
        Constructor constr = veterinarClazz.getConstructor(new Class[]{String.class});
        Object obj = constr.newInstance("Doctor Who");
        if (obj instanceof Veterinarian) {
            ((Veterinarian) obj).treatAnimal(animals[3]);
        }
    }
}
