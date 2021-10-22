package com.pb.chyzhyk.hw3;


import java.util.Scanner;
import static java.lang.System.in;

public class Bingo {

    public static void main(String[] args) {

        int a = (int)(Math.random()*100+1);


        int attempt = 0;
        Scanner scan = new Scanner(in);
        while(true ) {
            attempt++;
            System.out.print("Угадайте задуманое число от 0 до 100.");
            System.out.println(" Для выхода из программы введите число дьявола - 666.");
            System.out.println("Попытка " + attempt + ":");
            int y = scan.nextInt();

            if (y == 666) {
                break;
            }


            if (y > a) {

                System.out.println("Число которое вы угадали большое");

            } else if (y < a) {

                System.out.println("Число, которое вы угадали маленькое");

            } else {

                System.out.println("Поздравляем, Вы угадали с " + attempt + " попытки!");
                break;
            }


        }
        }




}

