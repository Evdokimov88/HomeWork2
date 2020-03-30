package ru.evdokimov.task3;

import java.util.Scanner;

public class arifmProg {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите шаг прогрессии");
        int d = scan.nextInt(); //шаг прогрессии
        System.out.println("Введите количество элементов прогрессии ");
        int n = scan.nextInt(); //количество элементов прогрессии
        int[] a = new int[n]; //создаем массив из n элементов
        System.out.println("Введите значение первого элемента прогрессии ");
        a[1] = scan.nextInt(); //присваиваем значение первому члену прогрессии
        int i;
        System.out.println("арифметическая прогрессия из " + n + " чисел, с первым числом "+a[1]+", с шагом " + d + " равна:");
        for (i = 1; i <= n; i++) { //запускаем счетчик от 1 до n
            System.out.println(a[1] + ((i - 1) * d)); //формула арифметической прогресии
        }
    }


}

