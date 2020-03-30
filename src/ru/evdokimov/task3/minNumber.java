package ru.evdokimov.task3;

import java.util.Scanner;

public class minNumber {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = in.nextInt(); //вводим первое число
        System.out.println("Введите второе число:");
        int b = in.nextInt();// вводим второе число
// ниже сравниваем введенные числа
        if (a > b) {
            System.out.println("Минимальное из введенных чисел " + b);
        }
        if (a < b) {
            System.out.println("Минимальное из введенных чисел " + a);
        }
        if (a == b) {
            System.out.println("Числа равны");
        }
    }
}