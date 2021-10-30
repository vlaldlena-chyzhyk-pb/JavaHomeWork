package com.pb.chyzhyk.hw4;

import java.util.Locale;
import java.util.Scanner;

public class CapitalLetter {
    static void print (String in){
        System.out.println(in);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку");
        String in = scan.nextLine();
        String result = in.toUpperCase();
        System.out.println("Result: " + result);
    }

}

