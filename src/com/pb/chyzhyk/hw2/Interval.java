package com.pb.chyzhyk.hw2;

import java.util.Scanner;

import static java.lang.System.in;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);
        int g;
        System.out.print("Введите число в диапозоне от 0 до 100");
        g = scan.nextInt();
        if (g>=0 && g<=15) {
            System.out.print("диапозон [0-15]");
        }
        else if (g<36) {
            System.out.print("диапозон [16-35]");
        }
        else if (g<51) {
            System.out.print("диапозон [36-50]");
        }
        else if (g<101) {
            System.out.print("диапозон [51-100]");
        }
        else {
            System.out.print("Неправильное введено число. Введите пожалуйста число в диапозоне от 0 до 100");
        }
        }

}
