package ru.evdokimov.task3;

import java.util.Scanner;

public class charNum {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        boolean isTrue = true;
        while (isTrue) {
            System.out.println("Введите число (для выхода введите любую букву:");
            int a = in.nextInt(); //вводим число
            if ((a < 0) & ((a % 2) == 0)) {
                System.out.println("Введенное число отрицательное, четное:");
            }
            if ((a < 0) & ((a % 2) != 0)) {
                System.out.println("Введенное число отрицательное, нечетное:");
            }
            if ((a > 0) & ((a % 2) != 0)) {
                System.out.println("Введенное число положительноее, нечетное:");
            }
            if ((a > 0) & ((a % 2) == 0)) {
                System.out.println("Введенное число положительноее, четное:");
            }
            if (a == 0) {
                System.out.println("Введенное число равно '0'");
            }
        }
    }
}