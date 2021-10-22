package com.pb.chyzhyk.hw3;

import java.util.Scanner;

import static java.lang.System.in;

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);
        int[] array = new int[10];
        int sum = 0;
        System.out.println("Введите 10 чисел");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        for (int num : array) {
            sum = sum + num;
        }
        System.out.println("Сумма элементов массива равна: " + sum);
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0)
                counter += 1;
        }
        System.out.println("Количество положительных элементов: " + counter);
        for (int i = 0; i < array.length; i++){
            for (int j = array.length-1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
            System.out.print(array[i] + ";");
        }
    }
}



