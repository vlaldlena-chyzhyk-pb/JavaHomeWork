package com.pb.chyzhyk.hw2;
import java.util.Scanner;

import static java.lang.System.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);
        int a;
        int b;
        String sign;
        System.out.print("Введите первую циферку");
        a = scan.nextInt();
        System.out.print("Введите вторую циферку");
        b = scan.nextInt();
        System.out.print("Введите знак действия:+ - * /");
        sign = scan.next(); // + - * /
        if (b==0 && sign.equals("/")) {
            System.out.print("Делить на ноль нельзя. Попробуйте другую циферку");
        }
        else {
            switch (sign) {
                case "+":
                    System.out.println(a + b);
                    break;

                case "-":
                    System.out.println(a - b);
                    break;

                case "*":
                    System.out.println(a * b);
                    break;

                case "/":
                    System.out.println(((double) a) / b);
                    break;
            }
        }

    }
}