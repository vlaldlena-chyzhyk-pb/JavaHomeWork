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
        char[] chars = in.toCharArray();

        chars[0] = Character.toUpperCase(chars[0]);
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == ' ') {
                chars[i + 1] = Character.toUpperCase(chars[i + 1]);
            }
        }
        in = new String(chars);
        System.out.println(in);
    }

}

